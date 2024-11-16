package sakalti.swamplands.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import sakalti.swamplands.registry.UGBlockEntities;

public class DepthrockBedBlockEntity extends BlockEntity {

	public DepthrockBedBlockEntity(BlockPos pos, BlockState state) {
		super(UGBlockEntities.DEPTHROCK_BED.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}
}