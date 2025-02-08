
package net.mcreator.bugsaplenty.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bugsaplenty.entity.model.BeetlePinkStripedModel;
import net.mcreator.bugsaplenty.entity.BeetlePinkStripedEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BeetlePinkStripedRenderer extends GeoEntityRenderer<BeetlePinkStripedEntity> {
	public BeetlePinkStripedRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BeetlePinkStripedModel());
		this.shadowRadius = 0.3f;
	}

	@Override
	public RenderType getRenderType(BeetlePinkStripedEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BeetlePinkStripedEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}
}
