package zaneextras.interfaces;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface IZaneExtendedReach {
	
	/**
	 * Interface to define weapons with greater than default reach, which is 3.0
	 * Credit to BalkondeurAlpha for this code, find him at
	 * http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/
	 * 1272627-balkons-weaponmod-v1-14 na na na na na :3 -aka Zollernwolf
	 */
	public float getExtendedReach(World world, EntityLivingBase living,
			ItemStack itemstack);
}
