package zaneextras.items.tool.damnhardbutter;

import net.minecraft.item.ItemPickaxe;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolDamnHardButterPickaxe extends ItemPickaxe {
	
	public ItemToolDamnHardButterPickaxe() {
		
		super(ZaneToolMaterials.BUTTER);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_butterpickaxe");
		this.setTextureName(ModInfo.MODID + ":butterpickaxe");
		this.setHarvestLevel("pickaxe", 3);
	}
	
}
