package zaneextras.items.tool.emerald;

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

public class ItemToolEmeraldAxe extends ItemAxe {
	public ItemToolEmeraldAxe() {
		super(ZaneToolMaterials.EMERALD);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_emeraldaxe");
		this.setTextureName(ModInfo.MODID + ":emeraldaxe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack emeraldAxe = new ItemStack(ItemList.emeraldAxe, 1);
		
		emeraldAxe.addEnchantment(Enchantment.knockback, 2);
		items.add(emeraldAxe);
	}
}