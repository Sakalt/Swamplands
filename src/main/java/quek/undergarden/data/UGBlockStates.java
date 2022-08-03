package quek.undergarden.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import quek.undergarden.data.provider.UGBlockstateProvider;
import quek.undergarden.registry.UGBlocks;

public class UGBlockStates extends UGBlockstateProvider {

    public UGBlockStates(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, fileHelper);
    }

    @Override
    public String getName() {
        return "Undergarden Block States";
    }

    @Override
    protected void registerStatesAndModels() {
        torchBlock(UGBlocks.SHARD_TORCH, UGBlocks.SHARD_WALL_TORCH);
        block(UGBlocks.DEPTHROCK);
        block(UGBlocks.DEEPSOIL);
        crossBlock(UGBlocks.ASHEN_DEEPTURF);
        block(UGBlocks.DEPTHROCK_COAL_ORE);
        block(UGBlocks.DEPTHROCK_CLOGGRUM_ORE);
        block(UGBlocks.SHIVERSTONE_FROSTSTEEL_ORE);
        block(UGBlocks.DEPTHROCK_UTHERIUM_ORE);
        log(UGBlocks.SMOGSTEM_LOG, "smogstem_log");
        crossBlock(UGBlocks.SMOGSTEM_SAPLING);
        log(UGBlocks.WIGGLEWOOD_LOG, "wigglewood_log");
        crossBlock(UGBlocks.WIGGLEWOOD_SAPLING);
        block(UGBlocks.SMOGSTEM_PLANKS);
        block(UGBlocks.WIGGLEWOOD_PLANKS);
        block(UGBlocks.SMOGSTEM_LEAVES);
        block(UGBlocks.WIGGLEWOOD_LEAVES);
        crossBlock(UGBlocks.INDIGO_MUSHROOM);
        crossBlock(UGBlocks.VEIL_MUSHROOM);
        crossBlock(UGBlocks.INK_MUSHROOM);
        crossBlock(UGBlocks.BLOOD_MUSHROOM);
        block(UGBlocks.DEPTHROCK_BRICKS);
        block(UGBlocks.CRACKED_DEPTHROCK_BRICKS);
        crossBlock(UGBlocks.GLITTERKELP);
        crossBlock(UGBlocks.GLITTERKELP_PLANT);
        block(UGBlocks.SHIVERSTONE);
        block(UGBlocks.SHIVERSTONE_BRICKS);
        block(UGBlocks.DEPTHROCK_REGALIUM_ORE);
        block(UGBlocks.TREMBLECRUST);
        block(UGBlocks.TREMBLECRUST_BRICKS);
        block(UGBlocks.CRACKED_TREMBLECRUST_BRICKS);
        block(UGBlocks.TREMBLECRUST_UTHERIUM_ORE);
        block(UGBlocks.LOOSE_TREMBLECRUST);
        block(UGBlocks.DEPTHROCK_IRON_ORE);
        block(UGBlocks.DEPTHROCK_GOLD_ORE);
        block(UGBlocks.DEPTHROCK_DIAMOND_ORE);
        block(UGBlocks.COARSE_DEEPSOIL);
        crossBlock(UGBlocks.GRONGLE_SAPLING);
        block(UGBlocks.GRONGLE_LEAVES);
        log(UGBlocks.GRONGLE_LOG, "grongle_log");
        block(UGBlocks.GRONGLE_PLANKS);
        log(UGBlocks.STRIPPED_SMOGSTEM_LOG, "stripped_smogstem_log");
        log(UGBlocks.STRIPPED_WIGGLEWOOD_LOG, "stripped_wigglewood_log");
        log(UGBlocks.STRIPPED_GRONGLE_LOG, "stripped_grongle_log");
        block(UGBlocks.CRACKED_SHIVERSTONE_BRICKS);
        block(UGBlocks.BLOOD_MUSHROOM_GLOBULE);
        crossBlock(UGBlocks.SEEPING_INK);
        crossBlock(UGBlocks.MUSHROOM_VEIL);
        crossBlock(UGBlocks.MUSHROOM_VEIL_PLANT);
        block(UGBlocks.FORGOTTEN_BLOCK);
        block(UGBlocks.CLOGGRUM_BLOCK);
        block(UGBlocks.FROSTSTEEL_BLOCK);
        block(UGBlocks.UTHERIUM_BLOCK);
        block(UGBlocks.CHISELED_DEPTHROCK_BRICKS);
        block(UGBlocks.CHISELED_SHIVERSTONE_BRICKS);
        crossBlock(UGBlocks.FROZEN_DEEPTURF);
        block(UGBlocks.CHISELED_TREMBLECRUST_BRICKS);
        block(UGBlocks.SEDIMENT);
        block(UGBlocks.SEDIMENT_GLASS);
        block(UGBlocks.CLOGGRUM_TILES);
        block(UGBlocks.DEPTHROCK_TILES);
        carpet(UGBlocks.MOGMOSS_RUG);
        block(UGBlocks.SHIVERSTONE_COAL_ORE);
        block(UGBlocks.SHIVERSTONE_IRON_ORE);
        block(UGBlocks.SHIVERSTONE_DIAMOND_ORE);
        block(UGBlocks.SHIVERSTONE_CLOGGRUM_ORE);
        block(UGBlocks.SHIVERSTONE_UTHERIUM_ORE);
        block(UGBlocks.SHIVERSTONE_REGALIUM_ORE);
        block(UGBlocks.RAW_CLOGGRUM_BLOCK);
        block(UGBlocks.RAW_FROSTSTEEL_BLOCK);
        block(UGBlocks.POLISHED_DEPTHROCK);

        stairs(UGBlocks.DEPTHROCK_STAIRS, UGBlocks.DEPTHROCK);
        stairs(UGBlocks.POLISHED_DEPTHROCK_STAIRS, UGBlocks.POLISHED_DEPTHROCK);
        stairs(UGBlocks.DEPTHROCK_BRICK_STAIRS, UGBlocks.DEPTHROCK_BRICKS);
        stairs(UGBlocks.SMOGSTEM_STAIRS, UGBlocks.SMOGSTEM_PLANKS);
        stairs(UGBlocks.WIGGLEWOOD_STAIRS, UGBlocks.WIGGLEWOOD_PLANKS);
        stairs(UGBlocks.SHIVERSTONE_STAIRS, UGBlocks.SHIVERSTONE);
        stairs(UGBlocks.SHIVERSTONE_BRICK_STAIRS, UGBlocks.SHIVERSTONE_BRICKS);
        stairs(UGBlocks.GRONGLE_STAIRS, UGBlocks.GRONGLE_PLANKS);
        stairs(UGBlocks.TREMBLECRUST_STAIRS, UGBlocks.TREMBLECRUST);
        stairs(UGBlocks.TREMBLECRUST_BRICK_STAIRS, UGBlocks.TREMBLECRUST_BRICKS);
        stairs(UGBlocks.CLOGGRUM_TILE_STAIRS, UGBlocks.CLOGGRUM_TILES);
        stairs(UGBlocks.DEPTHROCK_TILE_STAIRS, UGBlocks.DEPTHROCK_TILES);

        slab(UGBlocks.DEPTHROCK_SLAB, UGBlocks.DEPTHROCK);
        slab(UGBlocks.POLISHED_DEPTHROCK_SLAB, UGBlocks.POLISHED_DEPTHROCK);
        slab(UGBlocks.DEPTHROCK_BRICK_SLAB, UGBlocks.DEPTHROCK_BRICKS);
        slab(UGBlocks.SMOGSTEM_SLAB, UGBlocks.SMOGSTEM_PLANKS);
        slab(UGBlocks.WIGGLEWOOD_SLAB, UGBlocks.WIGGLEWOOD_PLANKS);
        slab(UGBlocks.SHIVERSTONE_SLAB, UGBlocks.SHIVERSTONE);
        slab(UGBlocks.SHIVERSTONE_BRICK_SLAB, UGBlocks.SHIVERSTONE_BRICKS);
        slab(UGBlocks.GRONGLE_SLAB, UGBlocks.GRONGLE_PLANKS);
        slab(UGBlocks.TREMBLECRUST_SLAB, UGBlocks.TREMBLECRUST);
        slab(UGBlocks.TREMBLECRUST_BRICK_SLAB, UGBlocks.TREMBLECRUST_BRICKS);
        slab(UGBlocks.CLOGGRUM_TILE_SLAB, UGBlocks.CLOGGRUM_TILES);
        slab(UGBlocks.DEPTHROCK_TILE_SLAB, UGBlocks.DEPTHROCK_TILES);

        wall(UGBlocks.DEPTHROCK_WALL, UGBlocks.DEPTHROCK);
        wall(UGBlocks.POLISHED_DEPTHROCK_WALL, UGBlocks.POLISHED_DEPTHROCK);
        wall(UGBlocks.DEPTHROCK_BRICK_WALL, UGBlocks.DEPTHROCK_BRICKS);
        wall(UGBlocks.SHIVERSTONE_WALL, UGBlocks.SHIVERSTONE);
        wall(UGBlocks.SHIVERSTONE_BRICK_WALL, UGBlocks.SHIVERSTONE_BRICKS);
        wall(UGBlocks.TREMBLECRUST_WALL, UGBlocks.TREMBLECRUST);
        wall(UGBlocks.TREMBLECRUST_BRICK_WALL, UGBlocks.TREMBLECRUST_BRICKS);

        fence(UGBlocks.SMOGSTEM_FENCE, UGBlocks.SMOGSTEM_PLANKS);
        fence(UGBlocks.WIGGLEWOOD_FENCE, UGBlocks.WIGGLEWOOD_PLANKS);
        fence(UGBlocks.GRONGLE_FENCE, UGBlocks.GRONGLE_PLANKS);

        fenceGate(UGBlocks.SMOGSTEM_FENCE_GATE, UGBlocks.SMOGSTEM_PLANKS);
        fenceGate(UGBlocks.WIGGLEWOOD_FENCE_GATE, UGBlocks.WIGGLEWOOD_PLANKS);
        fenceGate(UGBlocks.GRONGLE_FENCE_GATE, UGBlocks.GRONGLE_PLANKS);

        door(UGBlocks.SMOGSTEM_DOOR, "smogstem");
        door(UGBlocks.WIGGLEWOOD_DOOR, "wigglewood");
        door(UGBlocks.GRONGLE_DOOR, "grongle");

        trapdoor(UGBlocks.SMOGSTEM_TRAPDOOR, "smogstem");
        trapdoor(UGBlocks.WIGGLEWOOD_TRAPDOOR, "wigglewood");
        trapdoor(UGBlocks.GRONGLE_TRAPDOOR, "grongle");

        button(UGBlocks.DEPTHROCK_BUTTON, UGBlocks.DEPTHROCK);
        button(UGBlocks.SHIVERSTONE_BUTTON, UGBlocks.SHIVERSTONE);
        button(UGBlocks.TREMBLECRUST_BUTTON, UGBlocks.TREMBLECRUST);
        button(UGBlocks.SMOGSTEM_BUTTON, UGBlocks.SMOGSTEM_PLANKS);
        button(UGBlocks.WIGGLEWOOD_BUTTON, UGBlocks.WIGGLEWOOD_PLANKS);
        button(UGBlocks.GRONGLE_BUTTON, UGBlocks.GRONGLE_PLANKS);

        pressurePlate(UGBlocks.DEPTHROCK_PRESSURE_PLATE, UGBlocks.DEPTHROCK);
        pressurePlate(UGBlocks.SHIVERSTONE_PRESSURE_PLATE, UGBlocks.SHIVERSTONE);
        pressurePlate(UGBlocks.TREMBLECRUST_PRESSURE_PLATE, UGBlocks.TREMBLECRUST);
        pressurePlate(UGBlocks.SMOGSTEM_PRESSURE_PLATE, UGBlocks.SMOGSTEM_PLANKS);
        pressurePlate(UGBlocks.WIGGLEWOOD_PRESSURE_PLATE, UGBlocks.WIGGLEWOOD_PLANKS);
        pressurePlate(UGBlocks.GRONGLE_PRESSURE_PLATE, UGBlocks.GRONGLE_PLANKS);

        sign(UGBlocks.SMOGSTEM_SIGN, UGBlocks.SMOGSTEM_WALL_SIGN, "smogstem");
        sign(UGBlocks.WIGGLEWOOD_SIGN, UGBlocks.WIGGLEWOOD_WALL_SIGN, "wigglewood");
        sign(UGBlocks.GRONGLE_SIGN, UGBlocks.GRONGLE_WALL_SIGN, "grongle");
    }
}