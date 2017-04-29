package zaneextras.blocks.cropblock;

import java.util.Random;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import zaneextras.items.ItemList;
import zaneextras.lib.ModInfo;
import zaneextras.lib.ZaneTabs;

public class LettuceBlock extends Block {
	
	@SideOnly(Side.CLIENT)
	private IIcon field_150201_a;
	
	public LettuceBlock() {
		super(Material.gourd);
		this.setCreativeTab(ZaneTabs.zTab);
		this.setHardness(0.4F);
		this.setResistance(0.1F);
		this.setBlockTextureName(ModInfo.MODID + ":lettuce");
		this.setBlockName(ModInfo.MODID + "_lettuce");
	}
	
	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return p_149691_1_ != 1 && p_149691_1_ != 0 ? this.blockIcon
				: this.field_150201_a;
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_,
			int p_149650_3_) {
		return ItemList.lettuce;
	}
	
	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random p_149745_1_) {
		return 3 + p_149745_1_.nextInt(5);
	}
	
	/**
	 * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i'
	 * (inclusive).
	 */
	@Override
	public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_) {
		int j = this.quantityDropped(p_149679_2_)
				+ p_149679_2_.nextInt(1 + p_149679_1_);
		
		if (j > 9) {
			j = 9;
		}
		
		return j;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.blockIcon = p_149651_1_
				.registerIcon(this.getTextureName() + "_side");
		this.field_150201_a = p_149651_1_
				.registerIcon(this.getTextureName() + "_top");
	}
}
