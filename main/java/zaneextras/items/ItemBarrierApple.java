package zaneextras.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import zaneextras.items.food.ZaneItemFood;
import zaneextras.lib.ModInfo;
import zaneextras.potions.ZanePotion;

public class ItemBarrierApple extends ZaneItemFood {
	
	public ItemBarrierApple() {
		super("barrierapples", 2, 2.0F, false);
		this.setMaxStackSize(64);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.epic;
	}
	
	@Override
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_,
			EntityPlayer player) {
		super.onFoodEaten(p_77849_1_, p_77849_2_, player);
		player.addPotionEffect(
				new PotionEffect(ZanePotion.barrier.id, 21600, 0));
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iir) {
		this.itemIcon = iir.registerIcon(ModInfo.MODID + ":" + "barrierapples");
	}
}