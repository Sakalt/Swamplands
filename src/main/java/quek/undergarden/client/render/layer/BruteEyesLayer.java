package quek.undergardens.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.BruteModel;
import quek.undergardens.entity.animal.Brute;

public class BruteEyesLayer<T extends Brute, M extends BruteModel<T>> extends EyesLayer<T, M> {

	private static final RenderType BRUTE_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/brute_eyes.png"));

	public BruteEyesLayer(RenderLayerParent<T, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return BRUTE_EYES;
	}
}
