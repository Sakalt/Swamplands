package quek.swamplands.registry;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import quek.swamplands.Undergardens;

import java.util.Map;

public class UGTrimMaterials {
	public static final ResourceKey<TrimMaterial> CLOGGRUM = create("cloggrum");
	public static final ResourceKey<TrimMaterial> FROSTSTEEL = create("froststeel");
	public static final ResourceKey<TrimMaterial> UTHERIUM = create("utherium");
	public static final ResourceKey<TrimMaterial> REGALIUM = create("regalium");
	public static final ResourceKey<TrimMaterial> FORGOTTEN = create("forgotten");

	private static ResourceKey<TrimMaterial> create(String name) {
		return ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, name));
	}

	public static void bootstrap(BootstrapContext<TrimMaterial> context) {
		register(context, CLOGGRUM, UGItems.CLOGGRUM_INGOT, Style.EMPTY.withColor(9863528), 0.2F);
		register(context, FROSTSTEEL, UGItems.FROSTSTEEL_INGOT, Style.EMPTY.withColor(9484768), 0.9F);
		register(context, UTHERIUM, UGItems.UTHERIUM_CRYSTAL, Style.EMPTY.withColor(14440522), 0.4F);
		register(context, REGALIUM, UGItems.REGALIUM_CRYSTAL, Style.EMPTY.withColor(16570493), 0.6F);
		register(context, FORGOTTEN, UGItems.FORGOTTEN_INGOT, Style.EMPTY.withColor(4769934), 0.7F);
	}

	private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Holder<Item> trimItem, Style color, float itemModelIndex) {
		TrimMaterial material = new TrimMaterial(trimKey.location().getPath(), trimItem, itemModelIndex, Map.of(), Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(color));
		context.register(trimKey, material);
	}
}
