package zaneextras.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;

public class ArmorRecipes {
	
	public static void init() {
		ArmorCraftingRecipes.init();
	}
	
	public static class ArmorCraftingRecipes {
		
		public static final int WILDCARD_VALUE = Short.MAX_VALUE;
		
		public static void init() {
			
			// Hard Hat, Staria
			ItemStack stariaHelmet = new ItemStack(ItemList.stariaHelmet, 1);
			stariaHelmet.addEnchantment(Enchantment.respiration, 4);
			stariaHelmet.addEnchantment(Enchantment.protection, 4);
			
			GameRegistry.addRecipe(stariaHelmet, new Object[] { "SSS", "S S",
					"   ", 'S', ItemList.empoweredStaria });
			
			// Popping Chest, Staria
			ItemStack stariaChestPlate = new ItemStack(
					ItemList.stariaChestPlate, 1);
			stariaChestPlate.addEnchantment(Enchantment.protection, 4);
			stariaChestPlate.addEnchantment(Enchantment.blastProtection, 4);
			
			GameRegistry.addRecipe(stariaChestPlate, new Object[] { "S S",
					"SSS", "SSS", 'S', ItemList.empoweredStaria });
			
			// Smooth Leggings, Staria
			ItemStack stariaLeggings = new ItemStack(ItemList.stariaLeggings,
					1);
			stariaLeggings.addEnchantment(Enchantment.protection, 4);
			stariaLeggings.addEnchantment(Enchantment.projectileProtection, 4);
			
			GameRegistry.addRecipe(stariaLeggings, new Object[] { "SSS", "S S",
					"S S", 'S', ItemList.empoweredStaria });
			
			// Dem bootys, Staria
			ItemStack stariaBoots = new ItemStack(ItemList.stariaBoots, 1);
			stariaBoots.addEnchantment(Enchantment.featherFalling, 4);
			stariaBoots.addEnchantment(Enchantment.protection, 4);
			
			GameRegistry.addRecipe(stariaBoots, new Object[] { "   ", "S S",
					"S S", 'S', ItemList.empoweredStaria });
			
			// Hard Hat, Zanium
			ItemStack zaniumHelmet = new ItemStack(ItemList.zaniumHelmet, 1);
			zaniumHelmet.addEnchantment(Enchantment.respiration, 4);
			zaniumHelmet.addEnchantment(Enchantment.thorns, 4);
			
			GameRegistry.addRecipe(zaniumHelmet, new Object[] { "ZZZ", "Z Z",
					"   ", 'Z', ItemList.empoweredZanium });
			
			// Popping Chest, Zanium
			ItemStack zaniumChestPlate = new ItemStack(
					ItemList.zaniumChestPlate, 1);
			zaniumChestPlate.addEnchantment(Enchantment.blastProtection, 4);
			zaniumChestPlate.addEnchantment(Enchantment.thorns, 4);
			
			GameRegistry.addRecipe(zaniumChestPlate, new Object[] { "Z Z",
					"ZZZ", "ZZZ", 'Z', ItemList.empoweredZanium });
			
			// Smooth Leggings, Zanium
			ItemStack zaniumLeggings = new ItemStack(ItemList.zaniumLeggings,
					1);
			zaniumLeggings.addEnchantment(Enchantment.thorns, 4);
			zaniumLeggings.addEnchantment(Enchantment.projectileProtection, 4);
			
			GameRegistry.addRecipe(zaniumLeggings, new Object[] { "ZZZ", "Z Z",
					"Z Z", 'Z', ItemList.empoweredZanium });
			
			// Dem bootys, Zanium
			ItemStack zaniumBoots = new ItemStack(ItemList.zaniumBoots, 1);
			zaniumBoots.addEnchantment(Enchantment.featherFalling, 4);
			zaniumBoots.addEnchantment(Enchantment.thorns, 4);
			
			GameRegistry.addRecipe(zaniumBoots, new Object[] { "   ", "Z Z",
					"Z Z", 'Z', ItemList.empoweredZanium });
			
			// Hard Hat, Butter
			GameRegistry.addRecipe(new ItemStack(ItemList.butterHelmet, 1),
					new Object[] { "RRR", "R R", "   ", 'R',
							ItemList.butterItem });
			
			// Popping Chest, Butter
			GameRegistry.addRecipe(new ItemStack(ItemList.butterChestPlate, 1),
					new Object[] { "R R", "RRR", "RRR", 'R',
							ItemList.butterItem });
			
			// Smooth Leggings, Butter
			GameRegistry.addRecipe(new ItemStack(ItemList.butterLeggings, 1),
					new Object[] { "RRR", "R R", "R R", 'R',
							ItemList.butterItem });
			
			// Dem bootys, Butter
			GameRegistry.addRecipe(new ItemStack(ItemList.butterBoots, 1),
					new Object[] { "   ", "R R", "R R", 'R',
							ItemList.butterItem });
			
			// Hard Hat, Emerald
			GameRegistry.addRecipe(new ItemStack(ItemList.emeraldHelmet, 1),
					new Object[] { "EEE", "E E", "   ", 'E', Items.emerald });
			
			// Popping Chest, Emerald
			GameRegistry.addRecipe(new ItemStack(ItemList.emeraldChestPlate, 1),
					new Object[] { "E E", "EEE", "EEE", 'E', Items.emerald });
			
			// Smooth Leggings, Emerald
			GameRegistry.addRecipe(new ItemStack(ItemList.emeraldLeggings, 1),
					new Object[] { "EEE", "E E", "E E", 'E', Items.emerald });
			
			// Dem bootys, Emerald
			GameRegistry.addRecipe(new ItemStack(ItemList.emeraldBoots, 1),
					new Object[] { "   ", "E E", "E E", 'E', Items.emerald });
			
			// Hard Hat, Skyium
			ItemStack skyiumHelmet = new ItemStack(ItemList.skyiumHelmet, 1);
			skyiumHelmet.addEnchantment(Enchantment.protection, 3);
			
			GameRegistry.addRecipe(skyiumHelmet,
					new Object[] { "SSS", "S S", "   ", 'S', ItemList.skyium });
			
			// Popping Chest, Skyium
			ItemStack skyiumChestPlate = new ItemStack(
					ItemList.skyiumChestPlate, 1);
			skyiumChestPlate.addEnchantment(Enchantment.projectileProtection,
					3);
			
			GameRegistry.addRecipe(skyiumChestPlate,
					new Object[] { "S S", "SSS", "SSS", 'S', ItemList.skyium });
			
			// Smooth Leggings, Skyium
			ItemStack skyiumLeggings = new ItemStack(ItemList.skyiumLeggings,
					1);
			skyiumLeggings.addEnchantment(Enchantment.blastProtection, 3);
			
			GameRegistry.addRecipe(skyiumLeggings,
					new Object[] { "SSS", "S S", "S S", 'S', ItemList.skyium });
			
			// Dem bootys, Skyium
			ItemStack skyiumBoots = new ItemStack(ItemList.skyiumBoots, 1);
			skyiumBoots.addEnchantment(Enchantment.featherFalling, 4);
			
			GameRegistry.addRecipe(skyiumBoots,
					new Object[] { "   ", "S S", "S S", 'S', ItemList.skyium });
			
			// Hard Hat, Zogite
			ItemStack zogiteHelmet = new ItemStack(ItemList.zogiteHelmet, 1);
			zogiteHelmet.addEnchantment(Enchantment.thorns, 3);
			
			GameRegistry.addRecipe(zogiteHelmet, new Object[] { "SSS", "S S",
					"   ", 'S', ItemList.zogiteIngot });
			
			// Popping Chest, Zogite
			ItemStack zogiteChestPlate = new ItemStack(
					ItemList.zogiteChestPlate, 1);
			zogiteChestPlate.addEnchantment(Enchantment.thorns, 3);
			
			GameRegistry.addRecipe(zogiteChestPlate, new Object[] { "S S",
					"SSS", "SSS", 'S', ItemList.zogiteIngot });
			
			// Smooth Leggings, Zogite
			ItemStack zogiteLeggings = new ItemStack(ItemList.zogiteLeggings,
					1);
			zogiteLeggings.addEnchantment(Enchantment.thorns, 3);
			
			GameRegistry.addRecipe(zogiteLeggings, new Object[] { "SSS", "S S",
					"S S", 'S', ItemList.zogiteIngot });
			
			// Dem bootys, Zogite
			ItemStack zogiteBoots = new ItemStack(ItemList.zogiteBoots, 1);
			zogiteBoots.addEnchantment(Enchantment.thorns, 3);
			
			GameRegistry.addRecipe(zogiteBoots, new Object[] { "   ", "S S",
					"S S", 'S', ItemList.zogiteIngot });
			
			// Hard Hat, Radite
			ItemStack raditeHelmet = new ItemStack(ItemList.raditeHelmet, 1);
			raditeHelmet.addEnchantment(Enchantment.protection, 4);
			
			GameRegistry.addRecipe(raditeHelmet, new Object[] { "SSS", "S S",
					"   ", 'S', ItemList.raditeIngot });
			
			// Popping Chest, Radite
			ItemStack raditeChestPlate = new ItemStack(
					ItemList.raditeChestPlate, 1);
			raditeChestPlate.addEnchantment(Enchantment.protection, 4);
			
			GameRegistry.addRecipe(raditeChestPlate, new Object[] { "S S",
					"SSS", "SSS", 'S', ItemList.raditeIngot });
			
			// Smooth Leggings, Radite
			ItemStack raditeLeggings = new ItemStack(ItemList.raditeLeggings,
					1);
			raditeLeggings.addEnchantment(Enchantment.protection, 4);
			
			GameRegistry.addRecipe(raditeLeggings, new Object[] { "SSS", "S S",
					"S S", 'S', ItemList.raditeIngot });
			
			// Dem bootys, Radite
			ItemStack raditeBoots = new ItemStack(ItemList.raditeBoots, 1);
			raditeBoots.addEnchantment(Enchantment.protection, 4);
			
			GameRegistry.addRecipe(raditeBoots, new Object[] { "   ", "S S",
					"S S", 'S', ItemList.raditeIngot });
			
			// Hard Hat, Fool Staria
			GameRegistry.addRecipe(new ItemStack(ItemList.foolStariaHelmet, 1),
					new Object[] { "RRR", "R R", "   ", 'R',
							ItemList.foolStaria });
			
			// Popping Chest, Fool Staria
			GameRegistry.addRecipe(
					new ItemStack(ItemList.foolStariaChestPlate, 1),
					new Object[] { "R R", "RRR", "RRR", 'R',
							ItemList.foolStaria });
			
			// Smooth Leggings, Fool Staria
			GameRegistry.addRecipe(
					new ItemStack(ItemList.foolStariaLeggings, 1),
					new Object[] { "RRR", "R R", "R R", 'R',
							ItemList.foolStaria });
			
			// Dem bootys, Fool Staria
			GameRegistry.addRecipe(new ItemStack(ItemList.foolStariaBoots, 1),
					new Object[] { "   ", "R R", "R R", 'R',
							ItemList.foolStaria });
		}
	}
}