package net.mcreator.bugsaplenty.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModGameRules;
import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;
import net.mcreator.bugsaplenty.entity.TermiteEntity;

import java.util.List;
import java.util.Comparator;

public class InfestationBackupProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack carryitem = ItemStack.EMPTY;
		double ex = 0;
		double ey = 0;
		double ez = 0;
		double tx = 0;
		double ty = 0;
		double tz = 0;
		double side = 0;
		{
			Entity _ent = entity;
			_ent.teleportTo((Math.floor(x) + 0.5), (Math.floor(y) + 0.5), (Math.floor(z) + 0.5));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((Math.floor(x) + 0.5), (Math.floor(y) + 0.5), (Math.floor(z) + 0.5), _ent.getYRot(), _ent.getXRot());
		}
		if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = BugsAplentyModEntities.TERMITE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement((Mth.nextDouble(RandomSource.create(), -0.2, 0.2)), (Mth.nextDouble(RandomSource.create(), 0, 0.2)), (Mth.nextDouble(RandomSource.create(), -0.2, 0.2)));
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof TermiteEntity) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, Mth.nextInt(RandomSource.create(), 1200, 1800), 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, Mth.nextInt(RandomSource.create(), 100, 200), 1, false, false));
					}
				}
			}
		} else {
			if (Math.random() < 0.03 || Math.random() < 0.09 && (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK) ? _livEnt.getEffect(MobEffects.LUCK).getDuration() : 0) <= 100) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 1, 0.2, 0.2, 0.2, 0.1);
			}
			if (Math.random() < 0.01 || Math.random() < 0.03 && (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK) ? _livEnt.getEffect(MobEffects.LUCK).getDuration() : 0) <= 100) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:termite.work")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:termite.work")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				{
					Entity _ent = entity;
					_ent.teleportTo(x, (y + 1), z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, (y + 1), z, _ent.getYRot(), _ent.getXRot());
				}
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				{
					Entity _ent = entity;
					_ent.teleportTo((x + 1), (y + 1), z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x + 1), (y + 1), z, _ent.getYRot(), _ent.getXRot());
				}
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				{
					Entity _ent = entity;
					_ent.teleportTo((x - 1), (y + 1), z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x - 1), (y + 1), z, _ent.getYRot(), _ent.getXRot());
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				{
					Entity _ent = entity;
					_ent.teleportTo(x, (y + 1), (z - 1));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, (y + 1), (z - 1), _ent.getYRot(), _ent.getXRot());
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				{
					Entity _ent = entity;
					_ent.teleportTo(x, (y + 1), (z + 1));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, (y + 1), (z + 1), _ent.getYRot(), _ent.getXRot());
				}
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				{
					Entity _ent = entity;
					_ent.teleportTo((x + 1), (y + 1), (z + 1));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x + 1), (y + 1), (z + 1), _ent.getYRot(), _ent.getXRot());
				}
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				{
					Entity _ent = entity;
					_ent.teleportTo((x - 1), (y + 1), (z + 1));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x - 1), (y + 1), (z + 1), _ent.getYRot(), _ent.getXRot());
				}
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				{
					Entity _ent = entity;
					_ent.teleportTo((x + 1), (y + 1), (z - 1));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x + 1), (y + 1), (z - 1), _ent.getYRot(), _ent.getXRot());
				}
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				{
					Entity _ent = entity;
					_ent.teleportTo((x - 1), (y + 1), (z - 1));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x - 1), (y + 1), (z - 1), _ent.getYRot(), _ent.getXRot());
				}
			}
			if (!(entity instanceof LivingEntity _livEnt45 && _livEnt45.hasEffect(MobEffects.LUCK))) {
				ex = x;
				ey = y;
				ez = z;
				while ((world.getBlockState(BlockPos.containing(ex, ey - 1, ez))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(ex + 1, ey - 1, ez))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(ex - 1, ey - 1, ez))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(ex, ey - 1, ez - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(ex, ey - 1, ez + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(ex + 1, ey - 1, ez + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(ex - 1, ey - 1, ez + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(ex + 1, ey - 1, ez - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(ex - 1, ey - 1, ez - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
					if ((world.getBlockState(BlockPos.containing(ex, ey - 1, ez))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
						ey = ey - 1;
					} else if ((world.getBlockState(BlockPos.containing(ex + 1, ey - 1, ez))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
						ex = ex + 1;
						ey = ey - 1;
					} else if ((world.getBlockState(BlockPos.containing(ex - 1, ey - 1, ez))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
						ex = ex - 1;
						ey = ey - 1;
					} else if ((world.getBlockState(BlockPos.containing(ex, ey - 1, ez - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
						ey = ey - 1;
						ez = ez - 1;
					} else if ((world.getBlockState(BlockPos.containing(ex, ey - 1, ez + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
						ey = ey - 1;
						ez = ez + 1;
					} else if ((world.getBlockState(BlockPos.containing(ex + 1, ey - 1, ez + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
						ex = ex + 1;
						ey = ey - 1;
						ez = ez + 1;
					} else if ((world.getBlockState(BlockPos.containing(ex - 1, ey - 1, ez + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
						ex = ex - 1;
						ey = ey - 1;
						ez = ez + 1;
					} else if ((world.getBlockState(BlockPos.containing(ex + 1, ey - 1, ez - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
						ex = ex + 1;
						ey = ey - 1;
						ez = ez - 1;
					} else if ((world.getBlockState(BlockPos.containing(ex - 1, ey - 1, ez - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
						ex = ex - 1;
						ey = ey - 1;
						ez = ez - 1;
					}
				}
				if (!world.getBlockState(BlockPos.containing(ex + 1, ey, ez)).canOcclude() && !world.getBlockState(BlockPos.containing(ex - 1, ey, ez)).canOcclude() && !world.getBlockState(BlockPos.containing(ex, ey, ez - 1)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(ex, ey, ez + 1)).canOcclude()) {
					side = Mth.nextInt(RandomSource.create(), 0, 3);
					if (side == 0) {
						ex = ex + 1;
					} else if (side == 1) {
						ex = ex - 1;
					} else if (side == 2) {
						ez = ez - 1;
					} else {
						ez = ez + 1;
					}
				} else {
					if (!world.getBlockState(BlockPos.containing(ex + 0.5, ey, ez)).canOcclude()) {
						ex = ex + 1;
					} else if (!world.getBlockState(BlockPos.containing(ex - 0.5, ey, ez)).canOcclude()) {
						ex = ex - 1;
					} else if (!world.getBlockState(BlockPos.containing(ex, ey, ez - 0.5)).canOcclude()) {
						ez = ez - 1;
					} else if (!world.getBlockState(BlockPos.containing(ex, ey, ez + 0.5)).canOcclude()) {
						ez = ez + 1;
					} else {
						ex = x;
						ey = y;
						ez = z;
					}
				}
				tx = x;
				ty = y;
				tz = z;
				if (!entity.level().isClientSide())
					entity.discard();
				carryitem = (new ItemStack((world.getBlockState(BlockPos.containing(tx, ty, tz))).getBlock()));
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE.get().spawn(_level, BlockPos.containing(ex, ey, ez), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world.getLevelData().getGameRules().getBoolean(BugsAplentyModGameRules.TERMITEGRIEFING) == true) {
					if (((Entity) world.getEntitiesOfClass(TermiteEntity.class, AABB.ofSize(new Vec3(ex, ey, ez), 3, 3, 3), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(ex, ey, ez)).findFirst().orElse(null)).getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
						ItemStack _setstack = carryitem.copy();
						_setstack.setCount(1);
						_modHandler.setStackInSlot(0, _setstack);
					}
					world.levelEvent(2001, BlockPos.containing(tx, ty, tz), Block.getId((world.getBlockState(BlockPos.containing(tx, ty, tz)))));
					world.setBlock(BlockPos.containing(tx, ty, tz), Blocks.AIR.defaultBlockState(), 3);
				}
			}
		}
	}
}
