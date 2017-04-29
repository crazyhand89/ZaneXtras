package zaneextras.items.food;

import net.minecraft.item.ItemFood;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemCropFood extends ItemFood {
	
	public ItemCropFood(String strTexture, int hunger, float saturation) {
		super(hunger, saturation, false);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_" + strTexture);
		this.setTextureName(ModInfo.MODID + ":" + strTexture);
	}
	
}