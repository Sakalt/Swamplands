package quek.swamplands.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.GloomperModel;
import quek.swamplands.client.model.UGModelLayers;
import quek.swamplands.client.render.layer.GloomperEyesLayer;
import quek.swamplands.entity.animal.Gloomper;

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