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

public class Rotwalker extends RotspawnMonster {

	public Rotwalker(EntityType<? extends Monster> type, Level level) {
		super(type, level);
	}

	public static AttributeSupplier.Builder registerAttributes() {
		return Monster.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 24.0D)
				.add(Attributes.ARMOR, 14.0D)
				.add(Attributes.ATTACK_DAMAGE, 4.75D)
				.add(Attributes.MOVEMENT_SPEED, 0.23D);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return UGSoundEvents.ROTWALKER_AMBIENT.get();
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return UGSoundEvents.ROTWALKER_HURT.get();
	}

	@Override
	protected SoundEvent getDeathSound() {
		return UGSoundEvents.ROTWALKER_DEATH.get();
	}

	@Override
	protected void playStepSound(BlockPos pos, BlockState state) {
		this.playSound(UGSoundEvents.ROTWALKER_STEP.get(), 0.15F, 1.0F);
	}
}
