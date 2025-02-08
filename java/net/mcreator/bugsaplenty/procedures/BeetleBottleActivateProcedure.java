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
import net.minecraft.tags.ItemTags;
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
import net.mcreator.bugsaplenty.entity.BeetleYellowStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleYellowStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleYellowSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleYellowSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleYellowPlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleYellowPlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleWhiteStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleWhiteStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleWhiteSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleWhiteSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleWhitePlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleWhitePlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleRedStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleRedStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleRedSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleRedSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleRedPlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleRedPlainEntity;
import net.mcreator.bugsaplenty.entity.BeetlePurpleStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetlePurpleStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetlePurpleSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetlePurpleSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetlePurplePlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetlePurplePlainEntity;
import net.mcreator.bugsaplenty.entity.BeetlePinkStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetlePinkStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetlePinkSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetlePinkSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetlePinkPlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetlePinkPlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleOrangeStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleOrangeStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleOrangeSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleOrangeSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleOrangePlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleOrangePlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleMagentaStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleMagentaStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleMagentaSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleMagentaSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleMagentaPlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleMagentaPlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleLimeStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleLimeStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleLimeSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleLimeSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleLimePlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleLimePlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightgrayStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightgrayStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightgraySpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightgraySpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightgrayPlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightgrayPlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightblueStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightblueStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightblueSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightblueSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightbluePlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleLightbluePlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleGreenStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleGreenStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleGreenSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleGreenSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleGreenPlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleGreenPlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleGrayStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleGrayStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleGraySpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleGraySpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleGrayPlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleGrayPlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleCyanStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleCyanStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleCyanSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleCyanSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleCyanPlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleCyanPlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleBrownStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleBrownStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleBrownSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleBrownSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleBrownPlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleBrownPlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleBlueStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleBlueStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleBlueSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleBlueSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleBluePlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleBluePlainEntity;
import net.mcreator.bugsaplenty.entity.BeetleBlackStripedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleBlackStripedEntity;
import net.mcreator.bugsaplenty.entity.BeetleBlackSpottedShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleBlackSpottedEntity;
import net.mcreator.bugsaplenty.entity.BeetleBlackPlainShinyEntity;
import net.mcreator.bugsaplenty.entity.BeetleBlackPlainEntity;
import net.mcreator.bugsaplenty.BugsAplentyMod;

import java.util.List;
import java.util.Comparator;

