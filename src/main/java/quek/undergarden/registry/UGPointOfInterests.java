package quek.swamplands.registry;

import com.google.common.collect.ImmutableSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import quek.swamplands.Undergardens;

public class UGPointOfInterests {

	public static final DeferredRegister<PoiType> POI = DeferredRegister.create(Registries.POINT_OF_INTEREST_TYPE, Undergardens.MODID);

	public static final DeferredHolder<PoiType, PoiType> UNDERGARDEN_PORTAL = POI.register("swamplands_portal", () -> new PoiType(ImmutableSet.copyOf(UGBlocks.UNDERGARDEN_PORTAL.get().getStateDefinition().getPossibleStates()), 0, 1));
}
