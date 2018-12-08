package com.animania.addons.catsdogs.client.models.dogs;

import com.animania.client.models.render.ModelRendererAnimania;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelPug extends ModelBase
{
	ModelRendererAnimania body;
	ModelRendererAnimania back_right;
	ModelRendererAnimania back_left;
	ModelRendererAnimania front_right;
	ModelRendererAnimania front_left;
	ModelRendererAnimania tail;
	ModelRendererAnimania neck;
	ModelRendererAnimania pug_head;
	ModelRendererAnimania ear1;
	ModelRendererAnimania ear2;
	ModelRendererAnimania nose;

	public ModelPug()
	{
		this.body = new ModelRendererAnimania(this, 20, 42);
		this.body.setTextureSize(64, 64);
		this.body.addBox(-4.5F, -4.5F, -6.5F, 9, 9, 13);
		this.body.setRotationPoint(0.0F, 13.5F, 10.0F);
		this.body.setOffset(0.0F, -0.0F, -0.0F);
		this.back_right = new ModelRendererAnimania(this, 3, 27);
		this.back_right.setTextureSize(64, 64);
		this.back_right.addBox(-1.5F, -3.0F, -1.5F, 3, 6, 3);
		this.back_right.setRotationPoint(-2.0F, 5.0F, 4.0F);
		this.back_right.setOffset(0.0F, 2.5F, -0.0F);
		this.back_left = new ModelRendererAnimania(this, 3, 0);
		this.back_left.setTextureSize(64, 64);
		this.back_left.addBox(-1.5F, -3.0F, -1.5F, 3, 6, 3);
		this.back_left.setRotationPoint(4.5F, -2.5F, -0.0F);
		this.back_left.setOffset(0.0F, 2.5F, -0.0F);
		this.front_right = new ModelRendererAnimania(this, 3, 18);
		this.front_right.setTextureSize(64, 64);
		this.front_right.addBox(-1.5F, -3.0F, -1.5F, 3, 6, 3);
		this.front_right.setRotationPoint(-0.5F, -2.5F, -8.0F);
		this.front_right.setOffset(0.0F, 2.5F, -0.0F);
		this.front_left = new ModelRendererAnimania(this, 3, 9);
		this.front_left.setTextureSize(64, 64);
		this.front_left.addBox(-1.5F, -3.0F, -1.5F, 3, 6, 3);
		this.front_left.setRotationPoint(4.5F, -2.5F, -8.0F);
		this.front_left.setOffset(0.0F, 2.5F, -0.0F);
		this.tail = new ModelRendererAnimania(this, 6, 39);
		this.tail.setTextureSize(64, 64);
		this.tail.addBox(-1.0F, -3.0F, -3.0F, 2, 6, 6);
		this.tail.setRotationPoint(0.0F, -5.0F, 4.0F);
		this.tail.setOffset(0.0F, -0.0F, 2.0F);
		this.neck = new ModelRendererAnimania(this, 27, 27);
		this.neck.setTextureSize(64, 64);
		this.neck.addBox(-3.5F, -3.5F, -4.0F, 7, 7, 8);
		this.neck.setRotationPoint(0.0F, -6.0F, -7.5F);
		this.neck.setOffset(0.0F, 3.0F, 4.0F);
		this.pug_head = new ModelRendererAnimania(this, 28, 13);
		this.pug_head.setTextureSize(64, 64);
		this.pug_head.addBox(-4.0F, -4.0F, -3.0F, 8, 8, 6);
		this.pug_head.setRotationPoint(0.0F, 0.8914F, -4.3271F);
		this.pug_head.setOffset(0.0F, -0.0F, -0.0F);
		this.ear1 = new ModelRendererAnimania(this, 23, 9);
		this.ear1.setTextureSize(64, 64);
		this.ear1.addBox(-0.5F, -2.0F, -2.0F, 1, 4, 4);
		this.ear1.setRotationPoint(-4.0F, -4.0F, -0.0F);
		this.ear1.setOffset(0.5F, 2.0F, -0.0F);
		this.ear2 = new ModelRendererAnimania(this, 24, 1);
		this.ear2.setTextureSize(64, 64);
		this.ear2.addBox(-0.5F, -2.0F, -2.0F, 1, 4, 4);
		this.ear2.setRotationPoint(-8.3785F, -3.3891F, -0.0F);
		this.ear2.setOffset(0.5F, 2.0F, -0.0F);
		this.nose = new ModelRendererAnimania(this, 37, 9);
		this.nose.setTextureSize(64, 64);
		this.nose.addBox(-2.0F, -1.5F, -0.5F, 4, 3, 1);
		this.nose.setRotationPoint(0.0F, 0.0F, -1.5F);
		this.nose.setOffset(0.0F, 1.5F, -2.0F);
		this.back_right.addChild(this.back_left);
		this.back_right.addChild(this.front_right);
		this.back_right.addChild(this.front_left);
		this.body.addChild(this.back_right);
		this.body.addChild(this.tail);
		this.ear1.addChild(this.ear2);
		this.pug_head.addChild(this.ear1);
		this.pug_head.addChild(this.nose);
		this.neck.addChild(this.pug_head);
		this.body.addChild(this.neck);

	}

	@Override
	public void render(Entity entity, float f1, float f2, float f3, float f4, float f5, float scale)
	{
		this.neck.rotateAngleX = -0.6108652381980153F;
		this.pug_head.rotateAngleX = 0.6108652381980153F;
		this.ear1.rotateAngleX = 0.2617993877991494F;
		this.ear1.rotateAngleY = 3.141592653589793F;
		this.ear1.rotateAngleZ = -0.17453292519943295F;
		this.ear2.rotateAngleX = 0.0859365217096968F;
		this.ear2.rotateAngleY = 3.126401307780435F;
		this.ear2.rotateAngleZ = -0.3322653110191685F;
		this.setRotationAngles(f1, f2, f3, f4, f5, scale, entity);
		this.body.render(scale);
	}
}
