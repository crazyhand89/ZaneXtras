package zaneextras.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import zaneextras.blocks.cropblock.LettuceBlock;
import zaneextras.blocks.cropblock.TomatoBlock;
import zaneextras.blocks.crops.CropGarlic;
import zaneextras.blocks.crops.CropGeneralPepper;
import zaneextras.blocks.crops.CropGhostPepper;
import zaneextras.blocks.crops.CropGreenBean;
import zaneextras.blocks.crops.CropOnion;
import zaneextras.blocks.crops.CropPeppercorn;
import zaneextras.blocks.crops.CropSpinach;
import zaneextras.blocks.crops.CropSweetPotato;
import zaneextras.blocks.crops.LettuceStem;
import zaneextras.blocks.crops.TomatoStem;
import zaneextras.blocks.liquid.AcidLiquidBlock;
import zaneextras.blocks.liquid.ChlorineLiquidBlock;
import zaneextras.blocks.liquid.RaditeLiquidBlock;
import zaneextras.blocks.ore.SkyiumOreBlock;
import zaneextras.blocks.ore.SodiumOreBlock;
import zaneextras.blocks.ore.StariaOreBlock;
import zaneextras.blocks.ore.ZaneOreBlock;
import zaneextras.blocks.ore.ZaniumOreBlock;
import zaneextras.blocks.trees.LightLeaves;
import zaneextras.blocks.trees.LightLog;
import zaneextras.blocks.trees.LightSapling;
import zaneextras.fluid.FluidAcid;
import zaneextras.fluid.FluidChlorine;
import zaneextras.fluid.FluidRadite;
import zaneextras.lib.ZaneTabs;

public class BlockList {
	
	// Fluids
	public static FluidAcid acid = new FluidAcid("acid");
	public static FluidChlorine chlorine = new FluidChlorine("chlorine");
	public static FluidRadite radite = new FluidRadite("radite");
	
	// Ores
	public static final Block dhbOre = new ZaneOreBlock(Material.rock,
			"butterore", 2.0F, 2.0F, Block.soundTypeStone, 1);
	public static final Block zaniumOre = new ZaniumOreBlock();
	public static final Block stariaOre = new StariaOreBlock();
	public static final Block sodiumOre = new SodiumOreBlock();
	public static final Block skyiumOre = new SkyiumOreBlock();
	public static final Block raditeOre = new ZaneOreBlock(Material.rock,
			"raditeore", 3.0F, 3.0F, Block.soundTypeStone, 5);
	public static final Block zogiteOre = new ZaneOreBlock(Material.rock,
			"zogiteore", 3.0F, 3.0F, Block.soundTypeStone, 5);
	public static final Block lightRedstoneOre = new ZaneOreBlock(Material.rock,
			"lightredstoneore", 3.0F, 3.0F, Block.soundTypeStone, 2);
	public static final Block lightLapisOre = new ZaneOreBlock(Material.rock,
			"lightlapisore", 3.0F, 3.0F, Block.soundTypeStone, 2);
	public static final Block lightDiamondOre = new ZaneOreBlock(Material.rock,
			"lightdiamondore", 3.0F, 3.0F, Block.soundTypeStone, 2);
	public static final Block lightGoldOre = new ZaneOreBlock(Material.rock,
			"lightgoldore", 3.0F, 3.0F, Block.soundTypeStone, 2);
	public static final Block lightEmeraldOre = new ZaneOreBlock(Material.rock,
			"lightemeraldore", 3.0F, 3.0F, Block.soundTypeStone, 2);
	public static final Block lightIronOre = new ZaneOreBlock(Material.rock,
			"lightironore", 3.0F, 3.0F, Block.soundTypeStone, 2);
	
	// Crops
	public static final Block sweetPotatoCrop = new CropSweetPotato();
	public static final Block greenBeanCrop = new CropGreenBean();
	public static final Block ghostCrop = new CropGhostPepper();
	public static final Block pepperCrop = new CropGeneralPepper();
	public static final Block spinachCrop = new CropSpinach();
	public static final Block peppercornCrop = new CropPeppercorn();
	public static final Block onionCrop = new CropOnion();
	public static final Block garlicCrop = new CropGarlic();
	
	// Stems
	public static final Block tomatoStem = new TomatoStem();
	public static final Block lettuceStem = new LettuceStem();
	
	// Liquid Blocks
	public static final Block acidFluidBlock = new AcidLiquidBlock(acid);
	public static final Block chlorineFluidBlock = new ChlorineLiquidBlock(
			chlorine);
	public static final Block raditeFluidBlock = new RaditeLiquidBlock(radite);
	
	// Blocks for Crops
	public static final Block lettuceBlock = new LettuceBlock();
	public static final Block tomatoBlock = new TomatoBlock();
	
