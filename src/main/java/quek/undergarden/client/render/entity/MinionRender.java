package quek.undergardens.client.render.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import quek.undergardens.Undergardens;
import quek.undergardens.client.model.MinionModel;
import quek.undergardens.client.model.UGModelLayers;
import quek.undergardens.client.render.layer.MinionEyesLayer;
import quek.undergardens.entity.Minion;

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