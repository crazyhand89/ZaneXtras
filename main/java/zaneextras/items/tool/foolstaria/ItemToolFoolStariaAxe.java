package zaneextras.items.tool.foolstaria;

import net.minecraft.item.ItemAxe;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolFoolStariaAxe extends ItemAxe {
	
	public ItemToolFoolStariaAxe() {
		super(ZaneToolMaterials.BUTTER);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_foolstariaaxe");
		this.setTextureName(ModInfo.MODID + ":stariaaxe");
	}
}
