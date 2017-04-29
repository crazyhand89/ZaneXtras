package zaneextras.oredict;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import zaneextras.blocks.BlockList;
import zaneextras.config.ZaneConfig;
import zaneextras.items.ItemList;

public class ZaneOreDict {
	
	public static void init() {
		
		// Blocks
		registerOre("blockZogradite", BlockList.zograditeBlock);
		registerOre("blockCheese", BlockList.cheeseBlock);
		registerOre("blockDamnHardButter", BlockList.dhbBlock);
		registerOre("blockRadite", BlockList.raditeBlock);
		registerOre("blockSkyium", BlockList.skyiumBlock);
		registerOre("blockRedGlowstone", BlockList.redGlow);
		registerOre("blockRedTorch", BlockList.redTorch);
		registerOre("blockStaria", BlockList.stariaBlock);
		registerOre("blockZanium", BlockList.zaniumBlock);
		registerOre("blockZogite", BlockList.zogiteBlock);
		registerOre("plankWood", BlockList.lightPlank);
		
		// Ores
		registerOre("oreStaria", BlockList.stariaOre);
		registerOre("oreRadite", BlockList.raditeOre);
		registerOre("oreSkyium", BlockList.skyiumOre);
		registerOre("oreSodium", BlockList.sodiumOre);
		registerOre("oreButter", BlockList.dhbOre);
		registerOre("oreZanium", BlockList.zaniumOre);
		registerOre("oreZogite", BlockList.zogiteOre);
		
		// dust
		registerOre("dustRedGlowstone", ItemList.redGlowStoneDust);
		registerOre("dustRadite", ItemList.raditeDust);
		registerOre("dustZogite", ItemList.zogiteDust);
		registerOre("dustZogradite", ItemList.zograditeBlend);
		registerOre("dustSkyium", ItemList.skyiumDust);
		registerOre("dustButter", ItemList.butterDust);
		
		// ingots
		registerOre("ingotZogite", ItemList.zogiteIngot);
		registerOre("ingotRadite", ItemList.raditeIngot);
		
		if (ZaneConfig.butterIsYellorite) {
			registerOre("ingotUranium", ItemList.butterItem);
			registerOre("dustUranium", ItemList.butterDust);
		} else {
			registerOre("ingotButter", ItemList.butterItem);
		}
		registerOre("ingotZogradite", ItemList.zograditeIgnot);
		registerOre("ingotSkyium", ItemList.skyium);
		
		// Gems
		registerOre("gemStaria", ItemList.staria);
		registerOre("gemZanium", ItemList.zanium);
		
		// Crops
		registerOre("cropGarlic", ItemList.garlic);
		registerOre("cropOnion", ItemList.onion);
		registerOre("cropTomato", ItemList.tomato);
		registerOre("cropgreenBean", ItemList.greenBean);
		registerOre("cropPepper", ItemList.pepper);
		registerOre("cropGhostPepper", ItemList.ghost);
		registerOre("cropPeppercorn", ItemList.peppercorn);
		registerOre("cropSpinach", ItemList.spinach);
		registerOre("cropSweetPotato", ItemList.sweetPotato);
		registerOre("cropLettuce", ItemList.lettuce);
		
		// Food
		registerOre("foodButter", ItemList.butterFood);
		registerOre("foodSalad", ItemList.salad);
		registerOre("foodSaladFrench", ItemList.frenchSalad);
		registerOre("foodSaladItalian", ItemList.italianSalad);
		registerOre("foodSaladRanch", ItemList.ranchSalad);
		registerOre("foodRawSweet", ItemList.rawSweet);
		registerOre("foodCookedSweet", ItemList.cookedSweet);
		registerOre("foodRayFry", ItemList.rawFry);
		registerOre("foodCookedFry", ItemList.cookedFry);
		registerOre("foodCheese", ItemList.cheese);
		
		// Non Edible Food
		registerOre("foodCrushedPepper", ItemList.rawFry);
		registerOre("foodTomatoPaste", ItemList.cookedFry);
		registerOre("foodKetchup", ItemList.cheese);
		
		// Bottle Items
		registerOre("bottleFrench", ItemList.french);
		registerOre("bottleRanch", ItemList.ranch);
		registerOre("bottleItalian", ItemList.italian);
		registerOre("bottleVinegar", ItemList.vinegar);
		registerOre("bottleMixed", ItemList.mixedBottle);
		registerOre("bottleAcid", ItemList.acidBottle);
		registerOre("bottleChlorine", ItemList.chlorineBottle);
		registerOre("bottlePepper", ItemList.blackPepper);
		registerOre("bottleSalt", ItemList.salt);
		
		// Materials
		registerOre("materialSodium", ItemList.sodium);
		registerOre("materialChargedStaria", ItemList.chargedStaria);
		registerOre("materialChargedZanium", ItemList.chargedZanium);
		
		// Misc Items
		registerOre("itemKnife", ItemList.knife);
		
		// Sticks
		registerOre("itemGlowStick", ItemList.glowStick);
		registerOre("itemRaditeStick", ItemList.raditeInfusedStick);
		registerOre("itemNetherStick", ItemList.netherStick);
	}
	
	public static void registerOre(String strName, Item item) {
		OreDictionary.registerOre(strName, new ItemStack(item, 1));
	}
	
	public static void registerOre(String strName, Block block) {
		OreDictionary.registerOre(strName, new ItemStack(block, 1));
	}
	
	public static void registerOre(String strName, Block... blocks) {
		for (Block zollernBlock : blocks) {
			registerOre(strName, zollernBlock);
		}
	}
	
	public static void registerOre(String strName, Item... items) {
		for (Item zollernItem : items) {
			registerOre(strName, zollernItem);
		}
	}
}