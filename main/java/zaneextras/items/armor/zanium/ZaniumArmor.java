package zaneextras.items.armor.zanium;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ZaniumArmor extends ItemArmor {
	public String textureName;
	public String unName;
	
	protected Enchantment enchanment1;
	protected int amplifier1 = 1;
	protected Enchantment enchanment2;
	protected int amplifier2 = 1;
	
	public ZaniumArmor(ArmorMaterial material, String textureName, int type,
			Enchantment ench1, int amp1, Enchantment ench2, int amp2) {
		super(material, 0, type);
		this.textureName = textureName;
		unName = textureName;
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_" + unName);
		this.setTextureName(ModInfo.MODID + ":" + textureName);
		this.enchanment1 = ench1;
		this.amplifier1 = amp1;
		this.enchanment2 = ench2;
		this.amplifier2 = amp2;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		return ModInfo.MODID + ":textures/armor/" + "zaniumarmor" + "_"
				+ (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack zaniumArmor = new ItemStack(this, 1);
		
		zaniumArmor.addEnchantment(enchanment1, amplifier1);
		zaniumArmor.addEnchantment(enchanment2, amplifier2);
		items.add(zaniumArmor);
	}
}
