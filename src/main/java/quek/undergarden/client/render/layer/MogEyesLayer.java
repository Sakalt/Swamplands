package quek.swamplands.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.MogModel;
import quek.swamplands.entity.animal.Mog;

public class MogEyesLayer<E extends Mog, M extends MogModel<E>> extends EyesLayer<E, M> {

	private static final RenderType MOG_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/mog_eyes.png"));

	public MogEyesLayer(RenderLayerParent<E, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return MOG_EYES;
	}
}
