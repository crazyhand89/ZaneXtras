package zaneextras.items.tool.staria;

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

public class ItemToolStariaHoe extends ItemHoe {
	public ItemToolStariaHoe() {
		super(ZaneToolMaterials.STARIA);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_stariahoe");
		this.setTextureName(ModInfo.MODID + ":stariahoe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack stariaHoe = new ItemStack(ItemList.stariaHoe, 1);
		
		stariaHoe.addEnchantment(Enchantment.baneOfArthropods, 3);
		stariaHoe.addEnchantment(Enchantment.unbreaking, 3);
		items.add(stariaHoe);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
}
