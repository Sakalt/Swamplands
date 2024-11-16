package quek.undergardens.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.MuncherModel;
import quek.undergardens.client.model.UGModelLayers;
import quek.undergardens.client.render.layer.MuncherEyesLayer;
import quek.undergardens.entity.cavern.Muncher;

public class MuncherRender extends MobRenderer<Muncher, MuncherModel<Muncher>> {

	private static final ResourceLocation MUNCHER = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/muncher.png");

	public MuncherRender(EntityRendererProvider.Context context) {
		super(context, new MuncherModel<>(context.bakeLayer(UGModelLayers.MUNCHER)), 0.5F);
		this.addLayer(new MuncherEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(Muncher entity) {
		return MUNCHER;
	}
}