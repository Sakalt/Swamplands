package sakalti.swamplands.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import sakalti.swamplands.Undergardens;
import sakalti.swamplands.client.model.DwellerModel;
import sakalti.swamplands.entity.animal.dweller.Dweller;

public class DwellerEyesLayer<T extends Dweller, M extends DwellerModel<T>> extends EyesLayer<T, M> {

	private final static RenderType DWELLER_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/dweller_eyes.png"));

	public DwellerEyesLayer(RenderLayerParent<T, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return DWELLER_EYES;
	}
}
