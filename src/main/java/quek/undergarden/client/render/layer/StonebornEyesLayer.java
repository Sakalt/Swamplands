package quek.undergardens.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.StonebornModel;
import quek.undergardens.entity.stoneborn.Stoneborn;

public class StonebornEyesLayer<T extends Stoneborn, M extends StonebornModel<T>> extends EyesLayer<T, M> {

	private static final RenderType STONEBORN_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/stoneborn_eyes.png"));

	public StonebornEyesLayer(RenderLayerParent<T, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return STONEBORN_EYES;
	}

}
