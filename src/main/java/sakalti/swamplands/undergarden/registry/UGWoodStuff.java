package sakalti.swamplands.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import sakalti.swamplands.Undergardens;

public class UGWoodStuff {

	public static final BlockSetType WIGGLEWOOD_WOOD_SET = new BlockSetType(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "wigglewood").toString());
	public static final BlockSetType SMOGSTEM_WOOD_SET = new BlockSetType(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "smogstem").toString());
	public static final BlockSetType GRONGLE_WOOD_SET = new BlockSetType(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "grongle").toString());

	public static final WoodType WIGGLEWOOD_WOOD_TYPE = WoodType.register(new WoodType(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "wigglewood").toString(), WIGGLEWOOD_WOOD_SET));
	public static final WoodType SMOGSTEM_WOOD_TYPE = WoodType.register(new WoodType(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "smogstem").toString(), SMOGSTEM_WOOD_SET));
	public static final WoodType GRONGLE_WOOD_TYPE = WoodType.register(new WoodType(ResourceLocation.fromNamespaceAndPath(Undergardens.MODID, "grongle").toString(), GRONGLE_WOOD_SET));
}
