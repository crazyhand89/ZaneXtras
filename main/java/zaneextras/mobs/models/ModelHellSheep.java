package zaneextras.mobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelHellSheep extends ModelBase {
	
	public ModelRenderer bipedHead;
	public ModelRenderer head2;
	public ModelRenderer bipedBody;
	public ModelRenderer bipedRightArm;
	public ModelRenderer bipedLeftArm;
	public ModelRenderer bipedRightLeg;
	public ModelRenderer bipedLeftLeg;
	
	public ModelHellSheep() {
		textureWidth = 64;
		textureHeight = 32;
		
		bipedHead = new ModelRenderer(this, 0, 0);
		bipedHead.addBox(0F, 0F, 0F, 8, 8, 8);
		bipedHead.setRotationPoint(0F, -8F, -4F);
		bipedHead.setTextureSize(64, 32);
		bipedHead.mirror = true;
		setRotation(bipedHead, 0F, 0F, 0F);
		head2 = new ModelRenderer(this, 0, 0);
		head2.addBox(-7F, -8F, -4F, 8, 8, 8);
		head2.setRotationPoint(0F, 0F, 0F);
		head2.setTextureSize(64, 32);
		head2.mirror = true;
		setRotation(head2, 0F, 0F, 0F);
		bipedBody = new ModelRenderer(this, 16, 16);
		bipedBody.addBox(-4F, 0F, -2F, 8, 12, 4);
		bipedBody.setRotationPoint(0F, 0F, 0F);
		bipedBody.setTextureSize(64, 32);
		bipedBody.mirror = true;
		setRotation(bipedBody, 0F, 0F, 0F);
		bipedRightArm = new ModelRenderer(this, 40, 16);
		bipedRightArm.addBox(-3F, -2F, -2F, 4, 12, 4);
		bipedRightArm.setRotationPoint(-5F, 2F, 0F);
		bipedRightArm.setTextureSize(64, 32);
		bipedRightArm.mirror = true;
		setRotation(bipedRightArm, -1.570796F, 0F, 0.0698132F);
		bipedLeftArm = new ModelRenderer(this, 40, 16);
		bipedLeftArm.addBox(-1F, -2F, -2F, 4, 12, 4);
		bipedLeftArm.setRotationPoint(5F, 2F, 0F);
		bipedLeftArm.setTextureSize(64, 32);
		bipedLeftArm.mirror = true;
		setRotation(bipedLeftArm, -1.570796F, 0F, -0.0698132F);
		bipedRightLeg = new ModelRenderer(this, 0, 16);
		bipedRightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
		bipedRightLeg.setRotationPoint(-2F, 12F, 0F);
		bipedRightLeg.setTextureSize(64, 32);
		bipedRightLeg.mirror = true;
		setRotation(bipedRightLeg, 0F, 0F, 0F);
		bipedLeftLeg = new ModelRenderer(this, 0, 16);
		bipedLeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
		bipedLeftLeg.setRotationPoint(2F, 12F, 0F);
		bipedLeftLeg.setTextureSize(64, 32);
		bipedLeftLeg.mirror = true;
		setRotation(bipedLeftLeg, 0F, 0F, 0F);
	}
	
	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4,
			float par5, float par6, float par7) {
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		bipedHead.render(par7);
		head2.render(par7);
		bipedBody.render(par7);
		bipedRightArm.render(par7);
		bipedLeftArm.render(par7);
		bipedRightLeg.render(par7);
		bipedLeftLeg.render(par7);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float par1, float par2, float par3,
			float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	    float f6 = (180F / (float)Math.PI);
	    this.bipedBody.rotateAngleX = par5 / (180F / (float)Math.PI);
	    this.bipedBody.rotateAngleY = par4 / (180F / (float)Math.PI);

	    this.bipedRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.bipedLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	}
	
}