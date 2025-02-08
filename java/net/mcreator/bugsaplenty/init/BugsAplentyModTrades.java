
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.bugsaplenty.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class BugsAplentyModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(BugsAplentyModItems.CYAN_BEETLE_BOTTLE.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(BugsAplentyModItems.BLUE_BEETLE_BOTTLE.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(BugsAplentyModItems.RED_BEETLE_BOTTLE.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(BugsAplentyModItems.MAGENTA_DRAGONFLY_BOTTLE.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(BugsAplentyModItems.CYAN_DRAGONFLY_BOTTLE.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 12), new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SHINY.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 12), new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_STRIPED.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 16), new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SHINY_STRIPED.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SPOTTED.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SHINY_SPOTTED.get()), 10, 5, 0.05f));
	}
}
