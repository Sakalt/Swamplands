package quek.swamplands.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import quek.swamplands.Undergardens;

public class UGTags {

	public static class Items {

		public static final TagKey<Item> SLINGSHOT_ENCHANTABLE = tag("enchantable/slingshot");

		public static final TagKey<Item> MUSHROOMS = tag("mushrooms");
		public static final TagKey<Item> CLOGGRUM_ITEMS = tag("cloggrum_items");
		public static final TagKey<Item> FROSTSTEEL_ITEMS = tag("froststeel_items");
		public static final TagKey<Item> UTHERIUM_ITEMS = tag("utherium_items");
		public static final TagKey<Item> SMOGSTEM_LOGS = tag("smogstem_logs");
		public static final TagKey<Item> WIGGLEWOOD_LOGS = tag("wigglewood_logs");
		public static final TagKey<Item> GRONGLE_LOGS = tag("grongle_logs");

		public static final TagKey<Item> RAW_MATERIALS_CLOGGRUM = commonTag("raw_materials/cloggrum");
		public static final TagKey<Item> RAW_MATERIALS_FROSTSTEEL = commonTag("raw_materials/froststeel");

		public static final TagKey<Item> INGOTS_CLOGGRUM = commonTag("ingots/cloggrum");
		public static final TagKey<Item> INGOTS_FROSTSTEEL = commonTag("ingots/froststeel");
		public static final TagKey<Item> INGOTS_UTHERIUM = commonTag("ingots/utherium");
		public static final TagKey<Item> INGOTS_REGALIUM = commonTag("ingots/regalium");
		public static final TagKey<Item> INGOTS_FORGOTTEN_METAL = commonTag("ingots/forgotten_metal");

		public static final TagKey<Item> NUGGETS_CLOGGRUM = commonTag("nuggets/cloggrum");
		public static final TagKey<Item> NUGGETS_FROSTSTEEL = commonTag("nuggets/froststeel");
		public static final TagKey<Item> NUGGETS_FORGOTTEN_METAL = commonTag("nuggets/forgotten_metal");

		public static final TagKey<Item> ORES_CLOGGRUM = commonTag("ores/cloggrum");
		public static final TagKey<Item> ORES_FROSTSTEEL = commonTag("ores/froststeel");
		public static final TagKey<Item> ORES_UTHERIUM = commonTag("ores/utherium");
		public static final TagKey<Item> ORES_REGALIUM = commonTag("ores/regalium");

		public static final TagKey<Item> STORAGE_BLOCKS_CLOGGRUM = commonTag("storage_blocks/cloggrum");
		public static final TagKey<Item> STORAGE_BLOCKS_FROSTSTEEL = commonTag("storage_blocks/froststeel");
		public static final TagKey<Item> STORAGE_BLOCKS_UTHERIUM = commonTag("storage_blocks/utherium");
		public static final TagKey<Item> STORAGE_BLOCKS_REGALIUM = commonTag("storage_blocks/regalium");
		public static final TagKey<Item> STORAGE_BLOCKS_FORGOTTEN_METAL = commonTag("storage_blocks/forgotten_metal");

		public static final TagKey<Item> STORAGE_BLOCKS_RAW_CLOGGRUM = commonTag("storage_blocks/raw_cloggrum");
		public static final TagKey<Item> STORAGE_BLOCKS_RAW_FROSTSTEEL = commonTag("storage_blocks/raw_froststeel");

