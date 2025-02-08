package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class ButterflyFlightConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (!world.getLevelData().isRaining() && world instanceof Level _lvl1 && _lvl1.isDay()) {
			return true;
		}
		return false;
	}
}
