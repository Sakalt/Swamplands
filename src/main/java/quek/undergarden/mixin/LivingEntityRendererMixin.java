package quek.undergardens.mixin;

import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import quek.undergardens.registry.UGEffects;

@Mixin(LivingEntityRenderer.class)
public class LivingEntityRendererMixin<T extends LivingEntity> {

	@Inject(method = "isShaking", at = @At("HEAD"), cancellable = true, remap = false)
	public void undergardens$shakeWhileChilly(T entity, CallbackInfoReturnable<Boolean> cir) {
		if (entity.getAttribute(Attributes.MOVEMENT_SPEED).getModifier(UGEffects.CHILLY_MODIFIER) != null) {
			cir.setReturnValue(true);
		}
	}
}
