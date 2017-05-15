package zaneextras.items.tool.foolstaria;

import net.minecraft.item.ItemPickaxe;
import zaneextras.items.tool.ZaneToolMaterials;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ItemToolFoolStariaPickaxe extends ItemPickaxe {
	
	public ItemToolFoolStariaPickaxe() {
		
		super(ZaneToolMaterials.BUTTER);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_foolstariapickaxe");
		this.setTextureName(ModInfo.MODID + ":stariapickaxe");
		this.setHarvestLevel("pickaxe", 1);
	}
	
}
