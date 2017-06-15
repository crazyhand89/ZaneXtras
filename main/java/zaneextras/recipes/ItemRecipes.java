package zaneextras.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import zaneextras.blocks.BlockList;
import zaneextras.items.ItemList;
import zaneextras.lib.helpers.ModHelper;

public class ItemRecipes {
	
	public static void init() {
		BottleRecipes.init();
		MiscRecipes.init();
		StickRecipes.init();
	}
	
	public static class BottleRecipes {
		
		public static void init() {
			// Acid Bottle
			GameRegistry
					.addShapelessRecipe(new ItemStack(ItemList.acidBottle, 3),
							new Object[] { ItemList.acidBucket,
									Items.glass_bottle, Items.glass_bottle,
									Items.glass_bottle });
			
			// Chlorine Bottle
			GameRegistry
					.addShapelessRecipe(
							new ItemStack(ItemList.chlorineBottle, 3),
							new Object[] { ItemList.chlorineBucket,
									Items.glass_bottle, Items.glass_bottle,
									Items.glass_bottle });
			
			// Mixed Bottle
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.mixedBottle),
					new Object[] { ItemList.acidBottle, Items.water_bucket });
			
		}
	}
	
	public static class StickRecipes {
		
		public static void init() {
			// Glow Stick
			GameRegistry.addShapelessRecipe(
					new ItemStack(ItemList.glowStick, 2),
					new Object[] { Items.stick, Items.glowstone_dust,
							Items.glowstone_dust });
			
			// Nether Stick
			GameRegistry.addRecipe(new ItemStack(ItemList.netherStick, 2),
					new Object[] { "   ", "  N", "  N", 'N',
							Items.netherbrick });
			
			// Red Glow Stick
			GameRegistry
					.addRecipe(new ItemStack(BlockList.redTorch, 4),
							new Object[] { "   ", "  R", "  S", 'R',
									ItemList.redGlowStoneDust, 'S',
									Items.stick });
			
			// Light Stick
			GameRegistry.addRecipe(new ItemStack(ItemList.lightStick, 4),
					new Object[] { "   ", "  P", "  P", 'P',
							BlockList.lightPlank });
		}
	}
	
	public static class MiscRecipes {
		
		public static void init() {
			// Chef's Knife
			GameRegistry.addRecipe(new ItemStack(ItemList.knife, 1),
					new Object[] { "   ", " I ", "S  ", 'S', Items.stick, 'I',
							Items.iron_ingot });
			
			// Charged Staria Alternative
			if (!ModHelper.useZollernExtras && !ModHelper.useBigReactors) {
				GameRegistry
						.addRecipe(new ItemStack(ItemList.chargedStaria, 1),
								new Object[] { "GGG", "GEG", "GGG", 'G',
										Blocks.emerald_block, 'E',
										ItemList.staria });
			}
			
			// Charged Zanium Alternative
			if (!ModHelper.useZollernExtras && !ModHelper.useBigReactors) {
				GameRegistry
						.addRecipe(new ItemStack(ItemList.chargedZanium, 1),
								new Object[] { "GGG", "GEG", "GGG", 'G',
										Blocks.emerald_block, 'E',
										ItemList.zanium });
			}
			
			// Empowered Staria Alternative
			if (!ModHelper.useZollernExtras && !ModHelper.useBigReactors) {
				GameRegistry
						.addRecipe(new ItemStack(ItemList.empoweredStaria, 1),
								new Object[] { "GGG", "GEG", "GGG", 'G',
										Blocks.emerald_block, 'E',
										ItemList.staria });
			}
			
			// Empowered Zanium Alternative
			if (!ModHelper.useZollernExtras && !ModHelper.useBigReactors) {
				GameRegistry
						.addRecipe(new ItemStack(ItemList.empoweredZanium, 1),
								new Object[] { "GGG", "GEG", "GGG", 'G',
										Blocks.emerald_block, 'E',
										ItemList.zanium });
			}
			
			// Zogradite Blend
			GameRegistry.addRecipe(new ItemStack(ItemList.zograditeBlend, 4),
					new Object[] { "ZZ ", "RR ", "B  ", 'Z',
							ItemList.zogiteDust, 'R', ItemList.raditeDust, 'B',
							ItemList.raditeBucket });
			
			// Bone to Bonemeal Light
			GameRegistry.addShapelessRecipe(
					new ItemStack(ItemList.lightBoneMeal, 2),
					new Object[] { ItemList.lightBone });
			
			// Light Eye
			GameRegistry.addRecipe(new ItemStack(ItemList.lightEye, 1),
					new Object[] { "ZZZ", "SES", "RRR", 'Z',
							ItemList.zogiteIngot, 'R', ItemList.raditeIngot,
							'S', ItemList.staria, 'E', Items.ender_eye });
			
			// Angel Key
			GameRegistry
					.addRecipe(new ItemStack(ItemList.angelKey, 1),
							new Object[] { " A ", "AHA", " A ", 'A',
									ItemList.pureFeather, 'H',
									ItemList.angelHalo });
			
			// Radiated Coal
			GameRegistry.addRecipe(new ItemStack(ItemList.radiatedCoal, 8),
					new Object[] { "ZZZ", "ZCZ", "ZZZ", 'C', Items.coal, 'Z',
							ItemList.zogiteIngot });
			
			// Angel Ingot
			GameRegistry.addRecipe(new ItemStack(ItemList.lightIngot, 1),
					new Object[] { "AAA", "AAA", "AAA", 'A',
							ItemList.lightNugget });
		}
	}
}
