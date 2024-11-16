package quek.undergardens.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.GwibModel;
import quek.undergardens.client.model.UGModelLayers;
import quek.undergardens.client.render.layer.GwibEyesLayer;
import quek.undergardens.entity.animal.Gwib;

public class GwibRender extends MobRenderer<Gwib, GwibModel<Gwib>> {

	public static final ResourceLocation GWIB = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/gwib.png");

	public GwibRender(EntityRendererProvider.Context context) {
		super(context, new GwibModel<>(context.bakeLayer(UGModelLayers.GWIB)), 0.5F);
		this.addLayer(new GwibEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(Gwib entity) {
		return GWIB;
	}

	@Override
	protected void setupRotations(Gwib entity, PoseStack stack, float ageInTicks, float rotationYaw, float partialTicks, float scale) {
		super.setupRotations(entity, stack, ageInTicks, rotationYaw, partialTicks, scale);
		float f = 4.3F * Mth.sin(0.6F * ageInTicks);
		stack.mulPose(Axis.YP.rotationDegrees(-f));
	}
}