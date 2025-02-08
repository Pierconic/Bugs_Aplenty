package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModItems;
import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;
import net.mcreator.bugsaplenty.entity.DragonflyTreasureEntity;
import net.mcreator.bugsaplenty.entity.DragonflyStingEntity;
import net.mcreator.bugsaplenty.entity.DragonflySteelyEntity;
import net.mcreator.bugsaplenty.entity.DragonflyRuddyEntity;
import net.mcreator.bugsaplenty.entity.DragonflyPaleEntity;
import net.mcreator.bugsaplenty.entity.DragonflyMysticEntity;
import net.mcreator.bugsaplenty.entity.DragonflyMidnightEntity;
import net.mcreator.bugsaplenty.entity.DragonflyIridescentEntity;
import net.mcreator.bugsaplenty.entity.DragonflyFushaEntity;
import net.mcreator.bugsaplenty.entity.DragonflyDevilEntity;
import net.mcreator.bugsaplenty.entity.DragonflyDarnerEntity;
import net.mcreator.bugsaplenty.entity.DragonflyCoalEntity;
import net.mcreator.bugsaplenty.entity.DragonflyAzureEntity;
import net.mcreator.bugsaplenty.entity.DragonflyArborEntity;
import net.mcreator.bugsaplenty.entity.DragonflyAmberEntity;
import net.mcreator.bugsaplenty.BugsAplentyMod;

import java.util.List;
import java.util.Comparator;

public class DragonflyBottleActivateProcedure {
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
		if (itemstack.getItem() == BugsAplentyModItems.RED_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_DARNER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyDarnerEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyDarnerEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.ORANGE_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_AMBER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyAmberEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyAmberEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.YELLOW_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_STING.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyStingEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyStingEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.LIME_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_TREASURE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyTreasureEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyTreasureEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.GREEN_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_RUDDY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyRuddyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyRuddyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.LIGHT_BLUE_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_AZURE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyAzureEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyAzureEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.CYAN_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_ARBOR.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyArborEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyArborEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.BLUE_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_MYSTIC.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyMysticEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyMysticEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.PURPLE_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_IRIDESCENT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyIridescentEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyIridescentEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.MAGENTA_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_FUSHA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyFushaEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyFushaEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.PINK_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_DEVIL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyDevilEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyDevilEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.BROWN_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_AMBER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyAmberEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyAmberEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.WHITE_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_PALE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyPaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyPaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.LIGHT_GRAY_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_STEELY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflySteelyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflySteelyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.GRAY_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_MIDNIGHT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyMidnightEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyMidnightEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.BLACK_DRAGONFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.DRAGONFLY_COAL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Dragonfly Bottle]") && !world.getEntitiesOfClass(DragonflyCoalEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(DragonflyCoalEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		}
		BugsAplentyMod.queueServerWork(2, () -> {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:dragonflies")))) {
						entityiterator.getPersistentData().putBoolean("annoying", true);
					}
				}
			}
		});
	}
}
