package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModItems;

public class RandomBottleRattleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (Math.random() < 0.01) {
			if (itemstack.getItem() == BugsAplentyModItems.SILVERFISH_BOTTLE.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.silverfish.ambient")), SoundSource.NEUTRAL, (float) 0.6, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.silverfish.ambient")), SoundSource.NEUTRAL, (float) 0.6, 1, false);
					}
				}
			} else if (itemstack.getItem() == BugsAplentyModItems.ENDERMITE_BOTTLE.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.endermite.ambient")), SoundSource.NEUTRAL, (float) 0.6, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.endermite.ambient")), SoundSource.NEUTRAL, (float) 0.6, 1, false);
					}
				}
			} else if (itemstack.getItem() == BugsAplentyModItems.BEE_BOTTLE.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.bee.loop")), SoundSource.NEUTRAL, (float) 0.6, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.bee.loop")), SoundSource.NEUTRAL, (float) 0.6, 1, false);
					}
				}
			} else if (itemstack.getItem() == BugsAplentyModItems.TERMITE_BOTTLE.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:termite.work")), SoundSource.NEUTRAL, (float) 0.6, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:termite.work")), SoundSource.NEUTRAL, (float) 0.6, 1, false);
					}
				}
			}
		}
	}
}
