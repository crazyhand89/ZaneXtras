package zaneextras.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import zaneextras.ZaneExtrasMain;
import zaneextras.items.ItemList;
import zaneextras.mobs.entities.EntityUriel;

public class ArchAngelUrielBossBlock extends ZaneBlock {
	
	public ArchAngelUrielBossBlock(Material mat, String name, float hardness,
			float resitance, SoundType sound) {
		super(mat, name, hardness, resitance, sound);
		this.setBlockUnbreakable();
	}
	
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3,
			int par4, EntityPlayer par5EntityPlayer, int par6, float par7,
			float par8, float par9) {
		super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer,
				par6, par7, par8, par9);
		if (par5EntityPlayer.getHeldItem() != null) {
			ItemStack heldItemStack = par5EntityPlayer.getHeldItem();
			Item heldItem = heldItemStack.getItem();
			if (heldItem != null && heldItem == ItemList.angelKey) {
				this.spawnUriel(par1World, par2, par3, par4, par5EntityPlayer);
			}
		}
		return true;
	}
	
	public void spawnUriel(World par1World, int par2, int par3, int par4,
			EntityPlayer player) {
		if (!par1World.isRemote
				&& par1World.difficultySetting != EnumDifficulty.PEACEFUL) {
			EntityUriel uriel = new EntityUriel(par1World);
			uriel.setLocationAndAngles(par2, par3, par4, 0, 0);
			ItemStack skySword = new ItemStack(ItemList.skyiumSword, 1);
			uriel.setCurrentItemOrArmor(0, skySword);
			par1World.spawnEntityInWorld(uriel);
			par1World.setBlock(par2, par3, par4, Blocks.air);
			ZaneExtrasMain.proxy.sendChatMessage(player,
					"I shall avenge my fallen comrades!");
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_,
			int p_149694_4_) {
		return Item.getItemById(0);
	}
}
