package net.mcreator.bugsaplenty.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bugsaplenty.entity.PolychromeButterflyEntity;

public class PolychromeButterflyModel extends GeoModel<PolychromeButterflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(PolychromeButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:animations/butterfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PolychromeButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:geo/butterfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PolychromeButterflyEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/" + entity.getTexture() + ".png");
	}

}
