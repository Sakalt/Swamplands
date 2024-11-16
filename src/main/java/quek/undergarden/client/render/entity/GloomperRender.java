package quek.undergardens.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.GloomperModel;
import quek.undergardens.client.model.UGModelLayers;
import quek.undergardens.client.render.layer.GloomperEyesLayer;
import quek.undergardens.entity.animal.Gloomper;

public class GloomperRender extends MobRenderer<Gloomper, GloomperModel<Gloomper>> {

	public static final ResourceLocation GLOOMPER = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/gloomper.png");

	public GloomperRender(EntityRendererProvider.Context context) {
		super(context, new GloomperModel<>(context.bakeLayer(UGModelLayers.GLOOMPER)), 1.0F);
		this.addLayer(new GloomperEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(Gloomper entity) {
		return GLOOMPER;
	}
}