
package net.mcreator.bugsaplenty.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.bugsaplenty.entity.NullPheremoneEntity;

public class NullPheremoneRenderer extends MobRenderer<NullPheremoneEntity, SlimeModel<NullPheremoneEntity>> {
	public NullPheremoneRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(NullPheremoneEntity entity) {
		return ResourceLocation.parse("bugs_aplenty:textures/entities/termite_normal.png");
	}
}
