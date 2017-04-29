package zaneextras.items.tool.emerald;

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

public class ItemToolEmeraldPickaxe extends ItemPickaxe {
	
	public ItemToolEmeraldPickaxe() {
		super(ZaneToolMaterials.EMERALD);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_emeraldpickaxe");
		this.setTextureName(ModInfo.MODID + ":emeraldpickaxe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack emeraldPickaxe = new ItemStack(ItemList.emeraldPickaxe, 1);
		
		emeraldPickaxe.addEnchantment(Enchantment.fortune, 1);
		emeraldPickaxe.addEnchantment(Enchantment.efficiency, 1);
		items.add(emeraldPickaxe);
	}
}
