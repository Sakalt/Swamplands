package quek.undergardens.item.tool;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import quek.undergardens.registry.UGItems;

import java.util.List;

public class UGPickaxeItem extends PickaxeItem {

	public UGPickaxeItem(Tier tier, Properties properties) {
		super(tier, properties);
	}

	@Override
	public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
		if (stack.getItem() == UGItems.FROSTSTEEL_PICKAXE.get()) {
			tooltip.add(Component.translatable("tooltip.undergardens.froststeel_weapon").withStyle(ChatFormatting.AQUA));
		}
		if (stack.getItem() == UGItems.FORGOTTEN_PICKAXE.get()) {
			tooltip.add(Component.translatable("tooltip.undergardens.forgotten_tool").withStyle(ChatFormatting.GREEN));
		}
	}
}