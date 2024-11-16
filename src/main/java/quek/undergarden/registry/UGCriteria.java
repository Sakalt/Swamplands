package quek.swamplands.registry;

import net.minecraft.advancements.CriterionTrigger;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import quek.swamplands.Undergardens;
import quek.swamplands.criterion.SlingshotFireTrigger;
import quek.swamplands.criterion.StonebornTradeTrigger;

public class UGCriteria {

	public static final DeferredRegister<CriterionTrigger<?>> CRITERIA = DeferredRegister.create(Registries.TRIGGER_TYPE, Undergardens.MODID);

	public static final DeferredHolder<CriterionTrigger<?>, StonebornTradeTrigger> STONEBORN_TRADE = CRITERIA.register("stoneborn_trade", StonebornTradeTrigger::new);
	public static final DeferredHolder<CriterionTrigger<?>, SlingshotFireTrigger> SLINGSHOT_FIRE = CRITERIA.register("slingshot_fire", SlingshotFireTrigger::new);
}