package sakalti.swamplands.item.tool;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import sakalti.swamplands.registry.UGItems;

import java.util.List;

public class UGShovelItem extends ShovelItem {

	public UGShovelItem(Tier tier, Properties properties) {
		super(tier, properties);
	}

	@Override
	public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
		if (stack.getItem() == UGItems.FROSTSTEEL_SHOVEL.get()) {
			tooltip.add(Component.translatable("tooltip.swamplands.froststeel_weapon").withStyle(ChatFormatting.AQUA));
		}
		if (stack.getItem() == UGItems.FORGOTTEN_SHOVEL.get()) {
			tooltip.add(Component.translatable("tooltip.swamplands.forgotten_tool").withStyle(ChatFormatting.GREEN));
		}
	}
}