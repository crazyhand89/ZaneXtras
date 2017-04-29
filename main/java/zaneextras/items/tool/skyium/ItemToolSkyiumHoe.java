package zaneextras.items.tool.skyium;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolSkyiumHoe extends ItemHoe {
	public ItemToolSkyiumHoe() {
		super(ZaneToolMaterials.SKYIUM);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_skyiumhoe");
		this.setTextureName(ModInfo.MODID + ":skyiumhoe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack skyiumHoe = new ItemStack(ItemList.skyiumHoe, 1);
		
		skyiumHoe.addEnchantment(Enchantment.looting, 1);
		skyiumHoe.addEnchantment(Enchantment.unbreaking, 1);
		items.add(skyiumHoe);
	}
}