		private static TagKey<Item> tag(String name) {
			return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, name));
		}

		private static TagKey<Item> commonTag(String name) {
			return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
		}
	}

	public static class Blocks {

		public static final TagKey<Block> BASE_STONE_UNDERGARDEN = tag("base_stone_swamplands");
		public static final TagKey<Block> DEPTHROCK_ORE_REPLACEABLES = tag("depthrock_ore_replaceables");
		public static final TagKey<Block> SHIVERSTONE_ORE_REPLACEABLES = tag("shiverstone_ore_replaceables");
		public static final TagKey<Block> TREMBLECRUST_ORE_REPLACEABLES = tag("tremblecrust_ore_replaceables");
		public static final TagKey<Block> UNDERGARDEN_CARVER_REPLACEABLES = tag("swamplands_carver_replaceables");
		public static final TagKey<Block> MUSHROOMS = tag("mushrooms");
		public static final TagKey<Block> PORTAL_FRAME_BLOCKS = tag("portal_frame_blocks");
		public static final TagKey<Block> SMOGSTEM_LOGS = tag("smogstem_logs");
		public static final TagKey<Block> WIGGLEWOOD_LOGS = tag("wigglewood_logs");
		public static final TagKey<Block> GRONGLE_LOGS = tag("grongle_logs");
		public static final TagKey<Block> MUNCHER_BREAKABLES = tag("muncher_breakables");
		public static final TagKey<Block> SCINTLING_SPAWNABLE_ON = tag("scintling_spawnable_on");
		public static final TagKey<Block> SMOG_MOG_SPAWNABLE_ON = tag("smog_mog_spawnable_on");

		public static final TagKey<Block> ORES_CLOGGRUM = commonTag("ores/cloggrum");
		public static final TagKey<Block> ORES_FROSTSTEEL = commonTag("ores/froststeel");
		public static final TagKey<Block> ORES_UTHERIUM = commonTag("ores/utherium");
		public static final TagKey<Block> ORES_REGALIUM = commonTag("ores/regalium");

		public static final TagKey<Block> STORAGE_BLOCKS_CLOGGRUM = commonTag("storage_blocks/cloggrum");
		public static final TagKey<Block> STORAGE_BLOCKS_FROSTSTEEL = commonTag("storage_blocks/froststeel");
		public static final TagKey<Block> STORAGE_BLOCKS_UTHERIUM = commonTag("storage_blocks/utherium");
		public static final TagKey<Block> STORAGE_BLOCKS_REGALIUM = commonTag("storage_blocks/regalium");
		public static final TagKey<Block> STORAGE_BLOCKS_FORGOTTEN_METAL = commonTag("storage_blocks/forgotten_metal");

		public static final TagKey<Block> STORAGE_BLOCKS_RAW_CLOGGRUM = commonTag("storage_blocks/raw_cloggrum");
		public static final TagKey<Block> STORAGE_BLOCKS_RAW_FROSTSTEEL = commonTag("storage_blocks/raw_froststeel");

		public static final TagKey<Block> DEPTHROCK_GROUND = commonTag("ore_bearing_ground/depthrock");
		public static final TagKey<Block> DEPTHROCK_ORES = commonTag("ores_in_ground/depthrock");

		public static final TagKey<Block> SHIVERSTONE_GROUND = commonTag("ore_bearing_ground/shiverstone");
		public static final TagKey<Block> SHIVERSTONE_ORES = commonTag("ores_in_ground/shiverstone");

		public static final TagKey<Block> TREMBLECRUST_GROUND = commonTag("ore_bearing_ground/tremblecrust");
		public static final TagKey<Block> TREMBLECRUST_ORES = commonTag("ores_in_ground/tremblecrust");

		private static TagKey<Block> tag(String name) {
			return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, name));
		}

		private static TagKey<Block> commonTag(String name) {
			return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
		}
	}

	public static class Entities {

		public static final TagKey<EntityType<?>> ROTSPAWN = tag("rotspawn");
		public static final TagKey<EntityType<?>> CAVERN_CREATURE = tag("cavern_creature");
		public static final TagKey<EntityType<?>> IMMUNE_TO_VIRULENT_MIX = tag("immune_to_virulent_mix");
		public static final TagKey<EntityType<?>> IMMUNE_TO_SCINTLING_GOO = tag("immune_to_scintling_goo");
		public static final TagKey<EntityType<?>> IMMUNE_TO_BLISTERBERRY_BUSH = tag("immune_to_blisterberry_bush");
		public static final TagKey<EntityType<?>> IMMUNE_TO_GOOEY_EFFECT = tag("immune_to_gooey_effect");

		private static TagKey<EntityType<?>> tag(String name) {
			return TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, name));
		}
	}

	public static class Fluids {

		public static final TagKey<Fluid> VIRULENT = tag("virulent");

		private static TagKey<Fluid> tag(String name) {
			return TagKey.create(Registries.FLUID, ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, name));
		}
	}

	public static class Biomes {

		public static final TagKey<Biome> IS_UNDERGARDEN = tag("is_swamplands");

		public static final TagKey<Biome> HAS_CATACOMBS = tag("has_structure/catacombs");
		public static final TagKey<Biome> HAS_FORGOTTEN_VESTIGE = tag("has_structure/forgotten_vestige");

		private static TagKey<Biome> tag(String name) {
			return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, name));
		}
	}

	public static class Enchantments {

		public static final TagKey<Enchantment> SLINGSHOT_EXCLUSIVE = tag("exclusive_set/slingshot");

		private static TagKey<Enchantment> tag(String name) {
			return TagKey.create(Registries.ENCHANTMENT, ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, name));
		}
	}
}