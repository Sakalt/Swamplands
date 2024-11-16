package quek.swamplands.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.RotwalkerModel;
import quek.swamplands.entity.rotspawn.Rotwalker;

public class RotwalkerEyesLayer<T extends Rotwalker, M extends RotwalkerModel<T>> extends EyesLayer<T, M> {

	private static final RenderType ROTWALKER_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/rotwalker_eyes.png"));

	public RotwalkerEyesLayer(RenderLayerParent<T, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return ROTWALKER_EYES;
	}
}
