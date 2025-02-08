package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;

public class BeetleSelectionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String color = "";
		if (!entity.level().isClientSide())
			entity.discard();
		color = "none";
		if (y >= 55 && (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sunflower_plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
				color = "yellow";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
				if (Math.random() < 0.7) {
					color = "brown";
				} else {
					color = "green";
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("cherry_grove"))) {
				if (Math.random() < 0.4) {
					color = "brown";
				} else {
					color = "pink";
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna_plateau"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_savanna"))) {
				if (Math.random() < 0.7) {
					color = "orange";
				} else {
					color = "brown";
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mangrove_swamp"))) {
				if (Math.random() < 0.5) {
					color = "red";
				} else {
					color = "brown";
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
				color = "white";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("beach")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("stony_shore"))) {
				color = "blue";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("grove"))) {
				if (Math.random() < 0.7) {
					color = "white";
				} else {
					color = "lightblue";
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle"))) {
				if (Math.random() < 0.5) {
					color = "green";
				} else if (Math.random() < 0.5) {
					color = "lime";
				} else {
					color = "cyan";
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ice_spikes"))) {
				color = "lightblue";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("bamboo_jungle"))) {
				color = "lime";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("flower_forest"))) {
				if (Math.random() < 0.5) {
					color = "pink";
				} else if (Math.random() < 0.5) {
					color = "lightblue";
				} else {
					color = "purple";
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("forest"))) {
				if (Math.random() < 0.7) {
					color = "brown";
				} else {
					color = "green";
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("birch_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_birch_forest"))) {
				if (Math.random() < 0.7) {
					color = "purple";
				} else {
					color = "pink";
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (Math.random() < 0.5) {
					color = "brown";
				} else if (Math.random() < 0.5) {
					color = "green";
				} else {
					color = "red";
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("meadow"))) {
				if (Math.random() < 0.7) {
					color = "pink";
				} else {
					color = "yellow";
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("eroded_badlands"))) {
				if (Math.random() < 0.7) {
					color = "orange";
				} else {
					color = "yellow";
				}
			}
		} else if (y < 55 && (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lush_caves"))) {
				if (Math.random() < 0.5) {
					color = "lime";
				} else if (Math.random() < 0.5) {
					color = "pink";
				} else {
					color = "green";
				}
			} else {
				if (y > 0) {
					color = "lightgray";
				} else {
					color = "gray";
				}
			}
		} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warped_forest"))) {
				color = "cyan";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("crimson_forest"))) {
				color = "red";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("basalt_deltas"))) {
				if (Math.random() < 0.6) {
					color = "black";
				} else {
					color = "gray";
				}
			}
		}
		if ((color).equals("red")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("orange")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("yellow")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("lime")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("green")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("lightblue")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("cyan")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("blue")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("purple")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("pink")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("brown")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("white")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("lightgray")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("gray")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		} else if ((color).equals("black")) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.9) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.75) {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYBodyRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setYHeadRot(Mth.nextInt(RandomSource.create(), -180, 180));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		}
	}
}
