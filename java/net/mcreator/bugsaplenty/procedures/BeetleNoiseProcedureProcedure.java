package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

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

public class BeetleNoiseProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWall()) {
			if (!entity.level().isClientSide())
				entity.discard();
		} else {
			if (!entity.onGround() && !entity.isInWaterOrBubble() && entity.getDeltaMovement().y() < 0) {
				entity.fallDistance = 0;
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-0.045), (entity.getDeltaMovement().z())));
			}
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles"))) && Math.random() < 0.02) {
				world.addParticle(ParticleTypes.END_ROD, (x + Mth.nextDouble(RandomSource.create(), -0.15, 0.15)), y, (z + Mth.nextDouble(RandomSource.create(), -0.15, 0.15)), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)),
						(Mth.nextDouble(RandomSource.create(), 0.05, 0.1)), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)));
			}
			if (!(entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(MobEffects.LUCK)) && !(entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(MobEffects.UNLUCK))) {
				if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty() || entity.isInWaterRainOrBubble()) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.LUCK);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, Mth.nextInt(RandomSource.create(), 140, 360), 1, false, false));
				} else {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 50, 1, false, false));
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:red_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.red.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.red.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleRedPlainShinyEntity) {
							((BeetleRedPlainShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleRedSpottedShinyEntity) {
							((BeetleRedSpottedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleRedStripedShinyEntity) {
							((BeetleRedStripedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.red.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.red.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleRedPlainEntity) {
							((BeetleRedPlainEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleRedSpottedEntity) {
							((BeetleRedSpottedEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleRedStripedEntity) {
							((BeetleRedStripedEntity) entity).setAnimation("animation.beetle.sing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:orange_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.orange.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.orange.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleOrangePlainShinyEntity) {
							((BeetleOrangePlainShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleOrangeSpottedShinyEntity) {
							((BeetleOrangeSpottedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleOrangeStripedShinyEntity) {
							((BeetleOrangeStripedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.orange.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.orange.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleOrangePlainEntity) {
							((BeetleOrangePlainEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleOrangeSpottedEntity) {
							((BeetleOrangeSpottedEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleOrangeStripedEntity) {
							((BeetleOrangeStripedEntity) entity).setAnimation("animation.beetle.longsing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:yellow_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.yellow.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.yellow.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleYellowPlainShinyEntity) {
							((BeetleYellowPlainShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleYellowSpottedShinyEntity) {
							((BeetleYellowSpottedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleYellowStripedShinyEntity) {
							((BeetleYellowStripedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.yellow.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.yellow.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleYellowPlainEntity) {
							((BeetleYellowPlainEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleYellowSpottedEntity) {
							((BeetleYellowSpottedEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleYellowStripedEntity) {
							((BeetleYellowStripedEntity) entity).setAnimation("animation.beetle.sing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:lime_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lime.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lime.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleLimePlainShinyEntity) {
							((BeetleLimePlainShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleLimeSpottedShinyEntity) {
							((BeetleLimeSpottedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleLimeStripedShinyEntity) {
							((BeetleLimeStripedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lime.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lime.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleLimePlainEntity) {
							((BeetleLimePlainEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleLimeSpottedEntity) {
							((BeetleLimeSpottedEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleLimeStripedEntity) {
							((BeetleLimeStripedEntity) entity).setAnimation("animation.beetle.sing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:green_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.green.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.green.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleGreenPlainShinyEntity) {
							((BeetleGreenPlainShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleGreenSpottedShinyEntity) {
							((BeetleGreenSpottedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleGreenStripedShinyEntity) {
							((BeetleGreenStripedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.green.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.green.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleGreenPlainEntity) {
							((BeetleGreenPlainEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleGreenSpottedEntity) {
							((BeetleGreenSpottedEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleGreenStripedEntity) {
							((BeetleGreenStripedEntity) entity).setAnimation("animation.beetle.sing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:light_blue_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lightblue.plainshiny")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lightblue.plainshiny")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleLightbluePlainShinyEntity) {
							((BeetleLightbluePlainShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleLightblueSpottedShinyEntity) {
							((BeetleLightblueSpottedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleLightblueStripedShinyEntity) {
							((BeetleLightblueStripedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lightblue.plaindull")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lightblue.plaindull")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleLightbluePlainEntity) {
							((BeetleLightbluePlainEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleLightblueSpottedEntity) {
							((BeetleLightblueSpottedEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleLightblueStripedEntity) {
							((BeetleLightblueStripedEntity) entity).setAnimation("animation.beetle.sing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:cyan_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.cyan.plainshiny")), SoundSource.NEUTRAL, (float) 1.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.cyan.plainshiny")), SoundSource.NEUTRAL, (float) 1.5, 1, false);
							}
						}
						if (entity instanceof BeetleCyanPlainShinyEntity) {
							((BeetleCyanPlainShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleCyanSpottedShinyEntity) {
							((BeetleCyanSpottedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleCyanStripedShinyEntity) {
							((BeetleCyanStripedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.cyan.plaindull")), SoundSource.NEUTRAL, (float) 1.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.cyan.plaindull")), SoundSource.NEUTRAL, (float) 1.5, 1, false);
							}
						}
						if (entity instanceof BeetleCyanPlainEntity) {
							((BeetleCyanPlainEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleCyanSpottedEntity) {
							((BeetleCyanSpottedEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleCyanStripedEntity) {
							((BeetleCyanStripedEntity) entity).setAnimation("animation.beetle.longsing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:blue_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.blue.plainshiny")), SoundSource.NEUTRAL, (float) 1.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.blue.plainshiny")), SoundSource.NEUTRAL, (float) 1.5, 1, false);
							}
						}
						if (entity instanceof BeetleBluePlainShinyEntity) {
							((BeetleBluePlainShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleBlueSpottedShinyEntity) {
							((BeetleBlueSpottedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleBlueStripedShinyEntity) {
							((BeetleBlueStripedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.blue.plaindull")), SoundSource.NEUTRAL, (float) 1.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.blue.plaindull")), SoundSource.NEUTRAL, (float) 1.5, 1, false);
							}
						}
						if (entity instanceof BeetleBluePlainEntity) {
							((BeetleBluePlainEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleBlueSpottedEntity) {
							((BeetleBlueSpottedEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleBlueStripedEntity) {
							((BeetleBlueStripedEntity) entity).setAnimation("animation.beetle.longsing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:purple_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.purple.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.purple.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetlePurplePlainShinyEntity) {
							((BeetlePurplePlainShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetlePurpleSpottedShinyEntity) {
							((BeetlePurpleSpottedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetlePurpleStripedShinyEntity) {
							((BeetlePurpleStripedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.purple.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.purple.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetlePurplePlainEntity) {
							((BeetlePurplePlainEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetlePurpleSpottedEntity) {
							((BeetlePurpleSpottedEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetlePurpleStripedEntity) {
							((BeetlePurpleStripedEntity) entity).setAnimation("animation.beetle.longsing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:pink_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.pink.plainshiny")), SoundSource.NEUTRAL, (float) 0.6, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.pink.plainshiny")), SoundSource.NEUTRAL, (float) 0.6, 1, false);
							}
						}
						if (entity instanceof BeetlePinkPlainShinyEntity) {
							((BeetlePinkPlainShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetlePinkSpottedShinyEntity) {
							((BeetlePinkSpottedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetlePinkStripedShinyEntity) {
							((BeetlePinkStripedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.pink.plaindull")), SoundSource.NEUTRAL, (float) 0.6, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.pink.plaindull")), SoundSource.NEUTRAL, (float) 0.6, 1, false);
							}
						}
						if (entity instanceof BeetlePinkPlainEntity) {
							((BeetlePinkPlainEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetlePinkSpottedEntity) {
							((BeetlePinkSpottedEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetlePinkStripedEntity) {
							((BeetlePinkStripedEntity) entity).setAnimation("animation.beetle.sing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:magenta_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.magenta.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.magenta.plainshiny")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleMagentaPlainShinyEntity) {
							((BeetleMagentaPlainShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleMagentaSpottedShinyEntity) {
							((BeetleMagentaSpottedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleMagentaStripedShinyEntity) {
							((BeetleMagentaStripedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.magenta.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.magenta.plaindull")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						if (entity instanceof BeetleMagentaPlainEntity) {
							((BeetleMagentaPlainEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleMagentaSpottedEntity) {
							((BeetleMagentaSpottedEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleMagentaStripedEntity) {
							((BeetleMagentaStripedEntity) entity).setAnimation("animation.beetle.sing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:brown_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.brown.plainshiny")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.brown.plainshiny")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleBrownPlainShinyEntity) {
							((BeetleBrownPlainShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleBrownSpottedShinyEntity) {
							((BeetleBrownSpottedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleBrownStripedShinyEntity) {
							((BeetleBrownStripedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.brown.plaindull")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.brown.plaindull")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleBrownPlainEntity) {
							((BeetleBrownPlainEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleBrownSpottedEntity) {
							((BeetleBrownSpottedEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleBrownStripedEntity) {
							((BeetleBrownStripedEntity) entity).setAnimation("animation.beetle.longsing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:white_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.white.plainshiny")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.white.plainshiny")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleWhitePlainShinyEntity) {
							((BeetleWhitePlainShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleWhiteSpottedShinyEntity) {
							((BeetleWhiteSpottedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleWhiteStripedShinyEntity) {
							((BeetleWhiteStripedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.white.plaindull")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.white.plaindull")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleWhitePlainEntity) {
							((BeetleWhitePlainEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleWhiteSpottedEntity) {
							((BeetleWhiteSpottedEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleWhiteStripedEntity) {
							((BeetleWhiteStripedEntity) entity).setAnimation("animation.beetle.longsing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:light_gray_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lightgray.plainshiny")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lightgray.plainshiny")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleLightgrayPlainShinyEntity) {
							((BeetleLightgrayPlainShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleLightgraySpottedShinyEntity) {
							((BeetleLightgraySpottedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleLightgrayStripedShinyEntity) {
							((BeetleLightgrayStripedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lightgray.plaindull")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.lightgray.plaindull")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleLightgrayPlainEntity) {
							((BeetleLightgrayPlainEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleLightgraySpottedEntity) {
							((BeetleLightgraySpottedEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleLightgrayStripedEntity) {
							((BeetleLightgrayStripedEntity) entity).setAnimation("animation.beetle.longsing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:gray_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.gray.plainshiny")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.gray.plainshiny")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleGrayPlainShinyEntity) {
							((BeetleGrayPlainShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleGraySpottedShinyEntity) {
							((BeetleGraySpottedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleGrayStripedShinyEntity) {
							((BeetleGrayStripedShinyEntity) entity).setAnimation("animation.beetle.longsing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.gray.plaindull")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.gray.plaindull")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleGrayPlainEntity) {
							((BeetleGrayPlainEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleGraySpottedEntity) {
							((BeetleGraySpottedEntity) entity).setAnimation("animation.beetle.longsing");
						}
						if (entity instanceof BeetleGrayStripedEntity) {
							((BeetleGrayStripedEntity) entity).setAnimation("animation.beetle.longsing");
						}
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:black_beetles")))) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:shiny_beetles")))) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.black.plainshiny")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.black.plainshiny")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleBlackPlainShinyEntity) {
							((BeetleBlackPlainShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleBlackSpottedShinyEntity) {
							((BeetleBlackSpottedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleBlackStripedShinyEntity) {
							((BeetleBlackStripedShinyEntity) entity).setAnimation("animation.beetle.sing");
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.black.plaindull")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:beetle.black.plaindull")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof BeetleBlackPlainEntity) {
							((BeetleBlackPlainEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleBlackSpottedEntity) {
							((BeetleBlackSpottedEntity) entity).setAnimation("animation.beetle.sing");
						}
						if (entity instanceof BeetleBlackStripedEntity) {
							((BeetleBlackStripedEntity) entity).setAnimation("animation.beetle.sing");
						}
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.UNLUCK);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, Mth.nextInt(RandomSource.create(), 140, 360), 1, false, false));
			}
			if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).isEmpty()) && !(entity.getPersistentData().getBoolean("annoying") == true)) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
