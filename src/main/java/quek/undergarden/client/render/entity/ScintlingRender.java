package quek.swamplands.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.ScintlingModel;
import quek.swamplands.client.model.UGModelLayers;
import quek.swamplands.client.render.layer.ScintlingGlowLayer;
import quek.swamplands.entity.animal.Scintling;

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