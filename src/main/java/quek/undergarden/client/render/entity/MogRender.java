package quek.swamplands.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.MogModel;
import quek.swamplands.client.model.UGModelLayers;
import quek.swamplands.client.render.layer.MogEyesLayer;
import quek.swamplands.entity.animal.Mog;

public class MogRender extends MobRenderer<Mog, MogModel<Mog>> {

	private static final ResourceLocation MOG = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/mog.png");
	private static final ResourceLocation MOG_NAKED = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/mog_naked.png");

	public MogRender(EntityRendererProvider.Context context) {
		super(context, new MogModel<>(context.bakeLayer(UGModelLayers.MOG)), 0.5F);
		this.addLayer(new MogEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(Mog entity) {
		return entity.hasMoss() ? MOG : MOG_NAKED;
	}
}