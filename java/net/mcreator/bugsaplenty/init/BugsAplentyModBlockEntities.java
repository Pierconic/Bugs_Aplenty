
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bugsaplenty.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.bugsaplenty.block.entity.YellowCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.WhiteCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.TermiteNestBlockEntity;
import net.mcreator.bugsaplenty.block.entity.RedCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.PurpleCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.PinkCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.OrangeCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.MagentaCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.LimeCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.LightGrayCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.LightBlueCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.GreenCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.GrayCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.CyanCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.CobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.BrownCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.BlueCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.block.entity.BlackCobbledTerracottaBlockEntity;
import net.mcreator.bugsaplenty.BugsAplentyMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class BugsAplentyModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, BugsAplentyMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> TERMITE_NEST = register("termite_nest", BugsAplentyModBlocks.TERMITE_NEST, TermiteNestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> COBBLED_TERRACOTTA = register("cobbled_terracotta", BugsAplentyModBlocks.COBBLED_TERRACOTTA, CobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> RED_COBBLED_TERRACOTTA = register("red_cobbled_terracotta", BugsAplentyModBlocks.RED_COBBLED_TERRACOTTA, RedCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ORANGE_COBBLED_TERRACOTTA = register("orange_cobbled_terracotta", BugsAplentyModBlocks.ORANGE_COBBLED_TERRACOTTA, OrangeCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> YELLOW_COBBLED_TERRACOTTA = register("yellow_cobbled_terracotta", BugsAplentyModBlocks.YELLOW_COBBLED_TERRACOTTA, YellowCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> LIME_COBBLED_TERRACOTTA = register("lime_cobbled_terracotta", BugsAplentyModBlocks.LIME_COBBLED_TERRACOTTA, LimeCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> LIGHT_BLUE_COBBLED_TERRACOTTA = register("light_blue_cobbled_terracotta", BugsAplentyModBlocks.LIGHT_BLUE_COBBLED_TERRACOTTA, LightBlueCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CYAN_COBBLED_TERRACOTTA = register("cyan_cobbled_terracotta", BugsAplentyModBlocks.CYAN_COBBLED_TERRACOTTA, CyanCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLUE_COBBLED_TERRACOTTA = register("blue_cobbled_terracotta", BugsAplentyModBlocks.BLUE_COBBLED_TERRACOTTA, BlueCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> MAGENTA_COBBLED_TERRACOTTA = register("magenta_cobbled_terracotta", BugsAplentyModBlocks.MAGENTA_COBBLED_TERRACOTTA, MagentaCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PINK_COBBLED_TERRACOTTA = register("pink_cobbled_terracotta", BugsAplentyModBlocks.PINK_COBBLED_TERRACOTTA, PinkCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PURPLE_COBBLED_TERRACOTTA = register("purple_cobbled_terracotta", BugsAplentyModBlocks.PURPLE_COBBLED_TERRACOTTA, PurpleCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BROWN_COBBLED_TERRACOTTA = register("brown_cobbled_terracotta", BugsAplentyModBlocks.BROWN_COBBLED_TERRACOTTA, BrownCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> WHITE_COBBLED_TERRACOTTA = register("white_cobbled_terracotta", BugsAplentyModBlocks.WHITE_COBBLED_TERRACOTTA, WhiteCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> LIGHT_GRAY_COBBLED_TERRACOTTA = register("light_gray_cobbled_terracotta", BugsAplentyModBlocks.LIGHT_GRAY_COBBLED_TERRACOTTA, LightGrayCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GRAY_COBBLED_TERRACOTTA = register("gray_cobbled_terracotta", BugsAplentyModBlocks.GRAY_COBBLED_TERRACOTTA, GrayCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLACK_COBBLED_TERRACOTTA = register("black_cobbled_terracotta", BugsAplentyModBlocks.BLACK_COBBLED_TERRACOTTA, BlackCobbledTerracottaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GREEN_COBBLED_TERRACOTTA = register("green_cobbled_terracotta", BugsAplentyModBlocks.GREEN_COBBLED_TERRACOTTA, GreenCobbledTerracottaBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TERMITE_NEST.get(), (blockEntity, side) -> ((TermiteNestBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((CobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RED_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((RedCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ORANGE_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((OrangeCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, YELLOW_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((YellowCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, LIME_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((LimeCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, LIGHT_BLUE_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((LightBlueCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CYAN_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((CyanCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLUE_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((BlueCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MAGENTA_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((MagentaCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PINK_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((PinkCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PURPLE_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((PurpleCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BROWN_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((BrownCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WHITE_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((WhiteCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, LIGHT_GRAY_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((LightGrayCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRAY_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((GrayCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLACK_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((BlackCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GREEN_COBBLED_TERRACOTTA.get(), (blockEntity, side) -> ((GreenCobbledTerracottaBlockEntity) blockEntity).getItemHandler());
	}
}
