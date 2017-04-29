package zaneextras.items.tool.staria;

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

public class ItemToolStariaAxe extends ItemAxe {
	
	public ItemToolStariaAxe() {
		super(ZaneToolMaterials.STARIA);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_stariaaxe");
		this.setTextureName(ModInfo.MODID + ":stariaaxe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack stariaAxe = new ItemStack(ItemList.stariaAxe, 1);
		
		stariaAxe.addEnchantment(Enchantment.knockback, 3);
		stariaAxe.addEnchantment(Enchantment.efficiency, 3);
		stariaAxe.addEnchantment(Enchantment.unbreaking, 3);
		items.add(stariaAxe);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
}
