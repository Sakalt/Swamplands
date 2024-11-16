package quek.undergardens.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.SmogMogModel;
import quek.undergardens.client.model.UGModelLayers;
import quek.undergardens.client.render.layer.SmogMogEyesLayer;
import quek.undergardens.entity.animal.SmogMog;

public class SmogMogRender extends MobRenderer<SmogMog, SmogMogModel<SmogMog>> {

	private static final ResourceLocation SMOG_MOG = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/smog_mog.png");
	private static final ResourceLocation SMOG_MOG_NAKED = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/smog_mog_naked.png");

	public SmogMogRender(EntityRendererProvider.Context context) {
		super(context, new SmogMogModel<>(context.bakeLayer(UGModelLayers.SMOG_MOG)), 0.5F);
		this.addLayer(new SmogMogEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(SmogMog entity) {
		return entity.hasMoss() ? SMOG_MOG : SMOG_MOG_NAKED;
	}
}
