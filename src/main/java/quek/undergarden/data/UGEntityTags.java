package quek.undergardens.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import quek.undergardens.Undergardens;
import quek.undergardens.registry.UGEntityTypes;
import quek.undergardens.registry.UGTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class UGEntityTags extends EntityTypeTagsProvider {

	public UGEntityTags(PackOutput output, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, future, Undergardens.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		//undergardens
		tag(UGTags.Entities.ROTSPAWN).add(UGEntityTypes.ROTLING.get(), UGEntityTypes.ROTWALKER.get(), UGEntityTypes.ROTBEAST.get());
		tag(UGTags.Entities.CAVERN_CREATURE).add(UGEntityTypes.NARGOYLE.get(), UGEntityTypes.SCINTLING.get(), UGEntityTypes.MUNCHER.get(), UGEntityTypes.SPLOOGIE.get());
		tag(UGTags.Entities.IMMUNE_TO_VIRULENT_MIX).addTag(UGTags.Entities.ROTSPAWN).addTag(UGTags.Entities.CAVERN_CREATURE).addTag(Tags.EntityTypes.BOSSES).add(UGEntityTypes.STONEBORN.get(), UGEntityTypes.MOG.get(), UGEntityTypes.SMOG_MOG.get(), UGEntityTypes.GLOOMPER.get(), EntityType.WARDEN);
		tag(UGTags.Entities.IMMUNE_TO_SCINTLING_GOO).add(UGEntityTypes.SCINTLING.get(), UGEntityTypes.FORGOTTEN_GUARDIAN.get(), UGEntityTypes.DWELLER.get(), EntityType.WARDEN);
		tag(UGTags.Entities.IMMUNE_TO_BLISTERBERRY_BUSH).add(UGEntityTypes.SCINTLING.get(), UGEntityTypes.SMOG_MOG.get());
		tag(UGTags.Entities.IMMUNE_TO_GOOEY_EFFECT).add(UGEntityTypes.SCINTLING.get());

		//forge
		tag(Tags.EntityTypes.BOSSES).add(UGEntityTypes.FORGOTTEN_GUARDIAN.get());

		//vanilla
		tag(EntityTypeTags.IMPACT_PROJECTILES).add(UGEntityTypes.BLISTERBOMB.get(), UGEntityTypes.ROTTEN_BLISTERBERRY.get(), UGEntityTypes.GOO_BALL.get(), UGEntityTypes.DEPTHROCK_PEBBLE.get(), UGEntityTypes.MINION_PROJECTILE.get());
		tag(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS).add(UGEntityTypes.SCINTLING.get(), UGEntityTypes.ROTLING.get(), UGEntityTypes.MUNCHER.get(), UGEntityTypes.SPLOOGIE.get(), UGEntityTypes.MOG.get(), UGEntityTypes.SMOG_MOG.get(), UGEntityTypes.FORGOTTEN_GUARDIAN.get());
		tag(EntityTypeTags.FREEZE_IMMUNE_ENTITY_TYPES).add(UGEntityTypes.FORGOTTEN_GUARDIAN.get());
		tag(EntityTypeTags.FALL_DAMAGE_IMMUNE).add(UGEntityTypes.FORGOTTEN_GUARDIAN.get(), UGEntityTypes.MINION.get());
		tag(EntityTypeTags.DISMOUNTS_UNDERWATER).add(UGEntityTypes.DWELLER.get());
		tag(EntityTypeTags.CAN_BREATHE_UNDER_WATER).add(UGEntityTypes.GLOOMPER.get());
		tag(EntityTypeTags.UNDEAD).add(UGEntityTypes.FORGOTTEN.get()).addTag(UGTags.Entities.ROTSPAWN);
	}
}