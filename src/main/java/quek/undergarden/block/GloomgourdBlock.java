package quek.undergarden.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.PumpkinBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.common.ToolActions;
import quek.undergarden.registry.UGBlocks;
import quek.undergarden.registry.UGItems;

public class GloomgourdBlock extends PumpkinBlock {

	public GloomgourdBlock(Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
		ItemStack itemstack = player.getItemInHand(handIn);
		if (itemstack.canPerformAction(ToolActions.SHEARS_CARVE)) {
			if (!level.isClientSide()) {
				Direction direction = hit.getDirection();
				Direction direction1 = direction.getAxis() == Direction.Axis.Y ? player.getDirection().getOpposite() : direction;
				level.playSound(null, pos, SoundEvents.PUMPKIN_CARVE, SoundSource.BLOCKS, 1.0F, 1.0F);
				level.setBlock(pos, UGBlocks.CARVED_GLOOMGOURD.get().defaultBlockState().setValue(CarvedGloomgourdBlock.FACING, direction1), 11);
				ItemEntity itementity = new ItemEntity(level, (double) pos.getX() + 0.5D + (double) direction1.getStepX() * 0.65D, (double) pos.getY() + 0.1D, (double) pos.getZ() + 0.5D + (double) direction1.getStepZ() * 0.65D, new ItemStack(UGItems.GLOOMGOURD_SEEDS.get(), 4));
				itementity.setDeltaMovement(0.05D * (double) direction1.getStepX() + level.getRandom().nextDouble() * 0.02D, 0.05D, 0.05D * (double) direction1.getStepZ() + level.getRandom().nextDouble() * 0.02D);
				level.addFreshEntity(itementity);
				itemstack.hurtAndBreak(1, player, (playerIn) -> playerIn.broadcastBreakEvent(handIn));
			}

			return InteractionResult.SUCCESS;
		} else {
			return super.use(state, level, pos, player, handIn, hit);
		}
	}
}