package zaneextras.items.tool.damnhardbutter;

import net.minecraft.item.ItemAxe;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolDamnHardButterAxe extends ItemAxe {
	
	public ItemToolDamnHardButterAxe() {
		super(ZaneToolMaterials.BUTTER);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_butteraxe");
		this.setTextureName(ModInfo.MODID + ":butteraxe");
	}
}
