package quek.swamplands.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.GwiblingModel;
import quek.swamplands.entity.animal.Gwibling;

public class GwiblingEyesLayer<T extends Gwibling, M extends GwiblingModel<T>> extends EyesLayer<T, M> {

	private static final RenderType GWIBLING_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/gwibling_eyes.png"));

	public GwiblingEyesLayer(RenderLayerParent<T, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return GWIBLING_EYES;
	}
}
