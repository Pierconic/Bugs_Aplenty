package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;
import net.mcreator.bugsaplenty.entity.NestMarkerEntity;

public class SpawnNestMarkerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(!world.getEntitiesOfClass(NestMarkerEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).isEmpty())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.NEST_MARKER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
