package sakalti.swamplands.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import sakalti.swamplands.Undergardens;
import sakalti.swamplands.client.model.NargoyleModel;
import sakalti.swamplands.client.model.UGModelLayers;
import sakalti.swamplands.entity.cavern.Nargoyle;

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