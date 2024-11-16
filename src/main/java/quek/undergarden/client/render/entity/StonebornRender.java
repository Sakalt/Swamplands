package quek.swamplands.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.StonebornModel;
import quek.swamplands.client.model.UGModelLayers;
import quek.swamplands.client.render.layer.StonebornEyesLayer;
import quek.swamplands.entity.stoneborn.Stoneborn;

public class StonebornRender extends MobRenderer<Stoneborn, StonebornModel<Stoneborn>> {

	private static final ResourceLocation STONEBORN = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/stoneborn.png");

	public StonebornRender(EntityRendererProvider.Context context) {
		super(context, new StonebornModel<>(context.bakeLayer(UGModelLayers.STONEBORN)), 0.6F);
		this.addLayer(new StonebornEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(Stoneborn entity) {
		return STONEBORN;
	}

	@Override
	protected boolean isShaking(Stoneborn stoneborn) {
		return super.isShaking(stoneborn) || (!stoneborn.inUndergardens() && !stoneborn.isNoAi());
	}
}