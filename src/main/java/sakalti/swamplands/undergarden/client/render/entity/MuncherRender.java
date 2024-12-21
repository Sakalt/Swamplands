package sakalti.swamplands.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import sakalti.swamplands.Undergardens;
import sakalti.swamplands.client.model.MuncherModel;
import sakalti.swamplands.client.model.UGModelLayers;
import sakalti.swamplands.client.render.layer.MuncherEyesLayer;
import sakalti.swamplands.entity.cavern.Muncher;

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