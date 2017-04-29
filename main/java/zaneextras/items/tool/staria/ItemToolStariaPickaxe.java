package zaneextras.items.tool.staria;

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

public class ItemToolStariaPickaxe extends ItemPickaxe {
	public ItemToolStariaPickaxe() {
		super(ZaneToolMaterials.STARIA);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_stariapickaxe");
		this.setTextureName(ModInfo.MODID + ":stariapickaxe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack stariaPickaxe = new ItemStack(ItemList.stariaPickaxe, 1);
		
		stariaPickaxe.addEnchantment(Enchantment.fortune, 3);
		stariaPickaxe.addEnchantment(Enchantment.efficiency, 5);
		stariaPickaxe.addEnchantment(Enchantment.unbreaking, 3);
		items.add(stariaPickaxe);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
}
