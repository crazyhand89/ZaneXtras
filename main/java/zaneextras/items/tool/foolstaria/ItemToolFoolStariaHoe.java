package zaneextras.items.tool.foolstaria;

import net.minecraft.item.ItemHoe;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolFoolStariaHoe extends ItemHoe {
	public ItemToolFoolStariaHoe() {
		super(ZaneToolMaterials.BUTTER);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_foolstariahoe");
		this.setTextureName(ModInfo.MODID + ":stariahoe");
	}
}