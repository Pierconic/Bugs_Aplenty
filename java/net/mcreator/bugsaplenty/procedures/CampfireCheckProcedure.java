package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CampfireCheckProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sy = 0;
		found = false;
		sy = 1;
		while (found == false && sy <= 12) {
			if ((world.getBlockState(BlockPos.containing(x, y - sy, z))).getBlock() == Blocks.AIR) {
				sy = sy + 1;
			} else if ((world.getBlockState(BlockPos.containing(x, y - sy, z))).getBlock() == Blocks.CAMPFIRE
					&& ((world.getBlockState(BlockPos.containing(x, y - sy, z))).getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _getbp5
							&& (world.getBlockState(BlockPos.containing(x, y - sy, z))).getValue(_getbp5)) == true) {
				found = true;
				return true;
			} else {
				found = true;
				return false;
			}
		}
		return false;
	}
}
