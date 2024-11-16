package quek.undergardens.entity.projectile.slingshot;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import quek.undergardens.registry.UGDamageSources;
import quek.undergardens.registry.UGEntityTypes;
import quek.undergardens.registry.UGItems;

public class DepthrockPebble extends SlingshotProjectile {

	private int airTime = 1;

	public DepthrockPebble(EntityType<? extends DepthrockPebble> type, Level level) {
		super(type, level);
	}

	public DepthrockPebble(Level level, double x, double y, double z) {
		super(UGEntityTypes.DEPTHROCK_PEBBLE.get(), x, y, z, level);
	}

	public DepthrockPebble(Level level, LivingEntity shooter) {
		super(UGEntityTypes.DEPTHROCK_PEBBLE.get(), shooter, level);
		this.setDropItem(true);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().getGameTime() % 5 == 0) {
			this.airTime++;
		}
	}

	@Override
	protected void onHitEntity(EntityHitResult result) {
		super.onHitEntity(result);
		Entity victim = result.getEntity();
		float length = (float) this.getDeltaMovement().length();
		int damage = Mth.ceil(Mth.clamp((double) length * this.airTime, 0.0D, 2.147483647E9D));
		victim.hurt(this.damageSources().source(UGDamageSources.DEPTHROCK_PEBBLE, this, this.getOwner()), damage);
		this.playSound(SoundEvents.STONE_BREAK, 1.0F, 1.0F);
		if (!this.level().isClientSide()) {
			this.level().broadcastEntityEvent(this, (byte) 3);
			this.discard();
		}
	}

	@Override
	protected Item getDefaultItem() {
		return UGItems.DEPTHROCK_PEBBLE.get();
	}

	@Override
	public void handleEntityEvent(byte id) {
		if (id == 3) {
			for (int i = 0; i < 8; ++i) {
				this.level().addParticle(this.makeParticle(), this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
			}
		}
	}
}