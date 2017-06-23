package zaneextras.recipes;

import cofh.thermalfoundation.item.TFItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import zaneextras.blocks.BlockList;
import zaneextras.items.ItemList;
import zaneextras.lib.helpers.ModHelper;
import zollernextras.blocks.ZollernBlocks;
import zollernextras.items.ZollernItems;

public class ThermalExpansionRecipes {
	
	public static void init() {
		MagmaCrucibleRecipes.init();
		TransposerRecipes.init();
		InductionRecipes.init();
		PulverizeOreRecipes.init();
		LightOreRecipes.init();
		PulverizeFoodRecipes.init();
	}
	
	public static class LightOreRecipes {
		public static void init() {
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(BlockList.lightDiamondOre, 1),
					new ItemStack(Items.diamond, 8));
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(BlockList.lightEmeraldOre, 1),
					new ItemStack(Items.emerald, 8));
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(BlockList.lightGoldOre, 1),
					new ItemStack(Items.gold_ingot, 8));
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(BlockList.lightIronOre, 1),
					new ItemStack(Items.iron_ingot, 12));
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(BlockList.lightLapisOre, 1),
					new ItemStack(Items.dye, 10, 4));
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(BlockList.lightRedstoneOre, 1),
					new ItemStack(Items.redstone, 10));
			ZaneThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(BlockList.lightNickelOre, 1),
					new ItemStack(TFItems.dustNickel.getItem(), 5, 36));
			ZaneThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(BlockList.lightCopperOre, 1),
					new ItemStack(TFItems.dustCopper.getItem(), 5, 32));
			ZaneThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(BlockList.lightLeadOre, 1),
					new ItemStack(TFItems.dustLead.getItem(), 5, 35));
			ZaneThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(BlockList.lightTinOre, 1),
					new ItemStack(TFItems.dustTin.getItem(), 5, 33));
			ZaneThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(BlockList.lightPlatinumOre, 1),
					new ItemStack(TFItems.dustPlatinum.getItem(), 5, 37));
			ZaneThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(BlockList.lightSilverOre, 1),
					new ItemStack(TFItems.dustSilver.getItem(), 5, 34));
		}
	}
	
	public static class PulverizeOreRecipes {
		public static void init() {
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(BlockList.sodiumOre, 1),
					new ItemStack(ItemList.sodium, 8));
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(BlockList.skyiumOre, 1),
					new ItemStack(ItemList.skyiumDust, 2));
			ZaneThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(BlockList.raditeOre, 1),
					new ItemStack(ItemList.raditeDust, 2));
			ZaneThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(BlockList.zogiteOre, 1),
					new ItemStack(ItemList.zogiteDust, 2));
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(ItemList.skyium, 1),
					new ItemStack(ItemList.skyiumDust, 1));
			ZaneThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ItemList.raditeIngot, 1),
					new ItemStack(ItemList.raditeDust, 1));
			ZaneThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ItemList.zogiteIngot, 1),
					new ItemStack(ItemList.zogiteDust, 1));
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(ItemList.butterItem, 1),
					new ItemStack(ItemList.butterDust, 1));
			ZaneThermalExpansionHelper.addPulverizerRecipe(5000,
					new ItemStack(BlockList.zaniumOre, 1),
					new ItemStack(ItemList.zanium, 3));
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(BlockList.dhbOre, 1),
					new ItemStack(ItemList.butterDust, 2));
			ZaneThermalExpansionHelper.addPulverizerRecipe(5000,
					new ItemStack(BlockList.stariaOre, 1),
					new ItemStack(ItemList.staria, 3));
		}
	}
	
	public static class PulverizeFoodRecipes {
		public static void init() {
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(Items.milk_bucket, 1),
					new ItemStack(ItemList.butterFood, 4));
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(ItemList.tomato, 1),
					new ItemStack(ItemList.tomatoPaste, 4));
			ZaneThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(ItemList.peppercorn, 1),
					new ItemStack(ItemList.crushedPeppercorn, 4));
		}
	}
	
	public static class MagmaCrucibleRecipes {
		public static void init() {
			// Molten Radite
			ZaneThermalExpansionHelper.addCrucibleRecipe(1500,
					new ItemStack(ItemList.raditeIngot, 1),
					new FluidStack(BlockList.radite, 250));
			
			// Molten Radite
			ZaneThermalExpansionHelper.addCrucibleRecipe(3000,
					new ItemStack(BlockList.raditeBlock, 1),
					new FluidStack(BlockList.radite, 2250));
		}
	}
	
	public static class TransposerRecipes {
		public static void init() {
			// Radite Bucket
			ZaneThermalExpansionHelper.addTransposerFill(1500,
					new ItemStack(Items.bucket, 1),
					new ItemStack(ItemList.raditeBucket, 1),
					new FluidStack(BlockList.radite, 1000), true);
			
		}
	}
	
	public static class InductionRecipes {
		public static void init() {
			// Charged Staria
			if (ModHelper.useZollernExtras) {
				ZaneThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(ZollernBlocks.chargiumBlock),
						new ItemStack(ItemList.staria),
						new ItemStack(ItemList.chargedStaria));
			} else {
				ZaneThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(Blocks.emerald_block, 2),
						new ItemStack(ItemList.staria),
						new ItemStack(ItemList.chargedStaria));
			}
			
			// Charged Zanium
			if (ModHelper.useZollernExtras) {
				ZaneThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(ZollernBlocks.chargiumBlock),
						new ItemStack(ItemList.zanium),
						new ItemStack(ItemList.chargedZanium));
			} else {
				ZaneThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(Blocks.emerald_block, 2),
						new ItemStack(ItemList.zanium),
						new ItemStack(ItemList.chargedZanium));
			}
			
			// Empowered Zanium
			if (ModHelper.useZollernExtras) {
				ZaneThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(ZollernItems.chargiumIngot),
						new ItemStack(ItemList.zanium),
						new ItemStack(ItemList.empoweredZanium));
			} else {
				ZaneThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(Blocks.emerald_block, 2),
						new ItemStack(ItemList.zanium),
						new ItemStack(ItemList.empoweredZanium));
			}
			
			// Empowered Staria
			if (ModHelper.useZollernExtras) {
				ZaneThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(ZollernItems.chargiumIngot),
						new ItemStack(ItemList.staria),
						new ItemStack(ItemList.empoweredStaria));
			} else {
				ZaneThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(Blocks.emerald_block, 2),
						new ItemStack(ItemList.staria),
						new ItemStack(ItemList.empoweredStaria));
			}
			
			ZaneThermalExpansionHelper.addSmelterRecipe(10000,
					new ItemStack(ItemList.chargedStaria),
					new ItemStack(ItemList.zograditeBlend),
					new ItemStack(ItemList.zograditeIgnot, 3));
			ZaneThermalExpansionHelper.addSmelterRecipe(10000,
					new ItemStack(ItemList.chargedZanium),
					new ItemStack(ItemList.zograditeBlend),
					new ItemStack(ItemList.zograditeIgnot, 3));
			
			ZaneThermalExpansionHelper.addSmelterRecipe(1000,
					new ItemStack(ItemList.glowStick),
					new ItemStack(ItemList.raditeDust),
					new ItemStack(ItemList.raditeInfusedStick));
		}
	}
}
