package com.animania.render.peacocks;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.opengl.GL11;

import com.animania.entities.cows.EntityBullAngus;
import com.animania.entities.peacocks.EntityPeafowlWhite;
import com.animania.models.ModelPeafowl;


@SideOnly(Side.CLIENT)
public class RenderPeafowlWhite extends RenderLiving<EntityPeafowlWhite>
{

	public RenderPeafowlWhite(RenderManager rm)
	{
		super(rm, new ModelPeafowl(), 0.3F);
	}

	protected float handleRotationFloat(EntityPeafowlWhite livingBase, float partialTicks)
	{
		float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
		float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
		return (MathHelper.sin(f) + 1.0F) * f1;
	}

	
	@Override
    protected void preRenderCallback(EntityPeafowlWhite entityliving, float f)
    {
        preRenderScale((EntityPeafowlWhite)entityliving, f);
    }

	protected void preRenderScale(EntityPeafowlWhite entity, float f)
    {
        GL11.glScalef(0.9F, 0.9F, 0.9F); 
    }
	
	@Override
	protected ResourceLocation getEntityTexture(EntityPeafowlWhite entity) {
		
		int blinkTimer = entity.blinkTimer;

		if (blinkTimer < 5 && blinkTimer >= 0) {
			return entity.getResourceLocationBlink();
		} else {
			return entity.getResourceLocation();
		}
	}

}