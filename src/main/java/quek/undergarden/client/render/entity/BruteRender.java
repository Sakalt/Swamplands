package quek.undergardens.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.BruteModel;
import quek.undergardens.client.model.UGModelLayers;
import quek.undergardens.client.render.layer.BruteEyesLayer;
import quek.undergardens.entity.animal.Brute;

public class BruteRender extends MobRenderer<Brute, BruteModel<Brute>> {

	private static final ResourceLocation BRUTE = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/brute.png");

	public BruteRender(EntityRendererProvider.Context context) {
		super(context, new BruteModel<>(context.bakeLayer(UGModelLayers.BRUTE)), 0.7F);
		this.addLayer(new BruteEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(Brute entity) {
		return BRUTE;
	}
}
