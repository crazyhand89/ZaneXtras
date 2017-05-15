package zaneextras.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zaneextras.items.ItemList;

public class ToolRecipes {
	
	public static void init() {
		StariaToolCraftingRecipes.init();
		ZaniumToolCraftingRecipes.init();
		ButterToolCraftingRecipes.init();
		EmeraldToolCraftingRecipes.init();
		SkyiumToolCraftingRecipes.init();
		FoolStariaToolCraftingRecipes.init();
	}
	
	public static class StariaToolCraftingRecipes {
		
		public static void init() {
			
			// Dat hoe, Staria
			ItemStack stariaHoe = new ItemStack(ItemList.stariaHoe, 1);
			stariaHoe.addEnchantment(Enchantment.baneOfArthropods, 3);
			stariaHoe.addEnchantment(Enchantment.unbreaking, 3);
			
			GameRegistry.addRecipe(stariaHoe, new Object[] { "SSS", " G ",
					"G  ", 'S', ItemList.staria, 'G', ItemList.glowStick });
			
			// Axey Axe, Staria
			ItemStack stariaAxe = new ItemStack(ItemList.stariaAxe, 1);
			stariaAxe.addEnchantment(Enchantment.knockback, 3);
			stariaAxe.addEnchantment(Enchantment.efficiency, 3);
			stariaAxe.addEnchantment(Enchantment.unbreaking, 3);
			
			GameRegistry.addRecipe(stariaAxe, new Object[] { "SS ", "SG ",
					"SG ", 'S', ItemList.staria, 'G', ItemList.glowStick });
			
			// Harden Pick, Staria
			ItemStack stariaPickaxe = new ItemStack(ItemList.stariaPickaxe, 1);
			stariaPickaxe.addEnchantment(Enchantment.fortune, 3);
			stariaPickaxe.addEnchantment(Enchantment.efficiency, 5);
			stariaPickaxe.addEnchantment(Enchantment.unbreaking, 3);
			
			GameRegistry.addRecipe(stariaPickaxe, new Object[] { "SSS", "SGS",
					" G ", 'S', ItemList.staria, 'G', ItemList.glowStick });
			
			// Slippery Spade, Staria
			ItemStack stariaShovel = new ItemStack(ItemList.stariaShovel, 1);
			stariaShovel.addEnchantment(Enchantment.smite, 3);
			stariaShovel.addEnchantment(Enchantment.efficiency, 3);
			stariaShovel.addEnchantment(Enchantment.unbreaking, 3);
			
			GameRegistry.addRecipe(stariaShovel, new Object[] { " S ", "SGS",
					" G ", 'S', ItemList.staria, 'G', ItemList.glowStick });
			
		}
	}
	
	public static class ZaniumToolCraftingRecipes {
		
		public static void init() {
			// Dat hoe, Zanium
			ItemStack zaniumHoe = new ItemStack(ItemList.zaniumHoe, 1);
			zaniumHoe.addEnchantment(Enchantment.smite, 3);
			zaniumHoe.addEnchantment(Enchantment.fireAspect, 1);
			
			GameRegistry.addRecipe(zaniumHoe, new Object[] { "ZZZ", " N ",
					"N  ", 'Z', ItemList.zanium, 'N', ItemList.netherStick });
			
			// Axey Axe, Zanium
			ItemStack zaniumAxe = new ItemStack(ItemList.zaniumAxe, 1);
			zaniumAxe.addEnchantment(Enchantment.knockback, 3);
			zaniumAxe.addEnchantment(Enchantment.fireAspect, 1);
			zaniumAxe.addEnchantment(Enchantment.efficiency, 3);
			
			GameRegistry.addRecipe(zaniumAxe, new Object[] { "ZZ ", "ZN ",
					"ZN ", 'Z', ItemList.zanium, 'N', ItemList.netherStick });
			
			// Harden Pick, Zanium
			ItemStack zaniumPickaxe = new ItemStack(ItemList.zaniumPickaxe, 1);
			zaniumPickaxe.addEnchantment(Enchantment.fortune, 3);
			zaniumPickaxe.addEnchantment(Enchantment.efficiency, 5);
			zaniumPickaxe.addEnchantment(Enchantment.fireAspect, 1);
			
			GameRegistry.addRecipe(zaniumPickaxe, new Object[] { "ZZZ", "ZNZ",
					" N ", 'Z', ItemList.zanium, 'N', ItemList.netherStick });
			
			// Slippery Spade, Zanium
			ItemStack zaniumShovel = new ItemStack(ItemList.zaniumShovel, 1);
			zaniumShovel.addEnchantment(Enchantment.baneOfArthropods, 3);
			zaniumShovel.addEnchantment(Enchantment.efficiency, 3);
			zaniumShovel.addEnchantment(Enchantment.fireAspect, 1);
			
			GameRegistry.addRecipe(zaniumShovel, new Object[] { " Z ", "ZNZ",
					" N ", 'Z', ItemList.zanium, 'N', ItemList.netherStick });
		}
	}
	
	public static class ButterToolCraftingRecipes {
		
		public static void init() {
			
			// Dat hoe, Butter
			addHoeRecipe(new ItemStack(ItemList.butterHoe, 1),
					ItemList.butterItem, Items.stick);
			
			// Axey Axe, Butter
			addAxeRecipe(new ItemStack(ItemList.butterAxe, 1),
					ItemList.butterItem, Items.stick);
			
			// Harden Pick, Butter
			GameRegistry.addRecipe(new ItemStack(ItemList.butterPickaxe, 1),
					new Object[] { "RRR", " S ", " S ", 'R',
							ItemList.butterItem, 'S', Items.stick });
			
			// Slippery Spade, Butter
			GameRegistry.addRecipe(new ItemStack(ItemList.butterShovel, 1),
					new Object[] { " R ", " S ", " S ", 'R',
							ItemList.butterItem, 'S', Items.stick });
		}
	}
	
