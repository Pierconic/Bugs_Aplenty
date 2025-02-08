package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BeetleSpawnConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y, z))
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() || world.getBlockState(BlockPos.containing(x, y - 2, z)).canOcclude() || world.getBlockState(BlockPos.containing(x, y - 3, z)).canOcclude())) {
			return true;
		}
		return false;
	}
}
