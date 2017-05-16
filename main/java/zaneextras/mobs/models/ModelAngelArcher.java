package zaneextras.mobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelBiped - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelAngelArcher extends ModelBase {
    public ModelRenderer field_78114_d;
    public ModelRenderer field_78112_f;
    public ModelRenderer field_78124_i;
    public ModelRenderer field_78116_c;
    public ModelRenderer field_78115_e;
    public ModelRenderer field_78113_g;
    public ModelRenderer field_78123_h;
    public ModelRenderer field_78121_j;

    public ModelAngelArcher() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78114_d = new ModelRenderer(this, 32, 0);
        this.field_78114_d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78114_d.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.field_78124_i = new ModelRenderer(this, 0, 16);
        this.field_78124_i.mirror = true;
        this.field_78124_i.setRotationPoint(1.899999976158142F, 12.0F, 0.10000000149011612F);
        this.field_78124_i.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78112_f = new ModelRenderer(this, 40, 16);
        this.field_78112_f.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_78112_f.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_78112_f, 0.0F, 0.0F, 0.10000000149011613F);
        this.field_78116_c = new ModelRenderer(this, 0, 0);
        this.field_78116_c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_c.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.field_78115_e = new ModelRenderer(this, 16, 16);
        this.field_78115_e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78115_e.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.field_78113_g = new ModelRenderer(this, 40, 16);
        this.field_78113_g.mirror = true;
        this.field_78113_g.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.field_78113_g.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_78113_g, 0.0F, 0.0F, -0.10000000149011613F);
        this.field_78123_h = new ModelRenderer(this, 0, 16);
        this.field_78123_h.setRotationPoint(-1.899999976158142F, 12.0F, 0.10000000149011612F);
        this.field_78123_h.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78121_j = new ModelRenderer(this, 24, 0);
        this.field_78121_j.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78121_j.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78114_d.render(f5);
        this.field_78124_i.render(f5);
        this.field_78112_f.render(f5);
        this.field_78116_c.render(f5);
        this.field_78115_e.render(f5);
        this.field_78113_g.render(f5);
        this.field_78123_h.render(f5);
        this.field_78121_j.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
