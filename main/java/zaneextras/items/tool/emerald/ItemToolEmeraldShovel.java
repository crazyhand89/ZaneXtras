package zaneextras.items.tool.emerald;

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

public class ItemToolEmeraldShovel extends ItemSpade {
	public ItemToolEmeraldShovel() {
		super(ZaneToolMaterials.EMERALD);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_emeraldshovel");
		this.setTextureName(ModInfo.MODID + ":emeraldshovel");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack emeraldShovel = new ItemStack(ItemList.emeraldShovel, 1);
		
		emeraldShovel.addEnchantment(Enchantment.knockback, 1);
		items.add(emeraldShovel);
	}
}
