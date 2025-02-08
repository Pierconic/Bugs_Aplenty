package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;

public class ButterflySelectionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double type = 0;
		if (!entity.level().isClientSide())
			entity.discard();
		if (Math.random() < 0.01) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.PRISMWING_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle"))) {
				type = Mth.nextInt(RandomSource.create(), 1, 5);
				if (type == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.MALACHITE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.TWILIT_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.POLYCHROME_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SAPPHIRE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SUNBEAM_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_dry/overworld")))) {
				type = Mth.nextInt(RandomSource.create(), 1, 4);
				if (type == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BUCKEYE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.PAINTED_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.PEACOCK_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SUNBEAM_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_cold")))) {
				type = Mth.nextInt(RandomSource.create(), 1, 4);
				if (type == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.AETHERWING_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SAPPHIRE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SNOWLACE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SOOTWING_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("flower_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("meadow"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("birch_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_birch_forest"))) {
				type = Mth.nextInt(RandomSource.create(), 1, 7);
				if (type == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.HAIRSTREAK_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.PEACOCK_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SAPPHIRE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.MONARCH_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SUNBEAM_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.PASTEL_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.MALACHITE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				type = Mth.nextInt(RandomSource.create(), 1, 3);
				if (type == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SOOTWING_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SWALLOWTAIL_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.PEACOCK_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("cherry_grove"))) {
				type = Mth.nextInt(RandomSource.create(), 1, 3);
				if (type == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.PASTEL_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.TWILIT_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.PAINTED_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_forest")))) {
				type = Mth.nextInt(RandomSource.create(), 1, 4);
				if (type == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BUCKEYE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.PEACOCK_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.PAINTED_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.MONARCH_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else {
				type = Mth.nextInt(RandomSource.create(), 1, 4);
				if (type == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.MONARCH_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SUNBEAM_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.SAPPHIRE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else if (type == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.HAIRSTREAK_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			}
		}
	}
}
