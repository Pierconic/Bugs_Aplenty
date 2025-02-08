package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModBlocks;

public class CobbledTerracottaGenerationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double check = 0;
		boolean found = false;
		found = false;
		for (int index0 = 0; index0 < 5; index0++) {
			if (check == 0) {
				sx = 0;
				sy = -1;
				sz = 0;
			} else if (check == 1) {
				sx = 1;
				sy = 0;
				sz = 0;
			} else if (check == 2) {
				sx = -1;
				sy = 0;
				sz = 0;
			} else if (check == 3) {
				sx = 0;
				sy = 0;
				sz = 1;
			} else if (check == 4) {
				sx = 0;
				sy = 0;
				sz = -1;
			}
			if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:crackable_terracotta"))) && !found) {
				world.levelEvent(2001, BlockPos.containing(x + sx, y + sy, z + sz), Block.getId((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)))));
				found = true;
				if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WHITE_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.WHITE_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.ORANGE_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.ORANGE_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.MAGENTA_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.MAGENTA_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.LIGHT_BLUE_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.LIGHT_BLUE_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.YELLOW_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.YELLOW_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.LIME_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.LIME_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PINK_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.PINK_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRAY_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.GRAY_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.LIGHT_GRAY_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.LIGHT_GRAY_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.CYAN_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.CYAN_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PURPLE_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.PURPLE_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BLUE_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.BLUE_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BROWN_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.BROWN_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GREEN_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.GREEN_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.RED_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.RED_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BLACK_TERRACOTTA) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BugsAplentyModBlocks.BLACK_COBBLED_TERRACOTTA.get().defaultBlockState(), 3);
				}
			}
			check = check + 1;
		}
	}
}
