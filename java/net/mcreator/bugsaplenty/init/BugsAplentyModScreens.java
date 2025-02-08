
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bugsaplenty.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.bugsaplenty.client.gui.TestScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BugsAplentyModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(BugsAplentyModMenus.TEST.get(), TestScreen::new);
	}
}
