package zaneextras.items.tool.zanium;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolZaniumPickaxe extends ItemPickaxe {
	public ItemToolZaniumPickaxe() {
		super(ZaneToolMaterials.ZANIUM);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_zaniumpickaxe");
		this.setTextureName(ModInfo.MODID + ":zaniumpickaxe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack zaniumPickaxe = new ItemStack(ItemList.zaniumPickaxe, 1);
		
		zaniumPickaxe.addEnchantment(Enchantment.fortune, 3);
		zaniumPickaxe.addEnchantment(Enchantment.efficiency, 5);
		zaniumPickaxe.addEnchantment(Enchantment.fireAspect, 1);
		items.add(zaniumPickaxe);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
}
