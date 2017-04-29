package zaneextras.items.weapon;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemWeaponSkyiumSword extends ItemSword {
	public ItemWeaponSkyiumSword() {
		super(ZaneToolMaterials.SKYIUM);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_skyiumsword");
		this.setTextureName(ModInfo.MODID + ":skyiumsword");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack skyiumSword = new ItemStack(ItemList.skyiumSword, 1);
		
		skyiumSword.addEnchantment(Enchantment.looting, 2);
		skyiumSword.addEnchantment(Enchantment.sharpness, 2);
		skyiumSword.addEnchantment(Enchantment.unbreaking, 1);
		items.add(skyiumSword);
	}
}