	// Material turned blocks
	public static final Block dhbBlock = new ZaneBlock(Material.rock,
			"butterblock", 2.0F, 4.0F, Block.soundTypeStone);
	public static final Block redGlow = new RedGlowStoneBlock();
	public static final Block stariaBlock = new ZaneBlock(Material.iron,
			"stariablock", 2.0F, 4.0F, Block.soundTypeMetal);
	public static final Block zaniumBlock = new ZaneBlock(Material.iron,
			"zaniumblock", 2.0F, 4.0F, Block.soundTypeMetal);
	public static final Block skyiumBlock = new ZaneBlock(Material.rock,
			"skyiumblock", 0.5F, 1.0F, Block.soundTypeGlass);
	public static final Block raditeBlock = new ZaneBlock(Material.iron,
			"raditeblock", 2.0F, 4.0F, Block.soundTypeMetal);
	public static final Block zogiteBlock = new ZaneBlock(Material.iron,
			"zogiteblock", 2.0F, 4.0F, Block.soundTypeMetal);
	public static final Block zograditeBlock = new ZaneBlock(Material.iron,
			"zograditeblock", 7.0F, 8.0F, Block.soundTypeMetal);
	
	// Light Blocks
	public static final Block lightStone = new LightStoneBlock();
	public static final Block lightStoneBrick = new ZaneLightBlock(
			Material.rock, "lightstonebrick", 1.0F, 3.0F, Block.soundTypeStone,
			1.0F);
	public static final Block lightCobbleStone = new ZaneLightBlock(
			Material.rock, "lightcobblestone", 1.0F, 3.0F, Block.soundTypeStone,
			1.0F);
	public static final Block lightDirt = new ZaneLightBlock(Material.ground,
			"lightdirt", 0.2F, 0.1F, Block.soundTypeGravel, 1.0F);
	public static final Block lightGrassDirt = new BlockLightGrass();
	
	// Food blocks
	public static final Block cheeseBlock = new CheeseBlock();
	
	// Torches
	public static final Block redTorch = new RedTorch();
	
	// Light Tree
	public static final Block lightLog = new LightLog();
	public static final Block lightPlank = new ZaneBlock(Material.wood,
			"planks_light", 1.0F, 1.0F, Block.soundTypeWood);
	public static final Block lightLeaves = new LightLeaves();
	public static final Block lightSapling = new LightSapling();
	
	// Furnace
	public static final Block cFurnace = new CFurnaceBlock(false).setCreativeTab(ZaneTabs.zTab);
	public static final Block cFurnaceActive = new CFurnaceBlock(true);
	
	public static void init() {
		addBlock(dhbBlock, "b1");
		addBlock(dhbOre, "b2");
		addBlock(redGlow, "b3");
		addBlock(sweetPotatoCrop, "b4"); // Bingo!!
		addBlock(greenBeanCrop, "b5");
		addBlock(ghostCrop, "b6");
		addBlock(pepperCrop, "b7");
		addBlock(spinachCrop, "b8");
		addBlock(lettuceBlock, "b9");
		addBlock(lettuceStem, "b10");
		addBlock(stariaOre, "b11");
		addBlock(stariaBlock, "b12");
		addBlock(redTorch, "b13");
		addBlock(zaniumOre, "b14");
		addBlock(zaniumBlock, "b15");
		addBlock(cheeseBlock, "b16");
		addBlock(acidFluidBlock, "b17");
		addBlock(tomatoBlock, "b18");
		addBlock(tomatoStem, "b19");
		addBlock(peppercornCrop, "b20");
		addBlock(onionCrop, "b21");
		addBlock(garlicCrop, "b22");
		addBlock(sodiumOre, "b23");
		addBlock(chlorineFluidBlock, "b24");
		addBlock(skyiumBlock, "b25");
		addBlock(skyiumOre, "b26");
		addBlock(zogiteOre, "b27");
		addBlock(raditeOre, "b28");
		addBlock(zogiteBlock, "b29");
		addBlock(raditeBlock, "b30");
		addBlock(raditeFluidBlock, "b31");
		addBlock(zograditeBlock, "b32");
		addBlock(lightStone, "b33");
		addBlock(lightStoneBrick, "b34");
		addBlock(lightDirt, "b35");
		addBlock(lightCobbleStone, "b36");
		addBlock(lightGrassDirt, "b37");
		addBlock(lightDiamondOre, "b38");
		addBlock(lightRedstoneOre, "b39");
		addBlock(lightLapisOre, "b40");
		addBlock(lightIronOre, "b41");
		addBlock(lightGoldOre, "b42");
		addBlock(lightEmeraldOre, "b43");
		addBlock(lightLog, "b44");
		addBlock(lightPlank, "b45");
		addBlock(lightLeaves, "b46");
		addBlock(lightSapling, "b47");
		addBlock(cFurnace, "b48");
		addBlock(cFurnaceActive, "b49");
	}
	
	public static void addBlock(Block block, String name) {
		GameRegistry.registerBlock(block, name);
	}
	
}