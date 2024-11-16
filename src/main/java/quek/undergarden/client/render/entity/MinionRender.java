package quek.swamplands.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.MinionModel;
import quek.swamplands.client.model.UGModelLayers;
import quek.swamplands.client.render.layer.MinionEyesLayer;
import quek.swamplands.entity.Minion;

public class MinionRender extends MobRenderer<Minion, MinionModel<Minion>> {

	private static final ResourceLocation MINION = ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/minion.png");

	public MinionRender(EntityRendererProvider.Context context) {
		super(context, new MinionModel<>(context.bakeLayer(UGModelLayers.MINION)), 0.5F);
		this.addLayer(new MinionEyesLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(Minion entity) {
		return MINION;
	}
}