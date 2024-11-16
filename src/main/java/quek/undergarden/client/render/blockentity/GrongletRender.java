package quek.undergardens.client.render.blockentity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.block.GrongletBlock;
import quek.undergardens.block.entity.GrongletBlockEntity;
import quek.undergardens.client.model.UGModelLayers;

public class GrongletRender implements BlockEntityRenderer<GrongletBlockEntity> {

	private final ModelPart burs;
	private final ModelPart limbs;
	private final ModelPart body;

	public GrongletRender(BlockEntityRendererProvider.Context context) {
		ModelPart gronglet = context.bakeLayer(UGModelLayers.GRONGLET);
		this.burs = gronglet.getChild("burs");
		this.limbs = gronglet.getChild("limbs");
		this.body = gronglet.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition burs = partdefinition.addOrReplaceChild("burs", CubeListBuilder.create(), PartPose.offset(4.0F, 24.0F, -6.0F));

		PartDefinition top_burs = burs.addOrReplaceChild("top_burs", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, 6.0F));

		top_burs.addOrReplaceChild("lastbur", CubeListBuilder.create().texOffs(24, 22).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 4.0F));

		top_burs.addOrReplaceChild("middlebur", CubeListBuilder.create().texOffs(24, 20).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		top_burs.addOrReplaceChild("firstbur", CubeListBuilder.create().texOffs(24, 24).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, -4.0F));

		PartDefinition side_burs = burs.addOrReplaceChild("side_burs", CubeListBuilder.create(), PartPose.offset(-4.0F, -2.0F, 6.0F));

		side_burs.addOrReplaceChild("rightbur", CubeListBuilder.create().texOffs(8, 16).addBox(-2.0F, 0.0F, -6.0F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -0.0F, 0.0F));

		side_burs.addOrReplaceChild("leftbur", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, 0.0F, -6.0F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -0.0F, 0.0F));

		PartDefinition edge_burs = burs.addOrReplaceChild("edge_burs", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, 6.0F));

		edge_burs.addOrReplaceChild("leftedgebur", CubeListBuilder.create().texOffs(4, 16).addBox(0.0F, 0.0F, -6.0F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		edge_burs.addOrReplaceChild("rightedgebur", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -6.0F, 2.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition limbs = partdefinition.addOrReplaceChild("limbs", CubeListBuilder.create(), PartPose.offset(0.0F, 23.99F, 0.0F));

		limbs.addOrReplaceChild("legs", CubeListBuilder.create().texOffs(22, 16).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0F, 6.0F));

		limbs.addOrReplaceChild("arms", CubeListBuilder.create().texOffs(22, 18).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0F, -6.0F));

		partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -6.0F, 8.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void render(GrongletBlockEntity gronglet, float partialTicks, PoseStack stack, MultiBufferSource bufferSource, int light, int overlay) {
		Direction direction = gronglet.getBlockState().getValue(GrongletBlock.FACING);
		stack.pushPose();
		if (direction == Direction.UP) {
			stack.translate(0.5D, 1.5D, 0.5D);
		}
		if (direction == Direction.DOWN) {
			stack.translate(0.5D, -0.5D, 0.5D);
		}
		if (direction == Direction.SOUTH) {
			stack.translate(0.5D, 0.5D, 1.5D);
		}
		if (direction == Direction.NORTH) {
			stack.translate(0.5D, 0.5D, -0.5D);
		}
		if (direction == Direction.EAST) {
			stack.translate(1.5F, 0.5F, 0.5F);
		}
		if (direction == Direction.WEST) {
			stack.translate(-0.5F, 0.5F, 0.5F);
		}
		stack.mulPose(direction.getRotation());
		stack.mulPose(Axis.ZP.rotationDegrees(180F));
		int yaw = gronglet.yaw;
		stack.mulPose(Axis.YP.rotationDegrees(yaw));
		VertexConsumer consumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/block/gronglet.png")));
		this.body.render(stack, consumer, light, overlay);
		this.limbs.render(stack, consumer, light, overlay);
		this.burs.render(stack, consumer, light, overlay);
		stack.popPose();
	}
}
