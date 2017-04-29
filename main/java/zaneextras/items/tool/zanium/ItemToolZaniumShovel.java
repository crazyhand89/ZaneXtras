package zaneextras.items.tool.zanium;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolZaniumShovel extends ItemSpade {
	public ItemToolZaniumShovel() {
		super(ZaneToolMaterials.ZANIUM);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_zaniumshovel");
		this.setTextureName(ModInfo.MODID + ":zaniumshovel");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack zaniumShovel = new ItemStack(ItemList.zaniumShovel, 1);
		
		zaniumShovel.addEnchantment(Enchantment.baneOfArthropods, 3);
		zaniumShovel.addEnchantment(Enchantment.efficiency, 3);
		zaniumShovel.addEnchantment(Enchantment.fireAspect, 1);
		items.add(zaniumShovel);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
}
