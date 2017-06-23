package zaneextras.blocks.ore;

import java.util.Random;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import zaneextras.blocks.ZaneBlock;

public class ZaneParticleLightOre extends ZaneBlock {
	
	public ZaneParticleLightOre(Material mat, String name, float hardness,
			float resitance, SoundType sound, int level) {
		super(mat, name, hardness, resitance, sound);
		this.setHarvestLevel("pickaxe", level);
		this.setLightLevel(1.0F);
		this.setTickRandomly(true);
	}
	
	@Override
	public int tickRate(World p_149738_1_) {
		return 30;
	}
	
	private void func_150186_m(World p_150186_1_, int p_150186_2_,
			int p_150186_3_, int p_150186_4_) {
		Random random = p_150186_1_.rand;
		double d0 = 0.0625D;
		
		for (int l = 0; l < 6; ++l) {
			double d1 = p_150186_2_ + random.nextFloat();
			double d2 = p_150186_3_ + random.nextFloat();
			double d3 = p_150186_4_ + random.nextFloat();
			
			if (l == 0 && !p_150186_1_
					.getBlock(p_150186_2_, p_150186_3_ + 1, p_150186_4_)
					.isOpaqueCube()) {
				d2 = p_150186_3_ + 1 + d0;
			}
			
			if (l == 1 && !p_150186_1_
					.getBlock(p_150186_2_, p_150186_3_ - 1, p_150186_4_)
					.isOpaqueCube()) {
				d2 = p_150186_3_ + 0 - d0;
			}
			
			if (l == 2 && !p_150186_1_
					.getBlock(p_150186_2_, p_150186_3_, p_150186_4_ + 1)
					.isOpaqueCube()) {
				d3 = p_150186_4_ + 1 + d0;
			}
			
			if (l == 3 && !p_150186_1_
					.getBlock(p_150186_2_, p_150186_3_, p_150186_4_ - 1)
					.isOpaqueCube()) {
				d3 = p_150186_4_ + 0 - d0;
			}
			
			if (l == 4 && !p_150186_1_
					.getBlock(p_150186_2_ + 1, p_150186_3_, p_150186_4_)
					.isOpaqueCube()) {
				d1 = p_150186_2_ + 1 + d0;
			}
			
			if (l == 5 && !p_150186_1_
					.getBlock(p_150186_2_ - 1, p_150186_3_, p_150186_4_)
					.isOpaqueCube()) {
				d1 = p_150186_2_ + 0 - d0;
			}
			
			if (d1 < p_150186_2_ || d1 > p_150186_2_ + 1 || d2 < 0.0D
					|| d2 > p_150186_3_ + 1 || d3 < p_150186_4_
					|| d3 > p_150186_4_ + 1) {
				p_150186_1_.spawnParticle("reddust", d1, d2, d3, 1.2D, 1.2D,
						10.D);
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World p_149734_1_, int p_149734_2_,
			int p_149734_3_, int p_149734_4_, Random p_149734_5_) {
		this.func_150186_m(p_149734_1_, p_149734_2_, p_149734_3_, p_149734_4_);
	}
	
}
