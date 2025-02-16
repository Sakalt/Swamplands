package sakalti.swamplands.entity.animal;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.control.SmoothSwimmingMoveControl;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import sakalti.swamplands.registry.UGSoundEvents;

public class Gwib extends WaterAnimal implements Enemy {

	public Gwib(EntityType<? extends WaterAnimal> type, Level level) {
		super(type, level);
		this.moveControl = new SmoothSwimmingMoveControl(this, 85, 10, 0.02F, 0.1F, true);
		this.lookControl = new SmoothSwimmingLookControl(this, 10);
	}

	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new TryFindWaterGoal(this));
		this.goalSelector.addGoal(1, new GwibAttackGoal(this, 1.5D, false));
		this.goalSelector.addGoal(2, new RandomSwimmingGoal(this, 1.5D, 120));
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
	}

	public static AttributeSupplier.Builder registerAttributes() {
		return WaterAnimal.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 14.0D)
				.add(Attributes.ARMOR, 3.0D)
				.add(Attributes.ATTACK_DAMAGE, 8.0D);
	}

	public static boolean canGwibSpawn(EntityType<? extends WaterAnimal> type, LevelAccessor level, MobSpawnType spawnType, BlockPos pos, RandomSource random) {
		return !(level.getDifficulty() == Difficulty.PEACEFUL) && random.nextInt(10) == 0 && level.getBlockState(pos).is(Blocks.WATER) && level.getBlockState(pos.above()).is(Blocks.WATER);
	}

	@Override
	public int getMaxHeadXRot() {
		return 1;
	}

	@Override
	public int getMaxHeadYRot() {
		return 1;
	}

	@Override
	protected PathNavigation createNavigation(Level level) {
		return new WaterBoundPathNavigation(this, level);
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return UGSoundEvents.GWIB_HURT.get();
	}

	@Override
	protected SoundEvent getDeathSound() {
		return UGSoundEvents.GWIB_DEATH.get();
	}

	@Override
	public void aiStep() {
		if (!this.isInWater() && this.onGround() && this.verticalCollision) {
			this.setDeltaMovement(this.getDeltaMovement().add((this.getRandom().nextFloat() * 2.0F - 1.0F) * 0.05F, 0.4F, (this.random.nextFloat() * 2.0F - 1.0F) * 0.05F));
			this.setOnGround(false);
			this.hasImpulse = true;
			this.playSound(UGSoundEvents.GWIB_FLOP.get(), 1.0F, this.getVoicePitch());
		}

		super.aiStep();
	}

	@Override
	public void travel(Vec3 travelVector) {
		if (this.isEffectiveAi() && this.isInWater()) {
			this.moveRelative(0.01F, travelVector);
			this.move(MoverType.SELF, this.getDeltaMovement());
			this.setDeltaMovement(this.getDeltaMovement().scale(0.9D));
			if (this.getTarget() == null) {
				this.setDeltaMovement(this.getDeltaMovement().add(0.0D, -0.005D, 0.0D));
			}
		} else {
			super.travel(travelVector);
		}
	}

	@Override
	protected boolean shouldDespawnInPeaceful() {
		return true;
	}

	private boolean targetIsInWater(@Nullable LivingEntity target) {
		if (target != null) {
			return target.isInWater();
		} else return false;
	}

	static class GwibAttackGoal extends MeleeAttackGoal {

		private final Gwib gwib;

		public GwibAttackGoal(Gwib gwib, double speedModifier, boolean followingTargetEvenIfNotSeen) {
			super(gwib, speedModifier, followingTargetEvenIfNotSeen);
			this.gwib = gwib;
		}

		@Override
		public boolean canUse() {
			return super.canUse() && this.gwib.targetIsInWater(this.gwib.getTarget());
		}

		@Override
		public boolean canContinueToUse() {
			return super.canContinueToUse() && this.gwib.targetIsInWater(this.gwib.getTarget());
		}
	}
}
