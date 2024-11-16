package quek.undergardens.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.GloomperModel;
import quek.undergardens.entity.animal.Gloomper;

public class GloomperEyesLayer<T extends Gloomper, M extends GloomperModel<T>> extends EyesLayer<T, M> {

	private static final RenderType GLOOMPER_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/gloomper_eyes.png"));

	public GloomperEyesLayer(RenderLayerParent<T, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return GLOOMPER_EYES;
	}
}
