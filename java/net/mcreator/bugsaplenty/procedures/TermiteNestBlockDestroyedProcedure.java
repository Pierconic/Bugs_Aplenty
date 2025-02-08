package net.mcreator.bugsaplenty.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;
import net.mcreator.bugsaplenty.entity.TermiteEntity;

import java.util.List;
import java.util.Comparator;

public class TermiteNestBlockDestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) && CampfireCheckProcedure.execute(world, x, y, z) == false
				&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH)) != 0)) {
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 3, 5); index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = BugsAplentyModEntities.TERMITE.get().spawn(_level,
							BlockPos.containing(x + 0.5 + Mth.nextInt(RandomSource.create(), (int) (-0.2), (int) 0.2), y, z + 0.5 + Mth.nextInt(RandomSource.create(), (int) (-0.2), (int) 0.2)), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement((Mth.nextDouble(RandomSource.create(), -0.2, 0.2)), (Mth.nextDouble(RandomSource.create(), 0, 0.2)), (Mth.nextDouble(RandomSource.create(), -0.2, 0.2)));
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof TermiteEntity) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 300, 1, false, false));
						if (entityiterator instanceof Mob _entity && entity instanceof LivingEntity _ent)
							_entity.setTarget(_ent);
					}
				}
			}
		}
	}
}
