package zaneextras.lib;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import zaneextras.items.ItemList;

public class ZaneExtrasTab extends CreativeTabs {
	
	public ZaneExtrasTab(String label) {
		super(label);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return ItemList.butterFood;
	}
}
