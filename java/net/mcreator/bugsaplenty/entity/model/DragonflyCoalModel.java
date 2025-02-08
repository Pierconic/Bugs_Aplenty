package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.DragonflyCoalEntity;

public class DragonflyCoalModel extends GeoModel<DragonflyCoalEntity> {
	@Override
	public ResourceLocation getAnimationResource(DragonflyCoalEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/dragonfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DragonflyCoalEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/dragonfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DragonflyCoalEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
