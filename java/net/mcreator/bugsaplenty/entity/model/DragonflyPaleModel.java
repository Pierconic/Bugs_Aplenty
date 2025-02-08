package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.DragonflyPaleEntity;

public class DragonflyPaleModel extends GeoModel<DragonflyPaleEntity> {
	@Override
	public ResourceLocation getAnimationResource(DragonflyPaleEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/dragonfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DragonflyPaleEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/dragonfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DragonflyPaleEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
