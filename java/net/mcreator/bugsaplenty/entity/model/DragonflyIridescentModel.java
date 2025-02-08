package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.DragonflyIridescentEntity;

public class DragonflyIridescentModel extends GeoModel<DragonflyIridescentEntity> {
	@Override
	public ResourceLocation getAnimationResource(DragonflyIridescentEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/dragonfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DragonflyIridescentEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/dragonfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DragonflyIridescentEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
