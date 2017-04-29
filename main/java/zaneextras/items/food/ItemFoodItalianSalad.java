package zaneextras.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodItalianSalad extends ZaneItemFood {
	
	public ItemFoodItalianSalad() {
		super("italiansalad", 20, 2.0F, false);
		this.setMaxStackSize(1);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.uncommon;
	}
	
	@Override
	public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_,
			EntityPlayer p_77654_3_) {
		super.onEaten(p_77654_1_, p_77654_2_, p_77654_3_);
		return new ItemStack(Items.bowl);
	}
	
	@Override
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_,
			EntityPlayer player) {
		super.onFoodEaten(p_77849_1_, p_77849_2_, player);
		player.addPotionEffect(
				new PotionEffect(Potion.damageBoost.id, 3600, 1));
	}
}
