package zaneextras.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zaneextras.blocks.BlockList;
import zaneextras.items.ItemList;

public class SmeltingRecipes {
	
	public static void init() {
		IgnotRecipes.init();
		FoodRecipes.init();
	}
	
	public static class IgnotRecipes {
		
		public static void init() {
			
			// Darm Hard Butter Ignot
			addSmelting(BlockList.dhbOre, new ItemStack(ItemList.butterItem, 1),
					0.5F);
			addSmelting(ItemList.butterDust,
					new ItemStack(ItemList.butterItem, 1), 0.5F);
		}
	}
	
	public static class FoodRecipes {
		
		public static void init() {
			// Potato Fry CookedDust to ignot
			addSmelting(ItemList.rawFry, new ItemStack(ItemList.cookedFry, 1),
					0.1F);
			
			// Sweet Potato Fry Cooked
			addSmelting(ItemList.rawSweet,
					new ItemStack(ItemList.cookedSweet, 1), 0.1F);
			
			// Cheese
			addSmelting(Items.milk_bucket, new ItemStack(ItemList.cheese, 8),
					0.2F);
			
			// Vinegar
			addSmelting(ItemList.mixedBottle,
					new ItemStack(ItemList.vinegar, 1), 0.2F);
		}
	}
	
	// smelting recipe helper Credit: Paul Shannon or Zollernwolf
	private static void addSmelting(ItemStack itemStack, ItemStack output,
			float xp) {
		GameRegistry.addSmelting(itemStack, output, xp);
	}
	
	private static void addSmelting(Block input, Item output, float xp) {
		addSmelting(input, new ItemStack(output, 1), xp);
	}
	
	public static void addSmelting(Item input, ItemStack output, float xp) {
		GameRegistry.addSmelting(input, output, xp);
	}
	
	public static void addSmelting(Item input, Item output, float xp) {
		addSmelting(input, new ItemStack(output, 1), xp);
	}
	
	public static void addSmelting(Block input, ItemStack output, float xp) {
		GameRegistry.addSmelting(input, output, xp);
	}
	
	public static void addSmelting(Block input, Block output, float xp) {
		addSmelting(input, new ItemStack(output, 1), xp);
	}
}
