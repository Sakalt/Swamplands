package quek.swamplands.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.MuncherModel;
import quek.swamplands.client.model.UGModelLayers;
import quek.swamplands.client.render.layer.MuncherEyesLayer;
import quek.swamplands.entity.cavern.Muncher;

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