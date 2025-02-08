package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.entity.Entity;

public class DragonflyInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("verticality", 0);
	}
}
