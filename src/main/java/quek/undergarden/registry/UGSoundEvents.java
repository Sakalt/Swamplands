package quek.swamplands.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import quek.swamplands.Undergardens;

public class UGSoundEvents {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(Registries.SOUND_EVENT, Undergardens.MODID);

	public static final DeferredHolder<SoundEvent, SoundEvent> UNDERGARDEN_AMBIENCE = register("ambient.swamplands");
	public static final DeferredHolder<SoundEvent, SoundEvent> ABYSS_AMBIENCE = register("ambient.abyss");
	public static final DeferredHolder<SoundEvent, SoundEvent> SPIRES_AMBIENCE = register("ambient.spires");
	public static final DeferredHolder<SoundEvent, SoundEvent> FROST_AMBIENCE = register("ambient.frost");
	public static final DeferredHolder<SoundEvent, SoundEvent> SEA_AMBIENCE = register("ambient.sea");

	public static final DeferredHolder<SoundEvent, SoundEvent> ABYSS_AMBIENT_ADDITION = register("ambient.abyss_addition");
	public static final DeferredHolder<SoundEvent, SoundEvent> BOG_AMBIENT_ADDITION = register("ambient.bog_addition");
	public static final DeferredHolder<SoundEvent, SoundEvent> FIELDS_AMBIENT_ADDITION = register("ambient.fields_addition");
	public static final DeferredHolder<SoundEvent, SoundEvent> SMOGSTEM_FOREST_AMBIENT_ADDITION = register("ambient.smogstem_forest_addition");
	public static final DeferredHolder<SoundEvent, SoundEvent> WIGGLEWOOD_FOREST_AMBIENT_ADDITION = register("ambient.wigglewood_forest_addition");
	public static final DeferredHolder<SoundEvent, SoundEvent> GRONGLEGROWTH_AMBIENT_ADDITION = register("ambient.gronglegrowth_addition");
	public static final DeferredHolder<SoundEvent, SoundEvent> DENSE_FOREST_AMBIENT_ADDITION = register("ambient.dense_forest_addition");
	public static final DeferredHolder<SoundEvent, SoundEvent> FROSTFIELDS_AMBIENT_ADDITION = register("ambient.frostfields_addition");
	public static final DeferredHolder<SoundEvent, SoundEvent> SPIRES_AMBIENT_ADDITION = register("ambient.spires_addition");
	public static final DeferredHolder<SoundEvent, SoundEvent> SEA_AMBIENT_ADDITION = register("ambient.sea_addition");

	public static final DeferredHolder<SoundEvent, SoundEvent> MOOD = register("ambient.mood");
	public static final DeferredHolder<SoundEvent, SoundEvent> FROST_MOOD = register("ambient.frost_mood");

	public static final DeferredHolder<SoundEvent, SoundEvent> UNDERGARDEN_MUSIC = register("music.swamplands");

	public static final DeferredHolder<SoundEvent, SoundEvent> MAMMOTH_DISC = register("music.disc.mammoth");
	public static final DeferredHolder<SoundEvent, SoundEvent> LIMAX_MAXIMUS_DISC = register("music.disc.limax_maximus");
	public static final DeferredHolder<SoundEvent, SoundEvent> RELICT_DISC = register("music.disc.relict");
	public static final DeferredHolder<SoundEvent, SoundEvent> GLOOMPER_ANTHEM_DISC = register("music.disc.gloomper_anthem");
	public static final DeferredHolder<SoundEvent, SoundEvent> GLOOMPER_SECRET_DISC = register("music.disc.gloomper_secret");

