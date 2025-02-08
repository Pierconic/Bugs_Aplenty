package net.mcreator.bugsaplenty.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModGameRules;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@EventBusSubscriber
public class BugSpawningProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double count = 0;
		double sx = 0;
		double sz = 0;
		double dragons = 0;
		double butter = 0;
		if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ()))).is(BlockTags.create(ResourceLocation.parse("forge:beetle_spawnable")))) {
			count = 0;
			dragons = 0;
			butter = 0;
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(48 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:beetles")))) {
						count = count + 1;
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:dragonflies")))) {
						dragons = dragons + 1;
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:butterflies")))) {
						butter = butter + 1;
					}
				}
			}
			if (Math.random() < 0.015 * (world.getLevelData().getGameRules().getInt(BugsAplentyModGameRules.AMBIENT_SPAWN_RATE)) && count < 5 && (entity.level().dimension()) == Level.NETHER) {
				sx = Mth.nextInt(RandomSource.create(), -18, 18);
				sz = Mth.nextInt(RandomSource.create(), -18, 18);
				if (Math.abs(sx) >= 9 || Math.abs(sz) >= 9) {
					SpawnBeetleProcedure.execute(world, x + sx, y + 2, z + sx);
					SpawnBeetleProcedure.execute(world, x + sx, y + 1, z + sx);
					SpawnBeetleProcedure.execute(world, x + sx, y, z + sx);
					SpawnBeetleProcedure.execute(world, x + sx, y - 1, z + sx);
					SpawnBeetleProcedure.execute(world, x + sx, y - 2, z + sx);
				}
			} else if (Math.random() < 0.005 * (world.getLevelData().getGameRules().getInt(BugsAplentyModGameRules.AMBIENT_SPAWN_RATE)) && count < 5 && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))
					&& !world.getLevelData().isRaining() && (entity.level().dimension()) == Level.OVERWORLD) {
				sx = Mth.nextInt(RandomSource.create(), -18, 18);
				sz = Mth.nextInt(RandomSource.create(), -18, 18);
				if (Math.abs(sx) >= 9 || Math.abs(sz) >= 9) {
					SpawnBeetleProcedure.execute(world, x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sx)), z + sx);
				}
			} else if (Math.random() < 0.0005 * (world.getLevelData().getGameRules().getInt(BugsAplentyModGameRules.AMBIENT_SPAWN_RATE)) && count < 5 && !world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))
					&& (entity.level().dimension()) == Level.OVERWORLD && y <= 52) {
				sx = Mth.nextInt(RandomSource.create(), -18, 18);
				sz = Mth.nextInt(RandomSource.create(), -18, 18);
				if (Math.abs(sx) >= 9 || Math.abs(sz) >= 9) {
					SpawnBeetleProcedure.execute(world, x + sx, y + 2, z + sx);
					SpawnBeetleProcedure.execute(world, x + sx, y + 1, z + sx);
					SpawnBeetleProcedure.execute(world, x + sx, y, z + sx);
					SpawnBeetleProcedure.execute(world, x + sx, y - 1, z + sx);
					SpawnBeetleProcedure.execute(world, x + sx, y - 2, z + sx);
				}
			}
			if (Math.random() < 0.045 * (world.getLevelData().getGameRules().getInt(BugsAplentyModGameRules.AMBIENT_SPAWN_RATE)) && dragons < 7
					&& (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("swamp")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mangrove_swamp"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle")))) {
				sx = Mth.nextInt(RandomSource.create(), -18, 18);
				sz = Mth.nextInt(RandomSource.create(), -18, 18);
				if (Math.abs(sx) >= 9 || Math.abs(sz) >= 9) {
					SpawnDragonflyProcedure.execute(world, x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
				}
			}
			if (((world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("flower_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("meadow"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("birch_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("cherry_grove"))) && Math.random() < 0.0075 * (world.getLevelData().getGameRules().getInt(BugsAplentyModGameRules.AMBIENT_SPAWN_RATE)) && butter < 7
					|| Math.random() < 0.0015 * (world.getLevelData().getGameRules().getInt(BugsAplentyModGameRules.AMBIENT_SPAWN_RATE)) && butter < 5) && (entity.level().dimension()) == Level.OVERWORLD
					&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) && !world.getLevelData().isRaining() && world instanceof Level _lvl51 && _lvl51.isDay()) {
				sx = Mth.nextInt(RandomSource.create(), -18, 18);
				sz = Mth.nextInt(RandomSource.create(), -18, 18);
				if (Math.abs(sx) >= 9 || Math.abs(sz) >= 9) {
					SpawnButterflyProcedure.execute(world, x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
				}
			}
		}
	}
}
