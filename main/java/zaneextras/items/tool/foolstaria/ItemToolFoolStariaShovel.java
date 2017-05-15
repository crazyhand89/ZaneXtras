package zaneextras.items.tool.foolstaria;

import net.minecraft.item.ItemSpade;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolFoolStariaShovel extends ItemSpade {
	
	public ItemToolFoolStariaShovel() {
		super(ZaneToolMaterials.BUTTER);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_foolstariashovel");
		this.setTextureName(ModInfo.MODID + ":stariashovel");
	}
	
}
