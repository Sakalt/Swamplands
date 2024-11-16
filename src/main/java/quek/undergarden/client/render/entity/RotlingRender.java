package sakalti.swamplands.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import sakalti.swamplands.Undergardens;
import sakalti.swamplands.client.model.RotlingModel;
import sakalti.swamplands.client.model.UGModelLayers;
import sakalti.swamplands.client.render.layer.RotlingEyesLayer;
import sakalti.swamplands.entity.rotspawn.Rotling;

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