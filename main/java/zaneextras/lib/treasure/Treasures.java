package zaneextras.lib.treasure;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;
import zaneextras.items.ItemList;

public final class Treasures {
	
	public static ArrayList<String> chestTypes = new ArrayList<String>();
	public static final WeightedRandomChestContent[] CTChestContents = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(Items.iron_ingot, 2, 1, 5, 10),
			new WeightedRandomChestContent(Items.gold_ingot, 4, 1, 5, 10) };
	
	public static void init() {
		ZaneChestGenHooks.init();
		addChestTypes();
		ItemStack skeleBow = new ItemStack(ItemList.skeleBow, 1);
		skeleBow.addEnchantment(Enchantment.flame, 1);
		skeleBow.addEnchantment(Enchantment.power, 3);
		skeleBow.addEnchantment(Enchantment.punch, 3);
		skeleBow.addEnchantment(Enchantment.infinity, 1);
		ZaneChestGenHooks.addDungeonLoot(
				ZaneChestGenHooks.getSkeletonInstance(), skeleBow, 5, 1, 1);
	}
	
	private static void addItems() {
		for (WeightedRandomChestContent chestContent : CTChestContents) {
			addChestItem(chestContent);
		}
	}
	
	private static void addChestItem(WeightedRandomChestContent item) {
		int i;
		for (i = 0; i < chestTypes.size(); i++) {
			ChestGenHooks.addItem(chestTypes.get(i), item);
		}
	}
	
	public static void addChest(int i, int j, int k, Random rand, World world,
			String chestType) {
		int chestX = i;
		int chestY = j;
		int chestZ = k;
		boolean isBigChest = rand.nextInt(4) == 1 ? true : false;
		spawnChest(world, rand, chestX, chestY, chestZ, isBigChest, chestType);
	}
	
	public static void spawnChest(World world, Random rand, int i, int j, int k,
			boolean isBigChest, String chestType) {
		world.setBlock(i, j, k, Blocks.chest);
		if (isBigChest) {
			world.setBlock(i + 1, j, k, Blocks.chest);
		}
		TileEntityChest tileentitychest = (TileEntityChest) world
				.getTileEntity(i, j, k);
		if (tileentitychest != null) {
			ZaneChestGenHooks info = ZaneChestGenHooks.getInfo(chestType);
			WeightedRandomChestContent.generateChestContents(rand,
					info.getItems(rand), tileentitychest, info.getCount(rand));
		}
	}
	
	public static void addChestTypes() {
		chestTypes.add(ZaneChestGenHooks.ZANE_TOWER_TRAINING);
		chestTypes.add(ZaneChestGenHooks.ZANE_TOWER_TREASURE);
		chestTypes.add(ZaneChestGenHooks.ZANE_TOWER_MAGIC);
		chestTypes.add(ZaneChestGenHooks.ZANE_SKELETON_KING);
	}
	
	public static String pickChestType() {
		return chestTypes.get(new Random().nextInt(chestTypes.size()));
		
	}
}