package zaneextras.items.tool.zanium;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolZaniumAxe extends ItemAxe {
	public ItemToolZaniumAxe() {
		super(ZaneToolMaterials.ZANIUM);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_zaniumaxe");
		this.setTextureName(ModInfo.MODID + ":zaniumaxe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack zaniumAxe = new ItemStack(ItemList.zaniumAxe, 1);
		
		zaniumAxe.addEnchantment(Enchantment.knockback, 3);
		zaniumAxe.addEnchantment(Enchantment.fireAspect, 1);
		zaniumAxe.addEnchantment(Enchantment.efficiency, 3);
		items.add(zaniumAxe);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
}
