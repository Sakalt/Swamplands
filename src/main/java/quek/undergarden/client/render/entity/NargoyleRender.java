package quek.undergardens.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.NargoyleModel;
import quek.undergardens.client.model.UGModelLayers;
import quek.undergardens.entity.cavern.Nargoyle;

public class NargoyleRender extends MobRenderer<Nargoyle, NargoyleModel<Nargoyle>> {

	private static final ResourceLocation NARGOYLE = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/nargoyle.png");

	public NargoyleRender(EntityRendererProvider.Context context) {
		super(context, new NargoyleModel<>(context.bakeLayer(UGModelLayers.NARGOYLE)), 0.8F);
	}

	@Override
	public ResourceLocation getTextureLocation(Nargoyle entity) {
		return NARGOYLE;
	}
}