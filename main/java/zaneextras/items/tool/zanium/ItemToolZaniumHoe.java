package zaneextras.items.tool.zanium;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolZaniumHoe extends ItemHoe {
	public ItemToolZaniumHoe() {
		super(ZaneToolMaterials.ZANIUM);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_zaniumhoe");
		this.setTextureName(ModInfo.MODID + ":zaniumhoe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack zaniumHoe = new ItemStack(ItemList.zaniumHoe, 1);
		
		zaniumHoe.addEnchantment(Enchantment.smite, 3);
		zaniumHoe.addEnchantment(Enchantment.fireAspect, 1);
		items.add(zaniumHoe);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
}