	public static class EmeraldToolCraftingRecipes {
		
		public static void init() {
			// Dat hoe, Emerald
			ItemStack emeraldHoe = new ItemStack(ItemList.emeraldHoe, 1);
			emeraldHoe.addEnchantment(Enchantment.fireAspect, 1);
			
			addHoeRecipe(emeraldHoe, Items.emerald, Items.stick);
			
			// Axey Axe, Emerald
			ItemStack emeraldAxe = new ItemStack(ItemList.emeraldAxe, 1);
			emeraldAxe.addEnchantment(Enchantment.knockback, 2);
			
			addAxeRecipe(emeraldAxe, Items.emerald, Items.stick);
			
			// Harden Pick, Emerald
			ItemStack emeraldPickaxe = new ItemStack(ItemList.emeraldPickaxe,
					1);
			emeraldPickaxe.addEnchantment(Enchantment.fortune, 1);
			emeraldPickaxe.addEnchantment(Enchantment.efficiency, 1);
			
			GameRegistry.addRecipe(emeraldPickaxe, new Object[] { "EEE", " S ",
					" S ", 'E', Items.emerald, 'S', Items.stick });
			
			// Slippery Spade, Emerald
			ItemStack emeraldShovel = new ItemStack(ItemList.emeraldShovel, 1);
			emeraldShovel.addEnchantment(Enchantment.knockback, 1);
			
			GameRegistry.addRecipe(emeraldShovel, new Object[] { " E ", " S ",
					" S ", 'E', Items.emerald, 'S', Items.stick });
		}
	}
	
	public static class SkyiumToolCraftingRecipes {
		
		public static void init() {
			
			// Dat hoe, Skyium
			ItemStack skyiumHoe = new ItemStack(ItemList.skyiumHoe, 1);
			skyiumHoe.addEnchantment(Enchantment.looting, 1);
			skyiumHoe.addEnchantment(Enchantment.unbreaking, 1);
			
			addHoeRecipe(skyiumHoe, ItemList.skyium, ItemList.glowStick);
			
			// Axey Axe, Skyium
			ItemStack skyiumAxe = new ItemStack(ItemList.skyiumAxe, 1);
			skyiumAxe.addEnchantment(Enchantment.knockback, 2);
			skyiumAxe.addEnchantment(Enchantment.efficiency, 1);
			skyiumAxe.addEnchantment(Enchantment.unbreaking, 1);
			
			addHoeRecipe(skyiumAxe, ItemList.skyium, ItemList.glowStick);
			
			// Harden Pick, Skyium
			ItemStack skyiumPickaxe = new ItemStack(ItemList.skyiumPickaxe, 1);
			skyiumPickaxe.addEnchantment(Enchantment.fortune, 2);
			skyiumPickaxe.addEnchantment(Enchantment.efficiency, 2);
			skyiumPickaxe.addEnchantment(Enchantment.unbreaking, 1);
			
			GameRegistry.addRecipe(skyiumPickaxe, new Object[] { "EEE", " S ",
					" S ", 'E', ItemList.skyium, 'S', ItemList.glowStick });
			
			// Slippery Spade, Skyium
			ItemStack skyiumShovel = new ItemStack(ItemList.skyiumShovel, 1);
			skyiumShovel.addEnchantment(Enchantment.knockback, 2);
			skyiumShovel.addEnchantment(Enchantment.unbreaking, 1);
			
			GameRegistry.addRecipe(skyiumShovel, new Object[] { " E ", " S ",
					" S ", 'E', ItemList.skyium, 'S', ItemList.glowStick });
		}
	}
	
	public static class FoolStariaToolCraftingRecipes {
		
		public static void init() {
			
			// Dat hoe, Butter
			addHoeRecipe(new ItemStack(ItemList.foolStariaHoe, 1),
					ItemList.foolStaria, Items.stick);
			
			// Axey Axe, Butter
			addAxeRecipe(new ItemStack(ItemList.foolStariaAxe, 1),
					ItemList.foolStaria, Items.stick);
			
			// Harden Pick, Butter
			GameRegistry.addRecipe(new ItemStack(ItemList.foolStariaPickaxe, 1),
					new Object[] { "RRR", " S ", " S ", 'R',
							ItemList.foolStaria, 'S', Items.stick });
			
			// Slippery Spade, Butter
			GameRegistry.addRecipe(new ItemStack(ItemList.foolStariaShovel, 1),
					new Object[] { " R ", " S ", " S ", 'R',
							ItemList.foolStaria, 'S', Items.stick });
		}
	}
	
	public static void addHoeRecipe(ItemStack output, Item material,
			Item stickMaterial) {
		GameRegistry.addRecipe(output, new Object[] { "MM ", " S ", " S ", 'M',
				material, 'S', stickMaterial });
		GameRegistry.addRecipe(output, new Object[] { " MM", " S ", " S ", 'M',
				material, 'S', stickMaterial });
	}
	
	public static void addAxeRecipe(ItemStack output, Item material,
			Item stickMaterial) {
		GameRegistry.addRecipe(output, new Object[] { "MM ", "MS ", " S ", 'M',
				material, 'S', stickMaterial });
		GameRegistry.addRecipe(output, new Object[] { " MM", " SM", " S ", 'M',
				material, 'S', stickMaterial });
	}
}