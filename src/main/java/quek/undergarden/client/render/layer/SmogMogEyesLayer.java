package sakalti.swamplands.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import sakalti.swamplands.Undergardens;
import sakalti.swamplands.client.model.SmogMogModel;
import sakalti.swamplands.entity.animal.SmogMog;

public class SmogMogEyesLayer<E extends SmogMog, M extends SmogMogModel<E>> extends EyesLayer<E, M> {

	private static final RenderType SMOG_MOG_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/smog_mog_eyes.png"));

	public SmogMogEyesLayer(RenderLayerParent<E, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return SMOG_MOG_EYES;
	}
}
