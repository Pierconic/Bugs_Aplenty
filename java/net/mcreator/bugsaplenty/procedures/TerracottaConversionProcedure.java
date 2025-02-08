package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModBlocks;

public class TerracottaConversionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.RED_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.RED_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ORANGE_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.ORANGE_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.YELLOW_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.YELLOW_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LIME_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.LIME_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LIGHT_BLUE_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.LIGHT_BLUE_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CYAN_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.CYAN_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BLUE_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.BLUE_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MAGENTA_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.MAGENTA_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.PINK_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.PINK_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.PURPLE_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.PURPLE_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BROWN_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.BROWN_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WHITE_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.WHITE_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LIGHT_GRAY_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.LIGHT_GRAY_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRAY_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.GRAY_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BLACK_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.BLACK_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GREEN_TERRACOTTA) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = BugsAplentyModBlocks.GREEN_COBBLED_TERRACOTTA.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
