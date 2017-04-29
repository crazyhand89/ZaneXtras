package zaneextras.achievments.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zaneextras.achievments.ZaneAchievments;
import zaneextras.blocks.BlockList;
import zaneextras.config.ZaneConfig;
import zaneextras.items.ItemList;

public class AchievmentHandler {
	
	boolean stariaChest;
	boolean stariaHelmet;
	boolean stariaLeggings;
	boolean stariaBoots;
	
	boolean zaniumChest;
	boolean zaniumHelmet;
	boolean zaniumLeggings;
	boolean zaniumBoots;
	
	/**
	 * This method is used to check for when the player picks up an item and see
	 * if it is an item among our achievements. If so it awards them with the
	 * appropriate Achievement. Unknown what the 1 is for, but needed to work.
	 */
	@SubscribeEvent
	public void notifyPickup(PlayerEvent.ItemPickupEvent e) {
		
		if (e.pickedUp.getEntityItem().isItemEqual(
				new ItemStack(Item.getItemFromBlock(BlockList.dhbOre)))) {
			e.player.addStat(ZaneAchievments.butterOreAch, 1);
		} else if (e.pickedUp.getEntityItem()
				.isItemEqual(new ItemStack(ItemList.skyium))) {
			e.player.addStat(ZaneAchievments.skyiumOreAch, 1);
		} else if (e.pickedUp.getEntityItem()
				.isItemEqual(new ItemStack(ItemList.lightBone))) {
			e.player.addStat(ZaneAchievments.killLightSkeletonAch, 1);
		} else if (e.pickedUp.getEntityItem()
				.isItemEqual(new ItemStack(ItemList.lightFlesh))) {
			e.player.addStat(ZaneAchievments.killLightZombieAch, 1);
		} else if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(
				Item.getItemFromBlock(BlockList.lightDiamondOre)))) {
			e.player.addStat(ZaneAchievments.lightOreAch, 1);
		} else if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(
				Item.getItemFromBlock(BlockList.lightEmeraldOre)))) {
			e.player.addStat(ZaneAchievments.lightOreAch, 1);
		} else if (e.pickedUp.getEntityItem().isItemEqual(
				new ItemStack(Item.getItemFromBlock(BlockList.lightGoldOre)))) {
			e.player.addStat(ZaneAchievments.lightOreAch, 1);
		} else if (e.pickedUp.getEntityItem().isItemEqual(
				new ItemStack(Item.getItemFromBlock(BlockList.lightIronOre)))) {
			e.player.addStat(ZaneAchievments.lightOreAch, 1);
		} else if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(
				Item.getItemFromBlock(BlockList.lightLapisOre)))) {
			e.player.addStat(ZaneAchievments.lightOreAch, 1);
		} else if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(
				Item.getItemFromBlock(BlockList.lightRedstoneOre)))) {
			e.player.addStat(ZaneAchievments.lightOreAch, 1);
		} else if (e.pickedUp.getEntityItem()
				.isItemEqual(new ItemStack(ItemList.staria))) {
			e.player.addStat(ZaneAchievments.stariaOreAch, 1);
		} else if (e.pickedUp.getEntityItem()
				.isItemEqual(new ItemStack(ItemList.zanium))) {
			e.player.addStat(ZaneAchievments.zaniumOreAch, 1);
		} else if (e.pickedUp.getEntityItem()
				.isItemEqual(new ItemStack(ItemList.sodium))) {
			e.player.addStat(ZaneAchievments.sodiumOreAch, 1);
		} else if (e.pickedUp.getEntityItem().isItemEqual(
				new ItemStack(Item.getItemFromBlock(BlockList.raditeOre)))) {
			e.player.addStat(ZaneAchievments.raditeOreAch, 1);
		} else if (e.pickedUp.getEntityItem().isItemEqual(
				new ItemStack(Item.getItemFromBlock(BlockList.zogiteOre)))) {
			e.player.addStat(ZaneAchievments.zogiteOreAch, 1);
		} else if (e.pickedUp.getEntityItem()
				.isItemEqual(new ItemStack(ItemList.skeleBow))) {
			e.player.addStat(ZaneAchievments.killSkeletonKingAch, 1);
		}
	}
	
	/**
	 * This method is used to check for when the player crafts an item and see
	 * if it is an item among our achievements. If so it awards them with the
	 * appropriate Achievement. Unknown what the 1 is for, but needed to work.
	 */
	@SubscribeEvent
	public void onCrafting(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(ItemList.zograditeScythe)) {
			e.player.addStat(ZaneAchievments.zograditeScytheAch, 1);
		} else if (e.crafting.getItem().equals(ItemList.salad)) {
			e.player.addStat(ZaneAchievments.saladAch, 1);
		} else if (e.crafting.getItem().equals(ItemList.frenchSalad)) {
			e.player.addStat(ZaneAchievments.dressedFSaladAch, 1);
		} else if (e.crafting.getItem().equals(ItemList.ranchSalad)) {
			e.player.addStat(ZaneAchievments.dressedRSaladAch, 1);
		} else if (e.crafting.getItem().equals(ItemList.italianSalad)) {
			e.player.addStat(ZaneAchievments.dressedISaladAch, 1);
		} else if (e.crafting.getItem().equals(ItemList.butterSword)) {
			e.player.addStat(ZaneAchievments.butterSwordAch, 1);
		} else if (e.crafting.getItem().equals(ItemList.stariaBoots)) {
			stariaBoots = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ItemList.stariaHelmet)) {
			stariaHelmet = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ItemList.stariaChestPlate)) {
			stariaChest = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ItemList.stariaLeggings)) {
			stariaLeggings = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ItemList.zaniumBoots)) {
			zaniumBoots = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ItemList.zaniumHelmet)) {
			zaniumHelmet = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ItemList.zaniumChestPlate)) {
			zaniumChest = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ItemList.zaniumLeggings)) {
			zaniumLeggings = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ItemList.stariaSword)) {
			e.player.addStat(ZaneAchievments.stariaSwordAch, 1);
		} else if (e.crafting.getItem().equals(ItemList.zaniumSword)) {
			e.player.addStat(ZaneAchievments.zaniumSwordAch, 1);
		}
	}
	
	/**
	 * This method is used to check for when the player picks up an item from a
	 * furnace and see if it is an item among our achievements. If so it awards
	 * them with the appropriate Achievement. Unknown what the 1 is for, but
	 * needed to work.
	 */
	@SubscribeEvent
	public void onSmelting(PlayerEvent.ItemSmeltedEvent e) {
		if (e.smelting.getItem().equals(ItemList.butterItem)) {
			e.player.addStat(ZaneAchievments.butterIngotAch, 1);
		} else if (e.smelting.getItem().equals(ItemList.zogiteIngot)) {
			e.player.addStat(ZaneAchievments.zogiteIngotAch, 1);
		} else if (e.smelting.getItem().equals(ItemList.raditeIngot)) {
			e.player.addStat(ZaneAchievments.raditeIngotAch, 1);
		}
	}
	
	/**
	 * This method is used to check for when the player travels to a dimension.
	 * If it is one of the dimensions listed than award the appropriate
	 * achievement. Unknown what the 1 is for, but needed to work.
	 */
	@SubscribeEvent
	public void onDimensionChange(PlayerEvent.PlayerChangedDimensionEvent e) {
		if (e.toDim == ZaneConfig.dimensionLightID)
			e.player.addStat(ZaneAchievments.lightDimAch, 1);
	}
	
	private void triggerArmorAchievement(ItemCraftedEvent event) {
		if (stariaHelmet && stariaLeggings && stariaBoots && stariaChest) {
			event.player.addStat(ZaneAchievments.stariaArmorAch, 1);
		}
		if (zaniumHelmet && zaniumLeggings && zaniumBoots && zaniumChest) {
			event.player.addStat(ZaneAchievments.zaniumArmorAch, 1);
		}
	}
}
