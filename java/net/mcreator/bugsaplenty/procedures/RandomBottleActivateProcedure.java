package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModItems;
import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;
import net.mcreator.bugsaplenty.entity.TermiteEntity;

import java.util.Comparator;

public class RandomBottleActivateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double tone = 0;
		boolean release = false;
		release = false;
		if (entity.isShiftKeyDown() && !(itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem())) {
			release = true;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, (x + entity.getLookAngle().x * 1.5), (y + entity.getLookAngle().y + 0.5), (z + entity.getLookAngle().z * 1.5), 5, 0.2, 0.2, 0.2, 0.1);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (itemstack.getItem() == BugsAplentyModItems.SILVERFISH_BOTTLE.get()) {
			if (release == true) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.SILVERFISH.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (!(itemstack.getDisplayName().getString()).equals("[" + Component.translatable("item.bugs_aplenty.silverfish_bottle").getString() + "]")
						&& !world.getEntitiesOfClass(Silverfish.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(Silverfish.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.silverfish.hurt")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.silverfish.hurt")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
					}
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.ENDERMITE_BOTTLE.get()) {
			if (release == true) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ENDERMITE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (!(itemstack.getDisplayName().getString()).equals("[" + Component.translatable("item.bugs_aplenty.endermite_bottle").getString() + "]")
						&& !world.getEntitiesOfClass(Endermite.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(Endermite.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.endermite.hurt")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.endermite.hurt")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
					}
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.BEE_BOTTLE.get()) {
			if (release == true) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (!(itemstack.getDisplayName().getString()).equals("[" + Component.translatable("item.bugs_aplenty.bee_bottle").getString() + "]")
						&& !world.getEntitiesOfClass(Bee.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(Bee.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.bee.hurt")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.bee.hurt")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
					}
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.TERMITE_BOTTLE.get()) {
			if (release == true) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.8), 0.3, (entity.getLookAngle().z * 0.8));
					}
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (!(itemstack.getDisplayName().getString()).equals("[" + Component.translatable("item.bugs_aplenty.termite_bottle").getString() + "]")
						&& !world.getEntitiesOfClass(TermiteEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(TermiteEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.hurt")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.hurt")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
					}
				}
			}
		}
	}
}
