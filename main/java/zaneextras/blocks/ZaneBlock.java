package zaneextras.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class ZaneBlock extends Block {
	
	public ZaneBlock(Material mat, String name, float hardness, float resitance,
			SoundType sound) {
		super(mat);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setStepSound(sound);
		this.setBlockName(ModInfo.MODID + "_" + name);
		this.setBlockTextureName(ModInfo.MODID + ":" + name);
		this.setHardness(hardness);
		this.setResistance(resitance);
	}
}
