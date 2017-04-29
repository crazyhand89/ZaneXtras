package zaneextras.items.tool.damnhardbutter;

import net.minecraft.item.ItemHoe;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolDamnHardButterHoe extends ItemHoe {
	public ItemToolDamnHardButterHoe() {
		super(ZaneToolMaterials.BUTTER);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_butterhoe");
		this.setTextureName(ModInfo.MODID + ":butterhoe");
	}
}