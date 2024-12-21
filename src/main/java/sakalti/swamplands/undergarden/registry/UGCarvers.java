package sakalti.swamplands.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.carver.CaveCarverConfiguration;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import sakalti.swamplands.Undergardens;
import sakalti.swamplands.world.gen.carver.UGCaveWorldCarver;

public class UGCarvers {

	public static final DeferredRegister<WorldCarver<?>> CARVERS = DeferredRegister.create(Registries.CARVER, Undergardens.MODID);

	public static final DeferredHolder<WorldCarver<?>, WorldCarver<CaveCarverConfiguration>> UNDERGARDEN_CAVE = CARVERS.register("swamplands_cave", () -> new UGCaveWorldCarver(CaveCarverConfiguration.CODEC));
}