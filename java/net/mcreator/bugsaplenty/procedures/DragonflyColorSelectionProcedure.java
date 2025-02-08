package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;

public class DragonflyColorSelectionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double pallete = 0;
		if (!entity.level().isClientSide())
			entity.discard();
		pallete = Mth.nextInt(RandomSource.create(), 0, 22);
		if (pallete == 0) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_DARNER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_AUBURN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_STING.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 3) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_TREASURE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 4) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_RUDDY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 5) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_AZURE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 6) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_ARBOR.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 7) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_MYSTIC.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 8) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_DEVIL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 9) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_AMBER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 10) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_IRIDESCENT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 11) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_PALE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 12) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_STEELY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 13) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_MIDNIGHT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else if (pallete == 14) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_COAL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		} else {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
