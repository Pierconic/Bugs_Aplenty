
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bugsaplenty.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.bugsaplenty.BugsAplentyMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class BugsAplentyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BugsAplentyMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(BugsAplentyModItems.TERMITE_SPAWN_EGG.get());
			tabData.accept(BugsAplentyModItems.DRAGONFLY_SPAWN_EGG.get());
			tabData.accept(BugsAplentyModItems.DRAGONFLY_WING.get());
			tabData.accept(BugsAplentyModItems.BEETLE_SPAWN_EGG.get());
			tabData.accept(BugsAplentyModItems.BUTTERFLY_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(BugsAplentyModBlocks.TERMITE_NEST.get().asItem());
			tabData.accept(BugsAplentyModBlocks.COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.RED_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.ORANGE_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.YELLOW_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.LIME_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.LIGHT_BLUE_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.CYAN_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.BLUE_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.MAGENTA_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.PINK_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.PURPLE_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.BROWN_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.WHITE_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.LIGHT_GRAY_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.GRAY_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.BLACK_COBBLED_TERRACOTTA.get().asItem());
			tabData.accept(BugsAplentyModBlocks.GREEN_COBBLED_TERRACOTTA.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(BugsAplentyModItems.COPPER_NET.get());

		}
	}
}
