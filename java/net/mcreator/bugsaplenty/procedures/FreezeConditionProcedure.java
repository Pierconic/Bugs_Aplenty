package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class FreezeConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.UNLUCK) && !(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty())) {
			return false;
		}
		return true;
	}
}
