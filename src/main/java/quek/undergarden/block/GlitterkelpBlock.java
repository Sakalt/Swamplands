package sakalti.swamplands.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.KelpBlock;
import sakalti.swamplands.registry.UGBlocks;

public class GlitterkelpBlock extends KelpBlock {

	public GlitterkelpBlock(Properties properties) {
		super(properties);
	}

	@Override
	protected Block getBodyBlock() {
		return UGBlocks.GLITTERKELP_PLANT.get();
	}
}