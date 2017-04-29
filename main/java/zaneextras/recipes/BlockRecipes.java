package zaneextras.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zaneextras.blocks.BlockList;
import zaneextras.items.ItemList;

public class BlockRecipes {
	
	public static void init() {
		BrickRecipes.init();
		MaterialToBrickRecipes.init();
		WoodRecipes.init();
	}
	
	public static class WoodRecipes {
		
		public static void init() {
			
			// Light Tree
			addWoodenPlanks(BlockList.lightLog, BlockList.lightPlank);
		}
	}
	
	public static class BrickRecipes {
		
		public static void init() {
			// Red Glowstone
			addBricks(ItemList.redGlowStoneDust, BlockList.redGlow);
		}
	}
	
	public static class MaterialToBrickRecipes {
		
		public static void init() {
			
			materialToBrick(BlockList.skyiumBlock, ItemList.skyium);
			materialToBrick(BlockList.zaniumBlock, ItemList.zanium);
			materialToBrick(BlockList.stariaBlock, ItemList.staria);
			materialToBrick(BlockList.dhbBlock, ItemList.butterItem);
			materialToBrick(BlockList.raditeBlock, ItemList.raditeIngot);
			materialToBrick(BlockList.zogiteBlock, ItemList.zogiteIngot);
			materialToBrick(BlockList.zograditeBlock, ItemList.zograditeIgnot);
		}
		
	}
	
	// Material to Block and the Reverse
	public static void materialToBrick(Block materialBlock, Item material) {
		GameRegistry.addRecipe(new ItemStack(materialBlock),
				new Object[] { "MMM", "MMM", "MMM", 'M', material });
		GameRegistry.addShapelessRecipe(new ItemStack(material, 9),
				new Object[] { materialBlock });
	}
	
	// brick recipe helper Credit: Paul Shannon or Zollernwolf
	public static void addBricks(Item coloredBrick, Block coloredBlock) {
		GameRegistry.addRecipe(new ItemStack(coloredBlock, 1),
				new Object[] { "CC ", "CC ", "   ", 'C', coloredBrick });
		GameRegistry.addShapelessRecipe(new ItemStack(coloredBrick, 4),
				new Object[] { coloredBlock });
	}
	
	public static void addBricks(Block coloredBrick, Block coloredBlock) {
		GameRegistry.addRecipe(new ItemStack(coloredBlock, 1),
				new Object[] { "CC ", "CC ", "   ", 'C', coloredBrick });
		GameRegistry.addShapelessRecipe(new ItemStack(coloredBrick, 4),
				new Object[] { coloredBlock });
	}
	
	public static void addBricks(Item coloredBrick, Block coloredBlock,
			int numOutput) {
		GameRegistry.addRecipe(new ItemStack(coloredBlock, numOutput),
				new Object[] { "CC ", "CC ", "   ", 'C', coloredBrick });
		GameRegistry.addShapelessRecipe(new ItemStack(coloredBrick, 4),
				new Object[] { coloredBlock });
	}
	
	public static void addBricks(Block coloredBrick, Block coloredBlock,
			int numOutput) {
		GameRegistry.addRecipe(new ItemStack(coloredBlock, numOutput),
				new Object[] { "CC ", "CC ", "   ", 'C', coloredBrick });
		GameRegistry.addShapelessRecipe(new ItemStack(coloredBrick, 4),
				new Object[] { coloredBlock });
	}
	
	public static void addWoodenPlanks(Block log, Block planks) {
		GameRegistry.addShapelessRecipe(new ItemStack(planks, 4),
				new Object[] { log });
	}
}
