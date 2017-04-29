package zaneextras.items.tool.skyium;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolSkyiumShovel extends ItemSpade {
	public ItemToolSkyiumShovel() {
		super(ZaneToolMaterials.SKYIUM);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_skyiumshovel");
		this.setTextureName(ModInfo.MODID + ":skyiumshovel");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack skyiumShovel = new ItemStack(ItemList.skyiumShovel, 1);
		
		skyiumShovel.addEnchantment(Enchantment.knockback, 2);
		skyiumShovel.addEnchantment(Enchantment.unbreaking, 1);
		items.add(skyiumShovel);
	}
}
