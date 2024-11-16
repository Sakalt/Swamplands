package quek.undergardens.data;

import com.google.common.collect.ImmutableList;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.advancements.packs.VanillaAdventureAdvancements;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import quek.undergardens.Undergardens;
import quek.undergardens.criterion.SlingshotFireTrigger;
import quek.undergardens.criterion.StonebornTradeTrigger;
import quek.undergardens.registry.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class UndergardensAdvancements implements AdvancementProvider.AdvancementGenerator {
	private static final List<ResourceKey<Biome>> UNDERGARDEN_BIOMES = ImmutableList.of(UGBiomes.ANCIENT_SEA, UGBiomes.BARREN_ABYSS, UGBiomes.DEAD_SEA, UGBiomes.DENSE_FOREST, UGBiomes.FORGOTTEN_FIELD, UGBiomes.FROSTFIELDS, UGBiomes.FROSTY_SMOGSTEM_FOREST, UGBiomes.GRONGLEGROWTH, UGBiomes.ICY_SEA, UGBiomes.BLOOD_MUSHROOM_BOG, UGBiomes.SMOG_SPIRES, UGBiomes.SMOGSTEM_FOREST, UGBiomes.WIGGLEWOOD_FOREST, UGBiomes.INDIGO_MUSHROOM_BOG, UGBiomes.INK_MUSHROOM_BOG, UGBiomes.VEIL_MUSHROOM_BOG);

	@SuppressWarnings("unused")
	@Override
	public void generate(HolderLookup.Provider provider, Consumer<AdvancementHolder> consumer, ExistingFileHelper helper) {
		AdvancementHolder root = Advancement.Builder.advancement()
				.display(
						UGBlocks.DEEPTURF_BLOCK.get(),
						Component.translatable("advancement.undergardens.root.title"),
						Component.empty(),
						ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/block/depthrock_bricks.png"),
						AdvancementType.TASK,
						false,
						false,
						false
				)
				.addCriterion("tick", PlayerTrigger.TriggerInstance.tick())
				.save(consumer, "undergardens:undergardens/root");

		AdvancementHolder catalyst = Advancement.Builder.advancement()
				.parent(root)
				.display(
						UGItems.CATALYST.get(),
						Component.translatable("advancement.undergardens.catalyst.title"),
						Component.translatable("advancement.undergardens.catalyst.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("has_catalyst", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.CATALYST.get()))
				.save(consumer, "undergardens:undergardens/catalyst");

		AdvancementHolder enter_undergardens = Advancement.Builder.advancement()
				.parent(catalyst)
				.display(
						UGBlocks.DEEPTURF_BLOCK.get(),
						Component.translatable("advancement.undergardens.enter_undergardens.title"),
						Component.translatable("advancement.undergardens.enter_undergardens.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("enter_undergardens", ChangeDimensionTrigger.TriggerInstance.changedDimensionTo(UGDimensions.UNDERGARDEN_LEVEL))
				.save(consumer, "undergardens:undergardens/enter_undergardens");

		AdvancementHolder slingshot = Advancement.Builder.advancement()
				.parent(enter_undergardens)
				.display(
						UGItems.SLINGSHOT.get(),
						Component.translatable("advancement.undergardens.slingshot.title"),
						Component.translatable("advancement.undergardens.slingshot.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("has_slingshot", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.SLINGSHOT.get()))
				.save(consumer, "undergardens:undergardens/slingshot");

		AdvancementHolder shoot_slingshot = Advancement.Builder.advancement()
				.parent(slingshot)
				.display(
						UGItems.DEPTHROCK_PEBBLE.get(),
						Component.translatable("advancement.undergardens.shoot_slingshot.title"),
						Component.translatable("advancement.undergardens.shoot_slingshot.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("shoot_slingshot", SlingshotFireTrigger.TriggerInstance.shotItem(UGItems.DEPTHROCK_PEBBLE.get()))
				.save(consumer, "undergardens:undergardens/shoot_slingshot");

		AdvancementHolder shoot_slingshot_goo = Advancement.Builder.advancement()
				.parent(slingshot)
				.display(
						UGItems.GOO_BALL.get(),
						Component.translatable("advancement.undergardens.shoot_slingshot_goo.title"),
						Component.translatable("advancement.undergardens.shoot_slingshot_goo.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("shoot_slingshot_goo", SlingshotFireTrigger.TriggerInstance.shotItem(UGItems.GOO_BALL.get()))
				.save(consumer, "undergardens:undergardens/shoot_slingshot_goo");

		AdvancementHolder shoot_slingshot_rotten_blisterberry = Advancement.Builder.advancement()
				.parent(slingshot)
				.display(
						UGItems.ROTTEN_BLISTERBERRY.get(),
						Component.translatable("advancement.undergardens.shoot_slingshot_rotten_blisterberry.title"),
						Component.translatable("advancement.undergardens.shoot_slingshot_rotten_blisterberry.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("shoot_slingshot_rotten_blisterberry", SlingshotFireTrigger.TriggerInstance.shotItem(UGItems.ROTTEN_BLISTERBERRY.get()))
				.save(consumer, "undergardens:undergardens/shoot_slingshot_rotten_blisterberry");

		AdvancementHolder slingshot_20_damage = Advancement.Builder.advancement()
				.parent(shoot_slingshot)
				.display(
						UGItems.DEPTHROCK_PEBBLE.get(),
						Component.translatable("advancement.undergardens.slingshot_20_damage.title"),
						Component.translatable("advancement.undergardens.slingshot_20_damage.desc"),
						null,
						AdvancementType.CHALLENGE,
						true,
						true,
						false
				)
				.addCriterion("20_damage", PlayerHurtEntityTrigger.TriggerInstance.playerHurtEntity(DamagePredicate.Builder.damageInstance().dealtDamage(MinMaxBounds.Doubles.atLeast(20.0D)).type(DamageSourcePredicate.Builder.damageType().direct(EntityPredicate.Builder.entity().of(UGEntityTypes.DEPTHROCK_PEBBLE.get()))), Optional.empty()))
				.save(consumer, "undergardens:undergardens/slingshot_20_damage");

		AdvancementHolder shoot_slingshot_gronglet = Advancement.Builder.advancement()
				.parent(slingshot)
				.display(
						UGBlocks.GRONGLET.get(),
						Component.translatable("advancement.undergardens.shoot_slingshot_gronglet.title"),
						Component.translatable("advancement.undergardens.shoot_slingshot_gronglet.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("shoot_slingshot_gronglet", SlingshotFireTrigger.TriggerInstance.shotItem(UGBlocks.GRONGLET.get()))
				.save(consumer, "undergardens:undergardens/shoot_slingshot_gronglet");

		AdvancementHolder underbeans = Advancement.Builder.advancement()
				.parent(enter_undergardens)
				.display(
						UGItems.UNDERBEANS.get(),
						Component.translatable("advancement.undergardens.underbeans.title"),
						Component.translatable("advancement.undergardens.underbeans.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("has_underbeans", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.UNDERBEANS.get()))
				.save(consumer, "undergardens:undergardens/underbeans");

		AdvancementHolder stoneborn_trade = Advancement.Builder.advancement()
				.parent(enter_undergardens)
				.display(
						UGItems.REGALIUM_CRYSTAL.get(),
						Component.translatable("advancement.undergardens.stoneborn_trade.title"),
						Component.translatable("advancement.undergardens.stoneborn_trade.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("trade_with_stoneborn", StonebornTradeTrigger.TriggerInstance.tradeWithStoneborn())
				.save(consumer, "undergardens:undergardens/stoneborn_trade");

		AdvancementHolder mine_ore = Advancement.Builder.advancement()
				.parent(enter_undergardens)
				.display(
						UGItems.RAW_CLOGGRUM.get(),
						Component.translatable("advancement.undergardens.mine_ore.title"),
						Component.translatable("advancement.undergardens.mine_ore.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.requirements(AdvancementRequirements.Strategy.OR)
				.addCriterion("has_raw_cloggrum", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.RAW_CLOGGRUM.get()))
				.addCriterion("has_raw_froststeel", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.RAW_FROSTSTEEL.get()))
				.addCriterion("has_utherium", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.UTHERIUM_CRYSTAL.get()))
				.addCriterion("has_regalium_crystal", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.REGALIUM_CRYSTAL.get()))
				.addCriterion("has_depthrock_cloggrum", InventoryChangeTrigger.TriggerInstance.hasItems(UGBlocks.DEPTHROCK_CLOGGRUM_ORE.get()))
				.addCriterion("has_shiverstone_cloggrum", InventoryChangeTrigger.TriggerInstance.hasItems(UGBlocks.SHIVERSTONE_CLOGGRUM_ORE.get()))
				.addCriterion("has_shiverstone_froststeel", InventoryChangeTrigger.TriggerInstance.hasItems(UGBlocks.SHIVERSTONE_FROSTSTEEL_ORE.get()))
				.addCriterion("has_depthrock_utherium", InventoryChangeTrigger.TriggerInstance.hasItems(UGBlocks.DEPTHROCK_UTHERIUM_ORE.get()))
				.addCriterion("has_shiverstone_utherium", InventoryChangeTrigger.TriggerInstance.hasItems(UGBlocks.SHIVERSTONE_UTHERIUM_ORE.get()))
				.addCriterion("has_depthrock_regalium", InventoryChangeTrigger.TriggerInstance.hasItems(UGBlocks.DEPTHROCK_REGALIUM_ORE.get()))
				.addCriterion("has_shiverstone_regalium", InventoryChangeTrigger.TriggerInstance.hasItems(UGBlocks.SHIVERSTONE_REGALIUM_ORE.get()))
				.save(consumer, "undergardens:undergardens/mine_ore");

		AdvancementHolder all_ore_blocks = Advancement.Builder.advancement()
				.parent(mine_ore)
				.display(
						UGBlocks.REGALIUM_BLOCK.get(),
						Component.translatable("advancement.undergardens.all_ore_blocks.title"),
						Component.translatable("advancement.undergardens.all_ore_blocks.desc"),
						null,
						AdvancementType.CHALLENGE,
						true,
						true,
						false
				)
				.addCriterion("has_all_ore_blocks", InventoryChangeTrigger.TriggerInstance.hasItems(UGBlocks.CLOGGRUM_BLOCK.get(), UGBlocks.FROSTSTEEL_BLOCK.get(), UGBlocks.UTHERIUM_BLOCK.get(), UGBlocks.REGALIUM_BLOCK.get()))
				.save(consumer, "undergardens:undergardens/all_ore_blocks");

		AdvancementHolder cloggrum_armor = Advancement.Builder.advancement()
				.parent(mine_ore)
				.display(
						UGItems.CLOGGRUM_CHESTPLATE.get(),
						Component.translatable("advancement.undergardens.cloggrum_armor.title"),
						Component.translatable("advancement.undergardens.cloggrum_armor.desc"),
						null,
						AdvancementType.GOAL,
						true,
						true,
						false
				)
				.addCriterion("has_cloggrum_armor", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.CLOGGRUM_HELMET.get(), UGItems.CLOGGRUM_CHESTPLATE.get(), UGItems.CLOGGRUM_LEGGINGS.get(), UGItems.CLOGGRUM_BOOTS.get()))
				.save(consumer, "undergardens:undergardens/cloggrum_armor");

		VanillaAdventureAdvancements.addBiomes(Advancement.Builder.advancement(), provider, UNDERGARDEN_BIOMES)
				.parent(enter_undergardens)
				.display(
						UGItems.CLOGGRUM_BOOTS.get(),
						Component.translatable("advancement.undergardens.all_undergardens_biomes.title"),
						Component.translatable("advancement.undergardens.all_undergardens_biomes.desc"),
						null,
						AdvancementType.CHALLENGE,
						true,
						true,
						false
				)
				.save(consumer, "undergardens:undergardens/all_undergardens_biomes");

		AdvancementHolder plant_gloomgourd = Advancement.Builder.advancement()
				.parent(enter_undergardens)
				.display(
						UGItems.GLOOMGOURD_SEEDS.get(),
						Component.translatable("advancement.undergardens.plant_gloomgourd.title"),
						Component.translatable("advancement.undergardens.plant_gloomgourd.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("plant_gloomgourd", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(UGBlocks.GLOOMGOURD_STEM.get()))
				.save(consumer, "undergardens:undergardens/plant_gloomgourd");

		AdvancementHolder stack_of_gloomgourds = Advancement.Builder.advancement()
				.parent(plant_gloomgourd)
				.display(
						UGBlocks.GLOOMGOURD.get(),
						Component.translatable("advancement.undergardens.stack_of_gloomgourds.title"),
						Component.translatable("advancement.undergardens.stack_of_gloomgourds.desc"),
						null,
						AdvancementType.GOAL,
						true,
						true,
						true
				)
				.addCriterion("has_64_gloomgourds", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(UGBlocks.GLOOMGOURD.get()).withCount(MinMaxBounds.Ints.exactly(64)).build()))
				.save(consumer, "undergardens:undergardens/stack_of_gloomgourds");

		AdvancementHolder catch_gwibling = Advancement.Builder.advancement()
				.parent(enter_undergardens)
				.display(
						UGItems.GWIBLING_BUCKET.get(),
						Component.translatable("advancement.undergardens.catch_gwibling.title"),
						Component.translatable("advancement.undergardens.catch_gwibling.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("has_gwibling_bucket", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.GWIBLING_BUCKET.get()))
				.save(consumer, "undergardens:undergardens/catch_gwibling");

		AdvancementHolder kill_rotling = Advancement.Builder.advancement()
				.parent(enter_undergardens)
				.display(
						UGItems.UTHERIC_SHARD.get(),
						Component.translatable("advancement.undergardens.kill_rotling.title"),
						Component.translatable("advancement.undergardens.kill_rotling.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("kill_rotling", KilledTrigger.TriggerInstance.playerKilledEntity(Optional.of(EntityPredicate.Builder.entity().of(UGEntityTypes.ROTLING.get()).build())))
				.save(consumer, "undergardens:undergardens/kill_rotling");

		AdvancementHolder shard_torch = Advancement.Builder.advancement()
				.parent(kill_rotling)
				.display(
						UGBlocks.SHARD_TORCH.get(),
						Component.translatable("advancement.undergardens.shard_torch.title"),
						Component.translatable("advancement.undergardens.shard_torch.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("has_shard_torch", InventoryChangeTrigger.TriggerInstance.hasItems(UGBlocks.SHARD_TORCH.get()))
				.save(consumer, "undergardens:undergardens/shard_torch");

		AdvancementHolder kill_all_rotspawn = Advancement.Builder.advancement()
				.parent(kill_rotling)
				.display(
						UGItems.UTHERIUM_SWORD.get(),
						Component.translatable("advancement.undergardens.kill_all_rotspawn.title"),
						Component.translatable("advancement.undergardens.kill_all_rotspawn.desc"),
						null,
						AdvancementType.CHALLENGE,
						true,
						true,
						false
				)
				.requirements(AdvancementRequirements.Strategy.AND)
				.addCriterion("kill_rotling", KilledTrigger.TriggerInstance.playerKilledEntity(Optional.of(EntityPredicate.Builder.entity().of(UGEntityTypes.ROTLING.get()).build())))
				.addCriterion("kill_rotwalker", KilledTrigger.TriggerInstance.playerKilledEntity(Optional.of(EntityPredicate.Builder.entity().of(UGEntityTypes.ROTWALKER.get()).build())))
				.addCriterion("kill_rotbeast", KilledTrigger.TriggerInstance.playerKilledEntity(Optional.of(EntityPredicate.Builder.entity().of(UGEntityTypes.ROTBEAST.get()).build())))
				.save(consumer, "undergardens:undergardens/kill_all_rotspawn");

		AdvancementHolder kill_scintling = Advancement.Builder.advancement()
				.parent(enter_undergardens)
				.display(
						UGItems.GOO_BALL.get(),
						Component.translatable("advancement.undergardens.kill_scintling.title"),
						Component.translatable("advancement.undergardens.kill_scintling.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						true
				)
				.addCriterion("kill_scintling", KilledTrigger.TriggerInstance.playerKilledEntity(Optional.of(EntityPredicate.Builder.entity().of(UGEntityTypes.SCINTLING.get()).build())))
				.save(consumer, "undergardens:undergardens/kill_scintling");

		AdvancementHolder catacombs = Advancement.Builder.advancement()
				.parent(enter_undergardens)
				.display(
						UGBlocks.DEPTHROCK_BRICK_STAIRS.get(),
						Component.translatable("advancement.undergardens.catacombs.title"),
						Component.translatable("advancement.undergardens.catacombs.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("enter_catacombs", PlayerTrigger.TriggerInstance.located(LocationPredicate.Builder.inStructure(provider.lookupOrThrow(Registries.STRUCTURE).getOrThrow(UGStructures.CATACOMBS))))
				.save(consumer, "undergardens:undergardens/catacombs");

		AdvancementHolder cloggrum_battleaxe = Advancement.Builder.advancement()
				.parent(catacombs)
				.display(
						UGItems.CLOGGRUM_BATTLEAXE.get(),
						Component.translatable("advancement.undergardens.cloggrum_battleaxe.title"),
						Component.translatable("advancement.undergardens.cloggrum_battleaxe.desc"),
						null,
						AdvancementType.GOAL,
						true,
						true,
						false
				)
				.addCriterion("has_cloggrum_battleaxe", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.CLOGGRUM_BATTLEAXE.get()))
				.save(consumer, "undergardens:undergardens/cloggrum_battleaxe");

		AdvancementHolder kill_guardian = Advancement.Builder.advancement()
				.parent(catacombs)
				.display(
						UGBlocks.FORGOTTEN_BLOCK.get(),
						Component.translatable("advancement.undergardens.kill_forgotten_guardian.title"),
						Component.translatable("advancement.undergardens.kill_forgotten_guardian.desc"),
						null,
						AdvancementType.GOAL,
						true,
						true,
						false
				)
				.addCriterion("kill_forgotten_guardian", KilledTrigger.TriggerInstance.playerKilledEntity(Optional.of(EntityPredicate.Builder.entity().of(UGEntityTypes.FORGOTTEN_GUARDIAN.get()).build())))
				.save(consumer, "undergardens:undergardens/kill_forgotten_guardian");

		AdvancementHolder forgotten_ingot = Advancement.Builder.advancement()
				.parent(kill_guardian)
				.display(
						UGItems.FORGOTTEN_INGOT.get(),
						Component.translatable("advancement.undergardens.forgotten_ingot.title"),
						Component.translatable("advancement.undergardens.forgotten_ingot.desc"),
						null,
						AdvancementType.TASK,
						true,
						true,
						false
				)
				.addCriterion("has_forgotten_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.FORGOTTEN_INGOT.get()))
				.save(consumer, "undergardens:undergardens/forgotten_ingot");

		AdvancementHolder forgotten_tools = Advancement.Builder.advancement()
				.parent(forgotten_ingot)
				.display(
						UGItems.FORGOTTEN_PICKAXE.get(),
						Component.translatable("advancement.undergardens.forgotten_tools.title"),
						Component.translatable("advancement.undergardens.forgotten_tools.desc"),
						null,
						AdvancementType.CHALLENGE,
						true,
						true,
						false
				)
				.addCriterion("has_forgotten_tools", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.FORGOTTEN_BATTLEAXE.get(), UGItems.FORGOTTEN_SWORD.get(), UGItems.FORGOTTEN_PICKAXE.get(), UGItems.FORGOTTEN_AXE.get(), UGItems.FORGOTTEN_SHOVEL.get(), UGItems.FORGOTTEN_HOE.get()))
				.save(consumer, "undergardens:undergardens/forgotten_tools");

		AdvancementHolder forgotten_battleaxe = Advancement.Builder.advancement()
				.parent(cloggrum_battleaxe)
				.display(
						UGItems.FORGOTTEN_BATTLEAXE.get(),
						Component.translatable("advancement.undergardens.forgotten_battleaxe.title"),
						Component.translatable("advancement.undergardens.forgotten_battleaxe.desc"),
						null,
						AdvancementType.CHALLENGE,
						true,
						true,
						false
				)
				.addCriterion("has_forgotten_battleaxe", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.FORGOTTEN_BATTLEAXE.get()))
				.save(consumer, "undergardens:undergardens/forgotten_battleaxe");

		AdvancementHolder summon_minion = Advancement.Builder.advancement()
				.parent(forgotten_ingot)
				.display(
						UGBlocks.CARVED_GLOOMGOURD.get(),
						Component.translatable("advancement.undergardens.summon_minion.title"),
						Component.translatable("advancement.undergardens.summon_minion.desc"),
						null,
						AdvancementType.GOAL,
						true,
						true,
						false
				)
				.addCriterion("summoned_minion", SummonedEntityTrigger.TriggerInstance.summonedEntity(EntityPredicate.Builder.entity().of(UGEntityTypes.MINION.get())))
				.save(consumer, "undergardens:undergardens/summon_minion");

		AdvancementHolder gloomper_secret_disc = Advancement.Builder.advancement()
				.parent(enter_undergardens)
				.display(
						UGItems.GLOOMPER_SECRET_DISC.get(),
						Component.translatable("advancement.undergardens.gloomper_secret_disc.title"),
						Component.translatable("advancement.undergardens.gloomper_secret_disc.desc"),
						null,
						AdvancementType.CHALLENGE,
						true,
						true,
						true
				)
				.addCriterion("has_disc", InventoryChangeTrigger.TriggerInstance.hasItems(UGItems.GLOOMPER_SECRET_DISC.get()))
				.save(consumer, "undergardens:undergardens/gloomper_secret_disc");
	}
}