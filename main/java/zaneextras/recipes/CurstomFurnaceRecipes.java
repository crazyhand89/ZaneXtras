package zaneextras.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zaneextras.blocks.BlockList;
import zaneextras.items.ItemList;

public class CurstomFurnaceRecipes {

	private static final CurstomFurnaceRecipes SMELTING_BASE = new CurstomFurnaceRecipes();

	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();

	public static CurstomFurnaceRecipes smelting() {
		return SMELTING_BASE;
	}
	
	private CurstomFurnaceRecipes(){
		this.addRecipie(Item.getItemFromBlock(BlockList.raditeOre), new ItemStack(ItemList.raditeIngot), 1.0F);
		this.addRecipie(ItemList.raditeDust, new ItemStack(ItemList.raditeIngot), 1.0F);
		this.addRecipie(Item.getItemFromBlock(BlockList.zogiteOre), new ItemStack(ItemList.zogiteIngot), 1.0F);
		this.addRecipie(ItemList.zogiteDust, new ItemStack(ItemList.zogiteIngot), 1.0F);
		this.addRecipie(Item.getItemFromBlock(BlockList.lightCobbleStone), new ItemStack(Item.getItemFromBlock(BlockList.lightStone)), 1.0F);
		this.addRecipie(Item.getItemFromBlock(BlockList.lightDiamondOre), new ItemStack(Items.diamond, 4), 2.0F);
		this.addRecipie(Item.getItemFromBlock(BlockList.lightLapisOre), new ItemStack(Items.dye, 8, 4), 1.0F);
		this.addRecipie(Item.getItemFromBlock(BlockList.lightRedstoneOre), new ItemStack(Items.redstone, 8), 1.0F);
		this.addRecipie(Item.getItemFromBlock(BlockList.lightEmeraldOre), new ItemStack(Items.emerald, 4), 2.0F);
		this.addRecipie(Item.getItemFromBlock(BlockList.lightGoldOre), new ItemStack(Items.gold_ingot, 4), 1.0F);
		this.addRecipie(Item.getItemFromBlock(BlockList.lightIronOre), new ItemStack(Items.iron_ingot, 8), 1.0F);
		this.addRecipie(Item.getItemFromBlock(BlockList.skyiumOre), new ItemStack(ItemList.skyium), 1.0F);
		this.addRecipie(ItemList.skyiumDust, new ItemStack(ItemList.skyium), 1.0F);
	}
	
	public void addRecipie(Item item, ItemStack itemstack, float experience){
		this.addLists(item, itemstack, experience);
	}
	
	public void addLists(Item item, ItemStack itemstack, float experience){
		this.putLists(new ItemStack(item, 1, 32767), itemstack, experience);
	}
	
	public void putLists(ItemStack itemstack, ItemStack itemstack2, float experience){
		this.smeltingList.put(itemstack, itemstack2);
		this.experienceList.put(itemstack2, Float.valueOf(experience));
	}

	public ItemStack getSmeltingResult(ItemStack itemstack) {
		Iterator iterator = this.smeltingList.entrySet().iterator();
		Entry entry;

		do {
			if (!iterator.hasNext()) {
				return null;
			}
			entry = (Entry) iterator.next();
		} while (!canBeSmelted(itemstack, (ItemStack) entry.getKey()));
		return (ItemStack) entry.getValue();
	}

	private boolean canBeSmelted(ItemStack itemstack, ItemStack itemstack2) {
		return itemstack2.getItem() == itemstack.getItem() && (itemstack2.getItemDamage() == 32767 || itemstack2.getItemDamage() == itemstack.getItemDamage());
	}
	
	public float giveExperience(ItemStack itemstack){
		Iterator iterator = this.experienceList.entrySet().iterator();
		Entry entry;
		
		do{
			if(!iterator.hasNext()){
				return 0.0f;
			}
			
			entry = (Entry) iterator.next();
		}
		while(!this.canBeSmelted(itemstack, (ItemStack) entry.getKey()));
		
		if(itemstack.getItem().getSmeltingExperience(itemstack) != -1){
				return itemstack.getItem().getSmeltingExperience(itemstack);
		}
		
		return ((Float) entry.getValue()).floatValue();
	}
}