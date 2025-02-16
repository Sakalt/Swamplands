package sakalti.swamplands.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import sakalti.swamplands.Undergardens;
import sakalti.swamplands.client.model.SploogieModel;
import sakalti.swamplands.client.model.UGModelLayers;
import sakalti.swamplands.entity.cavern.Sploogie;

public class SploogieRender extends MobRenderer<Sploogie, SploogieModel<Sploogie>> {

	private static final ResourceLocation SPLOOGIE = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/sploogie.png");

	public SploogieRender(EntityRendererProvider.Context context) {
		super(context, new SploogieModel<>(context.bakeLayer(UGModelLayers.SPLOOGIE)), 0.5F);
	}

	@Override
	public ResourceLocation getTextureLocation(Sploogie entity) {
		return SPLOOGIE;
	}
}
