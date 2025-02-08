
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bugsaplenty.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class BugsAplentyModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> TERMITEGRIEFING;
	public static GameRules.Key<GameRules.IntegerValue> TERMITERANGE;
	public static GameRules.Key<GameRules.IntegerValue> AMBIENT_SPAWN_RATE;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		TERMITEGRIEFING = GameRules.register("termiteGriefing", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		TERMITERANGE = GameRules.register("termiteRange", GameRules.Category.MOBS, GameRules.IntegerValue.create(16));
		AMBIENT_SPAWN_RATE = GameRules.register("ambientSpawnRate", GameRules.Category.SPAWNING, GameRules.IntegerValue.create(10));
	}
}
