package sakalti.swamplands.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import sakalti.swamplands.Undergardens;
import sakalti.swamplands.client.model.RotbeastModel;
import sakalti.swamplands.entity.rotspawn.Rotbeast;

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
