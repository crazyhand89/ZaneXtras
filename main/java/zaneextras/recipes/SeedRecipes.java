package zaneextras.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;

public class SeedRecipes {
	
	public static void init() {
		OverworldSeedRecipes.init();
		NetherSeedRecipes.init();
	}
	
	public static class OverworldSeedRecipes {
		
		public static void init() {
			// Letteuce Seeds
			GameRegistry.addShapelessRecipe(
					new ItemStack(ItemList.lettuceSeeds),
					new Object[] { ItemList.lettuce });
			
			// Pepper seeds
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.pepperSeeds),
					new Object[] { ItemList.pepper });
			
			// Green Bean seeds
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.greenSeeds),
					new Object[] { ItemList.greenBean });
			
			// Spinach seeds
			GameRegistry.addShapelessRecipe(
					new ItemStack(ItemList.spinachSeeds),
					new Object[] { ItemList.spinach });
			
			// Garlic seeds
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.garlicSeeds),
					new Object[] { ItemList.garlic });
			
			// Onion seeds
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.onionSeeds),
					new Object[] { ItemList.onion });
			
			// Tomato seeds
			GameRegistry.addRecipe(new ItemStack(ItemList.tomatoSeeds, 1),
					new Object[] { "   ", "   ", "  T", 'T', ItemList.tomato });
		}
	}
	
	public static class NetherSeedRecipes {
		
		public static void init() {
			// Ghost seeds
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.ghostSeeds),
					new Object[] { ItemList.ghost });
			
		}
	}
}
