package sakalti.swamplands.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import sakalti.swamplands.Undergardens;
import sakalti.swamplands.client.model.ScintlingModel;
import sakalti.swamplands.client.model.UGModelLayers;
import sakalti.swamplands.client.render.layer.ScintlingGlowLayer;
import sakalti.swamplands.entity.animal.Scintling;

public class ScintlingRender extends MobRenderer<Scintling, ScintlingModel<Scintling>> {

	private static final ResourceLocation SCINTLING = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/scintling.png");

	public ScintlingRender(EntityRendererProvider.Context context) {
		super(context, new ScintlingModel<>(context.bakeLayer(UGModelLayers.SCINTLING)), 0.5F);
		this.addLayer(new ScintlingGlowLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(Scintling entity) {
		return SCINTLING;
	}

}