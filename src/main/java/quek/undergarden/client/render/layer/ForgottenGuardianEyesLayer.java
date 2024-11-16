package quek.swamplands.client.render.layer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import quek.swamplands.Undergardens;
import quek.swamplands.client.model.ForgottenGuardianModel;
import quek.swamplands.entity.boss.ForgottenGuardian;

public class ForgottenGuardianEyesLayer<T extends ForgottenGuardian, M extends ForgottenGuardianModel<T>> extends EyesLayer<T, M> {

	private static final RenderType FORGOTTEN_GUARDIAN_EYES = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "textures/entity/forgotten_guardian_eyes.png"));

	public ForgottenGuardianEyesLayer(RenderLayerParent<T, M> parent) {
		super(parent);
	}

	@Override
	public RenderType renderType() {
		return FORGOTTEN_GUARDIAN_EYES;
	}

}