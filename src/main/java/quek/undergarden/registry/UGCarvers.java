package quek.undergardens.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.carver.CaveCarverConfiguration;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import quek.undergardens.Undergardens;
import quek.undergardens.world.gen.carver.UGCaveWorldCarver;

public class UGCarvers {

	public static final DeferredRegister<WorldCarver<?>> CARVERS = DeferredRegister.create(Registries.CARVER, Undergardens.MODID);

	public static final DeferredHolder<WorldCarver<?>, WorldCarver<CaveCarverConfiguration>> UNDERGARDEN_CAVE = CARVERS.register("undergardens_cave", () -> new UGCaveWorldCarver(CaveCarverConfiguration.CODEC));
}