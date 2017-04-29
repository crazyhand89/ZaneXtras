package zaneextras.items.tool.emerald;

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

public class ItemToolEmeraldHoe extends ItemHoe {
	public ItemToolEmeraldHoe() {
		super(ZaneToolMaterials.EMERALD);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_emeraldhoe");
		this.setTextureName(ModInfo.MODID + ":emeraldhoe");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack emeraldHoe = new ItemStack(ItemList.emeraldHoe, 1);
		
		emeraldHoe.addEnchantment(Enchantment.fireAspect, 1);
		items.add(emeraldHoe);
	}
}
