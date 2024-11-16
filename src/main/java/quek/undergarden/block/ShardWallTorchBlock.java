package sakalti.swamplands.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import sakalti.swamplands.registry.UGDamageSources;
import sakalti.swamplands.registry.UGParticleTypes;
import sakalti.swamplands.registry.UGTags;

public class ShardWallTorchBlock extends WallTorchBlock {

	public ShardWallTorchBlock(Properties properties) {
		super(ParticleTypes.FLAME, properties);
	}

	@Override
	public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
		Direction direction = state.getValue(FACING);
		double x = (double) pos.getX() + 0.5D;
		double y = (double) pos.getY() + 0.7D;
		double z = (double) pos.getZ() + 0.5D;
		Direction oppositeDirection = direction.getOpposite();
		level.addParticle(ParticleTypes.SMOKE, x + 0.27D * (double) oppositeDirection.getStepX(), y + 0.22D, z + 0.27D * (double) oppositeDirection.getStepZ(), 0.0D, 0.0D, 0.0D);
		level.addParticle(UGParticleTypes.SHARD.get(), x + 0.27D * (double) oppositeDirection.getStepX(), y + 0.22D, z + 0.27D * (double) oppositeDirection.getStepZ(), 0.0D, 0.0D, 0.0D);
	}

	@Override
	public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
		level.scheduleTick(pos, this, 20);
	}

	@Override
	public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		level.getEntitiesOfClass(LivingEntity.class, new AABB(pos).inflate(4.0D),
				entity -> entity.getType().is(UGTags.Entities.ROTSPAWN)).forEach(entity -> {
			if (entity.hurt(UGDamageSources.getShardTorchDamage(level, pos.getCenter()), 4)) {
				ShardTorchBlock.drawParticlesTo(level, pos.getCenter(), entity);
			}
		});
		level.scheduleTick(pos, this, 20);
	}
}