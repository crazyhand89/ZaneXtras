package zaneextras.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import zaneextras.ZaneExtrasMain;
import zaneextras.mobs.entities.EntitySkeletonKing;

public class SkeletonBossBlock extends ZaneBlock{

	public SkeletonBossBlock(Material mat, String name, float hardness,
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
				this.spawnSkeletonKing(par1World, par2, par3, par4,
						par5EntityPlayer);
		return true;
	}
	
	public void spawnSkeletonKing(World par1World, int par2, int par3, int par4,
			EntityPlayer player) {
		if (!par1World.isRemote
				&& par1World.difficultySetting != EnumDifficulty.PEACEFUL) {
			EntitySkeletonKing skeletonKing = new EntitySkeletonKing(par1World);
			skeletonKing.setLocationAndAngles(par2, par3, par4, 0, 0);
			par1World.spawnEntityInWorld(skeletonKing);
			par1World.setBlock(par2, par3, par4, Blocks.air);
			ZaneExtrasMain.proxy.sendChatMessage(player,
					"The King has awakens!");
		}
	}
}
