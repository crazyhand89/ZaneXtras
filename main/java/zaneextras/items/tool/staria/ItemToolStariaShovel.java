package zaneextras.items.tool.staria;

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

public class ItemToolStariaShovel extends ItemSpade {
	public ItemToolStariaShovel() {
		super(ZaneToolMaterials.STARIA);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_stariashovel");
		this.setTextureName(ModInfo.MODID + ":stariashovel");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack stariaShovel = new ItemStack(ItemList.stariaShovel, 1);
		
		stariaShovel.addEnchantment(Enchantment.smite, 3);
		stariaShovel.addEnchantment(Enchantment.efficiency, 3);
		stariaShovel.addEnchantment(Enchantment.unbreaking, 3);
		items.add(stariaShovel);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
}
