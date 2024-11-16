package quek.undergardens.block;

import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.KelpPlantBlock;
import quek.undergardens.registry.UGBlocks;

public class GlitterkelpPlantBlock extends KelpPlantBlock {

	public GlitterkelpPlantBlock(Properties properties) {
		super(properties);
	}

	@Override
	protected GrowingPlantHeadBlock getHeadBlock() {
		return UGBlocks.GLITTERKELP.get();
	}
}