package quek.undergardens.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.VoxelShape;
import quek.undergardens.registry.UGBlocks;
import quek.undergardens.registry.UGItems;

public class DroopvinePlantBlock extends GrowingPlantBodyBlock implements Droopvine {

	public static final MapCodec<DroopvinePlantBlock> CODEC = simpleCodec(DroopvinePlantBlock::new);
	public static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);

	public DroopvinePlantBlock(Properties properties) {
		super(properties, Direction.DOWN, SHAPE, false);
		this.registerDefaultState(this.stateDefinition.any().setValue(GLOWY, false));
	}

	@Override
	protected MapCodec<? extends GrowingPlantBodyBlock> codec() {
		return CODEC;
	}

	@Override
	protected GrowingPlantHeadBlock getHeadBlock() {
		return UGBlocks.DROOPVINE.get();
	}

	@Override
	protected BlockState updateHeadAfterConvertedFromBody(BlockState body, BlockState head) {
		return head.setValue(GLOWY, body.getValue(GLOWY));
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader level, BlockPos pos, Player player) {
		return new ItemStack(UGItems.DROOPFRUIT.get());
	}

	@Override
	protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult result) {
		return Droopvine.use(state, level, pos);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(GLOWY);
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
		return !state.getValue(GLOWY);
	}

	@Override
	public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
		return true;
	}

	@Override
	public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
		level.setBlock(pos, state.setValue(GLOWY, true), 2);
	}
}