package zaneextras.items.weapon;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import zaneextras.items.ItemList;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemWeaponEmeraldSword extends ItemSword {
	public ItemWeaponEmeraldSword() {
		super(ZaneToolMaterials.EMERALD);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_emeraldsword");
		this.setTextureName(ModInfo.MODID + ":emeraldsword");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs creativeTab, List items) {
		ItemStack emeraldSword = new ItemStack(ItemList.emeraldSword, 1);
		
		emeraldSword.addEnchantment(Enchantment.looting, 1);
		emeraldSword.addEnchantment(Enchantment.sharpness, 1);
		items.add(emeraldSword);
	}
}
