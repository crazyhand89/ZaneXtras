package zaneextras.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import zaneextras.blocks.BlockList;
import zaneextras.items.ItemList;

public class FoodRecipes {
	public static void init() {
		EdibleFoodRecipes.init();
		InEdibleFoodRecipes.init();
	}
	
	public static class EdibleFoodRecipes {
		
		public static final int WILDCARD_VALUE = Short.MAX_VALUE;
		
		public static void init() {
			// Special Salads
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.frenchSalad),
					new Object[] { ItemList.french, ItemList.salad });
			
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.ranchSalad),
					new Object[] { ItemList.ranch, ItemList.salad });
			
			GameRegistry.addShapelessRecipe(
					new ItemStack(ItemList.italianSalad),
					new Object[] { ItemList.italian, ItemList.salad });
			
			// Buttery Potato
			GameRegistry.addShapelessRecipe(
					new ItemStack(ItemList.butterPotato),
					new Object[] { Items.baked_potato, ItemList.butterFood });
			
			// Salad
			GameRegistry.addRecipe(new ItemStack(ItemList.salad, 1),
					new Object[] { "LLL", "CBC", "SSS", 'L', ItemList.lettuce,
							'S', ItemList.spinach, 'C', Items.carrot, 'B',
							Items.bowl });
			
			// Raw Fries
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.rawFry, 8),
					new Object[] {
							new ItemStack(ItemList.knife, 1, WILDCARD_VALUE),
							Items.potato });
			
			// Raw Sweet Fries
			GameRegistry
					.addShapelessRecipe(new ItemStack(ItemList.rawSweet, 8),
							new Object[] {
									new ItemStack(ItemList.knife, 1,
											WILDCARD_VALUE),
									ItemList.sweetPotato });
			
			// Cheese Wheel
			GameRegistry.addRecipe(new ItemStack(BlockList.cheeseWheelBlock, 1),
					new Object[] { "CCC", "CCC", "CCC", 'C', ItemList.cheese });
			
			// Butter
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.butterFood),
					new Object[] { Items.milk_bucket });
		}
	}
	
	public static class InEdibleFoodRecipes {
		
		public static void init() {
			
			// Tomato Paste
			GameRegistry.addRecipe(new ItemStack(ItemList.tomatoPaste, 2),
					new Object[] { "   ", " T ", "   ", 'T', ItemList.tomato });
			
			// Crushed Peppercorn
			GameRegistry.addShapelessRecipe(
					new ItemStack(ItemList.crushedPeppercorn, 2),
					new Object[] { ItemList.peppercorn });
			
			// Ketchup
			GameRegistry
					.addShapelessRecipe(new ItemStack(ItemList.ketchup),
							new Object[] { ItemList.vinegar,
									ItemList.tomatoPaste,
									ItemList.tomatoPaste });
			
			// Pepper
			GameRegistry.addRecipe(new ItemStack(ItemList.blackPepper, 1),
					new Object[] { "   ", "BBB", "BGB", 'B',
							ItemList.crushedPeppercorn, 'G',
							Items.glass_bottle });
			
			// Salt
			GameRegistry.addRecipe(new ItemStack(ItemList.salt, 1),
					new Object[] { "CSG", "   ", "   ", 'C',
							ItemList.chlorineBottle, 'S', ItemList.sodium, 'G',
							Items.glass_bottle });
			
			// French
			GameRegistry.addRecipe(new ItemStack(ItemList.french, 1),
					new Object[] { "VK ", "Ss ", "G  ", 'V', ItemList.vinegar,
							'S', ItemList.salt, 'G', Items.glass_bottle, 's',
							Items.sugar, 'K', ItemList.ketchup });
			
			// Ranch
			GameRegistry.addRecipe(new ItemStack(ItemList.ranch, 1),
					new Object[] { "Og ", "BS ", "G  ", 'O', ItemList.onion,
							'S', ItemList.salt, 'G', Items.glass_bottle, 'g',
							ItemList.garlic, 'B', ItemList.blackPepper });
			
			// Italian
			GameRegistry.addRecipe(new ItemStack(ItemList.italian, 1),
					new Object[] { "VB ", "Ss ", "G  ", 'V', ItemList.vinegar,
							'S', Items.sugar, 'G', Items.glass_bottle, 'B',
							ItemList.blackPepper, 's', ItemList.salt });
			
			//Barrier Apple
			GameRegistry.addRecipe(new ItemStack(ItemList.barrierApple, 4),
			new Object[] { "   ", " A ", "ZRZ", 'A', Items.golden_apple,
					'Z', ItemList.zogiteIngot, 'R', ItemList.raditeIngot});
			
			//Radiated Coal
			GameRegistry.addRecipe(new ItemStack(ItemList.radiatedCoal, 8),
					new Object[] { "ZZZ", "ZCZ", "ZZZ", 'C', Items.coal, 'Z', ItemList.zogiteIngot});
		}
	}
}