	public static final DeferredHolder<SoundEvent, SoundEvent> UNDERGARDEN_PORTAL_AMBIENT = register("block.swamplands_portal.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> UNDERGARDEN_PORTAL_ACTIVATE = register("block.swamplands_portal.activate");
	public static final DeferredHolder<SoundEvent, SoundEvent> UNDERGARDEN_PORTAL_TRAVEL = register("block.swamplands_portal.travel");

	public static final DeferredHolder<SoundEvent, SoundEvent> VIRULENT_FLOW = register("block.virulent.flow");
	public static final DeferredHolder<SoundEvent, SoundEvent> VIRULENT_BUBBLE = register("block.virulent.bubble");

	public static final DeferredHolder<SoundEvent, SoundEvent> GRONGLET_AMBIENT = register("block.gronglet.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> GRONGLET_BREAK = register("block.gronglet.break");
	public static final DeferredHolder<SoundEvent, SoundEvent> GRONGLET_PLACE = register("block.gronglet.place");
	public static final DeferredHolder<SoundEvent, SoundEvent> GRONGLET_BURN = register("block.gronglet.burn");

	public static final DeferredHolder<SoundEvent, SoundEvent> BLISTERBOMB_THROW = register("item.blisterbomb");

	public static final DeferredHolder<SoundEvent, SoundEvent> SLINGSHOT_SHOOT = register("item.slingshot.shoot");
	public static final DeferredHolder<SoundEvent, SoundEvent> SLINGSHOT_DRAW = register("item.slingshot.draw");
	public static final DeferredHolder<SoundEvent, SoundEvent> GRONGLET_SHOOT = register("item.slingshot.gronglet_shoot");

	public static final DeferredHolder<SoundEvent, SoundEvent> PICK_BLISTERBERRY_BUSH = register("item.blisterberry_bush.pick");

	public static final DeferredHolder<SoundEvent, SoundEvent> BUCKET_FILL_VIRULENT = register("item.bucket.fill_virulent");
	public static final DeferredHolder<SoundEvent, SoundEvent> BUCKET_EMPTY_VIRULENT = register("item.bucket.empty_virulent");

	public static final DeferredHolder<SoundEvent, SoundEvent> DITCHBULB_PASTE_USE = register("item.ditchbulb_paste.use");

	public static final DeferredHolder<SoundEvent, SoundEvent> BOOMGOURD_PRIMED = register("entity.boomgourd.primed");

	public static final DeferredHolder<SoundEvent, SoundEvent> DWELLER_AMBIENT = register("entity.dweller.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> DWELLER_HURT = register("entity.dweller.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> DWELLER_DEATH = register("entity.dweller.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> DWELLER_JUMP = register("entity.dweller.jump");
	public static final DeferredHolder<SoundEvent, SoundEvent> DWELLER_STEP = register("entity.dweller.step");
	public static final DeferredHolder<SoundEvent, SoundEvent> DWELLER_SADDLE_REMOVE = register("entity.dweller.saddle_remove");

	public static final DeferredHolder<SoundEvent, SoundEvent> ROTLING_AMBIENT = register("entity.rotling.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> ROTLING_HURT = register("entity.rotling.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> ROTLING_DEATH = register("entity.rotling.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> ROTLING_STEP = register("entity.rotling.step");

	public static final DeferredHolder<SoundEvent, SoundEvent> ROTWALKER_AMBIENT = register("entity.rotwalker.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> ROTWALKER_HURT = register("entity.rotwalker.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> ROTWALKER_DEATH = register("entity.rotwalker.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> ROTWALKER_STEP = register("entity.rotwalker.step");

	public static final DeferredHolder<SoundEvent, SoundEvent> ROTBEAST_AMBIENT = register("entity.rotbeast.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> ROTBEAST_HURT = register("entity.rotbeast.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> ROTBEAST_DEATH = register("entity.rotbeast.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> ROTBEAST_STEP = register("entity.rotbeast.step");
	public static final DeferredHolder<SoundEvent, SoundEvent> ROTBEAST_ATTACK = register("entity.rotbeast.attack");

	public static final DeferredHolder<SoundEvent, SoundEvent> BRUTE_AMBIENT = register("entity.brute.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> BRUTE_HURT = register("entity.brute.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> BRUTE_DEATH = register("entity.brute.death");

	public static final DeferredHolder<SoundEvent, SoundEvent> GLOOMPER_AMBIENT = register("entity.gloomper.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> GLOOMPER_HURT = register("entity.gloomper.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> GLOOMPER_DEATH = register("entity.gloomper.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> GLOOMPER_HOP = register("entity.gloomper.hop");
	public static final DeferredHolder<SoundEvent, SoundEvent> GLOOMPER_FART = register("entity.gloomper.fart");

	public static final DeferredHolder<SoundEvent, SoundEvent> STONEBORN_STEP = register("entity.stoneborn.step");
	public static final DeferredHolder<SoundEvent, SoundEvent> STONEBORN_SPEAKING = register("entity.stoneborn.speaking");
	public static final DeferredHolder<SoundEvent, SoundEvent> STONEBORN_PLEASED = register("entity.stoneborn.pleased");
	public static final DeferredHolder<SoundEvent, SoundEvent> STONEBORN_HURT = register("entity.stoneborn.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> STONEBORN_ANGRY = register("entity.stoneborn.angry");
	public static final DeferredHolder<SoundEvent, SoundEvent> STONEBORN_CONFUSED = register("entity.stoneborn.confused");
	public static final DeferredHolder<SoundEvent, SoundEvent> STONEBORN_CHANT = register("entity.stoneborn.chant");
	public static final DeferredHolder<SoundEvent, SoundEvent> STONEBORN_DEATH = register("entity.stoneborn.death");

	public static final DeferredHolder<SoundEvent, SoundEvent> FORGOTTEN_GUARDIAN_AMBIENT = register("entity.forgotten_guardian.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> FORGOTTEN_GUARDIAN_HURT = register("entity.forgotten_guardian.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> FORGOTTEN_GUARDIAN_DEATH = register("entity.forgotten_guardian.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> FORGOTTEN_GUARDIAN_ATTACK = register("entity.forgotten_guardian.attack");
	public static final DeferredHolder<SoundEvent, SoundEvent> FORGOTTEN_GUARDIAN_DEFLECT = register("entity.forgotten_guardian.deflect");
	public static final DeferredHolder<SoundEvent, SoundEvent> FORGOTTEN_GUARDIAN_STEP = register("entity.forgotten_guardian.step");

	public static final DeferredHolder<SoundEvent, SoundEvent> MINION_SHOOT = register("entity.minion.shoot");
	public static final DeferredHolder<SoundEvent, SoundEvent> MINION_DEATH = register("entity.minion.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> MINION_REPAIR = register("entity.minion.repair");

	public static final DeferredHolder<SoundEvent, SoundEvent> NARGOYLE_HURT = register("entity.nargoyle.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> NARGOYLE_DEATH = register("entity.nargoyle.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> NARGOYLE_ATTACK = register("entity.nargoyle.attack");

	public static final DeferredHolder<SoundEvent, SoundEvent> MUNCHER_AMBIENT = register("entity.muncher.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> MUNCHER_HURT = register("entity.muncher.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> MUNCHER_DEATH = register("entity.muncher.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> MUNCHER_CHEW = register("entity.muncher.chew");

	public static final DeferredHolder<SoundEvent, SoundEvent> SPLOOGIE_AMBIENT = register("entity.sploogie.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> SPLOOGIE_HURT = register("entity.sploogie.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> SPLOOGIE_DEATH = register("entity.sploogie.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> SPLOOGIE_SPIT = register("entity.sploogie.spit");

	public static final DeferredHolder<SoundEvent, SoundEvent> GWIB_HURT = register("entity.gwib.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> GWIB_DEATH = register("entity.gwib.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> GWIB_FLOP = register("entity.gwib.flop");

	public static final DeferredHolder<SoundEvent, SoundEvent> GWIBLING_HURT = register("entity.gwibling.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> GWIBLING_DEATH = register("entity.gwibling.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> GWIBLING_FLOP = register("entity.gwibling.flop");

	public static final DeferredHolder<SoundEvent, SoundEvent> MOG_AMBIENT = register("entity.mog.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> MOG_HURT = register("entity.mog.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> MOG_DEATH = register("entity.mog.death");

	public static final DeferredHolder<SoundEvent, SoundEvent> SMOG_MOG_AMBIENT = register("entity.smog_mog.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> SMOG_MOG_HURT = register("entity.smog_mog.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> SMOG_MOG_DEATH = register("entity.smog_mog.death");

	public static final DeferredHolder<SoundEvent, SoundEvent> SCINTLING_HURT = register("entity.scintling.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> SCINTLING_DEATH = register("entity.scintling.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> SCINTLING_STEP = register("entity.scintling.step");

	public static final DeferredHolder<SoundEvent, SoundEvent> FORGOTTEN_AMBIENT = register("entity.forgotten.ambient");
	public static final DeferredHolder<SoundEvent, SoundEvent> FORGOTTEN_HURT = register("entity.forgotten.hurt");
	public static final DeferredHolder<SoundEvent, SoundEvent> FORGOTTEN_DEATH = register("entity.forgotten.death");
	public static final DeferredHolder<SoundEvent, SoundEvent> FORGOTTEN_STEP = register("entity.forgotten.step");

	private static DeferredHolder<SoundEvent, SoundEvent> register(String name) {
		return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, name)));
	}
}