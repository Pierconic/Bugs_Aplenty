package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.DragonflyAmberEntity;

public class DragonflyAmberModel extends GeoModel<DragonflyAmberEntity> {
	@Override
	public ResourceLocation getAnimationResource(DragonflyAmberEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/dragonfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DragonflyAmberEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/dragonfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DragonflyAmberEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
