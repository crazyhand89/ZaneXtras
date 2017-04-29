package zaneextras.items.tool.skyium;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolSkyiumAxe extends ItemAxe {
	public ItemToolSkyiumAxe() {
		super(ZaneToolMaterials.SKYIUM);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_skyiumaxe");
		this.setTextureName(ModInfo.MODID + ":skyiumaxe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack skyiumAxe = new ItemStack(ItemList.skyiumAxe, 1);
		
		skyiumAxe.addEnchantment(Enchantment.knockback, 2);
		skyiumAxe.addEnchantment(Enchantment.efficiency, 1);
		skyiumAxe.addEnchantment(Enchantment.unbreaking, 1);
		items.add(skyiumAxe);
	}
}