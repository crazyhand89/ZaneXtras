package zaneextras.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodSalad extends ZaneItemFood {
	
	public ItemFoodSalad() {
		super("salad", 20, 2.0F, false);
		this.setMaxStackSize(1);
	}
	
	@Override
	public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_,
			EntityPlayer p_77654_3_) {
		super.onEaten(p_77654_1_, p_77654_2_, p_77654_3_);
		return new ItemStack(Items.bowl);
	}
}
