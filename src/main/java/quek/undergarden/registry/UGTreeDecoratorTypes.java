package quek.swamplands.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import quek.swamplands.Undergardens;
import quek.swamplands.world.gen.treedecorator.GrongleLeafDecorator;
import quek.swamplands.world.gen.treedecorator.GrongletTrunkDecorator;
import quek.swamplands.world.gen.treedecorator.ReplaceLeafDecorator;

public class UGTreeDecoratorTypes {
	public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATORS = DeferredRegister.create(Registries.TREE_DECORATOR_TYPE, Undergardens.MODID);

	public static final DeferredHolder<TreeDecoratorType<?>, TreeDecoratorType<GrongleLeafDecorator>> GRONGLE_LEAF_DECORATOR = TREE_DECORATORS.register("grongle_leaf_decorator", () -> new TreeDecoratorType<>(GrongleLeafDecorator.CODEC));
	public static final DeferredHolder<TreeDecoratorType<?>, TreeDecoratorType<GrongletTrunkDecorator>> GRONGLET_TRUNK_DECORATOR = TREE_DECORATORS.register("gronglet_trunk_decorator", () -> new TreeDecoratorType<>(GrongletTrunkDecorator.CODEC));
	public static final DeferredHolder<TreeDecoratorType<?>, TreeDecoratorType<ReplaceLeafDecorator>> REPLACE_LEAF_DECORATOR = TREE_DECORATORS.register("replace_leaf", () -> new TreeDecoratorType<>(ReplaceLeafDecorator.CODEC));
}