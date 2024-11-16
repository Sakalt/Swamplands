package quek.swamplands.event;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.neoforge.network.PacketDistributor;
import quek.swamplands.Undergardens;
import quek.swamplands.network.CreateCritParticlePacket;
import quek.swamplands.registry.UGEffects;
import quek.swamplands.registry.UGItems;
import quek.swamplands.registry.UGParticleTypes;
import quek.swamplands.registry.UGTags;

public class UndergardensToolEvents {

	protected static void setupToolEvents() {
		NeoForge.EVENT_BUS.addListener(UndergardensToolEvents::forgottenAttackEvent);
		NeoForge.EVENT_BUS.addListener(UndergardensToolEvents::forgottenDigEvent);
		NeoForge.EVENT_BUS.addListener(UndergardensToolEvents::utheriumAttackEvent);
		NeoForge.EVENT_BUS.addListener(UndergardensToolEvents::froststeelAttackEvent);
		NeoForge.EVENT_BUS.addListener(UndergardensToolEvents::froststeelTickEvent);
	}

	private static void forgottenAttackEvent(LivingIncomingDamageEvent event) {
		Entity source = event.getSource().getEntity();
		float damage = event.getAmount();

		if (source instanceof Player player) {
			if (player.getMainHandItem().getItem() == UGItems.FORGOTTEN_SWORD.get() || player.getMainHandItem().getItem() == UGItems.FORGOTTEN_AXE.get() || player.getMainHandItem().getItem() == UGItems.FORGOTTEN_BATTLEAXE.get()) {
				if (BuiltInRegistries.ENTITY_TYPE.getKey(event.getEntity().getType()).getNamespace().equals(Undergardens.MODID) && !event.getEntity().getType().is(Tags.EntityTypes.BOSSES)) {
					event.setAmount(damage * 1.5F);
				}
			}
		}
	}

	private static void forgottenDigEvent(PlayerEvent.BreakSpeed event) {
		Player player = event.getEntity();
		BlockState state = event.getState();

		if (player.getMainHandItem().getItem() == UGItems.FORGOTTEN_PICKAXE.get() || player.getMainHandItem().getItem() == UGItems.FORGOTTEN_AXE.get() || player.getMainHandItem().getItem() == UGItems.FORGOTTEN_SHOVEL.get() || player.getMainHandItem().getItem() == UGItems.FORGOTTEN_HOE.get()) {
			if (state != null && BuiltInRegistries.BLOCK.getKey(state.getBlock()).getNamespace().equals(Undergardens.MODID)) {
				event.setNewSpeed(event.getOriginalSpeed() * 1.5F);
			}
		}
	}

	private static void utheriumAttackEvent(LivingIncomingDamageEvent event) {
		Entity source = event.getSource().getEntity();
		float damage = event.getAmount();

		if (source instanceof Player player) {
			if (player.getMainHandItem().is(UGItems.UTHERIUM_SWORD.get()) || player.getMainHandItem().is(UGItems.UTHERIUM_AXE.get())) {
				if (event.getEntity().getType().is(UGTags.Entities.ROTSPAWN)) {
					event.setAmount(damage * 1.5F);
					if (!event.getEntity().level().isClientSide()) {
						PacketDistributor.sendToPlayersTrackingEntity(event.getEntity(), new CreateCritParticlePacket(event.getEntity().getId(), 2, UGParticleTypes.UTHERIUM_CRIT.get()));
					}
				}
			}
		}
	}

	private static void froststeelAttackEvent(LivingIncomingDamageEvent event) {
		Entity source = event.getSource().getEntity();
		if (source instanceof Player player) {
			if (player.getMainHandItem().is(UGItems.FROSTSTEEL_SWORD.get()) || player.getMainHandItem().is(UGItems.FROSTSTEEL_AXE.get())) {
				event.getEntity().addEffect(new MobEffectInstance(UGEffects.CHILLY, 600, 2, false, false));
			}
			if (player.getMainHandItem().is(UGItems.FROSTSTEEL_PICKAXE.get()) || player.getMainHandItem().is(UGItems.FROSTSTEEL_SHOVEL.get())) {
				event.getEntity().addEffect(new MobEffectInstance(UGEffects.CHILLY, 600, 1, false, false));
			}
		}
	}

	private static void froststeelTickEvent(EntityTickEvent.Pre event) {
		Entity entity = event.getEntity();
		if (entity instanceof LivingEntity living) {
			if (living.tickCount % 5 == 0 && living.level().isClientSide() && living.getAttribute(Attributes.MOVEMENT_SPEED).getModifier(UGEffects.CHILLY_MODIFIER) != null) {
				for (int i = 0; i < 5; i++) {
					double d0 = living.getRandom().nextFloat() * 2.0F - 1.0F;
					double d1 = living.getRandom().nextFloat() * 2.0F - 1.0F;
					double d2 = living.getRandom().nextFloat() * 2.0F - 1.0F;
					if (!(d0 * d0 + d1 * d1 + d2 * d2 > 1.0D)) {
						double d3 = living.getX(d0 / 2.0D);
						double d4 = living.getY(0.75D + d1 / 4.0D);
						double d5 = living.getZ(d2 / 2.0D);
						living.level().addParticle(UGParticleTypes.SNOWFLAKE.get(), false, d3, d4, d5, d0, d1 + 0.2D, d2);
					}
				}
			}
		}
	}
}