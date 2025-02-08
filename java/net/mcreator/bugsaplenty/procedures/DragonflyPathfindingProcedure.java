package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class DragonflyPathfindingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("annoying") && !(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).isEmpty())) {
			if (!entity.level().isClientSide())
				entity.discard();
		} else {
			if (entity.isInWall()) {
				if (world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
					{
						Entity _ent = entity;
						_ent.teleportTo((x + 1), y, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + 1), y, z, _ent.getYRot(), _ent.getXRot());
					}
				} else if (world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
					{
						Entity _ent = entity;
						_ent.teleportTo((x - 1), y, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x - 1), y, z, _ent.getYRot(), _ent.getXRot());
					}
				} else if (world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
					{
						Entity _ent = entity;
						_ent.teleportTo(x, y, (z - 1));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, (z - 1), _ent.getYRot(), _ent.getXRot());
					}
				} else if (world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
					{
						Entity _ent = entity;
						_ent.teleportTo(x, y, (z + 1));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, (z + 1), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
			if (world.getBlockState(BlockPos.containing(x, y - 0.6, z)).canOcclude()) {
				entity.setShiftKeyDown(true);
				entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y()), 0));
			} else {
				entity.setShiftKeyDown(false);
				if (Math.random() < 0.03) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:dragonfly.hover")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:dragonfly.hover")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				}
			}
			if (entity instanceof LivingEntity _livEnt26 && _livEnt26.hasEffect(MobEffects.LUCK)) {
				if (world.getBlockState(BlockPos.containing(x + entity.getLookAngle().x * 0.7, y + 0.3, z + entity.getLookAngle().z * 0.7)).canOcclude()) {
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() + Mth.nextInt(RandomSource.create(), 160, 180)));
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				}
				entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.5), (entity.getPersistentData().getDouble("verticality")), (entity.getLookAngle().z * 0.5)));
			} else if (!(entity instanceof LivingEntity _livEnt37 && _livEnt37.hasEffect(MobEffects.CONFUSION)) && !(entity instanceof LivingEntity _livEnt38 && _livEnt38.hasEffect(MobEffects.LUCK))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, Mth.nextInt(RandomSource.create(), 20, 120), 1, false, false));
			} else if (!(entity instanceof LivingEntity _livEnt41 && _livEnt41.hasEffect(MobEffects.LUCK))
					&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.CONFUSION) ? _livEnt.getEffect(MobEffects.CONFUSION).getDuration() : 0) == 1
					|| !world.getEntitiesOfClass(Frog.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty() || !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 3, 3, 3), e -> true).isEmpty()) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.CONFUSION);
				if (Math.random() < 0.5) {
					{
						Entity _ent = entity;
						_ent.setYRot(Mth.nextInt(RandomSource.create(), 0, 180));
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				} else {
					{
						Entity _ent = entity;
						_ent.setYRot(Mth.nextInt(RandomSource.create(), -180, 0));
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, Mth.nextInt(RandomSource.create(), 40, 70), 1, false, false));
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) || !((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR)
						|| !world.getEntitiesOfClass(Frog.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty() || !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 3, 3, 3), e -> true).isEmpty()) {
					entity.getPersistentData().putDouble("verticality", 0.1);
				} else if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 2, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 3, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 4, z))
						&& world.isEmptyBlock(BlockPos.containing(x, y - 5, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 6, z))) {
					entity.getPersistentData().putDouble("verticality", (-0.1));
				} else {
					if (Math.random() < 0.5) {
						entity.getPersistentData().putDouble("verticality", 0);
					} else {
						if (Math.random() < 0.5) {
							entity.getPersistentData().putDouble("verticality", 0.05);
						} else {
							entity.getPersistentData().putDouble("verticality", (-0.05));
						}
					}
				}
			} else {
				if (!((world.getBlockState(BlockPos.containing(x + entity.getLookAngle().x * 0.7, y + 0.3, z + entity.getLookAngle().z * 0.7))).getBlock() == Blocks.AIR)) {
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() + Mth.nextInt(RandomSource.create(), 160, 180)));
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.5), (entity.getPersistentData().getDouble("verticality")), (entity.getLookAngle().z * 0.5)));
				}
			}
		}
	}
}
