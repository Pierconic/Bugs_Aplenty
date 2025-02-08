package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class ButterflyAIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("annoying") && !(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).isEmpty())) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if ((world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 2, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 3, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 4, z))
				&& world.isEmptyBlock(BlockPos.containing(x, y - 5, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 6, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 7, z)) || !(world instanceof Level _lvl10 && _lvl10.isDay())
				|| world.getLevelData().isRaining()) && entity.getDeltaMovement().y() > -0.05) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() - 0.12), (entity.getDeltaMovement().z())));
		} else if (!world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) && entity.getDeltaMovement().y() < 0 && !world.getLevelData().isRaining() && world instanceof Level _lvl20 && _lvl20.isDay()) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.15), (entity.getDeltaMovement().z())));
		}
		if (entity.onGround() && world.getLevelData().isRaining() && !(world instanceof Level _lvl27 && _lvl27.isDay())) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-3), (entity.getDeltaMovement().z())));
		}
	}
}
