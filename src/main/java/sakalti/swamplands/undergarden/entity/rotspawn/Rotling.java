package sakalti.swamplands.entity.rotspawn;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import sakalti.swamplands.registry.UGSoundEvents;

public class Rotling extends RotspawnMonster {

	public Rotling(EntityType<? extends Monster> type, Level level) {
		super(type, level);
	}

	public static AttributeSupplier.Builder registerAttributes() {
		return Monster.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 16.0D)
				.add(Attributes.ATTACK_DAMAGE, 3.2D)
				.add(Attributes.MOVEMENT_SPEED, 0.3D);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return UGSoundEvents.ROTLING_AMBIENT.get();
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return UGSoundEvents.ROTLING_HURT.get();
	}

	@Override
	protected SoundEvent getDeathSound() {
		return UGSoundEvents.ROTLING_DEATH.get();
	}

	@Override
	protected void playStepSound(BlockPos pos, BlockState state) {
		this.playSound(UGSoundEvents.ROTLING_STEP.get(), 0.2F, 1.0F);
	}
}
