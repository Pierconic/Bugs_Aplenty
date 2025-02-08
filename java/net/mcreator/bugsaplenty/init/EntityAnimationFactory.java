package net.mcreator.bugsaplenty.init;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.mcreator.bugsaplenty.entity.TwilitButterflyEntity;
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

@EventBusSubscriber
public class EntityAnimationFactory {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		if (event != null && event.getEntity() != null) {
			if (event.getEntity() instanceof TermiteEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyDarnerEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyAuburnEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyStingEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyTreasureEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyRuddyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyAzureEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyArborEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyMysticEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyDevilEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyFushaEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyIridescentEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyPaleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflySteelyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyMidnightEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyCoalEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof DragonflyAmberEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleRedPlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleRedPlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleRedStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleRedStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleRedSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleRedSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleOrangePlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleOrangePlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleOrangeStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleOrangeStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleOrangeSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleOrangeSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleYellowPlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleYellowPlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleYellowStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleYellowStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleYellowSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleYellowSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLimePlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLimePlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLimeStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLimeStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLimeSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLimeSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGreenPlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGreenPlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGreenStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGreenStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGreenSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGreenSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightbluePlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightbluePlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightblueStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightblueStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightblueSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightblueSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleCyanPlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleCyanPlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleCyanStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleCyanStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleCyanSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleCyanSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBluePlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBluePlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBlueStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBlueStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBlueSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBlueSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePurplePlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePurplePlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePurpleStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePurpleStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePurpleSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePurpleSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePinkPlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePinkPlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePinkStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePinkStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePinkSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetlePinkSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleMagentaPlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleMagentaPlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleMagentaStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleMagentaStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleMagentaSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleMagentaSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBrownPlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBrownPlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBrownStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBrownStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBrownSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBrownSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleWhitePlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleWhitePlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleWhiteStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleWhiteStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleWhiteSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleWhiteSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightgrayPlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightgrayPlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightgrayStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightgrayStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightgraySpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleLightgraySpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGrayPlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGrayPlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGrayStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGrayStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGraySpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleGraySpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBlackPlainEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBlackPlainShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBlackStripedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBlackStripedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBlackSpottedEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BeetleBlackSpottedShinyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof MonarchButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof ButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof SunbeamButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof SapphireButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof HairstreakButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof BuckeyeButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof PeacockButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof PrismwingButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof PolychromeButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof MalachiteButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof SwallowtailButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof SootwingButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof PaintedButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof TwilitButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof SnowlaceButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof PastelButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof AetherwingButterflyEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
		}
	}
}
