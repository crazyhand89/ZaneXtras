package zaneextras.items.armor.skyium;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class SkyiumArmor extends ItemArmor {
	public String textureName;
	public String unName;
	
	protected Enchantment enchanment;
	protected int amplifier = 1;
	
	public SkyiumArmor(ArmorMaterial material, String textureName, int type,
			Enchantment ench, int amp) {
		super(material, 0, type);
		this.textureName = textureName;
		unName = textureName;
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_" + unName);
		this.setTextureName(ModInfo.MODID + ":" + textureName);
		this.enchanment = ench;
		this.amplifier = amp;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		return ModInfo.MODID + ":textures/armor/" + "skyiumarmor" + "_"
				+ (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack skyiumArmor = new ItemStack(this, 1);
		
		skyiumArmor.addEnchantment(enchanment, amplifier);
		items.add(skyiumArmor);
	}
}
