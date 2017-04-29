package zaneextras.items.food;

import net.minecraft.item.ItemFood;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ZaneItemFood extends ItemFood {
	
	public ZaneItemFood(String strTexture, int foodBar, float sat,
			boolean wolf) {
		super(foodBar, sat, wolf);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_" + strTexture);
		this.setTextureName(ModInfo.MODID + ":" + strTexture);
	}
}
