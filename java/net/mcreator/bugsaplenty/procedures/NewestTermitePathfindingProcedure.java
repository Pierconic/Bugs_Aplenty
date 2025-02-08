package net.mcreator.bugsaplenty.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;
import net.mcreator.bugsaplenty.init.BugsAplentyModBlocks;
import net.mcreator.bugsaplenty.entity.NestMarkerEntity;
import net.mcreator.bugsaplenty.BugsAplentyMod;

import java.util.Comparator;

public class NewestTermitePathfindingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean full = false;
		boolean found = false;
		full = false;
		if ((new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
					return _modHandler.getStackInSlot(sltid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(0, entity)).getCount() > 0) {
			full = true;
		}
		if ((full == true || !(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.LUCK))) && !world.getEntitiesOfClass(NestMarkerEntity.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).isEmpty()
				&& !(!world.getEntitiesOfClass(Silverfish.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty())) {
			if (entity instanceof Mob _entity && ((Entity) world.getEntitiesOfClass(NestMarkerEntity.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _ent)
				_entity.setTarget(_ent);
			if (entity.getDeltaMovement().x() <= 0.1 && entity.getDeltaMovement().z() <= 0.1) {
				BugsAplentyMod.queueServerWork(120, () -> {
					if (entity.getDeltaMovement().x() <= 0.1 && entity.getDeltaMovement().z() <= 0.1) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 400, 1, false, false));
						if (entity instanceof Mob _entity)
							_entity.getNavigation().stop();
					}
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y - 0.4, z))).getBlock() == BugsAplentyModBlocks.TERMITE_NEST.get()) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 8, 0.2, 0.2, 0.2, 0.1);
				if ((new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						if (world instanceof ILevelExtension _ext) {
							IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
							if (_itemHandler != null)
								return _itemHandler.getStackInSlot(slotid).getCount();
						}
						return 0;
					}
				}.getAmount(world, BlockPos.containing(x, y - 0.4, z), 0) == 0 || (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
							return _modHandler.getStackInSlot(sltid).copy();
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack(0, entity)).getItem() == (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						if (world instanceof ILevelExtension _ext) {
							IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
							if (_itemHandler != null)
								return _itemHandler.getStackInSlot(slotid).copy();
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack(world, BlockPos.containing(x, y - 0.4, z), 0)).getItem()) && new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						if (world instanceof ILevelExtension _ext) {
							IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
							if (_itemHandler != null)
								return _itemHandler.getStackInSlot(slotid).getCount();
						}
						return 0;
					}
				}.getAmount(world, BlockPos.containing(x, y - 0.4, z), 0) <= 63) {
					if (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							if (world instanceof ILevelExtension _ext) {
								IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
								if (_itemHandler != null)
									return _itemHandler.getStackInSlot(slotid).getCount();
							}
							return 0;
						}
					}.getAmount(world, BlockPos.containing(x, y - 0.4, z), 0) == 0) {
						if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y - 0.4, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
							ItemStack _setstack = (new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
										return _modHandler.getStackInSlot(sltid).copy();
									}
									return ItemStack.EMPTY;
								}
							}.getItemStack(0, entity)).copy();
							_setstack.setCount(1);
							_itemHandlerModifiable.setStackInSlot(0, _setstack);
						}
					} else {
						(new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								if (world instanceof ILevelExtension _ext) {
									IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
									if (_itemHandler != null)
										return _itemHandler.getStackInSlot(slotid).copy();
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack(world, BlockPos.containing(x, y - 0.4, z), 0)).setCount((int) (new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								if (world instanceof ILevelExtension _ext) {
									IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
									if (_itemHandler != null)
										return _itemHandler.getStackInSlot(slotid).getCount();
								}
								return 0;
							}
						}.getAmount(world, BlockPos.containing(x, y, z), 0) + 1));
					}
					CobbledTerracottaGenerationProcedure.execute(world, x, y - 0.4, z);
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
									return _modHandler.getStackInSlot(sltid).copy();
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack(0, entity)));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.beehive.enter")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.beehive.enter")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		} else if (full == false && entity instanceof LivingEntity _livEnt32 && _livEnt32.hasEffect(MobEffects.LUCK) && !(entity instanceof LivingEntity _livEnt33 && _livEnt33.hasEffect(MobEffects.UNLUCK))
				&& !(!world.getEntitiesOfClass(Silverfish.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty())) {
			if (entity.onGround()) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(x + 2, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
					entity.setDeltaMovement(new Vec3(0.3, (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
				} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(x - 2, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
					entity.setDeltaMovement(new Vec3((-0.3), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
				} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(x, y, z - 2))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (-0.3)));
				} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						|| (world.getBlockState(BlockPos.containing(x, y, z + 2))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), 0.3));
				} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
					entity.setDeltaMovement(new Vec3(0.3, (entity.getDeltaMovement().y()), 0.3));
				} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
					entity.setDeltaMovement(new Vec3((-0.3), (entity.getDeltaMovement().y()), 0.3));
				} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
					entity.setDeltaMovement(new Vec3(0.3, (entity.getDeltaMovement().y()), (-0.3)));
				} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))
						&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
					entity.setDeltaMovement(new Vec3((-0.3), (entity.getDeltaMovement().y()), (-0.3)));
				}
			}
			sx = -9;
			for (int index0 = 0; index0 < 18; index0++) {
				sy = -4;
				for (int index1 = 0; index1 < 8; index1++) {
					sz = -9;
					for (int index2 = 0; index2 < 18; index2++) {
						if (found == false) {
							if ((world.getBlockState(BlockPos.containing(Math.floor(x) + sx, Math.floor(y) + sy, Math.floor(z) + sz))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
								if ((world.getBlockState(BlockPos.containing(Math.floor(x) + sx + 1, Math.floor(y) + sy, Math.floor(z) + sz))).is(BlockTags.create(ResourceLocation.parse("forge:beetle_clear")))
										&& world.getBlockState(BlockPos.containing(Math.floor(x) + sx + 1, (Math.floor(y) + sy) - 1, Math.floor(z) + sz)).isFaceSturdy(world,
												BlockPos.containing(Math.floor(x) + sx + 1, (Math.floor(y) + sy) - 1, Math.floor(z) + sz), Direction.UP)
										|| (world.getBlockState(BlockPos.containing((Math.floor(x) + sx) - 1, Math.floor(y) + sy, Math.floor(z) + sz))).is(BlockTags.create(ResourceLocation.parse("forge:beetle_clear")))
												&& world.getBlockState(BlockPos.containing((Math.floor(x) + sx) - 1, (Math.floor(y) + sy) - 1, Math.floor(z) + sz)).isFaceSturdy(world,
														BlockPos.containing((Math.floor(x) + sx) - 1, (Math.floor(y) + sy) - 1, Math.floor(z) + sz), Direction.UP)
										|| (world.getBlockState(BlockPos.containing(Math.floor(x) + sx, Math.floor(y) + sy, (Math.floor(z) + sz) - 1))).is(BlockTags.create(ResourceLocation.parse("forge:beetle_clear")))
												&& world.getBlockState(BlockPos.containing(Math.floor(x) + sx, (Math.floor(y) + sy) - 1, (Math.floor(z) + sz) - 1)).isFaceSturdy(world,
														BlockPos.containing(Math.floor(x) + sx, (Math.floor(y) + sy) - 1, (Math.floor(z) + sz) - 1), Direction.UP)
										|| (world.getBlockState(BlockPos.containing(Math.floor(x) + sx, Math.floor(y) + sy, Math.floor(z) + sz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:beetle_clear")))
												&& world.getBlockState(BlockPos.containing(Math.floor(x) + sx, (Math.floor(y) + sy) - 1, Math.floor(z) + sz + 1)).isFaceSturdy(world,
														BlockPos.containing(Math.floor(x) + sx, (Math.floor(y) + sy) - 1, Math.floor(z) + sz + 1), Direction.UP)) {
									if (entity instanceof Mob _entity)
										_entity.getNavigation().moveTo((Math.floor(x) + sx), (Math.floor(y) + sy), (Math.floor(z) + sz), 1);
									found = true;
								}
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if ((world.getBlockState(BlockPos.containing(Math.floor(x), Math.floor(y) - 0.5, Math.floor(z)))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE_INFESTATION.get().spawn(_level, BlockPos.containing(Math.floor(x), Math.floor(y) - 1, Math.floor(z)), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 8, 0.2, 0.2, 0.2, 0.1);
				if (!entity.level().isClientSide())
					entity.discard();
			} else if ((world.getBlockState(BlockPos.containing(Math.floor(x) + 1, Math.floor(y), Math.floor(z)))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE_INFESTATION.get().spawn(_level, BlockPos.containing(Math.floor(x) + 1, Math.floor(y), Math.floor(z)), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 8, 0.2, 0.2, 0.2, 0.1);
				if (!entity.level().isClientSide())
					entity.discard();
			} else if ((world.getBlockState(BlockPos.containing(Math.floor(x) - 1, Math.floor(y), Math.floor(z)))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE_INFESTATION.get().spawn(_level, BlockPos.containing(Math.floor(x) - 1, Math.floor(y), Math.floor(z)), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 8, 0.2, 0.2, 0.2, 0.1);
				if (!entity.level().isClientSide())
					entity.discard();
			} else if ((world.getBlockState(BlockPos.containing(Math.floor(x), Math.floor(y), Math.floor(z) - 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE_INFESTATION.get().spawn(_level, BlockPos.containing(Math.floor(x), Math.floor(y), Math.floor(z) - 1), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 8, 0.2, 0.2, 0.2, 0.1);
				if (!entity.level().isClientSide())
					entity.discard();
			} else if ((world.getBlockState(BlockPos.containing(Math.floor(x), Math.floor(y), Math.floor(z) + 1))).is(BlockTags.create(ResourceLocation.parse("forge:termite_edible")))) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE_INFESTATION.get().spawn(_level, BlockPos.containing(Math.floor(x), Math.floor(y), Math.floor(z) + 1), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 8, 0.2, 0.2, 0.2, 0.1);
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
