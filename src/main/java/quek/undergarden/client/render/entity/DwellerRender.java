package quek.undergardens.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.SaddleLayer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.DwellerModel;
import quek.undergardens.client.model.UGModelLayers;
import quek.undergardens.client.render.layer.DwellerEyesLayer;
import quek.undergardens.entity.animal.dweller.Dweller;

public class DwellerRender extends MobRenderer<Dweller, DwellerModel<Dweller>> {

	private static final ResourceLocation DWELLER = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/dweller.png");
	private static final ResourceLocation DWELLER_SADDLE = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/dweller_saddle.png");

	public DwellerRender(EntityRendererProvider.Context context) {
		super(context, new DwellerModel<>(context.bakeLayer(UGModelLayers.DWELLER)), 0.7F);
		this.addLayer(new DwellerEyesLayer<>(this));
		this.addLayer(new SaddleLayer<>(this, new DwellerModel<>(context.bakeLayer(UGModelLayers.DWELLER_SADDLE)), DWELLER_SADDLE));
	}

	@Override
	public ResourceLocation getTextureLocation(Dweller entity) {
		return DWELLER;
	}
}