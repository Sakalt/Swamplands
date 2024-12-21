package sakalti.swamplands.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import sakalti.swamplands.Undergardens;
import sakalti.swamplands.registry.UGBlocks;
import sakalti.swamplands.registry.UGItems;
import sakalti.swamplands.registry.UGTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class UGItemTags extends ItemTagsProvider {

	public UGItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> future, CompletableFuture<TagLookup<Block>> provider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, future, provider, Undergardens.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		//swamplands
		tag(UGTags.Items.SLINGSHOT_ENCHANTABLE).add(UGItems.SLINGSHOT.get());
		copy(UGTags.Blocks.MUSHROOMS, UGTags.Items.MUSHROOMS);
		tag(UGTags.Items.CLOGGRUM_ITEMS).add(UGItems.CLOGGRUM_SWORD.get(), UGItems.CLOGGRUM_PICKAXE.get(), UGItems.CLOGGRUM_AXE.get(), UGItems.CLOGGRUM_SHOVEL.get(), UGItems.CLOGGRUM_HOE.get(), UGItems.CLOGGRUM_HELMET.get(), UGItems.CLOGGRUM_CHESTPLATE.get(), UGItems.CLOGGRUM_LEGGINGS.get(), UGItems.CLOGGRUM_BOOTS.get());
		tag(UGTags.Items.FROSTSTEEL_ITEMS).add(UGItems.FROSTSTEEL_SWORD.get(), UGItems.FROSTSTEEL_PICKAXE.get(), UGItems.FROSTSTEEL_AXE.get(), UGItems.FROSTSTEEL_SHOVEL.get(), UGItems.FROSTSTEEL_HOE.get(), UGItems.FROSTSTEEL_HELMET.get(), UGItems.FROSTSTEEL_CHESTPLATE.get(), UGItems.FROSTSTEEL_LEGGINGS.get(), UGItems.FROSTSTEEL_BOOTS.get());
		tag(UGTags.Items.UTHERIUM_ITEMS).add(UGItems.UTHERIUM_SWORD.get(), UGItems.UTHERIUM_PICKAXE.get(), UGItems.UTHERIUM_AXE.get(), UGItems.UTHERIUM_SHOVEL.get(), UGItems.UTHERIUM_HOE.get(), UGItems.UTHERIUM_HELMET.get(), UGItems.UTHERIUM_CHESTPLATE.get(), UGItems.UTHERIUM_LEGGINGS.get(), UGItems.UTHERIUM_BOOTS.get());
		copy(UGTags.Blocks.SMOGSTEM_LOGS, UGTags.Items.SMOGSTEM_LOGS);
		copy(UGTags.Blocks.WIGGLEWOOD_LOGS, UGTags.Items.WIGGLEWOOD_LOGS);
		copy(UGTags.Blocks.GRONGLE_LOGS, UGTags.Items.GRONGLE_LOGS);

		//swamplands forge
		tag(UGTags.Items.RAW_MATERIALS_CLOGGRUM).add(UGItems.RAW_CLOGGRUM.get());
		tag(UGTags.Items.RAW_MATERIALS_FROSTSTEEL).add(UGItems.RAW_FROSTSTEEL.get());

		tag(UGTags.Items.INGOTS_CLOGGRUM).add(UGItems.CLOGGRUM_INGOT.get());
		tag(UGTags.Items.INGOTS_FROSTSTEEL).add(UGItems.FROSTSTEEL_INGOT.get());
		tag(UGTags.Items.INGOTS_UTHERIUM).add(UGItems.UTHERIUM_CRYSTAL.get());
		tag(UGTags.Items.INGOTS_REGALIUM).add(UGItems.REGALIUM_CRYSTAL.get());
		tag(UGTags.Items.INGOTS_FORGOTTEN_METAL).add(UGItems.FORGOTTEN_INGOT.get());

		tag(UGTags.Items.NUGGETS_CLOGGRUM).add(UGItems.CLOGGRUM_NUGGET.get());
		tag(UGTags.Items.NUGGETS_FROSTSTEEL).add(UGItems.FROSTSTEEL_NUGGET.get());
		tag(UGTags.Items.NUGGETS_FORGOTTEN_METAL).add(UGItems.FORGOTTEN_NUGGET.get());

		copy(UGTags.Blocks.ORES_CLOGGRUM, UGTags.Items.ORES_CLOGGRUM);
		copy(UGTags.Blocks.ORES_FROSTSTEEL, UGTags.Items.ORES_FROSTSTEEL);
		copy(UGTags.Blocks.ORES_UTHERIUM, UGTags.Items.ORES_UTHERIUM);
		copy(UGTags.Blocks.ORES_REGALIUM, UGTags.Items.ORES_REGALIUM);

		copy(UGTags.Blocks.STORAGE_BLOCKS_CLOGGRUM, UGTags.Items.STORAGE_BLOCKS_CLOGGRUM);
		copy(UGTags.Blocks.STORAGE_BLOCKS_FROSTSTEEL, UGTags.Items.STORAGE_BLOCKS_FROSTSTEEL);
		copy(UGTags.Blocks.STORAGE_BLOCKS_UTHERIUM, UGTags.Items.STORAGE_BLOCKS_UTHERIUM);
		copy(UGTags.Blocks.STORAGE_BLOCKS_REGALIUM, UGTags.Items.STORAGE_BLOCKS_REGALIUM);
		copy(UGTags.Blocks.STORAGE_BLOCKS_FORGOTTEN_METAL, UGTags.Items.STORAGE_BLOCKS_FORGOTTEN_METAL);

		copy(UGTags.Blocks.STORAGE_BLOCKS_RAW_CLOGGRUM, UGTags.Items.STORAGE_BLOCKS_RAW_CLOGGRUM);
		copy(UGTags.Blocks.STORAGE_BLOCKS_RAW_FROSTSTEEL, UGTags.Items.STORAGE_BLOCKS_RAW_FROSTSTEEL);

		//vanilla
		tag(ItemTags.PLANKS).add(UGBlocks.SMOGSTEM_PLANKS.get().asItem(), UGBlocks.WIGGLEWOOD_PLANKS.get().asItem(), UGBlocks.GRONGLE_PLANKS.get().asItem());
		tag(ItemTags.WOODEN_BUTTONS).add(UGBlocks.SMOGSTEM_BUTTON.get().asItem(), UGBlocks.WIGGLEWOOD_BUTTON.get().asItem(), UGBlocks.GRONGLE_BUTTON.get().asItem());
		tag(ItemTags.BUTTONS).add(UGBlocks.DEPTHROCK_BUTTON.get().asItem(), UGBlocks.SHIVERSTONE_BUTTON.get().asItem());
		tag(ItemTags.WOODEN_DOORS).add(UGBlocks.SMOGSTEM_DOOR.get().asItem(), UGBlocks.WIGGLEWOOD_DOOR.get().asItem(), UGBlocks.GRONGLE_DOOR.get().asItem());
		tag(ItemTags.WOODEN_STAIRS).add(UGBlocks.SMOGSTEM_STAIRS.get().asItem(), UGBlocks.WIGGLEWOOD_STAIRS.get().asItem(), UGBlocks.GRONGLE_STAIRS.get().asItem());
		tag(ItemTags.WOODEN_SLABS).add(UGBlocks.SMOGSTEM_SLAB.get().asItem(), UGBlocks.WIGGLEWOOD_SLAB.get().asItem(), UGBlocks.GRONGLE_SLAB.get().asItem());
		tag(ItemTags.WOODEN_FENCES).add(UGBlocks.SMOGSTEM_FENCE.get().asItem(), UGBlocks.WIGGLEWOOD_FENCE.get().asItem(), UGBlocks.GRONGLE_FENCE.get().asItem());
		tag(ItemTags.SAPLINGS).add(UGBlocks.SMOGSTEM_SAPLING.get().asItem(), UGBlocks.WIGGLEWOOD_SAPLING.get().asItem(), UGBlocks.GRONGLE_SAPLING.get().asItem());
		tag(ItemTags.LOGS_THAT_BURN).addTag(UGTags.Items.SMOGSTEM_LOGS).addTag(UGTags.Items.WIGGLEWOOD_LOGS).addTag(UGTags.Items.GRONGLE_LOGS);
		tag(ItemTags.LOGS).addTag(UGTags.Items.SMOGSTEM_LOGS).addTag(UGTags.Items.WIGGLEWOOD_LOGS).addTag(UGTags.Items.GRONGLE_LOGS);
		tag(ItemTags.SMALL_FLOWERS).add(UGBlocks.SHIMMERWEED.get().asItem(), UGBlocks.AMOROUS_BRISTLE.get().asItem(), UGBlocks.MISERABELL.get().asItem(), UGBlocks.BUTTERBUNCH.get().asItem());
		tag(ItemTags.TALL_FLOWERS).add(UGBlocks.TALL_SHIMMERWEED.get().asItem());
		tag(ItemTags.WOODEN_PRESSURE_PLATES).add(UGBlocks.SMOGSTEM_PRESSURE_PLATE.get().asItem(), UGBlocks.WIGGLEWOOD_PRESSURE_PLATE.get().asItem(), UGBlocks.GRONGLE_PRESSURE_PLATE.get().asItem());
		tag(ItemTags.WALLS).add(UGBlocks.DEPTHROCK_WALL.get().asItem(), UGBlocks.DEPTHROCK_BRICK_WALL.get().asItem(), UGBlocks.SHIVERSTONE_WALL.get().asItem(), UGBlocks.SHIVERSTONE_BRICK_WALL.get().asItem(), UGBlocks.TREMBLECRUST_WALL.get().asItem(), UGBlocks.TREMBLECRUST_BRICK_WALL.get().asItem());
		tag(ItemTags.LEAVES).add(UGBlocks.SMOGSTEM_LEAVES.get().asItem(), UGBlocks.WIGGLEWOOD_LEAVES.get().asItem(), UGBlocks.GRONGLE_LEAVES.get().asItem());
		tag(ItemTags.WOODEN_TRAPDOORS).add(UGBlocks.SMOGSTEM_TRAPDOOR.get().asItem(), UGBlocks.WIGGLEWOOD_TRAPDOOR.get().asItem(), UGBlocks.GRONGLE_TRAPDOOR.get().asItem());
		tag(ItemTags.SIGNS).add(UGBlocks.SMOGSTEM_SIGN.get().asItem(), UGBlocks.WIGGLEWOOD_SIGN.get().asItem(), UGBlocks.GRONGLE_SIGN.get().asItem());
		tag(ItemTags.HANGING_SIGNS).add(UGBlocks.SMOGSTEM_HANGING_SIGN.get().asItem(), UGBlocks.WIGGLEWOOD_HANGING_SIGN.get().asItem(), UGBlocks.GRONGLE_HANGING_SIGN.get().asItem());
		tag(ItemTags.COALS).add(UGItems.DITCHBULB_PASTE.get());
		tag(ItemTags.BEACON_PAYMENT_ITEMS).add(UGItems.CLOGGRUM_INGOT.get(), UGItems.FROSTSTEEL_INGOT.get(), UGItems.UTHERIUM_CRYSTAL.get(), UGItems.REGALIUM_CRYSTAL.get(), UGItems.FORGOTTEN_INGOT.get());
		tag(ItemTags.STONE_TOOL_MATERIALS).add(UGBlocks.DEPTHROCK.get().asItem(), UGBlocks.SHIVERSTONE.get().asItem(), UGBlocks.TREMBLECRUST.get().asItem());
		tag(ItemTags.STONE_CRAFTING_MATERIALS).add(UGBlocks.DEPTHROCK.get().asItem(), UGBlocks.SHIVERSTONE.get().asItem(), UGBlocks.TREMBLECRUST.get().asItem());
		tag(ItemTags.FISHES).add(UGItems.RAW_GWIBLING.get(), UGItems.COOKED_GWIBLING.get());
		tag(ItemTags.BOATS).add(UGItems.SMOGSTEM_BOAT.get(), UGItems.WIGGLEWOOD_BOAT.get(), UGItems.GRONGLE_BOAT.get());
		tag(ItemTags.CHEST_BOATS).add(UGItems.SMOGSTEM_CHEST_BOAT.get(), UGItems.WIGGLEWOOD_CHEST_BOAT.get(), UGItems.GRONGLE_CHEST_BOAT.get());
		tag(ItemTags.WOOL_CARPETS).add(UGBlocks.MOGMOSS_RUG.get().asItem(), UGBlocks.BLUE_MOGMOSS_RUG.get().asItem());
		tag(ItemTags.COAL_ORES).add(UGBlocks.DEPTHROCK_COAL_ORE.get().asItem(), UGBlocks.SHIVERSTONE_COAL_ORE.get().asItem());
		tag(ItemTags.IRON_ORES).add(UGBlocks.DEPTHROCK_IRON_ORE.get().asItem(), UGBlocks.SHIVERSTONE_IRON_ORE.get().asItem());
		tag(ItemTags.GOLD_ORES).add(UGBlocks.DEPTHROCK_GOLD_ORE.get().asItem());
		tag(ItemTags.DIAMOND_ORES).add(UGBlocks.DEPTHROCK_DIAMOND_ORE.get().asItem(), UGBlocks.SHIVERSTONE_DIAMOND_ORE.get().asItem());
		tag(ItemTags.TRIM_MATERIALS).add(UGItems.CLOGGRUM_INGOT.get(), UGItems.FROSTSTEEL_INGOT.get(), UGItems.UTHERIUM_CRYSTAL.get(), UGItems.REGALIUM_CRYSTAL.get(), UGItems.FORGOTTEN_INGOT.get());
		tag(ItemTags.VILLAGER_PLANTABLE_SEEDS).add(UGItems.GLOOMGOURD_SEEDS.get());
		tag(ItemTags.WOLF_FOOD).add(UGItems.RAW_DWELLER_MEAT.get(), UGItems.DWELLER_STEAK.get(), UGItems.RAW_GLOOMPER_LEG.get(), UGItems.GLOOMPER_LEG.get());
		tag(ItemTags.HEAD_ARMOR).add(UGItems.CLOGGRUM_HELMET.get(), UGItems.FROSTSTEEL_HELMET.get(), UGItems.UTHERIUM_HELMET.get(), UGItems.ANCIENT_HELMET.get());
		tag(ItemTags.CHEST_ARMOR).add(UGItems.CLOGGRUM_CHESTPLATE.get(), UGItems.FROSTSTEEL_CHESTPLATE.get(), UGItems.UTHERIUM_CHESTPLATE.get(), UGItems.ANCIENT_CHESTPLATE.get());
		tag(ItemTags.LEG_ARMOR).add(UGItems.CLOGGRUM_LEGGINGS.get(), UGItems.FROSTSTEEL_LEGGINGS.get(), UGItems.UTHERIUM_LEGGINGS.get(), UGItems.ANCIENT_LEGGINGS.get());
		tag(ItemTags.FOOT_ARMOR).add(UGItems.CLOGGRUM_BOOTS.get(), UGItems.FROSTSTEEL_BOOTS.get(), UGItems.UTHERIUM_BOOTS.get());

		//forge
		tag(Tags.Items.BONES).add(UGItems.BRUTE_TUSK.get());
		tag(Tags.Items.COBBLESTONES).add(UGBlocks.DEPTHROCK.get().asItem(), UGBlocks.SHIVERSTONE.get().asItem(), UGBlocks.TREMBLECRUST.get().asItem());
		tag(Tags.Items.FENCE_GATES_WOODEN).add(UGBlocks.SMOGSTEM_FENCE_GATE.get().asItem(), UGBlocks.WIGGLEWOOD_FENCE_GATE.get().asItem(), UGBlocks.GRONGLE_FENCE_GATE.get().asItem());
		tag(Tags.Items.FENCES_WOODEN).add(UGBlocks.SMOGSTEM_FENCE.get().asItem(), UGBlocks.WIGGLEWOOD_FENCE.get().asItem(), UGBlocks.GRONGLE_FENCE.get().asItem());
		tag(Tags.Items.MUSHROOMS).addTag(UGTags.Items.MUSHROOMS);
		tag(Tags.Items.NUGGETS).addTag(UGTags.Items.NUGGETS_CLOGGRUM).addTag(UGTags.Items.NUGGETS_FROSTSTEEL).addTag(UGTags.Items.NUGGETS_FORGOTTEN_METAL);
		tag(Tags.Items.SEEDS).add(UGItems.GLOOMGOURD_SEEDS.get());
		tag(Tags.Items.SLIME_BALLS).add(UGItems.GOO_BALL.get());
		tag(Tags.Items.STRINGS).add(UGItems.TWISTYTWIG.get());
		tag(Tags.Items.INGOTS).addTag(UGTags.Items.INGOTS_CLOGGRUM).addTag(UGTags.Items.INGOTS_FROSTSTEEL).addTag(UGTags.Items.INGOTS_UTHERIUM).addTag(UGTags.Items.INGOTS_REGALIUM).addTag(UGTags.Items.INGOTS_FORGOTTEN_METAL);
		tag(Tags.Items.ORES).addTag(UGTags.Items.ORES_CLOGGRUM).addTag(UGTags.Items.ORES_FROSTSTEEL).addTag(UGTags.Items.ORES_UTHERIUM).addTag(UGTags.Items.ORES_REGALIUM).add(UGBlocks.DEPTHROCK_COAL_ORE.get().asItem(), UGBlocks.SHIVERSTONE_COAL_ORE.get().asItem(), UGBlocks.DEPTHROCK_IRON_ORE.get().asItem(), UGBlocks.SHIVERSTONE_IRON_ORE.get().asItem(), UGBlocks.DEPTHROCK_GOLD_ORE.get().asItem(), UGBlocks.DEPTHROCK_DIAMOND_ORE.get().asItem(), UGBlocks.SHIVERSTONE_DIAMOND_ORE.get().asItem());
		tag(Tags.Items.ORES_COAL).add(UGBlocks.DEPTHROCK_COAL_ORE.get().asItem(), UGBlocks.SHIVERSTONE_COAL_ORE.get().asItem());
		tag(Tags.Items.ORES_IRON).add(UGBlocks.DEPTHROCK_IRON_ORE.get().asItem(), UGBlocks.SHIVERSTONE_IRON_ORE.get().asItem());
		tag(Tags.Items.ORES_GOLD).add(UGBlocks.DEPTHROCK_GOLD_ORE.get().asItem());
		tag(Tags.Items.ORES_DIAMOND).add(UGBlocks.DEPTHROCK_DIAMOND_ORE.get().asItem(), UGBlocks.SHIVERSTONE_DIAMOND_ORE.get().asItem());
		tag(Tags.Items.STONES).add(UGBlocks.DEPTHROCK.get().asItem(), UGBlocks.SHIVERSTONE.get().asItem(), UGBlocks.TREMBLECRUST.get().asItem());
		tag(Tags.Items.STORAGE_BLOCKS).addTag(UGTags.Items.STORAGE_BLOCKS_CLOGGRUM).addTag(UGTags.Items.STORAGE_BLOCKS_RAW_CLOGGRUM).addTag(UGTags.Items.STORAGE_BLOCKS_FROSTSTEEL).addTag(UGTags.Items.STORAGE_BLOCKS_RAW_FROSTSTEEL).addTag(UGTags.Items.STORAGE_BLOCKS_UTHERIUM).addTag(UGTags.Items.STORAGE_BLOCKS_REGALIUM).addTag(UGTags.Items.STORAGE_BLOCKS_FORGOTTEN_METAL);
		tag(Tags.Items.GLASS_BLOCKS).add(UGBlocks.SEDIMENT_GLASS.get().asItem());
		tag(Tags.Items.GLASS_BLOCKS_COLORLESS).add(UGBlocks.SEDIMENT_GLASS.get().asItem());
		tag(Tags.Items.GLASS_PANES).add(UGBlocks.SEDIMENT_GLASS_PANE.get().asItem());
		tag(Tags.Items.GLASS_PANES_COLORLESS).add(UGBlocks.SEDIMENT_GLASS_PANE.get().asItem());
		tag(Tags.Items.SANDS).add(UGBlocks.SEDIMENT.get().asItem());
		tag(Tags.Items.SANDS_COLORLESS).add(UGBlocks.SEDIMENT.get().asItem());
		tag(Tags.Items.RAW_MATERIALS).addTag(UGTags.Items.RAW_MATERIALS_CLOGGRUM).addTag(UGTags.Items.RAW_MATERIALS_FROSTSTEEL);
		tag(ItemTags.SWORDS).add(UGItems.CLOGGRUM_SWORD.get(), UGItems.FROSTSTEEL_SWORD.get(), UGItems.UTHERIUM_SWORD.get(), UGItems.FORGOTTEN_SWORD.get());
		tag(ItemTags.PICKAXES).add(UGItems.CLOGGRUM_PICKAXE.get(), UGItems.FROSTSTEEL_PICKAXE.get(), UGItems.UTHERIUM_PICKAXE.get(), UGItems.FORGOTTEN_PICKAXE.get());
		tag(ItemTags.CLUSTER_MAX_HARVESTABLES).add(UGItems.CLOGGRUM_PICKAXE.get(), UGItems.FROSTSTEEL_PICKAXE.get(), UGItems.UTHERIUM_PICKAXE.get(), UGItems.FORGOTTEN_PICKAXE.get());
		tag(ItemTags.AXES).add(UGItems.CLOGGRUM_AXE.get(), UGItems.FROSTSTEEL_AXE.get(), UGItems.UTHERIUM_AXE.get(), UGItems.FORGOTTEN_AXE.get());
		tag(ItemTags.SHOVELS).add(UGItems.CLOGGRUM_SHOVEL.get(), UGItems.FROSTSTEEL_SHOVEL.get(), UGItems.UTHERIUM_SHOVEL.get(), UGItems.FORGOTTEN_SHOVEL.get());
		tag(ItemTags.HOES).add(UGItems.CLOGGRUM_HOE.get(), UGItems.FROSTSTEEL_HOE.get(), UGItems.UTHERIUM_HOE.get(), UGItems.FORGOTTEN_HOE.get());
		tag(Tags.Items.TOOLS_SHIELD).add(UGItems.CLOGGRUM_SHIELD.get());
		tag(Tags.Items.ARMORS).add(
			UGItems.CLOGGRUM_HELMET.get(), UGItems.CLOGGRUM_CHESTPLATE.get(), UGItems.CLOGGRUM_LEGGINGS.get(), UGItems.CLOGGRUM_BOOTS.get(),
			UGItems.FROSTSTEEL_HELMET.get(), UGItems.FROSTSTEEL_CHESTPLATE.get(), UGItems.FROSTSTEEL_LEGGINGS.get(), UGItems.FROSTSTEEL_BOOTS.get(),
			UGItems.UTHERIUM_HELMET.get(), UGItems.UTHERIUM_CHESTPLATE.get(), UGItems.UTHERIUM_LEGGINGS.get(), UGItems.UTHERIUM_BOOTS.get(),
			UGItems.ANCIENT_HELMET.get(), UGItems.ANCIENT_CHESTPLATE.get(), UGItems.ANCIENT_LEGGINGS.get()
		);
		tag(Tags.Items.FOODS).add(UGItems.DROOPFRUIT.get(), UGItems.UNDERBEANS.get(), UGItems.ROASTED_UNDERBEANS.get(), UGItems.BLISTERBERRY.get(), UGItems.ROTTEN_BLISTERBERRY.get(), UGItems.GOO_BALL.get(), UGItems.GLOOMGOURD_PIE.get(), UGItems.RAW_DWELLER_MEAT.get(), UGItems.DWELLER_STEAK.get(), UGItems.RAW_GWIBLING.get(), UGItems.COOKED_GWIBLING.get(), UGItems.RAW_GLOOMPER_LEG.get(), UGItems.GLOOMPER_LEG.get(), UGItems.BLOOD_GLOBULE.get(), UGItems.BLOODY_STEW.get(), UGItems.INKY_STEW.get(), UGItems.INDIGO_STEW.get(), UGItems.VEILED_STEW.get(), UGItems.SLOP_BOWL.get());
		tag(Tags.Items.FOODS_FRUIT).add(UGItems.DROOPFRUIT.get());
		tag(Tags.Items.FOODS_VEGETABLE).add(UGItems.UNDERBEANS.get(), UGItems.ROASTED_UNDERBEANS.get());
		tag(Tags.Items.FOODS_BERRY).add(UGItems.BLISTERBERRY.value(), UGItems.ROTTEN_BLISTERBERRY.get());
		tag(Tags.Items.FOODS_RAW_MEAT).add(UGItems.RAW_DWELLER_MEAT.get(), UGItems.RAW_GLOOMPER_LEG.get());
		tag(Tags.Items.FOODS_COOKED_MEAT).add(UGItems.DWELLER_STEAK.get(), UGItems.GLOOMPER_LEG.get());
		tag(Tags.Items.FOODS_RAW_FISH).add(UGItems.RAW_GWIBLING.get());
		tag(Tags.Items.FOODS_COOKED_FISH).add(UGItems.COOKED_GWIBLING.get());
		tag(Tags.Items.FOODS_SOUP).add(UGItems.BLOODY_STEW.get(), UGItems.INKY_STEW.get(), UGItems.INDIGO_STEW.get(), UGItems.VEILED_STEW.get(), UGItems.SLOP_BOWL.get());
	}
}