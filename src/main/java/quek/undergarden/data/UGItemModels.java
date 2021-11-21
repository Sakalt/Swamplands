package quek.undergarden.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import quek.undergarden.data.provider.UGItemModelProvider;
import quek.undergarden.registry.UGBlocks;
import quek.undergarden.registry.UGItems;

public class UGItemModels extends UGItemModelProvider {

    public UGItemModels(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, fileHelper);
    }

    @Override
    public String getName() {
        return "Undergarden Item Models";
    }

    @Override
    protected void registerModels() {
        block(UGBlocks.DEPTHROCK);
        block(UGBlocks.DEPTHROCK_COAL_ORE);
        block(UGBlocks.DEPTHROCK_CLOGGRUM_ORE);
        block(UGBlocks.SHIVERSTONE_FROSTSTEEL_ORE);
        block(UGBlocks.DEPTHROCK_UTHERIUM_ORE);
        block(UGBlocks.DEEPTURF_BLOCK);
        block(UGBlocks.DEEPSOIL_FARMLAND);
        block(UGBlocks.DEEPSOIL);
        blockFlat(UGBlocks.SMOGSTEM_SAPLING);
        block(UGBlocks.SMOGSTEM_LOG);
        block(UGBlocks.SMOGSTEM_LEAVES);
        blockFlat(UGBlocks.WIGGLEWOOD_SAPLING);
        block(UGBlocks.WIGGLEWOOD_LOG);
        block(UGBlocks.WIGGLEWOOD_LEAVES);
        block(UGBlocks.SMOGSTEM_PLANKS);
        block(UGBlocks.WIGGLEWOOD_PLANKS);
        block(UGBlocks.DEPTHROCK_BRICKS);
        block(UGBlocks.CRACKED_DEPTHROCK_BRICKS);
        blockFlat(UGBlocks.DEEPTURF);
        blockFlat(UGBlocks.DITCHBULB_PLANT);
        blockFlat(UGBlocks.INDIGO_MUSHROOM);
        blockFlat(UGBlocks.VEIL_MUSHROOM);
        blockFlat(UGBlocks.INK_MUSHROOM);
        blockFlat(UGBlocks.BLOOD_MUSHROOM);
        block(UGBlocks.GLOOMGOURD);
        block(UGBlocks.CARVED_GLOOMGOURD);
        block(UGBlocks.DEPTHROCK_PEBBLES);
        block(UGBlocks.GLOOM_O_LANTERN);
        block(UGBlocks.SHARD_O_LANTERN);
        block(UGBlocks.CLOGGRUM_BLOCK);
        block(UGBlocks.FROSTSTEEL_BLOCK);
        block(UGBlocks.UTHERIUM_BLOCK);
        block(UGBlocks.DEPTHROCK_STAIRS);
        block(UGBlocks.DEPTHROCK_BRICK_STAIRS);
        block(UGBlocks.SMOGSTEM_STAIRS);
        block(UGBlocks.WIGGLEWOOD_STAIRS);
        block(UGBlocks.DEPTHROCK_SLAB);
        block(UGBlocks.DEPTHROCK_BRICK_SLAB);
        block(UGBlocks.SMOGSTEM_SLAB);
        block(UGBlocks.WIGGLEWOOD_SLAB);
        itemFence(UGBlocks.SMOGSTEM_FENCE, "smogstem_planks");
        itemFence(UGBlocks.WIGGLEWOOD_FENCE, "wigglewood_planks");
        blockFlat(UGBlocks.CLOGGRUM_BARS);
        block(UGBlocks.SHIVERSTONE);
        block(UGBlocks.GOO);
        block(UGBlocks.SMOG_VENT);
        blockFlat(UGBlocks.ASHEN_DEEPTURF);
        block(UGBlocks.ASHEN_DEEPTURF_BLOCK);
        block(UGBlocks.DEPTHROCK_REGALIUM_ORE);
        block(UGBlocks.SHIVERSTONE_BRICKS);
        block(UGBlocks.SHIVERSTONE_STAIRS);
        block(UGBlocks.SHIVERSTONE_BRICK_STAIRS);
        block(UGBlocks.SHIVERSTONE_SLAB);
        block(UGBlocks.SHIVERSTONE_BRICK_SLAB);
        block(UGBlocks.REGALIUM_BLOCK);
        block(UGBlocks.TREMBLECRUST);
        block(UGBlocks.TREMBLECRUST_BRICKS);
        block(UGBlocks.CRACKED_TREMBLECRUST_BRICKS);
        block(UGBlocks.TREMBLECRUST_UTHERIUM_ORE);
        block(UGBlocks.SMOGSTEM_WOOD);
        block(UGBlocks.WIGGLEWOOD_WOOD);
        block(UGBlocks.LOOSE_TREMBLECRUST);
        block(UGBlocks.DEPTHROCK_IRON_ORE);
        block(UGBlocks.DEPTHROCK_GOLD_ORE);
        block(UGBlocks.DEPTHROCK_DIAMOND_ORE);
        block(UGBlocks.SMOGSTEM_FENCE_GATE);
        block(UGBlocks.WIGGLEWOOD_FENCE_GATE);
        wallInventory("depthrock_wall", modLoc("block/depthrock"));
        wallInventory("depthrock_brick_wall", modLoc("block/depthrock_bricks"));
        wallInventory("shiverstone_wall", modLoc("block/shiverstone"));
        wallInventory("shiverstone_brick_wall", modLoc("block/shiverstone_bricks"));
        wallInventory("tremblecrust_wall", modLoc("block/tremblecrust"));
        wallInventory("tremblecrust_brick_wall", modLoc("block/tremblecrust_bricks"));
        block(UGBlocks.COARSE_DEEPSOIL);
        block(UGBlocks.SMOGSTEM_PRESSURE_PLATE);
        block(UGBlocks.WIGGLEWOOD_PRESSURE_PLATE);
        block(UGBlocks.DEPTHROCK_PRESSURE_PLATE);
        block(UGBlocks.SHIVERSTONE_PRESSURE_PLATE);
        blockFlat(UGBlocks.GRONGLE_SAPLING);
        block(UGBlocks.GRONGLE_LOG);
        block(UGBlocks.GRONGLE_LEAVES);
        block(UGBlocks.GRONGLE_WOOD);
        block(UGBlocks.GRONGLE_SLAB);
        itemFence(UGBlocks.GRONGLE_FENCE, "grongle_planks");
        block(UGBlocks.GRONGLE_PLANKS);
        block(UGBlocks.GRONGLE_FENCE_GATE);
        block(UGBlocks.GRONGLE_STAIRS);
        block(UGBlocks.GRONGLE_PRESSURE_PLATE);
        block(UGBlocks.STRIPPED_SMOGSTEM_LOG);
        block(UGBlocks.STRIPPED_WIGGLEWOOD_LOG);
        block(UGBlocks.STRIPPED_GRONGLE_LOG);
        block(UGBlocks.STRIPPED_SMOGSTEM_WOOD);
        block(UGBlocks.STRIPPED_WIGGLEWOOD_WOOD);
        block(UGBlocks.STRIPPED_GRONGLE_WOOD);
        block(UGBlocks.CRACKED_SHIVERSTONE_BRICKS);
        block(UGBlocks.BLOOD_MUSHROOM_GLOBULE);
        block(UGBlocks.FORGOTTEN_BLOCK);
        block(UGBlocks.CHISELED_DEPTHROCK_BRICKS);
        block(UGBlocks.CHISELED_SHIVERSTONE_BRICKS);
        block(UGBlocks.FROZEN_DEEPTURF_BLOCK);
        blockFlat(UGBlocks.FROZEN_DEEPTURF);
        block(UGBlocks.CHISELED_TREMBLECRUST_BRICKS);
        block(UGBlocks.TREMBLECRUST_STAIRS);
        block(UGBlocks.TREMBLECRUST_BRICK_STAIRS);
        block(UGBlocks.TREMBLECRUST_SLAB);
        block(UGBlocks.TREMBLECRUST_BRICK_SLAB);
        block(UGBlocks.TREMBLECRUST_PRESSURE_PLATE);
        block(UGBlocks.GOO_BLOCK);
        block(UGBlocks.SEDIMENT);
        block(UGBlocks.SEDIMENT_GLASS);
        blockFlat(UGBlocks.SEDIMENT_GLASS_PANE, "sediment_glass");
        block(UGBlocks.CLOGGRUM_TILES);
        block(UGBlocks.CLOGGRUM_TILE_STAIRS);
        block(UGBlocks.CLOGGRUM_TILE_SLAB);
        block(UGBlocks.DEPTHROCK_TILES);
        block(UGBlocks.DEPTHROCK_TILE_STAIRS);
        block(UGBlocks.DEPTHROCK_TILE_SLAB);
        block(UGBlocks.MOGMOSS_RUG);
        normalItem(UGItems.MAMMOTH_DISC);
        normalItem(UGItems.LIMAX_MAXIMUS_DISC);
        normalItem(UGItems.GLOOMPER_ANTHEM_DISC);
        normalItem(UGItems.RELICT_DISC);
        normalItem(UGItems.GLOOMPER_SECRET_DISC);
        normalItem(UGItems.CATALYST);
        normalItem(UGItems.DEPTHROCK_PEBBLE);
        normalItem(UGItems.TWISTYTWIG);
        normalItem(UGItems.CLOGGRUM_INGOT);
        normalItem(UGItems.CLOGGRUM_NUGGET);
        normalItem(UGItems.FROSTSTEEL_INGOT);
        normalItem(UGItems.FROSTSTEEL_NUGGET);
        normalItem(UGItems.UTHERIC_SHARD);
        normalItem(UGItems.UTHERIUM_CRYSTAL);
        normalItem(UGItems.REGALIUM_CRYSTAL);
        normalItem(UGItems.FORGOTTEN_INGOT);
        normalItem(UGItems.FORGOTTEN_NUGGET);
        torchItem(UGBlocks.SHARD_TORCH);
        normalItem(UGItems.DITCHBULB);
        normalItem(UGItems.GLOOMGOURD_SEEDS);
        normalItem(UGItems.BRUTE_TUSK);
        normalItem(UGItems.MOGMOSS);
        normalItem(UGItems.GLOWING_KELP);
        normalItem(UGItems.GOO_BALL);
        normalItem(UGItems.ROTTEN_BLISTERBERRY);
        normalItem(UGItems.BLISTERBOMB);
        normalItem(UGItems.DROOPFRUIT);
        toolItem(UGItems.CLOGGRUM_SWORD);
        toolItem(UGItems.CLOGGRUM_PICKAXE);
        toolItem(UGItems.CLOGGRUM_AXE);
        toolItem(UGItems.CLOGGRUM_SHOVEL);
        toolItem(UGItems.CLOGGRUM_HOE);
        normalItem(UGItems.MASTICATOR_SCALES);
        normalItem(UGItems.MASTICATED_CHESTPLATE);
        normalItem(UGItems.CLOGGRUM_HELMET);
        normalItem(UGItems.CLOGGRUM_CHESTPLATE);
        normalItem(UGItems.CLOGGRUM_LEGGINGS);
        normalItem(UGItems.CLOGGRUM_BOOTS);
        normalItem(UGItems.FROSTSTEEL_HELMET);
        normalItem(UGItems.FROSTSTEEL_CHESTPLATE);
        normalItem(UGItems.FROSTSTEEL_LEGGINGS);
        normalItem(UGItems.FROSTSTEEL_BOOTS);
        normalItem(UGItems.UTHERIUM_HELMET);
        normalItem(UGItems.UTHERIUM_CHESTPLATE);
        normalItem(UGItems.UTHERIUM_LEGGINGS);
        normalItem(UGItems.UTHERIUM_BOOTS);
        toolItem(UGItems.FROSTSTEEL_SWORD);
        toolItem(UGItems.FROSTSTEEL_PICKAXE);
        toolItem(UGItems.FROSTSTEEL_AXE);
        toolItem(UGItems.FROSTSTEEL_SHOVEL);
        toolItem(UGItems.FROSTSTEEL_HOE);
        toolItem(UGItems.UTHERIUM_SWORD);
        toolItem(UGItems.UTHERIUM_PICKAXE);
        toolItem(UGItems.UTHERIUM_AXE);
        toolItem(UGItems.UTHERIUM_SHOVEL);
        toolItem(UGItems.UTHERIUM_HOE);
        toolItem(UGItems.FORGOTTEN_SWORD);
        toolItem(UGItems.FORGOTTEN_PICKAXE);
        toolItem(UGItems.FORGOTTEN_AXE);
        toolItem(UGItems.FORGOTTEN_SHOVEL);
        toolItem(UGItems.FORGOTTEN_HOE);
        normalItem(UGItems.SMOGSTEM_BOAT);
        normalItem(UGItems.WIGGLEWOOD_BOAT);
        normalItem(UGItems.GRONGLE_BOAT);
        normalItem(UGItems.VIRULENT_MIX_BUCKET);
        normalItem(UGItems.GWIBLING_BUCKET);
        normalItem(UGItems.UNDERBEANS);
        normalItem(UGItems.ROASTED_UNDERBEANS);
        normalItem(UGItems.BLISTERBERRY);
        normalItem(UGItems.GLOOMGOURD_PIE);
        normalItem(UGItems.RAW_DWELLER_MEAT);
        normalItem(UGItems.DWELLER_STEAK);
        normalItem(UGItems.RAW_GWIBLING);
        normalItem(UGItems.COOKED_GWIBLING);
        normalItem(UGItems.RAW_GLOOMPER_LEG);
        normalItem(UGItems.GLOOMPER_LEG);
        normalItem(UGItems.BLOODY_STEW);
        normalItem(UGItems.INDIGO_STEW);
        normalItem(UGItems.INKY_STEW);
        normalItem(UGItems.VEILED_STEW);
        rodItem(UGItems.UNDERBEAN_STICK);
        normalItem(UGItems.RAW_CLOGGRUM);
        normalItem(UGItems.RAW_FROSTSTEEL);
        block(UGBlocks.SHIVERSTONE_COAL_ORE);
        block(UGBlocks.SHIVERSTONE_IRON_ORE);
        block(UGBlocks.SHIVERSTONE_DIAMOND_ORE);
        block(UGBlocks.SHIVERSTONE_CLOGGRUM_ORE);
        block(UGBlocks.SHIVERSTONE_UTHERIUM_ORE);
        block(UGBlocks.SHIVERSTONE_REGALIUM_ORE);
        block(UGBlocks.RAW_CLOGGRUM_BLOCK);
        block(UGBlocks.RAW_FROSTSTEEL_BLOCK);
        blockFlatWithItemName(UGBlocks.CLOGGRUM_LANTERN, "cloggrum_lantern_item");
        blockFlat(UGBlocks.HANGING_GRONGLE_LEAVES);

        egg(UGItems.DWELLER_SPAWN_EGG);
        egg(UGItems.GWIBLING_SPAWN_EGG);
        egg(UGItems.ROTLING_SPAWN_EGG);
        egg(UGItems.ROTWALKER_SPAWN_EGG);
        egg(UGItems.ROTBEAST_SPAWN_EGG);
        egg(UGItems.BRUTE_SPAWN_EGG);
        egg(UGItems.SCINTLING_SPAWN_EGG);
        egg(UGItems.GLOOMPER_SPAWN_EGG);
        egg(UGItems.STONEBORN_SPAWN_EGG);
        egg(UGItems.NARGOYLE_SPAWN_EGG);
        egg(UGItems.MUNCHER_SPAWN_EGG);
        egg(UGItems.SPLOOGIE_SPAWN_EGG);
        egg(UGItems.GWIB_SPAWN_EGG);
        egg(UGItems.MOG_SPAWN_EGG);
        egg(UGItems.MASTICATOR_SPAWN_EGG);
        egg(UGItems.FORGOTTEN_GUARDIAN_SPAWN_EGG);

        sign(UGBlocks.SMOGSTEM_SIGN);
        sign(UGBlocks.WIGGLEWOOD_SIGN);
        sign(UGBlocks.GRONGLE_SIGN);
    }
}