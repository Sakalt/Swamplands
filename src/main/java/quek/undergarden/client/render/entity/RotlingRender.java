package quek.undergardens.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.RotlingModel;
import quek.undergardens.client.model.UGModelLayers;
import quek.undergardens.client.render.layer.RotlingEyesLayer;
import quek.undergardens.entity.rotspawn.Rotling;

public class RotlingRender extends MobRenderer<Rotling, RotlingModel<Rotling>> {

	private static final ResourceLocation ROTLING = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/rotling.png");

	public RotlingRender(EntityRendererProvider.Context context) {
		super(context, new RotlingModel<>(context.bakeLayer(UGModelLayers.ROTLING)), 0.6F);
		this.addLayer(new RotlingEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(Rotling entity) {
		return ROTLING;
	}
}