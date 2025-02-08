package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModBlocks;

public class NestMarkerCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BugsAplentyModBlocks.TERMITE_NEST.get()) || !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR)) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if (Math.random() < 0.004) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:termite.work")), SoundSource.BLOCKS, (float) 0.55, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("bugs_aplenty:termite.work")), SoundSource.BLOCKS, (float) 0.55, 1, false);
				}
			}
		}
	}
}
