package quek.undergardens.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.GwibModel;
import quek.undergardens.entity.animal.Gwib;

public class GwibEyesLayer<T extends Gwib, M extends GwibModel<T>> extends EyesLayer<T, M> {

	private static final RenderType GWIB_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/gwib_eyes.png"));

	public GwibEyesLayer(RenderLayerParent<T, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return GWIB_EYES;
	}
}
