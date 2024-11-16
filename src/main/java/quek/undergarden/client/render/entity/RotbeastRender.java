package quek.undergardens.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.RotbeastModel;
import quek.undergardens.client.model.UGModelLayers;
import quek.undergardens.client.render.layer.RotbeastEyesLayer;
import quek.undergardens.entity.rotspawn.Rotbeast;

public class RotbeastRender extends MobRenderer<Rotbeast, RotbeastModel<Rotbeast>> {

	private static final ResourceLocation ROTBEAST = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/rotbeast.png");

	public RotbeastRender(EntityRendererProvider.Context context) {
		super(context, new RotbeastModel<>(context.bakeLayer(UGModelLayers.ROTBEAST)), 0.6F);
		this.addLayer(new RotbeastEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(Rotbeast entity) {
		return ROTBEAST;
	}

	@Override
	protected void setupRotations(Rotbeast entity, PoseStack stack, float ageInTicks, float rotationYaw, float partialTicks, float scale) {
		super.setupRotations(entity, stack, ageInTicks, rotationYaw, partialTicks, scale);
		if (!((double) entity.walkAnimation.speed() < 0.01D)) {
			float f1 = entity.walkAnimation.position() - entity.walkAnimation.speed() * (1.0F - partialTicks) + 6.0F;
			float f2 = (Math.abs(f1 % 13.0F - 6.5F) - 3.25F) / 3.25F;
			stack.mulPose(Axis.ZP.rotationDegrees(6.5F * f2));
		}
	}
}