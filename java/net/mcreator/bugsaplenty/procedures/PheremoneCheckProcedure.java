package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;
import net.mcreator.bugsaplenty.entity.TermiteEntity;

import java.util.Comparator;

public class PheremoneCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
				&& !(world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
				&& !(world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
				&& !(world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible"))) || !(entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(MobEffects.LUCK))) {
			if (!entity.level().isClientSide())
				entity.discard();
		} else if (!world.getEntitiesOfClass(TermiteEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.2, 1.2, 1.2), e -> true).isEmpty()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, (((Entity) world.getEntitiesOfClass(TermiteEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.2, 1.2, 1.2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX()), (((Entity) world.getEntitiesOfClass(TermiteEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.2, 1.2, 1.2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY()), (((Entity) world.getEntitiesOfClass(TermiteEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.2, 1.2, 1.2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()), 6, 0.2, 0.2, 0.2, 0.1);
			if (!((Entity) world.getEntitiesOfClass(TermiteEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.2, 1.2, 1.2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
				((Entity) world.getEntitiesOfClass(TermiteEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.2, 1.2, 1.2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
			if (!entity.level().isClientSide())
				entity.discard();
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE_INFESTATION.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE_INFESTATION.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE_INFESTATION.get().spawn(_level, BlockPos.containing(x, y, z - 1), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE_INFESTATION.get().spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
		}
	}
}
