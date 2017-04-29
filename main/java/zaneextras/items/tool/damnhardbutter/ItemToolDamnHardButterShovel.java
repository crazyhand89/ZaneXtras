package zaneextras.items.tool.damnhardbutter;

import net.minecraft.item.ItemSpade;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolDamnHardButterShovel extends ItemSpade {
	
	public ItemToolDamnHardButterShovel() {
		super(ZaneToolMaterials.BUTTER);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_buttershovel");
		this.setTextureName(ModInfo.MODID + ":buttershovel");
	}
	
}
