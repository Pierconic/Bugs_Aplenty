package net.mcreator.bugsaplenty.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.entity.animal.Pufferfish;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.entity.animal.Bee;
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
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.network.BugsAplentyModVariables;
import net.mcreator.bugsaplenty.init.BugsAplentyModItems;
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
import net.mcreator.bugsaplenty.entity.DragonflyDevilEntity;
import net.mcreator.bugsaplenty.entity.DragonflyDarnerEntity;
import net.mcreator.bugsaplenty.entity.DragonflyCoalEntity;
import net.mcreator.bugsaplenty.entity.DragonflyAzureEntity;
import net.mcreator.bugsaplenty.entity.DragonflyAuburnEntity;
import net.mcreator.bugsaplenty.entity.DragonflyArborEntity;
import net.mcreator.bugsaplenty.entity.DragonflyAmberEntity;
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

import java.util.List;
import java.util.Comparator;

public class CopperNetActivateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean found = false;
		ItemStack pokemon = ItemStack.EMPTY;
		double slot = 0;
		double BucketVariant = 0;
		String DisplayName = "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:net.woosh")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:net.woosh")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerIter) {
				for (int _idx = 0; _idx < _modHandlerIter.getSlots(); _idx++) {
					ItemStack itemstackiterator = _modHandlerIter.getStackInSlot(_idx).copy();
					if (itemstackiterator.getItem() == itemstack.getItem()) {
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(itemstackiterator.getItem(), 30);
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.WATER_BUCKET)) : false)
							&& entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:fishes")))) {
						DisplayName = "";
						BucketVariant = 0;
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.BUBBLE, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 10, 0.2, 0.2, 0.2, 0.1);
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET) {
							(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
						} else {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(Items.WATER_BUCKET);
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
						if (entityiterator instanceof Cod) {
							if (!(entityiterator.getDisplayName().getString()).equals("Cod")) {
								pokemon = new ItemStack(Items.COD_BUCKET);
								pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
							} else {
								pokemon = new ItemStack(Items.COD_BUCKET);
							}
						} else if (entityiterator instanceof Salmon) {
							if (!(entityiterator.getDisplayName().getString()).equals("Salmon")) {
								pokemon = new ItemStack(Items.SALMON_BUCKET);
								pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
							} else {
								pokemon = new ItemStack(Items.SALMON_BUCKET);
							}
						} else if (entityiterator instanceof Pufferfish) {
							if (!(entityiterator.getDisplayName().getString()).equals("Pufferfish")) {
								pokemon = new ItemStack(Items.PUFFERFISH_BUCKET);
								pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
							} else {
								pokemon = new ItemStack(Items.PUFFERFISH_BUCKET);
							}
						} else if (entityiterator instanceof TropicalFish) {
							if (!(entityiterator.getDisplayName().getString()).equals("Tropical Fish")) {
								{
									final String _tagName = "BucketVariantTag";
									final double _tagValue = (entityiterator.getPersistentData().getDouble("Variant"));
									CustomData.update(DataComponents.CUSTOM_DATA, pokemon, tag -> tag.putDouble(_tagName, _tagValue));
								}
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((new java.text.DecimalFormat("########").format(entityiterator.getPersistentData().getDouble("Variant")))), false);
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((new java.text.DecimalFormat("########").format(BucketVariant))), false);
								pokemon = new ItemStack(Items.TROPICAL_FISH_BUCKET);
								pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
							} else {
								{
									final String _tagName = "BucketVariantTag";
									final double _tagValue = (entityiterator.getPersistentData().getDouble("Variant"));
									CustomData.update(DataComponents.CUSTOM_DATA, pokemon, tag -> tag.putDouble(_tagName, _tagValue));
								}
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((new java.text.DecimalFormat("########").format(entityiterator.getPersistentData().getDouble("Variant")))), false);
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((new java.text.DecimalFormat("########").format(BucketVariant))), false);
								pokemon = new ItemStack(Items.TROPICAL_FISH_BUCKET);
							}
						} else if (entityiterator instanceof Axolotl) {
							if (!(entityiterator.getDisplayName().getString()).equals("Axolotl")) {
								pokemon = new ItemStack(Items.AXOLOTL_BUCKET);
								pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
							} else {
								pokemon = new ItemStack(Items.AXOLOTL_BUCKET);
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = pokemon.copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					} else if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.GLASS_BOTTLE)) : false)
							&& entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:insects")))) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.POOF, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 6, 0.2, 0.2, 0.2, 0.1);
						found = false;
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.GLASS_BOTTLE) {
							(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
						} else {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
						if (entityiterator instanceof Silverfish) {
							pokemon = new ItemStack(BugsAplentyModItems.SILVERFISH_BOTTLE.get());
							if (!(entityiterator.getDisplayName().getString()).equals("Silverfish")) {
								pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
							}
						} else if (entityiterator instanceof TermiteEntity) {
							pokemon = new ItemStack(BugsAplentyModItems.TERMITE_BOTTLE.get());
							if (!(entityiterator.getDisplayName().getString()).equals("Termite")) {
								pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
							}
						} else if (entityiterator instanceof Endermite) {
							pokemon = new ItemStack(BugsAplentyModItems.ENDERMITE_BOTTLE.get());
							if (!(entityiterator.getDisplayName().getString()).equals("Endermite")) {
								pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
							}
						} else if (entityiterator instanceof Bee) {
							pokemon = new ItemStack(BugsAplentyModItems.BEE_BOTTLE.get());
							if (!(entityiterator.getDisplayName().getString()).equals("Bee")) {
								pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
							}
						} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:dragonflies")))) {
							if (entityiterator instanceof DragonflyAmberEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.BROWN_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Amber")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyArborEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.CYAN_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Arbor")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyAuburnEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.ORANGE_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Auburn")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyAzureEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.LIGHT_BLUE_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Azure")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyCoalEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.BLACK_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Coal")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyDarnerEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.RED_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Darner")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyDevilEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.PINK_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Devil")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyFushaEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.MAGENTA_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Fusha")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyIridescentEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.PURPLE_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Iridescent")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyMidnightEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.GRAY_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Midnight")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyMysticEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.BLUE_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Mystic")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyPaleEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.WHITE_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Pale")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyRuddyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.GREEN_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Ruddy")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflySteelyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.LIGHT_GRAY_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Steely")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyStingEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.YELLOW_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Sting")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof DragonflyTreasureEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.LIME_DRAGONFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Dragonfly Treasure")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							}
						} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:butterflies")))) {
							if (entityiterator instanceof MonarchButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.MONARCH_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Monarch Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof SunbeamButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.SUNBEAM_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Sunbeam Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof SapphireButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.SAPPHIRE_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Sapphire Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof HairstreakButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.HAIRSTREAK_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Hairstreak Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof AetherwingButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.AETHERWING_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Aetherwing Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof BuckeyeButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.BUCKEYE_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Buckeye Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof PeacockButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.PEACOCK_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Peacock Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof PastelButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.PASTEL_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Pastel Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof PaintedButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.PAINTED_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Painted Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof MalachiteButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.MALACHITE_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Malachite Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof PolychromeButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.POLYCHROME_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Polychrome Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof PrismwingButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.PRISMWING_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Prismwing Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof SnowlaceButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.SNOWLACE_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Snowlace Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof SootwingButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.SOOTWING_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Sootwing Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof SwallowtailButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.SWALLOWTAIL_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Swallowtail Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							} else if (entityiterator instanceof TwilitButterflyEntity) {
								pokemon = new ItemStack(BugsAplentyModItems.TWILIT_BUTTERFLY_BOTTLE.get());
								if (!(entityiterator.getDisplayName().getString()).equals("Twilit Butterfly")) {
									pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
								}
							}
						} else {
							{
								BugsAplentyModVariables.PlayerVariables _vars = entity.getData(BugsAplentyModVariables.PLAYER_VARIABLES);
								_vars.BeetlesCollected = entity.getData(BugsAplentyModVariables.PLAYER_VARIABLES).BeetlesCollected + 1;
								_vars.syncPlayerVariables(entity);
							}
							if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:red_beetles")))) {
								if (entityiterator instanceof BeetleRedPlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.RED_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Gulpbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleRedPlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.RED_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Gulpbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleRedSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.RED_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Gulpbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleRedSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.RED_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Gulpbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleRedStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.RED_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Gulpbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleRedStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.RED_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Gulpbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:orange_beetles")))) {
								if (entityiterator instanceof BeetleOrangePlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.ORANGE_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Thrumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleOrangePlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.ORANGE_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Thrumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleOrangeSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.ORANGE_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Thrumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleOrangeSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.ORANGE_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Thrumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleOrangeStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.ORANGE_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Thrumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleOrangeStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.ORANGE_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Thrumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:yellow_beetles")))) {
								if (entityiterator instanceof BeetleYellowPlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.YELLOW_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Humbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleYellowPlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.YELLOW_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Humbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleYellowSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.YELLOW_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Humbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleYellowSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.YELLOW_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Humbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleYellowStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.YELLOW_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Humbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleYellowStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.YELLOW_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Humbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:lime_beetles")))) {
								if (entityiterator instanceof BeetleLimePlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIME_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Flutebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLimePlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIME_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Flutebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLimeSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIME_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Flutebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLimeSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIME_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Flutebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLimeStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIME_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Flutebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLimeStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIME_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Flutebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:green_beetles")))) {
								if (entityiterator instanceof BeetleGreenPlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GREEN_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Bopbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleGreenPlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GREEN_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Bopbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleGreenSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GREEN_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Bopbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleGreenSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GREEN_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Bopbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleGreenStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GREEN_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Bopbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleGreenStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GREEN_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Bopbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:light_blue_beetles")))) {
								if (entityiterator instanceof BeetleLightbluePlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Chimebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLightbluePlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Chimebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLightblueSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Chimebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLightblueSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Chimebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLightblueStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Chimebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLightblueStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHTBLUE_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Chimebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:cyan_beetles")))) {
								if (entityiterator instanceof BeetleCyanPlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.CYAN_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Pulsebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleCyanPlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.CYAN_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Pulsebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleCyanSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.CYAN_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Pulsebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleCyanSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.CYAN_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Pulsebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleCyanStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.CYAN_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Pulsebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleCyanStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.CYAN_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Pulsebeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:blue_beetles")))) {
								if (entityiterator instanceof BeetleBluePlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLUE_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Seabeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBluePlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLUE_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Seabeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBlueSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLUE_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Seabeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBlueSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLUE_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Seabeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBlueStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLUE_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Seabeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBlueStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLUE_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Seabeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:purple_beetles")))) {
								if (entityiterator instanceof BeetlePurplePlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PURPLE_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Strumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetlePurplePlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PURPLE_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Strumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetlePurpleSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PURPLE_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Strumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetlePurpleSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PURPLE_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Strumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetlePurpleStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PURPLE_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Strumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetlePurpleStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PURPLE_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Strumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:pink_beetles")))) {
								if (entityiterator instanceof BeetlePinkPlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PINK_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Plinkbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetlePinkPlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PINK_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Plinkbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetlePinkSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PINK_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Plinkbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetlePinkSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PINK_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Plinkbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetlePinkStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PINK_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Plinkbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetlePinkStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.PINK_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Plinkbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:magenta_beetles")))) {
								if (entityiterator instanceof BeetleMagentaPlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Glitchbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleMagentaPlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Glitchbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleMagentaSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Glitchbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleMagentaSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Glitchbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleMagentaStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Glitchbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleMagentaStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.MAGENTA_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Glitchbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:brown_beetles")))) {
								if (entityiterator instanceof BeetleBrownPlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BROWN_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Clatterbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBrownPlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BROWN_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Clatterbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBrownSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BROWN_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Clatterbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBrownSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BROWN_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Clatterbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBrownStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BROWN_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Clatterbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBrownStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BROWN_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Clatterbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:white_beetles")))) {
								if (entityiterator instanceof BeetleWhitePlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.WHITE_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Songbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleWhitePlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.WHITE_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Songbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleWhiteSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.WHITE_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Songbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleWhiteSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.WHITE_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Songbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleWhiteStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.WHITE_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Songbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleWhiteStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.WHITE_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Songbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:light_gray_beetles")))) {
								if (entityiterator instanceof BeetleLightgrayPlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Bellbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLightgrayPlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Bellbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLightgraySpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Bellbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLightgraySpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Bellbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLightgrayStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Bellbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleLightgrayStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.LIGHT_GRAY_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Bellbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:gray_beetles")))) {
								if (entityiterator instanceof BeetleGrayPlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GRAY_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Wispbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleGrayPlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GRAY_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Wispbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleGraySpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GRAY_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Wispbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleGraySpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GRAY_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Wispbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleGrayStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GRAY_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Wispbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleGrayStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.GRAY_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Wispbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:black_beetles")))) {
								if (entityiterator instanceof BeetleBlackPlainEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLACK_BEETLE_BOTTLE.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Dull Rumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBlackPlainShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLACK_BEETLE_BOTTLE_SHINY.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Rumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBlackSpottedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLACK_BEETLE_BOTTLE_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Spotted Rumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBlackSpottedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLACK_BEETLE_BOTTLE_SHINY_SPOTTED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Spotted Rumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBlackStripedEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLACK_BEETLE_BOTTLE_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Striped Rumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								} else if (entityiterator instanceof BeetleBlackStripedShinyEntity) {
									pokemon = new ItemStack(BugsAplentyModItems.BLACK_BEETLE_BOTTLE_SHINY_STRIPED.get());
									if (!(entityiterator.getDisplayName().getString()).equals("Shiny Striped Rumbeetle")) {
										pokemon.set(DataComponents.CUSTOM_NAME, Component.literal((entityiterator.getDisplayName().getString())));
									}
								}
							}
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = pokemon.copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
			}
		}
	}
}
