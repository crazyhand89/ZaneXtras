package zaneextras.items;

import net.minecraft.item.Item;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ZaneItem extends Item {
	
	protected String name;
	
	public ZaneItem(String strTexture) {
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_" + strTexture);
		this.setTextureName(ModInfo.MODID + ":" + strTexture);
		name = strTexture;
	}
}