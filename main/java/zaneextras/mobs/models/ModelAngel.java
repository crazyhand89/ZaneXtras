package zaneextras.mobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * ModelBiped - Either Mojang or a mod author Created using Tabula 4.1.1
 */
public class ModelAngel extends ModelBase {
	public ModelRenderer field_78114_d;
	public ModelRenderer field_78112_f;
	public ModelRenderer bipedRightLeg;
	public ModelRenderer field_78116_c;
	public ModelRenderer bipedBody;
	public ModelRenderer field_78113_g;
	public ModelRenderer bipedLeftLeg;
	public ModelRenderer field_78121_j;
	
	public ModelAngel() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.field_78113_g = new ModelRenderer(this, 40, 16);
		this.field_78113_g.mirror = true;
		this.field_78113_g.setRotationPoint(5.0F, 2.0F, -0.0F);
		this.field_78113_g.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(field_78113_g, 0.0F, 0.0F, -0.10000000149011613F);
		this.field_78114_d = new ModelRenderer(this, 32, 0);
		this.field_78114_d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.field_78114_d.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
		this.field_78121_j = new ModelRenderer(this, 24, 0);
		this.field_78121_j.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.field_78121_j.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
		this.field_78116_c = new ModelRenderer(this, 0, 0);
		this.field_78116_c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.field_78116_c.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
		this.bipedLeftLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.field_78112_f = new ModelRenderer(this, 40, 16);
		this.field_78112_f.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.field_78112_f.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(field_78112_f, 0.0F, 0.0F, 0.10000000149011613F);
		this.bipedBody = new ModelRenderer(this, 16, 16);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
		this.bipedRightLeg = new ModelRenderer(this, 0, 16);
		this.bipedRightLeg.mirror = true;
		this.bipedRightLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.field_78113_g.render(f5);
		this.field_78114_d.render(f5);
		this.field_78121_j.render(f5);
		this.field_78116_c.render(f5);
		this.bipedLeftLeg.render(f5);
		this.field_78112_f.render(f5);
		this.bipedBody.render(f5);
		this.bipedRightLeg.render(f5);
	}
	
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y,
			float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float par1, float par2, float par3,
			float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
		float f6 = (180F / (float) Math.PI);
		this.bipedLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F
				* par2;
		this.bipedRightLeg.rotateAngleX = MathHelper
				.cos(par1 * 0.6662F + (float) Math.PI) * 1.4F * par2;
	}
}
