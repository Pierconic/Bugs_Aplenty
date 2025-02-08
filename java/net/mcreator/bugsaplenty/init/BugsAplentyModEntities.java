
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bugsaplenty.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.bugsaplenty.entity.TwilitButterflyEntity;
import net.mcreator.bugsaplenty.entity.TermiteInfestationEntity;
import net.mcreator.bugsaplenty.entity.TermiteEntity;
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
import net.mcreator.bugsaplenty.entity.NullPheremoneEntity;
import net.mcreator.bugsaplenty.entity.NestMarkerEntity;
import net.mcreator.bugsaplenty.entity.MonarchButterflyEntity;
import net.mcreator.bugsaplenty.entity.MalachiteButterflyEntity;
import net.mcreator.bugsaplenty.entity.HairstreakButterflyEntity;
import net.mcreator.bugsaplenty.entity.DragonflyTreasureEntity;
import net.mcreator.bugsaplenty.entity.DragonflyStingEntity;
import net.mcreator.bugsaplenty.entity.DragonflySteelyEntity;
import net.mcreator.bugsaplenty.entity.DragonflyRuddyEntity;
import net.mcreator.bugsaplenty.entity.DragonflyPaleEntity;
import net.mcreator.bugsaplenty.entity.DragonflyMysticEntity;
import net.mcreator.bugsaplenty.entity.DragonflyMidnightEntity;
import net.mcreator.bugsaplenty.entity.DragonflyIridescentEntity;
import net.mcreator.bugsaplenty.entity.DragonflyFushaEntity;
import net.mcreator.bugsaplenty.entity.DragonflyEntity;
import net.mcreator.bugsaplenty.entity.DragonflyDevilEntity;
import net.mcreator.bugsaplenty.entity.DragonflyDarnerEntity;
import net.mcreator.bugsaplenty.entity.DragonflyCoalEntity;
import net.mcreator.bugsaplenty.entity.DragonflyAzureEntity;
import net.mcreator.bugsaplenty.entity.DragonflyAuburnEntity;
import net.mcreator.bugsaplenty.entity.DragonflyArborEntity;
import net.mcreator.bugsaplenty.entity.DragonflyAmberEntity;
import net.mcreator.bugsaplenty.entity.ButterflyEntity;
import net.mcreator.bugsaplenty.entity.BuckeyeButterflyEntity;
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
import net.mcreator.bugsaplenty.entity.BeetleEntity;
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
import net.mcreator.bugsaplenty.entity.AetherwingButterflyEntity;
import net.mcreator.bugsaplenty.BugsAplentyMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class BugsAplentyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, BugsAplentyMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<TermiteEntity>> TERMITE = register("termite",
			EntityType.Builder.<TermiteEntity>of(TermiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<NestMarkerEntity>> NEST_MARKER = register("nest_marker",
			EntityType.Builder.<NestMarkerEntity>of(NestMarkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).fireImmune().sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<TermiteInfestationEntity>> TERMITE_INFESTATION = register("termite_infestation",
			EntityType.Builder.<TermiteInfestationEntity>of(TermiteInfestationEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).fireImmune().sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyDarnerEntity>> DRAGONFLY_DARNER = register("dragonfly_darner",
			EntityType.Builder.<DragonflyDarnerEntity>of(DragonflyDarnerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyEntity>> DRAGONFLY = register("dragonfly",
			EntityType.Builder.<DragonflyEntity>of(DragonflyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyAuburnEntity>> DRAGONFLY_AUBURN = register("dragonfly_auburn",
			EntityType.Builder.<DragonflyAuburnEntity>of(DragonflyAuburnEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyStingEntity>> DRAGONFLY_STING = register("dragonfly_sting",
			EntityType.Builder.<DragonflyStingEntity>of(DragonflyStingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyTreasureEntity>> DRAGONFLY_TREASURE = register("dragonfly_treasure",
			EntityType.Builder.<DragonflyTreasureEntity>of(DragonflyTreasureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyRuddyEntity>> DRAGONFLY_RUDDY = register("dragonfly_ruddy",
			EntityType.Builder.<DragonflyRuddyEntity>of(DragonflyRuddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyAzureEntity>> DRAGONFLY_AZURE = register("dragonfly_azure",
			EntityType.Builder.<DragonflyAzureEntity>of(DragonflyAzureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyArborEntity>> DRAGONFLY_ARBOR = register("dragonfly_arbor",
			EntityType.Builder.<DragonflyArborEntity>of(DragonflyArborEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyMysticEntity>> DRAGONFLY_MYSTIC = register("dragonfly_mystic",
			EntityType.Builder.<DragonflyMysticEntity>of(DragonflyMysticEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyDevilEntity>> DRAGONFLY_DEVIL = register("dragonfly_devil",
			EntityType.Builder.<DragonflyDevilEntity>of(DragonflyDevilEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyFushaEntity>> DRAGONFLY_FUSHA = register("dragonfly_fusha",
			EntityType.Builder.<DragonflyFushaEntity>of(DragonflyFushaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyIridescentEntity>> DRAGONFLY_IRIDESCENT = register("dragonfly_iridescent",
			EntityType.Builder.<DragonflyIridescentEntity>of(DragonflyIridescentEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyPaleEntity>> DRAGONFLY_PALE = register("dragonfly_pale",
			EntityType.Builder.<DragonflyPaleEntity>of(DragonflyPaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflySteelyEntity>> DRAGONFLY_STEELY = register("dragonfly_steely",
			EntityType.Builder.<DragonflySteelyEntity>of(DragonflySteelyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyMidnightEntity>> DRAGONFLY_MIDNIGHT = register("dragonfly_midnight",
			EntityType.Builder.<DragonflyMidnightEntity>of(DragonflyMidnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyCoalEntity>> DRAGONFLY_COAL = register("dragonfly_coal",
			EntityType.Builder.<DragonflyCoalEntity>of(DragonflyCoalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyAmberEntity>> DRAGONFLY_AMBER = register("dragonfly_amber",
			EntityType.Builder.<DragonflyAmberEntity>of(DragonflyAmberEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleRedPlainEntity>> BEETLE_RED_PLAIN = register("beetle_red_plain",
			EntityType.Builder.<BeetleRedPlainEntity>of(BeetleRedPlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleEntity>> BEETLE = register("beetle",
			EntityType.Builder.<BeetleEntity>of(BeetleEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleRedPlainShinyEntity>> BEETLE_RED_PLAIN_SHINY = register("beetle_red_plain_shiny",
			EntityType.Builder.<BeetleRedPlainShinyEntity>of(BeetleRedPlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleRedStripedEntity>> BEETLE_RED_STRIPED = register("beetle_red_striped",
			EntityType.Builder.<BeetleRedStripedEntity>of(BeetleRedStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleRedStripedShinyEntity>> BEETLE_RED_STRIPED_SHINY = register("beetle_red_striped_shiny",
			EntityType.Builder.<BeetleRedStripedShinyEntity>of(BeetleRedStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleRedSpottedEntity>> BEETLE_RED_SPOTTED = register("beetle_red_spotted",
			EntityType.Builder.<BeetleRedSpottedEntity>of(BeetleRedSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleRedSpottedShinyEntity>> BEETLE_RED_SPOTTED_SHINY = register("beetle_red_spotted_shiny",
			EntityType.Builder.<BeetleRedSpottedShinyEntity>of(BeetleRedSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleOrangePlainEntity>> BEETLE_ORANGE_PLAIN = register("beetle_orange_plain",
			EntityType.Builder.<BeetleOrangePlainEntity>of(BeetleOrangePlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleOrangePlainShinyEntity>> BEETLE_ORANGE_PLAIN_SHINY = register("beetle_orange_plain_shiny",
			EntityType.Builder.<BeetleOrangePlainShinyEntity>of(BeetleOrangePlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleOrangeStripedEntity>> BEETLE_ORANGE_STRIPED = register("beetle_orange_striped",
			EntityType.Builder.<BeetleOrangeStripedEntity>of(BeetleOrangeStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleOrangeStripedShinyEntity>> BEETLE_ORANGE_STRIPED_SHINY = register("beetle_orange_striped_shiny",
			EntityType.Builder.<BeetleOrangeStripedShinyEntity>of(BeetleOrangeStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleOrangeSpottedEntity>> BEETLE_ORANGE_SPOTTED = register("beetle_orange_spotted",
			EntityType.Builder.<BeetleOrangeSpottedEntity>of(BeetleOrangeSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleOrangeSpottedShinyEntity>> BEETLE_ORANGE_SPOTTED_SHINY = register("beetle_orange_spotted_shiny",
			EntityType.Builder.<BeetleOrangeSpottedShinyEntity>of(BeetleOrangeSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleYellowPlainEntity>> BEETLE_YELLOW_PLAIN = register("beetle_yellow_plain",
			EntityType.Builder.<BeetleYellowPlainEntity>of(BeetleYellowPlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleYellowPlainShinyEntity>> BEETLE_YELLOW_PLAIN_SHINY = register("beetle_yellow_plain_shiny",
			EntityType.Builder.<BeetleYellowPlainShinyEntity>of(BeetleYellowPlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleYellowStripedEntity>> BEETLE_YELLOW_STRIPED = register("beetle_yellow_striped",
			EntityType.Builder.<BeetleYellowStripedEntity>of(BeetleYellowStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleYellowStripedShinyEntity>> BEETLE_YELLOW_STRIPED_SHINY = register("beetle_yellow_striped_shiny",
			EntityType.Builder.<BeetleYellowStripedShinyEntity>of(BeetleYellowStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleYellowSpottedEntity>> BEETLE_YELLOW_SPOTTED = register("beetle_yellow_spotted",
			EntityType.Builder.<BeetleYellowSpottedEntity>of(BeetleYellowSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleYellowSpottedShinyEntity>> BEETLE_YELLOW_SPOTTED_SHINY = register("beetle_yellow_spotted_shiny",
			EntityType.Builder.<BeetleYellowSpottedShinyEntity>of(BeetleYellowSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLimePlainEntity>> BEETLE_LIME_PLAIN = register("beetle_lime_plain",
			EntityType.Builder.<BeetleLimePlainEntity>of(BeetleLimePlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLimePlainShinyEntity>> BEETLE_LIME_PLAIN_SHINY = register("beetle_lime_plain_shiny",
			EntityType.Builder.<BeetleLimePlainShinyEntity>of(BeetleLimePlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLimeStripedEntity>> BEETLE_LIME_STRIPED = register("beetle_lime_striped",
			EntityType.Builder.<BeetleLimeStripedEntity>of(BeetleLimeStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLimeStripedShinyEntity>> BEETLE_LIME_STRIPED_SHINY = register("beetle_lime_striped_shiny",
			EntityType.Builder.<BeetleLimeStripedShinyEntity>of(BeetleLimeStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLimeSpottedEntity>> BEETLE_LIME_SPOTTED = register("beetle_lime_spotted",
			EntityType.Builder.<BeetleLimeSpottedEntity>of(BeetleLimeSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLimeSpottedShinyEntity>> BEETLE_LIME_SPOTTED_SHINY = register("beetle_lime_spotted_shiny",
			EntityType.Builder.<BeetleLimeSpottedShinyEntity>of(BeetleLimeSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGreenPlainEntity>> BEETLE_GREEN_PLAIN = register("beetle_green_plain",
			EntityType.Builder.<BeetleGreenPlainEntity>of(BeetleGreenPlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGreenPlainShinyEntity>> BEETLE_GREEN_PLAIN_SHINY = register("beetle_green_plain_shiny",
			EntityType.Builder.<BeetleGreenPlainShinyEntity>of(BeetleGreenPlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGreenStripedEntity>> BEETLE_GREEN_STRIPED = register("beetle_green_striped",
			EntityType.Builder.<BeetleGreenStripedEntity>of(BeetleGreenStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGreenStripedShinyEntity>> BEETLE_GREEN_STRIPED_SHINY = register("beetle_green_striped_shiny",
			EntityType.Builder.<BeetleGreenStripedShinyEntity>of(BeetleGreenStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGreenSpottedEntity>> BEETLE_GREEN_SPOTTED = register("beetle_green_spotted",
			EntityType.Builder.<BeetleGreenSpottedEntity>of(BeetleGreenSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGreenSpottedShinyEntity>> BEETLE_GREEN_SPOTTED_SHINY = register("beetle_green_spotted_shiny",
			EntityType.Builder.<BeetleGreenSpottedShinyEntity>of(BeetleGreenSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightbluePlainEntity>> BEETLE_LIGHTBLUE_PLAIN = register("beetle_lightblue_plain",
			EntityType.Builder.<BeetleLightbluePlainEntity>of(BeetleLightbluePlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightbluePlainShinyEntity>> BEETLE_LIGHTBLUE_PLAIN_SHINY = register("beetle_lightblue_plain_shiny",
			EntityType.Builder.<BeetleLightbluePlainShinyEntity>of(BeetleLightbluePlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightblueStripedEntity>> BEETLE_LIGHTBLUE_STRIPED = register("beetle_lightblue_striped",
			EntityType.Builder.<BeetleLightblueStripedEntity>of(BeetleLightblueStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightblueStripedShinyEntity>> BEETLE_LIGHTBLUE_STRIPED_SHINY = register("beetle_lightblue_striped_shiny",
			EntityType.Builder.<BeetleLightblueStripedShinyEntity>of(BeetleLightblueStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightblueSpottedEntity>> BEETLE_LIGHTBLUE_SPOTTED = register("beetle_lightblue_spotted",
			EntityType.Builder.<BeetleLightblueSpottedEntity>of(BeetleLightblueSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightblueSpottedShinyEntity>> BEETLE_LIGHTBLUE_SPOTTED_SHINY = register("beetle_lightblue_spotted_shiny",
			EntityType.Builder.<BeetleLightblueSpottedShinyEntity>of(BeetleLightblueSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleCyanPlainEntity>> BEETLE_CYAN_PLAIN = register("beetle_cyan_plain",
			EntityType.Builder.<BeetleCyanPlainEntity>of(BeetleCyanPlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleCyanPlainShinyEntity>> BEETLE_CYAN_PLAIN_SHINY = register("beetle_cyan_plain_shiny",
			EntityType.Builder.<BeetleCyanPlainShinyEntity>of(BeetleCyanPlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleCyanStripedEntity>> BEETLE_CYAN_STRIPED = register("beetle_cyan_striped",
			EntityType.Builder.<BeetleCyanStripedEntity>of(BeetleCyanStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleCyanStripedShinyEntity>> BEETLE_CYAN_STRIPED_SHINY = register("beetle_cyan_striped_shiny",
			EntityType.Builder.<BeetleCyanStripedShinyEntity>of(BeetleCyanStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleCyanSpottedEntity>> BEETLE_CYAN_SPOTTED = register("beetle_cyan_spotted",
			EntityType.Builder.<BeetleCyanSpottedEntity>of(BeetleCyanSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleCyanSpottedShinyEntity>> BEETLE_CYAN_SPOTTED_SHINY = register("beetle_cyan_spotted_shiny",
			EntityType.Builder.<BeetleCyanSpottedShinyEntity>of(BeetleCyanSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBluePlainEntity>> BEETLE_BLUE_PLAIN = register("beetle_blue_plain",
			EntityType.Builder.<BeetleBluePlainEntity>of(BeetleBluePlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBluePlainShinyEntity>> BEETLE_BLUE_PLAIN_SHINY = register("beetle_blue_plain_shiny",
			EntityType.Builder.<BeetleBluePlainShinyEntity>of(BeetleBluePlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBlueStripedEntity>> BEETLE_BLUE_STRIPED = register("beetle_blue_striped",
			EntityType.Builder.<BeetleBlueStripedEntity>of(BeetleBlueStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBlueStripedShinyEntity>> BEETLE_BLUE_STRIPED_SHINY = register("beetle_blue_striped_shiny",
			EntityType.Builder.<BeetleBlueStripedShinyEntity>of(BeetleBlueStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBlueSpottedEntity>> BEETLE_BLUE_SPOTTED = register("beetle_blue_spotted",
			EntityType.Builder.<BeetleBlueSpottedEntity>of(BeetleBlueSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBlueSpottedShinyEntity>> BEETLE_BLUE_SPOTTED_SHINY = register("beetle_blue_spotted_shiny",
			EntityType.Builder.<BeetleBlueSpottedShinyEntity>of(BeetleBlueSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePurplePlainEntity>> BEETLE_PURPLE_PLAIN = register("beetle_purple_plain",
			EntityType.Builder.<BeetlePurplePlainEntity>of(BeetlePurplePlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePurplePlainShinyEntity>> BEETLE_PURPLE_PLAIN_SHINY = register("beetle_purple_plain_shiny",
			EntityType.Builder.<BeetlePurplePlainShinyEntity>of(BeetlePurplePlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePurpleStripedEntity>> BEETLE_PURPLE_STRIPED = register("beetle_purple_striped",
			EntityType.Builder.<BeetlePurpleStripedEntity>of(BeetlePurpleStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePurpleStripedShinyEntity>> BEETLE_PURPLE_STRIPED_SHINY = register("beetle_purple_striped_shiny",
			EntityType.Builder.<BeetlePurpleStripedShinyEntity>of(BeetlePurpleStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePurpleSpottedEntity>> BEETLE_PURPLE_SPOTTED = register("beetle_purple_spotted",
			EntityType.Builder.<BeetlePurpleSpottedEntity>of(BeetlePurpleSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePurpleSpottedShinyEntity>> BEETLE_PURPLE_SPOTTED_SHINY = register("beetle_purple_spotted_shiny",
			EntityType.Builder.<BeetlePurpleSpottedShinyEntity>of(BeetlePurpleSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePinkPlainEntity>> BEETLE_PINK_PLAIN = register("beetle_pink_plain",
			EntityType.Builder.<BeetlePinkPlainEntity>of(BeetlePinkPlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePinkPlainShinyEntity>> BEETLE_PINK_PLAIN_SHINY = register("beetle_pink_plain_shiny",
			EntityType.Builder.<BeetlePinkPlainShinyEntity>of(BeetlePinkPlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePinkStripedEntity>> BEETLE_PINK_STRIPED = register("beetle_pink_striped",
			EntityType.Builder.<BeetlePinkStripedEntity>of(BeetlePinkStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePinkStripedShinyEntity>> BEETLE_PINK_STRIPED_SHINY = register("beetle_pink_striped_shiny",
			EntityType.Builder.<BeetlePinkStripedShinyEntity>of(BeetlePinkStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePinkSpottedEntity>> BEETLE_PINK_SPOTTED = register("beetle_pink_spotted",
			EntityType.Builder.<BeetlePinkSpottedEntity>of(BeetlePinkSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetlePinkSpottedShinyEntity>> BEETLE_PINK_SPOTTED_SHINY = register("beetle_pink_spotted_shiny",
			EntityType.Builder.<BeetlePinkSpottedShinyEntity>of(BeetlePinkSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleMagentaPlainEntity>> BEETLE_MAGENTA_PLAIN = register("beetle_magenta_plain",
			EntityType.Builder.<BeetleMagentaPlainEntity>of(BeetleMagentaPlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleMagentaPlainShinyEntity>> BEETLE_MAGENTA_PLAIN_SHINY = register("beetle_magenta_plain_shiny",
			EntityType.Builder.<BeetleMagentaPlainShinyEntity>of(BeetleMagentaPlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleMagentaStripedEntity>> BEETLE_MAGENTA_STRIPED = register("beetle_magenta_striped",
			EntityType.Builder.<BeetleMagentaStripedEntity>of(BeetleMagentaStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleMagentaStripedShinyEntity>> BEETLE_MAGENTA_STRIPED_SHINY = register("beetle_magenta_striped_shiny",
			EntityType.Builder.<BeetleMagentaStripedShinyEntity>of(BeetleMagentaStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleMagentaSpottedEntity>> BEETLE_MAGENTA_SPOTTED = register("beetle_magenta_spotted",
			EntityType.Builder.<BeetleMagentaSpottedEntity>of(BeetleMagentaSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleMagentaSpottedShinyEntity>> BEETLE_MAGENTA_SPOTTED_SHINY = register("beetle_magenta_spotted_shiny",
			EntityType.Builder.<BeetleMagentaSpottedShinyEntity>of(BeetleMagentaSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBrownPlainEntity>> BEETLE_BROWN_PLAIN = register("beetle_brown_plain",
			EntityType.Builder.<BeetleBrownPlainEntity>of(BeetleBrownPlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBrownPlainShinyEntity>> BEETLE_BROWN_PLAIN_SHINY = register("beetle_brown_plain_shiny",
			EntityType.Builder.<BeetleBrownPlainShinyEntity>of(BeetleBrownPlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBrownStripedEntity>> BEETLE_BROWN_STRIPED = register("beetle_brown_striped",
			EntityType.Builder.<BeetleBrownStripedEntity>of(BeetleBrownStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBrownStripedShinyEntity>> BEETLE_BROWN_STRIPED_SHINY = register("beetle_brown_striped_shiny",
			EntityType.Builder.<BeetleBrownStripedShinyEntity>of(BeetleBrownStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBrownSpottedEntity>> BEETLE_BROWN_SPOTTED = register("beetle_brown_spotted",
			EntityType.Builder.<BeetleBrownSpottedEntity>of(BeetleBrownSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBrownSpottedShinyEntity>> BEETLE_BROWN_SPOTTED_SHINY = register("beetle_brown_spotted_shiny",
			EntityType.Builder.<BeetleBrownSpottedShinyEntity>of(BeetleBrownSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleWhitePlainEntity>> BEETLE_WHITE_PLAIN = register("beetle_white_plain",
			EntityType.Builder.<BeetleWhitePlainEntity>of(BeetleWhitePlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleWhitePlainShinyEntity>> BEETLE_WHITE_PLAIN_SHINY = register("beetle_white_plain_shiny",
			EntityType.Builder.<BeetleWhitePlainShinyEntity>of(BeetleWhitePlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleWhiteStripedEntity>> BEETLE_WHITE_STRIPED = register("beetle_white_striped",
			EntityType.Builder.<BeetleWhiteStripedEntity>of(BeetleWhiteStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleWhiteStripedShinyEntity>> BEETLE_WHITE_STRIPED_SHINY = register("beetle_white_striped_shiny",
			EntityType.Builder.<BeetleWhiteStripedShinyEntity>of(BeetleWhiteStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleWhiteSpottedEntity>> BEETLE_WHITE_SPOTTED = register("beetle_white_spotted",
			EntityType.Builder.<BeetleWhiteSpottedEntity>of(BeetleWhiteSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleWhiteSpottedShinyEntity>> BEETLE_WHITE_SPOTTED_SHINY = register("beetle_white_spotted_shiny",
			EntityType.Builder.<BeetleWhiteSpottedShinyEntity>of(BeetleWhiteSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightgrayPlainEntity>> BEETLE_LIGHTGRAY_PLAIN = register("beetle_lightgray_plain",
			EntityType.Builder.<BeetleLightgrayPlainEntity>of(BeetleLightgrayPlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightgrayPlainShinyEntity>> BEETLE_LIGHTGRAY_PLAIN_SHINY = register("beetle_lightgray_plain_shiny",
			EntityType.Builder.<BeetleLightgrayPlainShinyEntity>of(BeetleLightgrayPlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightgrayStripedEntity>> BEETLE_LIGHTGRAY_STRIPED = register("beetle_lightgray_striped",
			EntityType.Builder.<BeetleLightgrayStripedEntity>of(BeetleLightgrayStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightgrayStripedShinyEntity>> BEETLE_LIGHTGRAY_STRIPED_SHINY = register("beetle_lightgray_striped_shiny",
			EntityType.Builder.<BeetleLightgrayStripedShinyEntity>of(BeetleLightgrayStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightgraySpottedEntity>> BEETLE_LIGHTGRAY_SPOTTED = register("beetle_lightgray_spotted",
			EntityType.Builder.<BeetleLightgraySpottedEntity>of(BeetleLightgraySpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleLightgraySpottedShinyEntity>> BEETLE_LIGHTGRAY_SPOTTED_SHINY = register("beetle_lightgray_spotted_shiny",
			EntityType.Builder.<BeetleLightgraySpottedShinyEntity>of(BeetleLightgraySpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGrayPlainEntity>> BEETLE_GRAY_PLAIN = register("beetle_gray_plain",
			EntityType.Builder.<BeetleGrayPlainEntity>of(BeetleGrayPlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGrayPlainShinyEntity>> BEETLE_GRAY_PLAIN_SHINY = register("beetle_gray_plain_shiny",
			EntityType.Builder.<BeetleGrayPlainShinyEntity>of(BeetleGrayPlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGrayStripedEntity>> BEETLE_GRAY_STRIPED = register("beetle_gray_striped",
			EntityType.Builder.<BeetleGrayStripedEntity>of(BeetleGrayStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGrayStripedShinyEntity>> BEETLE_GRAY_STRIPED_SHINY = register("beetle_gray_striped_shiny",
			EntityType.Builder.<BeetleGrayStripedShinyEntity>of(BeetleGrayStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGraySpottedEntity>> BEETLE_GRAY_SPOTTED = register("beetle_gray_spotted",
			EntityType.Builder.<BeetleGraySpottedEntity>of(BeetleGraySpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleGraySpottedShinyEntity>> BEETLE_GRAY_SPOTTED_SHINY = register("beetle_gray_spotted_shiny",
			EntityType.Builder.<BeetleGraySpottedShinyEntity>of(BeetleGraySpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBlackPlainEntity>> BEETLE_BLACK_PLAIN = register("beetle_black_plain",
			EntityType.Builder.<BeetleBlackPlainEntity>of(BeetleBlackPlainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBlackPlainShinyEntity>> BEETLE_BLACK_PLAIN_SHINY = register("beetle_black_plain_shiny",
			EntityType.Builder.<BeetleBlackPlainShinyEntity>of(BeetleBlackPlainShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBlackStripedEntity>> BEETLE_BLACK_STRIPED = register("beetle_black_striped",
			EntityType.Builder.<BeetleBlackStripedEntity>of(BeetleBlackStripedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBlackStripedShinyEntity>> BEETLE_BLACK_STRIPED_SHINY = register("beetle_black_striped_shiny",
			EntityType.Builder.<BeetleBlackStripedShinyEntity>of(BeetleBlackStripedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBlackSpottedEntity>> BEETLE_BLACK_SPOTTED = register("beetle_black_spotted",
			EntityType.Builder.<BeetleBlackSpottedEntity>of(BeetleBlackSpottedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeetleBlackSpottedShinyEntity>> BEETLE_BLACK_SPOTTED_SHINY = register("beetle_black_spotted_shiny",
			EntityType.Builder.<BeetleBlackSpottedShinyEntity>of(BeetleBlackSpottedShinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<NullPheremoneEntity>> NULL_PHEREMONE = register("null_pheremone",
			EntityType.Builder.<NullPheremoneEntity>of(NullPheremoneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).fireImmune().sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<MonarchButterflyEntity>> MONARCH_BUTTERFLY = register("monarch_butterfly",
			EntityType.Builder.<MonarchButterflyEntity>of(MonarchButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ButterflyEntity>> BUTTERFLY = register("butterfly",
			EntityType.Builder.<ButterflyEntity>of(ButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<SunbeamButterflyEntity>> SUNBEAM_BUTTERFLY = register("sunbeam_butterfly",
			EntityType.Builder.<SunbeamButterflyEntity>of(SunbeamButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SapphireButterflyEntity>> SAPPHIRE_BUTTERFLY = register("sapphire_butterfly",
			EntityType.Builder.<SapphireButterflyEntity>of(SapphireButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<HairstreakButterflyEntity>> HAIRSTREAK_BUTTERFLY = register("hairstreak_butterfly",
			EntityType.Builder.<HairstreakButterflyEntity>of(HairstreakButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BuckeyeButterflyEntity>> BUCKEYE_BUTTERFLY = register("buckeye_butterfly",
			EntityType.Builder.<BuckeyeButterflyEntity>of(BuckeyeButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PeacockButterflyEntity>> PEACOCK_BUTTERFLY = register("peacock_butterfly",
			EntityType.Builder.<PeacockButterflyEntity>of(PeacockButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrismwingButterflyEntity>> PRISMWING_BUTTERFLY = register("prismwing_butterfly",
			EntityType.Builder.<PrismwingButterflyEntity>of(PrismwingButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PolychromeButterflyEntity>> POLYCHROME_BUTTERFLY = register("polychrome_butterfly",
			EntityType.Builder.<PolychromeButterflyEntity>of(PolychromeButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MalachiteButterflyEntity>> MALACHITE_BUTTERFLY = register("malachite_butterfly",
			EntityType.Builder.<MalachiteButterflyEntity>of(MalachiteButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SwallowtailButterflyEntity>> SWALLOWTAIL_BUTTERFLY = register("swallowtail_butterfly",
			EntityType.Builder.<SwallowtailButterflyEntity>of(SwallowtailButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SootwingButterflyEntity>> SOOTWING_BUTTERFLY = register("sootwing_butterfly",
			EntityType.Builder.<SootwingButterflyEntity>of(SootwingButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PaintedButterflyEntity>> PAINTED_BUTTERFLY = register("painted_butterfly",
			EntityType.Builder.<PaintedButterflyEntity>of(PaintedButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TwilitButterflyEntity>> TWILIT_BUTTERFLY = register("twilit_butterfly",
			EntityType.Builder.<TwilitButterflyEntity>of(TwilitButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnowlaceButterflyEntity>> SNOWLACE_BUTTERFLY = register("snowlace_butterfly",
			EntityType.Builder.<SnowlaceButterflyEntity>of(SnowlaceButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PastelButterflyEntity>> PASTEL_BUTTERFLY = register("pastel_butterfly",
			EntityType.Builder.<PastelButterflyEntity>of(PastelButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AetherwingButterflyEntity>> AETHERWING_BUTTERFLY = register("aetherwing_butterfly",
			EntityType.Builder.<AetherwingButterflyEntity>of(AetherwingButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.3f, 0.6f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerEntity(Capabilities.ItemHandler.ENTITY, TERMITE.get(), (living, context) -> living.getInventory());
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		TermiteEntity.init(event);
		NestMarkerEntity.init(event);
		TermiteInfestationEntity.init(event);
		DragonflyDarnerEntity.init(event);
		DragonflyEntity.init(event);
		DragonflyAuburnEntity.init(event);
		DragonflyStingEntity.init(event);
		DragonflyTreasureEntity.init(event);
		DragonflyRuddyEntity.init(event);
		DragonflyAzureEntity.init(event);
		DragonflyArborEntity.init(event);
		DragonflyMysticEntity.init(event);
		DragonflyDevilEntity.init(event);
		DragonflyFushaEntity.init(event);
		DragonflyIridescentEntity.init(event);
		DragonflyPaleEntity.init(event);
		DragonflySteelyEntity.init(event);
		DragonflyMidnightEntity.init(event);
		DragonflyCoalEntity.init(event);
		DragonflyAmberEntity.init(event);
		BeetleRedPlainEntity.init(event);
		BeetleEntity.init(event);
		BeetleRedPlainShinyEntity.init(event);
		BeetleRedStripedEntity.init(event);
		BeetleRedStripedShinyEntity.init(event);
		BeetleRedSpottedEntity.init(event);
		BeetleRedSpottedShinyEntity.init(event);
		BeetleOrangePlainEntity.init(event);
		BeetleOrangePlainShinyEntity.init(event);
		BeetleOrangeStripedEntity.init(event);
		BeetleOrangeStripedShinyEntity.init(event);
		BeetleOrangeSpottedEntity.init(event);
		BeetleOrangeSpottedShinyEntity.init(event);
		BeetleYellowPlainEntity.init(event);
		BeetleYellowPlainShinyEntity.init(event);
		BeetleYellowStripedEntity.init(event);
		BeetleYellowStripedShinyEntity.init(event);
		BeetleYellowSpottedEntity.init(event);
		BeetleYellowSpottedShinyEntity.init(event);
		BeetleLimePlainEntity.init(event);
		BeetleLimePlainShinyEntity.init(event);
		BeetleLimeStripedEntity.init(event);
		BeetleLimeStripedShinyEntity.init(event);
		BeetleLimeSpottedEntity.init(event);
		BeetleLimeSpottedShinyEntity.init(event);
		BeetleGreenPlainEntity.init(event);
		BeetleGreenPlainShinyEntity.init(event);
		BeetleGreenStripedEntity.init(event);
		BeetleGreenStripedShinyEntity.init(event);
		BeetleGreenSpottedEntity.init(event);
		BeetleGreenSpottedShinyEntity.init(event);
		BeetleLightbluePlainEntity.init(event);
		BeetleLightbluePlainShinyEntity.init(event);
		BeetleLightblueStripedEntity.init(event);
		BeetleLightblueStripedShinyEntity.init(event);
		BeetleLightblueSpottedEntity.init(event);
		BeetleLightblueSpottedShinyEntity.init(event);
		BeetleCyanPlainEntity.init(event);
		BeetleCyanPlainShinyEntity.init(event);
		BeetleCyanStripedEntity.init(event);
		BeetleCyanStripedShinyEntity.init(event);
		BeetleCyanSpottedEntity.init(event);
		BeetleCyanSpottedShinyEntity.init(event);
		BeetleBluePlainEntity.init(event);
		BeetleBluePlainShinyEntity.init(event);
		BeetleBlueStripedEntity.init(event);
		BeetleBlueStripedShinyEntity.init(event);
		BeetleBlueSpottedEntity.init(event);
		BeetleBlueSpottedShinyEntity.init(event);
		BeetlePurplePlainEntity.init(event);
		BeetlePurplePlainShinyEntity.init(event);
		BeetlePurpleStripedEntity.init(event);
		BeetlePurpleStripedShinyEntity.init(event);
		BeetlePurpleSpottedEntity.init(event);
		BeetlePurpleSpottedShinyEntity.init(event);
		BeetlePinkPlainEntity.init(event);
		BeetlePinkPlainShinyEntity.init(event);
		BeetlePinkStripedEntity.init(event);
		BeetlePinkStripedShinyEntity.init(event);
		BeetlePinkSpottedEntity.init(event);
		BeetlePinkSpottedShinyEntity.init(event);
		BeetleMagentaPlainEntity.init(event);
		BeetleMagentaPlainShinyEntity.init(event);
		BeetleMagentaStripedEntity.init(event);
		BeetleMagentaStripedShinyEntity.init(event);
		BeetleMagentaSpottedEntity.init(event);
		BeetleMagentaSpottedShinyEntity.init(event);
		BeetleBrownPlainEntity.init(event);
		BeetleBrownPlainShinyEntity.init(event);
		BeetleBrownStripedEntity.init(event);
		BeetleBrownStripedShinyEntity.init(event);
		BeetleBrownSpottedEntity.init(event);
		BeetleBrownSpottedShinyEntity.init(event);
		BeetleWhitePlainEntity.init(event);
		BeetleWhitePlainShinyEntity.init(event);
		BeetleWhiteStripedEntity.init(event);
		BeetleWhiteStripedShinyEntity.init(event);
		BeetleWhiteSpottedEntity.init(event);
		BeetleWhiteSpottedShinyEntity.init(event);
		BeetleLightgrayPlainEntity.init(event);
		BeetleLightgrayPlainShinyEntity.init(event);
		BeetleLightgrayStripedEntity.init(event);
		BeetleLightgrayStripedShinyEntity.init(event);
		BeetleLightgraySpottedEntity.init(event);
		BeetleLightgraySpottedShinyEntity.init(event);
		BeetleGrayPlainEntity.init(event);
		BeetleGrayPlainShinyEntity.init(event);
		BeetleGrayStripedEntity.init(event);
		BeetleGrayStripedShinyEntity.init(event);
		BeetleGraySpottedEntity.init(event);
		BeetleGraySpottedShinyEntity.init(event);
		BeetleBlackPlainEntity.init(event);
		BeetleBlackPlainShinyEntity.init(event);
		BeetleBlackStripedEntity.init(event);
		BeetleBlackStripedShinyEntity.init(event);
		BeetleBlackSpottedEntity.init(event);
		BeetleBlackSpottedShinyEntity.init(event);
		NullPheremoneEntity.init(event);
		MonarchButterflyEntity.init(event);
		ButterflyEntity.init(event);
		SunbeamButterflyEntity.init(event);
		SapphireButterflyEntity.init(event);
		HairstreakButterflyEntity.init(event);
		BuckeyeButterflyEntity.init(event);
		PeacockButterflyEntity.init(event);
		PrismwingButterflyEntity.init(event);
		PolychromeButterflyEntity.init(event);
		MalachiteButterflyEntity.init(event);
		SwallowtailButterflyEntity.init(event);
		SootwingButterflyEntity.init(event);
		PaintedButterflyEntity.init(event);
		TwilitButterflyEntity.init(event);
		SnowlaceButterflyEntity.init(event);
		PastelButterflyEntity.init(event);
		AetherwingButterflyEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TERMITE.get(), TermiteEntity.createAttributes().build());
		event.put(NEST_MARKER.get(), NestMarkerEntity.createAttributes().build());
		event.put(TERMITE_INFESTATION.get(), TermiteInfestationEntity.createAttributes().build());
		event.put(DRAGONFLY_DARNER.get(), DragonflyDarnerEntity.createAttributes().build());
		event.put(DRAGONFLY.get(), DragonflyEntity.createAttributes().build());
		event.put(DRAGONFLY_AUBURN.get(), DragonflyAuburnEntity.createAttributes().build());
		event.put(DRAGONFLY_STING.get(), DragonflyStingEntity.createAttributes().build());
		event.put(DRAGONFLY_TREASURE.get(), DragonflyTreasureEntity.createAttributes().build());
		event.put(DRAGONFLY_RUDDY.get(), DragonflyRuddyEntity.createAttributes().build());
		event.put(DRAGONFLY_AZURE.get(), DragonflyAzureEntity.createAttributes().build());
		event.put(DRAGONFLY_ARBOR.get(), DragonflyArborEntity.createAttributes().build());
		event.put(DRAGONFLY_MYSTIC.get(), DragonflyMysticEntity.createAttributes().build());
		event.put(DRAGONFLY_DEVIL.get(), DragonflyDevilEntity.createAttributes().build());
		event.put(DRAGONFLY_FUSHA.get(), DragonflyFushaEntity.createAttributes().build());
		event.put(DRAGONFLY_IRIDESCENT.get(), DragonflyIridescentEntity.createAttributes().build());
		event.put(DRAGONFLY_PALE.get(), DragonflyPaleEntity.createAttributes().build());
		event.put(DRAGONFLY_STEELY.get(), DragonflySteelyEntity.createAttributes().build());
		event.put(DRAGONFLY_MIDNIGHT.get(), DragonflyMidnightEntity.createAttributes().build());
		event.put(DRAGONFLY_COAL.get(), DragonflyCoalEntity.createAttributes().build());
		event.put(DRAGONFLY_AMBER.get(), DragonflyAmberEntity.createAttributes().build());
		event.put(BEETLE_RED_PLAIN.get(), BeetleRedPlainEntity.createAttributes().build());
		event.put(BEETLE.get(), BeetleEntity.createAttributes().build());
		event.put(BEETLE_RED_PLAIN_SHINY.get(), BeetleRedPlainShinyEntity.createAttributes().build());
		event.put(BEETLE_RED_STRIPED.get(), BeetleRedStripedEntity.createAttributes().build());
		event.put(BEETLE_RED_STRIPED_SHINY.get(), BeetleRedStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_RED_SPOTTED.get(), BeetleRedSpottedEntity.createAttributes().build());
		event.put(BEETLE_RED_SPOTTED_SHINY.get(), BeetleRedSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_ORANGE_PLAIN.get(), BeetleOrangePlainEntity.createAttributes().build());
		event.put(BEETLE_ORANGE_PLAIN_SHINY.get(), BeetleOrangePlainShinyEntity.createAttributes().build());
		event.put(BEETLE_ORANGE_STRIPED.get(), BeetleOrangeStripedEntity.createAttributes().build());
		event.put(BEETLE_ORANGE_STRIPED_SHINY.get(), BeetleOrangeStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_ORANGE_SPOTTED.get(), BeetleOrangeSpottedEntity.createAttributes().build());
		event.put(BEETLE_ORANGE_SPOTTED_SHINY.get(), BeetleOrangeSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_YELLOW_PLAIN.get(), BeetleYellowPlainEntity.createAttributes().build());
		event.put(BEETLE_YELLOW_PLAIN_SHINY.get(), BeetleYellowPlainShinyEntity.createAttributes().build());
		event.put(BEETLE_YELLOW_STRIPED.get(), BeetleYellowStripedEntity.createAttributes().build());
		event.put(BEETLE_YELLOW_STRIPED_SHINY.get(), BeetleYellowStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_YELLOW_SPOTTED.get(), BeetleYellowSpottedEntity.createAttributes().build());
		event.put(BEETLE_YELLOW_SPOTTED_SHINY.get(), BeetleYellowSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_LIME_PLAIN.get(), BeetleLimePlainEntity.createAttributes().build());
		event.put(BEETLE_LIME_PLAIN_SHINY.get(), BeetleLimePlainShinyEntity.createAttributes().build());
		event.put(BEETLE_LIME_STRIPED.get(), BeetleLimeStripedEntity.createAttributes().build());
		event.put(BEETLE_LIME_STRIPED_SHINY.get(), BeetleLimeStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_LIME_SPOTTED.get(), BeetleLimeSpottedEntity.createAttributes().build());
		event.put(BEETLE_LIME_SPOTTED_SHINY.get(), BeetleLimeSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_GREEN_PLAIN.get(), BeetleGreenPlainEntity.createAttributes().build());
		event.put(BEETLE_GREEN_PLAIN_SHINY.get(), BeetleGreenPlainShinyEntity.createAttributes().build());
		event.put(BEETLE_GREEN_STRIPED.get(), BeetleGreenStripedEntity.createAttributes().build());
		event.put(BEETLE_GREEN_STRIPED_SHINY.get(), BeetleGreenStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_GREEN_SPOTTED.get(), BeetleGreenSpottedEntity.createAttributes().build());
		event.put(BEETLE_GREEN_SPOTTED_SHINY.get(), BeetleGreenSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_LIGHTBLUE_PLAIN.get(), BeetleLightbluePlainEntity.createAttributes().build());
		event.put(BEETLE_LIGHTBLUE_PLAIN_SHINY.get(), BeetleLightbluePlainShinyEntity.createAttributes().build());
		event.put(BEETLE_LIGHTBLUE_STRIPED.get(), BeetleLightblueStripedEntity.createAttributes().build());
		event.put(BEETLE_LIGHTBLUE_STRIPED_SHINY.get(), BeetleLightblueStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_LIGHTBLUE_SPOTTED.get(), BeetleLightblueSpottedEntity.createAttributes().build());
		event.put(BEETLE_LIGHTBLUE_SPOTTED_SHINY.get(), BeetleLightblueSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_CYAN_PLAIN.get(), BeetleCyanPlainEntity.createAttributes().build());
		event.put(BEETLE_CYAN_PLAIN_SHINY.get(), BeetleCyanPlainShinyEntity.createAttributes().build());
		event.put(BEETLE_CYAN_STRIPED.get(), BeetleCyanStripedEntity.createAttributes().build());
		event.put(BEETLE_CYAN_STRIPED_SHINY.get(), BeetleCyanStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_CYAN_SPOTTED.get(), BeetleCyanSpottedEntity.createAttributes().build());
		event.put(BEETLE_CYAN_SPOTTED_SHINY.get(), BeetleCyanSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_BLUE_PLAIN.get(), BeetleBluePlainEntity.createAttributes().build());
		event.put(BEETLE_BLUE_PLAIN_SHINY.get(), BeetleBluePlainShinyEntity.createAttributes().build());
		event.put(BEETLE_BLUE_STRIPED.get(), BeetleBlueStripedEntity.createAttributes().build());
		event.put(BEETLE_BLUE_STRIPED_SHINY.get(), BeetleBlueStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_BLUE_SPOTTED.get(), BeetleBlueSpottedEntity.createAttributes().build());
		event.put(BEETLE_BLUE_SPOTTED_SHINY.get(), BeetleBlueSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_PURPLE_PLAIN.get(), BeetlePurplePlainEntity.createAttributes().build());
		event.put(BEETLE_PURPLE_PLAIN_SHINY.get(), BeetlePurplePlainShinyEntity.createAttributes().build());
		event.put(BEETLE_PURPLE_STRIPED.get(), BeetlePurpleStripedEntity.createAttributes().build());
		event.put(BEETLE_PURPLE_STRIPED_SHINY.get(), BeetlePurpleStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_PURPLE_SPOTTED.get(), BeetlePurpleSpottedEntity.createAttributes().build());
		event.put(BEETLE_PURPLE_SPOTTED_SHINY.get(), BeetlePurpleSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_PINK_PLAIN.get(), BeetlePinkPlainEntity.createAttributes().build());
		event.put(BEETLE_PINK_PLAIN_SHINY.get(), BeetlePinkPlainShinyEntity.createAttributes().build());
		event.put(BEETLE_PINK_STRIPED.get(), BeetlePinkStripedEntity.createAttributes().build());
		event.put(BEETLE_PINK_STRIPED_SHINY.get(), BeetlePinkStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_PINK_SPOTTED.get(), BeetlePinkSpottedEntity.createAttributes().build());
		event.put(BEETLE_PINK_SPOTTED_SHINY.get(), BeetlePinkSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_MAGENTA_PLAIN.get(), BeetleMagentaPlainEntity.createAttributes().build());
		event.put(BEETLE_MAGENTA_PLAIN_SHINY.get(), BeetleMagentaPlainShinyEntity.createAttributes().build());
		event.put(BEETLE_MAGENTA_STRIPED.get(), BeetleMagentaStripedEntity.createAttributes().build());
		event.put(BEETLE_MAGENTA_STRIPED_SHINY.get(), BeetleMagentaStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_MAGENTA_SPOTTED.get(), BeetleMagentaSpottedEntity.createAttributes().build());
		event.put(BEETLE_MAGENTA_SPOTTED_SHINY.get(), BeetleMagentaSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_BROWN_PLAIN.get(), BeetleBrownPlainEntity.createAttributes().build());
		event.put(BEETLE_BROWN_PLAIN_SHINY.get(), BeetleBrownPlainShinyEntity.createAttributes().build());
		event.put(BEETLE_BROWN_STRIPED.get(), BeetleBrownStripedEntity.createAttributes().build());
		event.put(BEETLE_BROWN_STRIPED_SHINY.get(), BeetleBrownStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_BROWN_SPOTTED.get(), BeetleBrownSpottedEntity.createAttributes().build());
		event.put(BEETLE_BROWN_SPOTTED_SHINY.get(), BeetleBrownSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_WHITE_PLAIN.get(), BeetleWhitePlainEntity.createAttributes().build());
		event.put(BEETLE_WHITE_PLAIN_SHINY.get(), BeetleWhitePlainShinyEntity.createAttributes().build());
		event.put(BEETLE_WHITE_STRIPED.get(), BeetleWhiteStripedEntity.createAttributes().build());
		event.put(BEETLE_WHITE_STRIPED_SHINY.get(), BeetleWhiteStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_WHITE_SPOTTED.get(), BeetleWhiteSpottedEntity.createAttributes().build());
		event.put(BEETLE_WHITE_SPOTTED_SHINY.get(), BeetleWhiteSpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_LIGHTGRAY_PLAIN.get(), BeetleLightgrayPlainEntity.createAttributes().build());
		event.put(BEETLE_LIGHTGRAY_PLAIN_SHINY.get(), BeetleLightgrayPlainShinyEntity.createAttributes().build());
		event.put(BEETLE_LIGHTGRAY_STRIPED.get(), BeetleLightgrayStripedEntity.createAttributes().build());
		event.put(BEETLE_LIGHTGRAY_STRIPED_SHINY.get(), BeetleLightgrayStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_LIGHTGRAY_SPOTTED.get(), BeetleLightgraySpottedEntity.createAttributes().build());
		event.put(BEETLE_LIGHTGRAY_SPOTTED_SHINY.get(), BeetleLightgraySpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_GRAY_PLAIN.get(), BeetleGrayPlainEntity.createAttributes().build());
		event.put(BEETLE_GRAY_PLAIN_SHINY.get(), BeetleGrayPlainShinyEntity.createAttributes().build());
		event.put(BEETLE_GRAY_STRIPED.get(), BeetleGrayStripedEntity.createAttributes().build());
		event.put(BEETLE_GRAY_STRIPED_SHINY.get(), BeetleGrayStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_GRAY_SPOTTED.get(), BeetleGraySpottedEntity.createAttributes().build());
		event.put(BEETLE_GRAY_SPOTTED_SHINY.get(), BeetleGraySpottedShinyEntity.createAttributes().build());
		event.put(BEETLE_BLACK_PLAIN.get(), BeetleBlackPlainEntity.createAttributes().build());
		event.put(BEETLE_BLACK_PLAIN_SHINY.get(), BeetleBlackPlainShinyEntity.createAttributes().build());
		event.put(BEETLE_BLACK_STRIPED.get(), BeetleBlackStripedEntity.createAttributes().build());
		event.put(BEETLE_BLACK_STRIPED_SHINY.get(), BeetleBlackStripedShinyEntity.createAttributes().build());
		event.put(BEETLE_BLACK_SPOTTED.get(), BeetleBlackSpottedEntity.createAttributes().build());
		event.put(BEETLE_BLACK_SPOTTED_SHINY.get(), BeetleBlackSpottedShinyEntity.createAttributes().build());
		event.put(NULL_PHEREMONE.get(), NullPheremoneEntity.createAttributes().build());
		event.put(MONARCH_BUTTERFLY.get(), MonarchButterflyEntity.createAttributes().build());
		event.put(BUTTERFLY.get(), ButterflyEntity.createAttributes().build());
		event.put(SUNBEAM_BUTTERFLY.get(), SunbeamButterflyEntity.createAttributes().build());
		event.put(SAPPHIRE_BUTTERFLY.get(), SapphireButterflyEntity.createAttributes().build());
		event.put(HAIRSTREAK_BUTTERFLY.get(), HairstreakButterflyEntity.createAttributes().build());
		event.put(BUCKEYE_BUTTERFLY.get(), BuckeyeButterflyEntity.createAttributes().build());
		event.put(PEACOCK_BUTTERFLY.get(), PeacockButterflyEntity.createAttributes().build());
		event.put(PRISMWING_BUTTERFLY.get(), PrismwingButterflyEntity.createAttributes().build());
		event.put(POLYCHROME_BUTTERFLY.get(), PolychromeButterflyEntity.createAttributes().build());
		event.put(MALACHITE_BUTTERFLY.get(), MalachiteButterflyEntity.createAttributes().build());
		event.put(SWALLOWTAIL_BUTTERFLY.get(), SwallowtailButterflyEntity.createAttributes().build());
		event.put(SOOTWING_BUTTERFLY.get(), SootwingButterflyEntity.createAttributes().build());
		event.put(PAINTED_BUTTERFLY.get(), PaintedButterflyEntity.createAttributes().build());
		event.put(TWILIT_BUTTERFLY.get(), TwilitButterflyEntity.createAttributes().build());
		event.put(SNOWLACE_BUTTERFLY.get(), SnowlaceButterflyEntity.createAttributes().build());
		event.put(PASTEL_BUTTERFLY.get(), PastelButterflyEntity.createAttributes().build());
		event.put(AETHERWING_BUTTERFLY.get(), AetherwingButterflyEntity.createAttributes().build());
	}
}
