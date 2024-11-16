package quek.swamplands.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.ForgottenModel;
import quek.swamplands.client.model.UGModelLayers;
import quek.swamplands.client.render.layer.ForgottenEyesLayer;
import quek.swamplands.entity.Forgotten;

public class ForgottenRender extends HumanoidMobRenderer<Forgotten, ForgottenModel<Forgotten>> {

	private static final ResourceLocation FORGOTTEN = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/forgotten.png");

	public ForgottenRender(EntityRendererProvider.Context context) {
		super(context, new ForgottenModel<>(context.bakeLayer(UGModelLayers.FORGOTTEN)), 0.5F);
		this.addLayer(new HumanoidArmorLayer<>(this, new ForgottenModel<>(context.bakeLayer(UGModelLayers.FORGOTTEN_INNER_ARMOR)), new ForgottenModel<>(context.bakeLayer(UGModelLayers.FORGOTTEN_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new ForgottenEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(Forgotten entity) {
		return FORGOTTEN;
	}

	@Override
	protected void scale(Forgotten entity, PoseStack stack, float partialTicks) {
		stack.scale(1.1F, 1.1F, 1.1F);
	}
}