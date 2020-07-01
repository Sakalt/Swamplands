package quek.undergarden.block.world;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import quek.undergarden.registry.UndergardenBlocks;

import java.util.Random;

public class UndergardenGrassBlock extends SpreadableSnowyDirtBlock implements IGrowable {

    public UndergardenGrassBlock(Properties builder) {
        super(builder);
    }

    private static boolean func_220257_b(BlockState p_220257_0_, IWorldReader p_220257_1_, BlockPos p_220257_2_) {
        BlockPos blockpos = p_220257_2_.up();
        BlockState blockstate = p_220257_1_.getBlockState(blockpos);
        if (blockstate.getBlock() == Blocks.SNOW && blockstate.get(SnowBlock.LAYERS) == 1) {
            return true;
        } else {
            int i = LightEngine.func_215613_a(p_220257_1_, p_220257_0_, p_220257_2_, blockstate, blockpos, Direction.UP, blockstate.getOpacity(p_220257_1_, blockpos));
            return i < p_220257_1_.getMaxLightLevel();
        }
    }

    private static boolean func_220256_c(BlockState p_220256_0_, IWorldReader p_220256_1_, BlockPos p_220256_2_) {
        BlockPos blockpos = p_220256_2_.up();
        return func_220257_b(p_220256_0_, p_220256_1_, p_220256_2_) && !p_220256_1_.getFluidState(blockpos).isTagged(FluidTags.WATER);
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return true;
    }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return worldIn.getBlockState(pos.up()).isAir();
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {

    }

    @Override
    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        if(!func_220257_b(state, worldIn, pos)) {
            if(!worldIn.isAreaLoaded(pos, 3))
                return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
            worldIn.setBlockState(pos, UndergardenBlocks.deepsoil.get().getDefaultState());
        }
        else {
            BlockState blockstate = this.getDefaultState();

            for(int i = 0; i < 4; ++i) {
                BlockPos blockpos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                if (worldIn.getBlockState(blockpos).getBlock() == UndergardenBlocks.deepsoil.get() && func_220256_c(blockstate, worldIn, blockpos)) {
                    worldIn.setBlockState(blockpos, blockstate.with(SNOWY, worldIn.getBlockState(blockpos.up()).getBlock() == Blocks.SNOW));
                }
            }

        }
    }

}
