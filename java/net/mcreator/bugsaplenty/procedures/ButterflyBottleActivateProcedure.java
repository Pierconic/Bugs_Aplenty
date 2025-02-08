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
import net.mcreator.bugsaplenty.entity.TwilitButterflyEntity;
import net.mcreator.bugsaplenty.entity.SwallowtailButterflyEntity;
import net.mcreator.bugsaplenty.entity.SunbeamButterflyEntity;
import net.mcreator.bugsaplenty.entity.SootwingButterflyEntity;
import net.mcreator.bugsaplenty.entity.SnowlaceButterflyEntity;
import net.mcreator.bugsaplenty.entity.SapphireButterflyEntity;
import net.mcreator.bugsaplenty.entity.PrismwingButterflyEntity;
import net.mcreator.bugsaplenty.entity.PolychromeButterflyEntity;
import net.mcreator.bugsaplenty.entity.PeacockButterflyEntity;
import net.mcreator.bugsaplenty.entity.PastelButterflyEntity;
import net.mcreator.bugsaplenty.entity.PaintedButterflyEntity;
import net.mcreator.bugsaplenty.entity.MonarchButterflyEntity;
import net.mcreator.bugsaplenty.entity.MalachiteButterflyEntity;
import net.mcreator.bugsaplenty.entity.HairstreakButterflyEntity;
import net.mcreator.bugsaplenty.entity.BuckeyeButterflyEntity;
import net.mcreator.bugsaplenty.entity.AetherwingButterflyEntity;
import net.mcreator.bugsaplenty.BugsAplentyMod;

import java.util.List;
import java.util.Comparator;

public class ButterflyBottleActivateProcedure {
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
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (itemstack.getItem() == BugsAplentyModItems.MONARCH_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.MONARCH_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(MonarchButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(MonarchButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.SUNBEAM_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.SUNBEAM_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(SunbeamButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(SunbeamButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.SAPPHIRE_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.SAPPHIRE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(SapphireButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(SapphireButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.HAIRSTREAK_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.HAIRSTREAK_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(HairstreakButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(HairstreakButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.BUCKEYE_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.BUCKEYE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(BuckeyeButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(BuckeyeButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.PEACOCK_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.PEACOCK_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(PeacockButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(PeacockButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.PRISMWING_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.PRISMWING_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(PrismwingButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(PrismwingButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.POLYCHROME_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.POLYCHROME_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(PolychromeButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(PolychromeButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.MALACHITE_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.MALACHITE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(MalachiteButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(MalachiteButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.SWALLOWTAIL_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.SWALLOWTAIL_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(SwallowtailButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(SwallowtailButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.SOOTWING_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.SOOTWING_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(SootwingButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(SootwingButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.PAINTED_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.PAINTED_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(PaintedButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(PaintedButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.TWILIT_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TWILIT_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(TwilitButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(TwilitButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.SNOWLACE_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.SNOWLACE_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(SnowlaceButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(SnowlaceButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.PASTEL_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.PASTEL_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(PastelButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(PastelButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
				}
			}
		} else if (itemstack.getItem() == BugsAplentyModItems.AETHERWING_BUTTERFLY_BOTTLE.get()) {
			if (release == true) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.AETHERWING_BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1), (entity.getLookAngle().y * 1), (entity.getLookAngle().z * 1));
					}
				}
				if (!(itemstack.getDisplayName().getString()).equals("[Butterfly Bottle]") && !world.getEntitiesOfClass(AetherwingButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(AetherwingButterflyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
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
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:butterflies")))) {
						entityiterator.getPersistentData().putBoolean("annoying", true);
					}
				}
			}
		});
	}
}
