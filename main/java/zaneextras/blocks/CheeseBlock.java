package zaneextras.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCake;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class CheeseBlock extends BlockCake {
	
	@SideOnly(Side.CLIENT)
	private IIcon field_150038_a;
	@SideOnly(Side.CLIENT)
	private IIcon field_150037_b;
	@SideOnly(Side.CLIENT)
	private IIcon field_150039_M;
	
	public CheeseBlock() {
		this.setHardness(1.2F);
		this.setResistance(0.1F);
		this.setBlockTextureName(ModInfo.MODID + ":cheesewheel");
		this.setBlockName(ModInfo.MODID + "_cheesewheel");
		this.setCreativeTab(ZaneTabs.zTab);
	}
	
	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_,
			int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_,
			int p_149727_6_, float p_149727_7_, float p_149727_8_,
			float p_149727_9_) {
		this.func_150036_b(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_,
				p_149727_5_);
		return true;
	}
	
	private void func_150036_b(World p_150036_1_, int p_150036_2_,
			int p_150036_3_, int p_150036_4_, EntityPlayer p_150036_5_) {
		if (p_150036_5_.canEat(false)) {
			p_150036_5_.getFoodStats().addStats(4, 0.3F);
			int l = p_150036_1_.getBlockMetadata(p_150036_2_, p_150036_3_,
					p_150036_4_) + 1;
			
			if (l >= 6) {
				p_150036_1_.setBlockToAir(p_150036_2_, p_150036_3_,
						p_150036_4_);
			} else {
				p_150036_1_.setBlockMetadataWithNotify(p_150036_2_, p_150036_3_,
						p_150036_4_, l, 2);
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return p_149691_1_ == 1 ? this.field_150038_a
				: (p_149691_1_ == 0 ? this.field_150037_b
						: (p_149691_2_ > 0 && p_149691_1_ == 4
								? this.field_150039_M : this.blockIcon));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.blockIcon = p_149651_1_
				.registerIcon(this.getTextureName() + "_side");
		this.field_150039_M = p_149651_1_
				.registerIcon(this.getTextureName() + "_inner");
		this.field_150038_a = p_149651_1_
				.registerIcon(this.getTextureName() + "_top");
		this.field_150037_b = p_149651_1_
				.registerIcon(this.getTextureName() + "_bottom");
	}
}
