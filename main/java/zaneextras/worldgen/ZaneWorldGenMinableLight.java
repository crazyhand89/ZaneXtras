package zaneextras.worldgen;

import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.WorldGenMinable;
import zaneextras.blocks.BlockList;

public class ZaneWorldGenMinableLight extends WorldGenMinable {
	
	public ZaneWorldGenMinableLight(Block par1, int par2) {
		super(par1, par2, BlockList.lightStone);
	}
	
	public ZaneWorldGenMinableLight(Block par1, int par2, int par3) {
		super(par1, par2);
	}
}