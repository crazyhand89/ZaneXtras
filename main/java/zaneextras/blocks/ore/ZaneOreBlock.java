package zaneextras.blocks.ore;

import net.minecraft.block.material.Material;
import zaneextras.blocks.ZaneBlock;

public class ZaneOreBlock extends ZaneBlock {
	
	public ZaneOreBlock(Material mat, String name, float hardness,
			float resitance, SoundType sound, int level) {
		super(mat, name, hardness, resitance, sound);
		this.setHarvestLevel("pickaxe", level);
	}
	
}
