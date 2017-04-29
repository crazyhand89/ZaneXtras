package zaneextras.items.tool.skyium;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolSkyiumPickaxe extends ItemPickaxe {
	
	public ItemToolSkyiumPickaxe() {
		super(ZaneToolMaterials.SKYIUM);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_skyiumpickaxe");
		this.setTextureName(ModInfo.MODID + ":skyiumpickaxe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack skyiumPickaxe = new ItemStack(ItemList.skyiumPickaxe, 1);
		
		skyiumPickaxe.addEnchantment(Enchantment.fortune, 2);
		skyiumPickaxe.addEnchantment(Enchantment.efficiency, 2);
		skyiumPickaxe.addEnchantment(Enchantment.unbreaking, 1);
		items.add(skyiumPickaxe);
	}
}
