package quek.undergardens.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.KelpBlock;
import quek.undergardens.registry.UGBlocks;

public class GlitterkelpBlock extends KelpBlock {

	public GlitterkelpBlock(Properties properties) {
		super(properties);
	}

	@Override
	protected Block getBodyBlock() {
		return UGBlocks.GLITTERKELP_PLANT.get();
	}
}