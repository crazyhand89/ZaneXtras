package zaneextras.items.food;

import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodGlowingFlesh extends ZaneItemFood {
	
	public ItemFoodGlowingFlesh() {
		super("glowingflesh", 2, 0.4F, false);
	}
	
	@Override
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_,
			EntityPlayer player) {
		super.onFoodEaten(p_77849_1_, p_77849_2_, player);
		Random rand = new Random();
		if (rand.nextInt(100) <= 5) {
			player.addPotionEffect(new PotionEffect(Potion.harm.id, 1, 0));
		}
		
		player.addPotionEffect(new PotionEffect(Potion.confusion.id, 240, 0));
		player.addPotionEffect(
				new PotionEffect(Potion.nightVision.id, 3000, 0));
	}
}