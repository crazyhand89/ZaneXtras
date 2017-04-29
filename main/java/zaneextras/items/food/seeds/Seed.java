package zaneextras.items.food.seeds;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class Seed extends ItemSeeds {
	
	public Seed(String strTexture, Block cropBlock) {
		super(cropBlock, Blocks.farmland);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setUnlocalizedName(ModInfo.MODID + "_" + strTexture);
		this.setTextureName(ModInfo.MODID + ":" + strTexture);
	}
	
}