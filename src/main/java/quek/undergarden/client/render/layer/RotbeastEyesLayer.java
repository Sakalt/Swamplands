package quek.undergardens.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.RotbeastModel;
import quek.undergardens.entity.rotspawn.Rotbeast;

public class RotbeastEyesLayer<T extends Rotbeast, M extends RotbeastModel<T>> extends EyesLayer<T, M> {

	private static final RenderType ROTBEAST_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/rotbeast_eyes.png"));

	public RotbeastEyesLayer(RenderLayerParent<T, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return ROTBEAST_EYES;
	}
}