public class BeetleBottleActivateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double tone = 0;
		boolean release = false;
		release = false;
		if (entity.isShiftKeyDown() && !(itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem())) {
			release = true;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.NOTE, (x + entity.getLookAngle().x * 1.5), (y + entity.getLookAngle().y + 0.5), (z + entity.getLookAngle().z * 1.5), 5, 0.2, 0.2, 0.2, 0.1);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		world.addParticle(ParticleTypes.NOTE, (x + entity.getLookAngle().x * 1.5), (y + entity.getLookAngle().y + 0.5), (z + entity.getLookAngle().z * 1.5), 0, 0.1, 0);
		if (entity.getLookAngle().y >= 0.95) {
			tone = 1.89;
		} else if (entity.getLookAngle().y < 0.95 && entity.getLookAngle().y >= 0.75) {
			tone = 1.78;
		} else if (entity.getLookAngle().y < 0.75 && entity.getLookAngle().y >= 0.55) {
			tone = 1.68;
		} else if (entity.getLookAngle().y < 0.55 && entity.getLookAngle().y >= 0.35) {
			tone = 1.59;
		} else if (entity.getLookAngle().y < 0.35 && entity.getLookAngle().y >= 0.15) {
			tone = 1.5;
		} else if (entity.getLookAngle().y < 0.15 && entity.getLookAngle().y >= 0) {
			tone = 1.41;
		} else if (entity.getLookAngle().y < 0 && entity.getLookAngle().y >= -0.15) {
			tone = 1.33;
		} else if (entity.getLookAngle().y < -0.15 && entity.getLookAngle().y >= -0.35) {
			tone = 1.26;
		} else if (entity.getLookAngle().y < -0.35 && entity.getLookAngle().y >= -0.55) {
			tone = 1.19;
		} else if (entity.getLookAngle().y < -0.55 && entity.getLookAngle().y >= -0.75) {
			tone = 1.19;
		} else if (entity.getLookAngle().y < -0.75 && entity.getLookAngle().y >= -0.95) {
			tone = 1.06;
		} else if (entity.getLookAngle().y < -0.95) {
			tone = 1;
		}
		if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:red_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:red.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:red.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.RED_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleRedPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleRedPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.RED_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleRedStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleRedStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.RED_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleRedSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleRedSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:red.sting.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:red.sting.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:red.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:red.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.RED_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleRedPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleRedPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.RED_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleRedStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleRedStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.RED_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_RED_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleRedSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleRedSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:red.tone.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:red.tone.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:orange_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:orange.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:orange.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.ORANGE_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleOrangePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleOrangePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.ORANGE_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleOrangeStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleOrangeStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.ORANGE_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleOrangeSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleOrangeSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:orange.sting.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:orange.sting.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:orange.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:orange.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.ORANGE_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleOrangePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleOrangePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.ORANGE_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleOrangeStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleOrangeStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.ORANGE_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_ORANGE_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleOrangeSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleOrangeSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:orange.tone.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:orange.tone.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:yellow_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:yellow.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:yellow.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.YELLOW_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleYellowPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleYellowPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.YELLOW_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleYellowStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleYellowStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.YELLOW_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleYellowSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleYellowSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:yellow.sting.base")), SoundSource.NEUTRAL, (float) 0.75, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:yellow.sting.base")), SoundSource.NEUTRAL, (float) 0.75, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:yellow.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:yellow.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.YELLOW_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleYellowPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleYellowPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.YELLOW_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleYellowStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleYellowStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.YELLOW_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_YELLOW_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleYellowSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleYellowSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:yellow.tone.base")), SoundSource.NEUTRAL, (float) 0.75, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:yellow.tone.base")), SoundSource.NEUTRAL, (float) 0.75, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:lime_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lime.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lime.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.LIME_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLimePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLimePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIME_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLimeStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLimeStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIME_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLimeSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLimeSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lime.sting.base")), SoundSource.NEUTRAL, (float) 0.75, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lime.sting.base")), SoundSource.NEUTRAL, (float) 0.75, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lime.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lime.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.LIME_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLimePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLimePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIME_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLimeStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLimeStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIME_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIME_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLimeSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLimeSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lime.tone.base")), SoundSource.NEUTRAL, (float) 0.75, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lime.tone.base")), SoundSource.NEUTRAL, (float) 0.75, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:green_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:green.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:green.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.GREEN_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGreenPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGreenPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.GREEN_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGreenStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGreenStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.GREEN_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGreenSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGreenSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:green.sting.base")), SoundSource.NEUTRAL, (float) 0.4, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:green.sting.base")), SoundSource.NEUTRAL, (float) 0.4, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:green.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:green.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.GREEN_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGreenPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGreenPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.GREEN_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGreenStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGreenStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.GREEN_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GREEN_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGreenSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGreenSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:green.tone.base")), SoundSource.NEUTRAL, (float) 0.4, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:green.tone.base")), SoundSource.NEUTRAL, (float) 0.4, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:light_blue_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightblue.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightblue.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightbluePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightbluePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightblueStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightblueStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightblueSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightblueSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightblue.sting.base")), SoundSource.NEUTRAL, (float) 0.4, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightblue.sting.base")), SoundSource.NEUTRAL, (float) 0.4, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightblue.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightblue.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightbluePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightbluePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightblueStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightblueStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTBLUE_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightblueSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightblueSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightblue.tone.base")), SoundSource.NEUTRAL, (float) 0.4, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightblue.tone.base")), SoundSource.NEUTRAL, (float) 0.4, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:cyan_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:cyan.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:cyan.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.CYAN_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleCyanPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleCyanPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.CYAN_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleCyanStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleCyanStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.CYAN_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleCyanSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleCyanSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:cyan.sting.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:cyan.sting.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:cyan.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:cyan.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.CYAN_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleCyanPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleCyanPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.CYAN_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleCyanStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleCyanStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.CYAN_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_CYAN_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleCyanSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleCyanSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:cyan.tone.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:cyan.tone.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:blue_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:blue.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:blue.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.BLUE_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBluePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBluePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.BLUE_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBlueStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBlueStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.BLUE_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBlueSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBlueSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:blue.sting.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:blue.sting.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:blue.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:blue.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.BLUE_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBluePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBluePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.BLUE_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBlueStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBlueStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.BLUE_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLUE_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBlueSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBlueSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:blue.tone.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:blue.tone.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:purple_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 3);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:purple.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:purple.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.PURPLE_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePurplePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePurplePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.PURPLE_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePurpleStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePurpleStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.PURPLE_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePurpleSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePurpleSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:purple.sting.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:purple.sting.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:purple.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:purple.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.PURPLE_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePurplePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePurplePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.PURPLE_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePurpleStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePurpleStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.PURPLE_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PURPLE_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePurpleSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePurpleSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:purple.tone.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:purple.tone.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:pink_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:pink.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:pink.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.PINK_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePinkPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePinkPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.PINK_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePinkStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePinkStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.PINK_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePinkSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePinkSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:pink.sting.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:pink.sting.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:pink.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:pink.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.PINK_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePinkPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePinkPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.PINK_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePinkStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePinkStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.PINK_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_PINK_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetlePinkSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetlePinkSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:pink.tone.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:pink.tone.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:magenta_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 8);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:magenta.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:magenta.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_MAGENTA_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleMagentaPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleMagentaPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_MAGENTA_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleMagentaStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleMagentaStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_MAGENTA_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleMagentaSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleMagentaSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:magenta.sting.base")), SoundSource.NEUTRAL, (float) 0.45, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:magenta.sting.base")), SoundSource.NEUTRAL, (float) 0.45, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:magenta.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:magenta.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_MAGENTA_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleMagentaPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleMagentaPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_MAGENTA_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleMagentaStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleMagentaStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_MAGENTA_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleMagentaSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleMagentaSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:magenta.tone.base")), SoundSource.NEUTRAL, (float) 0.45, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:magenta.tone.base")), SoundSource.NEUTRAL, (float) 0.45, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:brown_beetle_bottles")))) {
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:brown.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:brown.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.BROWN_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBrownPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBrownPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.BROWN_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBrownStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBrownStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.BROWN_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBrownSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBrownSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:brown.sting.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:brown.sting.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:brown.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:brown.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.BROWN_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBrownPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBrownPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.BROWN_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBrownStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBrownStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.BROWN_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BROWN_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBrownSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBrownSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:brown.tone.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:brown.tone.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:white_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:white.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:white.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.WHITE_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleWhitePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleWhitePlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.WHITE_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleWhiteStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleWhiteStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.WHITE_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleWhiteSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleWhiteSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:white.sting.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:white.sting.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:white.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:white.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.WHITE_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleWhitePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleWhitePlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.WHITE_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleWhiteStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleWhiteStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.WHITE_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_WHITE_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleWhiteSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleWhiteSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:white.tone.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:white.tone.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:light_gray_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightgray.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightgray.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightgrayPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightgrayPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightgrayStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightgrayStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightgraySpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightgraySpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightgray.sting.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightgray.sting.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightgray.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightgray.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightgrayPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightgrayPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightgrayStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightgrayStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_LIGHTGRAY_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleLightgraySpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleLightgraySpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightgray.tone.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:lightgray.tone.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:gray_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.gray.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.gray.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.GRAY_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGrayPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGrayPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.GRAY_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGrayStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGrayStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.GRAY_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGraySpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGraySpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:gray.sting.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:gray.sting.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:gray.hit1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:gray.hit1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.GRAY_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGrayPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGrayPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.GRAY_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGrayStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGrayStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.GRAY_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_GRAY_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleGraySpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleGraySpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:gray.tone.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:gray.tone.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:black_beetle_bottles")))) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
			if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:shiny_beetle_bottles")))) {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:black.hit.2")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:black.hit.2")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.BLACK_BEETLE_BOTTLE_SHINY.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_PLAIN_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBlackPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBlackPlainShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.BLACK_BEETLE_BOTTLE_SHINY_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_STRIPED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBlackStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBlackStripedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.BLACK_BEETLE_BOTTLE_SHINY_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_SPOTTED_SHINY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBlackSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBlackSpottedShinyEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:black.sting.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:black.sting.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			} else {
				if (release == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:black.hit.1")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:black.hit.1")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:bottle.pop")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (itemstack.getItem() == BugsAplentyModItems.BLACK_BEETLE_BOTTLE.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_PLAIN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBlackPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBlackPlainEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.BLACK_BEETLE_BOTTLE_STRIPED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_STRIPED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBlackStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBlackStripedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					} else if (itemstack.getItem() == BugsAplentyModItems.GRAY_BEETLE_BOTTLE_SPOTTED.get()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = BugsAplentyModEntities.BEETLE_BLACK_SPOTTED.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 0.5), 0.4, (entity.getLookAngle().z * 0.5));
							}
						}
						if (!(itemstack.getDisplayName().getString()).equals("[Beetle Bottle]") && !world.getEntitiesOfClass(BeetleBlackSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
							((Entity) world.getEntitiesOfClass(BeetleBlackSpottedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", ""))));
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:black.tone.base")), SoundSource.NEUTRAL, 1, (float) tone);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:black.tone.base")), SoundSource.NEUTRAL, 1, (float) tone, false);
						}
					}
				}
			}
		}
		if (release == true) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		BugsAplentyMod.queueServerWork(2, () -> {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:beetles")))) {
						entityiterator.getPersistentData().putBoolean("annoying", true);
					}
				}
			}
		});
	}
}
