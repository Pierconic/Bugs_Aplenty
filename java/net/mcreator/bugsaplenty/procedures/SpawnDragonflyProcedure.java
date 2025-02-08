package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;

public class SpawnDragonflyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sz = 0;
		double count = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:beetle_spawnable")))
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:beetle_clear")))
				&& (world.getBlockState(BlockPos.containing(x, y + 2, z))).is(BlockTags.create(ResourceLocation.parse("forge:beetle_clear")))) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY.get().spawn(_level, BlockPos.containing(x + 0.5, y + 2, z + 0.5), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
	}
}
