package sakalti.swamplands.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import sakalti.swamplands.Undergardens;
import sakalti.swamplands.registry.UGFluids;
import sakalti.swamplands.registry.UGTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class UGFluidTags extends FluidTagsProvider {

	public UGFluidTags(PackOutput output, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, future, Undergardens.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		tag(UGTags.Fluids.VIRULENT).add(UGFluids.VIRULENT_MIX_SOURCE.get(), UGFluids.VIRULENT_MIX_FLOWING.get());
	}
}
