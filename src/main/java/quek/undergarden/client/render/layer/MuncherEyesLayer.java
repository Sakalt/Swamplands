package quek.swamplands.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.MuncherModel;
import quek.swamplands.entity.cavern.Muncher;

public class MuncherEyesLayer<T extends Muncher, M extends MuncherModel<T>> extends EyesLayer<T, M> {

	private static final RenderType MUNCHER_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/muncher_eyes.png"));

	public MuncherEyesLayer(RenderLayerParent<T, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return MUNCHER_EYES;
	}
}
