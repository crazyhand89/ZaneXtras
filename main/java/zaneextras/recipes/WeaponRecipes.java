package zaneextras.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;

public class WeaponRecipes {
	
	public static void init() {
		SwordRecipes.init();
		BowAndArrowRecipes.init();
	}
	
	public static class SwordRecipes {
		
		public static void init() {
			// Swordy sword, Staria
			ItemStack stariaSword = new ItemStack(ItemList.stariaSword, 1);
			stariaSword.addEnchantment(Enchantment.looting, 3);
			stariaSword.addEnchantment(Enchantment.sharpness, 5);
			stariaSword.addEnchantment(Enchantment.unbreaking, 3);
			
			GameRegistry.addRecipe(stariaSword,
					new Object[] { "  S", "GS ", "GG ", 'S',
							ItemList.empoweredStaria, 'G',
							ItemList.glowStick });
			
			// Swordy sword, Zanium
			ItemStack zaniumSword = new ItemStack(ItemList.zaniumSword, 1);
			zaniumSword.addEnchantment(Enchantment.looting, 3);
			zaniumSword.addEnchantment(Enchantment.sharpness, 5);
			zaniumSword.addEnchantment(Enchantment.fireAspect, 1);
			
			GameRegistry.addRecipe(zaniumSword,
					new Object[] { "  Z", "NZ ", "NN ", 'Z',
							ItemList.empoweredZanium, 'N',
							ItemList.netherStick });
			
			// Swordy sword, Butter
			GameRegistry.addRecipe(new ItemStack(ItemList.butterSword, 1),
					new Object[] { " R ", " R ", " S ", 'R',
							ItemList.butterItem, 'S', Items.stick });
			
			// Swordy sword, Emerald
			ItemStack emeraldSword = new ItemStack(ItemList.emeraldSword, 1);
			emeraldSword.addEnchantment(Enchantment.looting, 1);
			emeraldSword.addEnchantment(Enchantment.sharpness, 1);
			
			GameRegistry.addRecipe(emeraldSword, new Object[] { " E ", " E ",
					" S ", 'E', Items.emerald, 'S', Items.stick });
			
			// Swordy sword, Skyium
			ItemStack skyiumSword = new ItemStack(ItemList.skyiumSword, 1);
			skyiumSword.addEnchantment(Enchantment.looting, 2);
			skyiumSword.addEnchantment(Enchantment.sharpness, 2);
			skyiumSword.addEnchantment(Enchantment.unbreaking, 1);
			
			GameRegistry.addRecipe(skyiumSword, new Object[] { " E ", " E ",
					" S ", 'E', ItemList.skyium, 'S', ItemList.glowStick });
			
			// Scythey scythe, Zogradite
			ItemStack zograditeScythe = new ItemStack(ItemList.zograditeScythe,
					1);
			zograditeScythe.addEnchantment(Enchantment.looting, 3);
			zograditeScythe.addEnchantment(Enchantment.sharpness, 5);
			zograditeScythe.addEnchantment(Enchantment.unbreaking, 3);
			
			GameRegistry.addRecipe(zograditeScythe,
					new Object[] { "ZZS", "ZS ", "S  ", 'Z',
							ItemList.zograditeIgnot, 'S',
							ItemList.raditeInfusedStick });
			
			// Swordy sword, Fool Staria
			GameRegistry.addRecipe(new ItemStack(ItemList.foolStariaSword, 1),
					new Object[] { " R ", " R ", " S ", 'R',
							ItemList.foolStaria, 'S', Items.stick });
			
			// Swordy sword, Angel
			GameRegistry
					.addRecipe(new ItemStack(ItemList.angelSword, 1),
							new Object[] { " R ", " R ", " S ", 'R',
									ItemList.lightIngot, 'S',
									ItemList.lightStick });
		}
	}
	
	public static class BowAndArrowRecipes {
		
		public static void init() {
			
			// Emerald Bow and Arrows
			GameRegistry
					.addRecipe(new ItemStack(ItemList.emeraldBow, 1),
							new Object[] { " GI", "E I", " GI", 'G',
									Items.gold_ingot, 'I', Items.iron_ingot,
									'E', Items.emerald });
			
			GameRegistry
					.addRecipe(new ItemStack(ItemList.emeraldArrow, 4),
							new Object[] { " E ", " S ", " F ", 'E',
									Items.emerald, 'S', Items.stick, 'F',
									Items.feather });
			
			// Ender Bow and Arrows
			GameRegistry
					.addRecipe(new ItemStack(ItemList.enderBow, 1),
							new Object[] { " NI", "E I", " NI", 'E',
									Items.ender_pearl, 'I', Items.iron_ingot,
									'N', ItemList.netherStick });
			
			GameRegistry
					.addRecipe(new ItemStack(ItemList.enderArrow, 4),
							new Object[] { " E ", " N ", " F ", 'E',
									Items.ender_pearl, 'N',
									ItemList.netherStick, 'F', Items.feather });
			
			// Golden Arrows
			GameRegistry
					.addRecipe(new ItemStack(ItemList.goldenArrow, 4),
							new Object[] { " G ", " S ", " F ", 'G',
									Items.gold_ingot, 'S', ItemList.glowStick,
									'F', Items.feather });
			
			// Light Bow and Arrows
			GameRegistry
					.addRecipe(new ItemStack(ItemList.lightBow, 1),
							new Object[] { "YLS", "LYS", "YLS", 'S',
									Items.string, 'L', ItemList.lightStick, 'Y',
									ItemList.lightBoneMeal });
			
			GameRegistry.addRecipe(new ItemStack(ItemList.lightArrow, 4),
					new Object[] { " E ", "YLY", " F ", 'E', Items.iron_ingot,
							'L', ItemList.lightStick, 'F', Items.feather, 'Y',
							ItemList.lightBoneMeal });
			
			// Angel Bow and Arrows
			GameRegistry
					.addRecipe(new ItemStack(ItemList.angelBow, 1),
							new Object[] { "YLS", "LYS", "YLS", 'S',
									Items.string, 'L', ItemList.lightStick, 'Y',
									ItemList.lightIngot });
			
			GameRegistry.addRecipe(new ItemStack(ItemList.angelArrow, 4),
					new Object[] { " E ", " L ", " F ", 'E',
							ItemList.lightIngot, 'L', ItemList.lightStick, 'F',
							ItemList.pureFeather });
		}
	}
}
