package zaneextras.items.food;

import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodGhostPepper extends ZaneItemFood {
	
	public ItemFoodGhostPepper() {
		super("ghostpepper", 2, 0.5F, false);
		this.setPotionEffect(Potion.confusion.id, 10, 200, 0.5F);
	}
	
	@Override
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_,
			EntityPlayer player) {
		super.onFoodEaten(p_77849_1_, p_77849_2_, player);
		Random rand = new Random();
		if (rand.nextInt(100) <= 35) {
			player.addPotionEffect(
					new PotionEffect(Potion.invisibility.id, 1200, 1));
		}
	}
	
}