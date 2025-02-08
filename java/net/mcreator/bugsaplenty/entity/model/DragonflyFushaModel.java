package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.DragonflyFushaEntity;

public class DragonflyFushaModel extends GeoModel<DragonflyFushaEntity> {
	@Override
	public ResourceLocation getAnimationResource(DragonflyFushaEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/dragonfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DragonflyFushaEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/dragonfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DragonflyFushaEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
