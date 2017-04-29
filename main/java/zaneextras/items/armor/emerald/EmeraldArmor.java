package zaneextras.items.armor.emerald;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class EmeraldArmor extends ItemArmor {
	
	public String textureName;
	public String unName;
	
	public EmeraldArmor(ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		this.textureName = textureName;
		unName = textureName;
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_" + unName);
		this.setTextureName(ModInfo.MODID + ":" + textureName);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		return ModInfo.MODID + ":textures/armor/" + "emeraldarmor" + "_"
				+ (this.armorType == 2 ? "2" : "1") + ".png";
	}
}
