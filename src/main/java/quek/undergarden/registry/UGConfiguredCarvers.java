package quek.undergardens.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantFloat;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.carver.CaveCarverConfiguration;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import quek.undergardens.Undergardens;

@SuppressWarnings("unused")
public class UGConfiguredCarvers {

	public static final ResourceKey<ConfiguredWorldCarver<?>> UNDERGARDEN_CAVE = ResourceKey.create(Registries.CONFIGURED_CARVER, ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "undergardens_cave"));

	public static void bootstrap(BootstrapContext<ConfiguredWorldCarver<?>> context) {
		context.register(UNDERGARDEN_CAVE, UGCarvers.UNDERGARDEN_CAVE.get().configured(new CaveCarverConfiguration(0.5F, UniformHeight.of(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(1)), ConstantFloat.of(0.5F), VerticalAnchor.aboveBottom(10), BuiltInRegistries.BLOCK.getOrCreateTag(UGTags.Blocks.UNDERGARDEN_CARVER_REPLACEABLES), ConstantFloat.of(1.0F), ConstantFloat.of(1.0F), ConstantFloat.of(-0.7F))));
	}
}