package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.PrismwingButterflyEntity;

public class PrismwingButterflyModel extends GeoModel<PrismwingButterflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(PrismwingButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/butterfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PrismwingButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/butterfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PrismwingButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
