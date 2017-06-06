package zaneextras.lib.treasure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.oredict.OreDictionary;
import zaneextras.items.ItemList;

public class ZaneChestGenHooks extends ChestGenHooks {
	public static final String ZANE_TOWER_TRAINING = "zaneTowerTraining";
	public static final String ZANE_TOWER_TREASURE = "zaneTowerTreasure";
	public static final String ZANE_TOWER_MAGIC = "zaneTowerMagic";
	public static final String ZANE_SKELETON_KING = "zaneSkeletonKing";
	public static final String ZANE_FORTRESS_TRAINING = "zaneFortressTraining";
	public static final String ZANE_FORTRESS_CHURCH = "zaneFortressChurch";
	public static final String ZANE_FORTRESS_JAIL = "zaneFortressJail";
	public static final String ZANE_FORTRESS_MAGIC = "zaneFortressMagic";
	public static final String ZANE_FORTRESS_POTION = "zaneFortressPotion";
	public static final String ZANE_FORTRESS_TREASURE = "zaneFortressTreasure";
	public static final String ZANE_FORTRESS_ARCHERY = "zaneFortressArchery";
	public static final String ZANE_ARCH_URIEL = "zaneArchUriel";
	
	public static final WeightedRandomChestContent[] ZTTChestContents = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(new ItemStack(ItemList.skyium), 3, 5,
					10),
			new WeightedRandomChestContent(new ItemStack(ItemList.enderBow), 1,
					1, 20),
			new WeightedRandomChestContent(new ItemStack(ItemList.emeraldBow),
					1, 1, 20),
			new WeightedRandomChestContent(new ItemStack(ItemList.butterPotato),
					4, 5, 90),
			new WeightedRandomChestContent(new ItemStack(ItemList.goldenArrow),
					4, 5, 90),
			new WeightedRandomChestContent(new ItemStack(ItemList.emeraldArrow),
					4, 5, 90),
			new WeightedRandomChestContent(new ItemStack(ItemList.enderArrow),
					4, 5, 90), };
	
	public static final WeightedRandomChestContent[] ZTTrChestContents = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(new ItemStack(ItemList.skyium), 3, 5,
					90),
			new WeightedRandomChestContent(new ItemStack(ItemList.staria), 1, 2,
					5),
			new WeightedRandomChestContent(new ItemStack(ItemList.zanium), 1, 2,
					5),
			new WeightedRandomChestContent(new ItemStack(ItemList.butterItem),
					4, 5, 95),
			new WeightedRandomChestContent(new ItemStack(ItemList.goldenArrow),
					4, 5, 80),
			new WeightedRandomChestContent(new ItemStack(ItemList.emeraldArrow),
					4, 5, 80),
			new WeightedRandomChestContent(new ItemStack(ItemList.enderArrow),
					4, 5, 80),
			new WeightedRandomChestContent(new ItemStack(ItemList.skyiumDust),
					3, 5, 90),
			new WeightedRandomChestContent(new ItemStack(ItemList.sodium), 4, 8,
					90),
			new WeightedRandomChestContent(new ItemStack(ItemList.italianSalad),
					1, 1, 20),
			new WeightedRandomChestContent(new ItemStack(ItemList.ranchSalad),
					1, 1, 20),
			new WeightedRandomChestContent(new ItemStack(ItemList.frenchSalad),
					1, 1, 20)
	
	};
	
	public static final WeightedRandomChestContent[] ZTMChestContents = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(
					new ItemStack(ItemList.redGlowStoneDust), 4, 8, 100),
			new WeightedRandomChestContent(new ItemStack(ItemList.skyiumDust),
					1, 2, 5),
			new WeightedRandomChestContent(new ItemStack(Items.glowstone_dust),
					4, 8, 100),
			new WeightedRandomChestContent(new ItemStack(ItemList.italianSalad),
					1, 1, 80),
			new WeightedRandomChestContent(new ItemStack(ItemList.ranchSalad),
					1, 1, 80),
			new WeightedRandomChestContent(new ItemStack(ItemList.frenchSalad),
					1, 1, 80),
			new WeightedRandomChestContent(new ItemStack(ItemList.sodium), 4, 6,
					40),
			new WeightedRandomChestContent(new ItemStack(ItemList.glowStick), 2,
					4, 20),
			new WeightedRandomChestContent(new ItemStack(ItemList.french), 1, 1,
					20),
			new WeightedRandomChestContent(new ItemStack(ItemList.italian), 1,
					1, 20),
			new WeightedRandomChestContent(new ItemStack(ItemList.ranch), 1, 1,
					20)
	
	};
	
	public static final WeightedRandomChestContent[] ZBossDrops = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(new ItemStack(ItemList.skeleBow), 1,
					1, 100),
			new WeightedRandomChestContent(new ItemStack(ItemList.staria), 1, 3,
					15),
			new WeightedRandomChestContent(new ItemStack(ItemList.zanium), 1, 3,
					15) };
	
	public static final WeightedRandomChestContent[] ZAFAChestContents = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(new ItemStack(ItemList.pureFeather),
					1, 2, 15),
			new WeightedRandomChestContent(new ItemStack(ItemList.angelBow), 1,
					1, 20),
			new WeightedRandomChestContent(new ItemStack(ItemList.barrierApple),
					1, 2, 5),
			new WeightedRandomChestContent(new ItemStack(ItemList.angelArrow),
					4, 8, 90) };
	
	public static final WeightedRandomChestContent[] ZAFTChestContents = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(new ItemStack(ItemList.pureFeather),
					1, 2, 15),
			new WeightedRandomChestContent(new ItemStack(ItemList.angelSword),
					1, 1, 20),
			new WeightedRandomChestContent(new ItemStack(ItemList.barrierApple),
					1, 2, 5) };
	
	public static final WeightedRandomChestContent[] ZAFTrChestContents = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(new ItemStack(ItemList.barrierApple),
					1, 2, 15),
			new WeightedRandomChestContent(new ItemStack(ItemList.angelSword),
					1, 1, 15),
			new WeightedRandomChestContent(new ItemStack(ItemList.angelKey), 1,
					1, 2),
			new WeightedRandomChestContent(new ItemStack(ItemList.angelArrow),
					4, 8, 80),
			new WeightedRandomChestContent(new ItemStack(ItemList.angelBow), 1,
					1, 15),
			new WeightedRandomChestContent(new ItemStack(ItemList.staria), 1, 3,
					10),
			new WeightedRandomChestContent(
					new ItemStack(ItemList.empoweredStaria), 1, 1, 5),
			new WeightedRandomChestContent(new ItemStack(ItemList.pureFeather),
					1, 2, 10),
			new WeightedRandomChestContent(new ItemStack(ItemList.angelHalo), 1,
					2, 5), };
	
	public static final WeightedRandomChestContent[] ZAFJChestContents = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(new ItemStack(Items.potato), 3, 6,
					50),
			new WeightedRandomChestContent(new ItemStack(Items.carrot), 3, 6,
					50),
			new WeightedRandomChestContent(new ItemStack(ItemList.barrierApple),
					1, 1, 1),
			new WeightedRandomChestContent(new ItemStack(ItemList.ranchSalad),
					1, 1, 1),
			new WeightedRandomChestContent(new ItemStack(ItemList.frenchSalad),
					1, 1, 1),
			new WeightedRandomChestContent(new ItemStack(ItemList.italianSalad),
					1, 1, 1) };
	
	public static final WeightedRandomChestContent[] ZAFCChestContents = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(new ItemStack(ItemList.angelHalo), 1,
					1, 10),
			new WeightedRandomChestContent(new ItemStack(ItemList.pureFeather),
					1, 2, 25),
			new WeightedRandomChestContent(new ItemStack(ItemList.staria), 1, 2,
					5),
			new WeightedRandomChestContent(
					new ItemStack(ItemList.empoweredStaria), 1, 1, 3),
			new WeightedRandomChestContent(new ItemStack(ItemList.lightBone), 1,
					3, 75) };
	
	public static final WeightedRandomChestContent[] ZAFPChestContents = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(new ItemStack(ItemList.pureFeather),
					1, 1, 10),
			new WeightedRandomChestContent(new ItemStack(ItemList.ranch), 1, 1,
					10),
			new WeightedRandomChestContent(new ItemStack(Items.glowstone_dust),
					1, 4, 10),
			new WeightedRandomChestContent(new ItemStack(ItemList.french), 1, 1,
					10),
			new WeightedRandomChestContent(new ItemStack(ItemList.italian), 1,
					1, 10) };
	
	public static final WeightedRandomChestContent[] ZAFMChestContents = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(new ItemStack(ItemList.pureFeather),
					1, 1, 10),
			new WeightedRandomChestContent(new ItemStack(ItemList.angelHalo), 1,
					1, 10),
			new WeightedRandomChestContent(new ItemStack(Items.ender_eye), 1, 4,
					5),
			new WeightedRandomChestContent(
					new ItemStack(Items.experience_bottle), 32, 64, 100),
			new WeightedRandomChestContent(new ItemStack(Items.nether_star), 1,
					1, 10) };
	
	public static final WeightedRandomChestContent[] ZAFUriel = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(new ItemStack(ItemList.urielSword),
					1, 1, 100),
			new WeightedRandomChestContent(
					new ItemStack(ItemList.empoweredStaria), 2, 5, 10) };
	
	private static final HashMap<String, ZaneChestGenHooks> chestInfo = new HashMap<String, ZaneChestGenHooks>();
	
	private static boolean hasInit = false;
	
	public static ZaneChestGenHooks getSkeletonInstance() {
		return ZaneChestGenHooks.getInfo(ZANE_SKELETON_KING);
	}
	
	public static ZaneChestGenHooks getUrielInstance() {
		return ZaneChestGenHooks.getInfo(ZANE_ARCH_URIEL);
	}
	
	public static ZaneChestGenHooks getFortressMagic() {
		return ZaneChestGenHooks.getInfo(ZANE_FORTRESS_MAGIC);
	}
	
	public static ZaneChestGenHooks getFortressJail() {
		return ZaneChestGenHooks.getInfo(ZANE_FORTRESS_JAIL);
	}
	
	static {
		init();
	}
	
	public static void init() {
		if (hasInit) {
			return;
		}
		
		hasInit = true;
		
		// Skeleton Castle
		addInfo(ZANE_TOWER_TRAINING, ZTTChestContents, 6, 7);
		addInfo(ZANE_TOWER_TREASURE, ZTTrChestContents, 9, 12);
		addInfo(ZANE_TOWER_MAGIC, ZTMChestContents, 6, 11);
		addInfo(ZANE_SKELETON_KING, ZBossDrops, 2, 2);
		
		// Angel Fortress
		addInfo(ZANE_FORTRESS_POTION, ZAFPChestContents, 3, 5);
		addInfo(ZANE_FORTRESS_MAGIC, ZAFMChestContents, 3, 5);
		addInfo(ZANE_FORTRESS_CHURCH, ZAFCChestContents, 3, 5);
		addInfo(ZANE_FORTRESS_ARCHERY, ZAFAChestContents, 2, 5);
		addInfo(ZANE_FORTRESS_TRAINING, ZAFTChestContents, 2, 5);
		addInfo(ZANE_FORTRESS_TREASURE, ZAFTrChestContents, 3, 10);
		addInfo(ZANE_FORTRESS_JAIL, ZAFJChestContents, 3, 7);
		addInfo(ZANE_ARCH_URIEL, ZAFUriel, 1, 2);
		
		ItemStack skeleBow = new ItemStack(ItemList.skeleBow, 1);
		skeleBow.addEnchantment(Enchantment.flame, 1);
		skeleBow.addEnchantment(Enchantment.power, 3);
		skeleBow.addEnchantment(Enchantment.punch, 3);
		skeleBow.addEnchantment(Enchantment.infinity, 1);
	}
	
	static void addDungeonLoot(ZaneChestGenHooks dungeon, ItemStack item,
			int weight, int min, int max) {
		dungeon.addItem(new WeightedRandomChestContent(item, min, max, weight));
	}
	
	private static void addInfo(String category,
			WeightedRandomChestContent[] items, int min, int max) {
		chestInfo.put(category,
				new ZaneChestGenHooks(category, items, min, max));
	}
	
	/**
	 * Retrieves, or creates the info class for the specified category.
	 *
	 * @param category
	 *            The category name
	 * @return A instance of ChestGenHooks for the specified category.
	 */
	public static ZaneChestGenHooks getInfo(String category) {
		if (!chestInfo.containsKey(category)) {
			chestInfo.put(category, new ZaneChestGenHooks(category));
		}
		return chestInfo.get(category);
	}
	
	/**
	 * Generates an array of items based on the input min/max count. If the
	 * stack can not hold the total amount, it will be split into stacks of size
	 * 1.
	 *
	 * @param rand
	 *            A random number generator
	 * @param source
	 *            Source item stack
	 * @param min
	 *            Minimum number of items
	 * @param max
	 *            Maximum number of items
	 * @return An array containing the generated item stacks
	 */
	public static ItemStack[] generateStacks(Random rand, ItemStack source,
			int min, int max) {
		int count = min + rand.nextInt(max - min + 1);
		
		ItemStack[] ret;
		if (source.getItem() == null) {
			ret = new ItemStack[0];
		} else if (count > source.getMaxStackSize()) {
			ret = new ItemStack[count];
			for (int x = 0; x < count; x++) {
				ret[x] = source.copy();
				ret[x].stackSize = 1;
			}
		} else {
			ret = new ItemStack[1];
			ret[0] = source.copy();
			ret[0].stackSize = count;
		}
		return ret;
	}
	
	// shortcut functions, See the non-static versions below
	public static WeightedRandomChestContent[] getItems(String category,
			Random rnd) {
		return getInfo(category).getItems(rnd);
	}
	
	public static int getCount(String category, Random rand) {
		return getInfo(category).getCount(rand);
	}
	
	public static void addItem(String category,
			WeightedRandomChestContent item) {
		getInfo(category).addItem(item);
	}
	
	public static void removeItem(String category, ItemStack item) {
		getInfo(category).removeItem(item);
	}
	
	public static ItemStack getOneItem(String category, Random rand) {
		return getInfo(category).getOneItem(rand);
	}
	
	private String category;
	private int countMin = 0;
	private int countMax = 0;
	
	ArrayList<WeightedRandomChestContent> contents = new ArrayList<WeightedRandomChestContent>();
	
	public ZaneChestGenHooks(String category) {
		super(category);
		this.category = category;
	}
	
	public ZaneChestGenHooks(String category,
			WeightedRandomChestContent[] items, int min, int max) {
		this(category);
		for (WeightedRandomChestContent item : items) {
			contents.add(item);
		}
		countMin = min;
		countMax = max;
	}
	
	/**
	 * Adds a new entry into the possible items to generate.
	 *
	 * @param item
	 *            The item to add.
	 */
	@Override
	public void addItem(WeightedRandomChestContent item) {
		contents.add(item);
	}
	
	/**
	 * Removes all items that match the input item stack, Only metadata and item
	 * ID are checked. If the input item has a metadata of -1, all metadatas
	 * will match.
	 *
	 * @param item
	 *            The item to check
	 */
	@Override
	public void removeItem(ItemStack item) {
		Iterator<WeightedRandomChestContent> itr = contents.iterator();
		while (itr.hasNext()) {
			WeightedRandomChestContent cont = itr.next();
			if (item.isItemEqual(cont.theItemId)
					|| item.getItemDamage() == OreDictionary.WILDCARD_VALUE
							&& item == cont.theItemId) {
				itr.remove();
			}
		}
	}
	
	/**
	 * Gets an array of all random objects that are associated with this
	 * category.
	 *
	 * @return The random objects
	 */
	@Override
	public WeightedRandomChestContent[] getItems(Random rnd) {
		ArrayList<WeightedRandomChestContent> ret = new ArrayList<WeightedRandomChestContent>();
		
		for (WeightedRandomChestContent orig : contents) {
			Item item = orig.theItemId.getItem();
			
			if (item != null) {
				WeightedRandomChestContent n = item.getChestGenBase(this, rnd,
						orig);
				if (n != null) {
					ret.add(n);
				}
			}
		}
		
		return ret.toArray(new WeightedRandomChestContent[ret.size()]);
	}
	
	/**
	 * Gets a random number between countMin and countMax.
	 *
	 * @param rand
	 *            A RNG
	 * @return A random number where countMin <= num <= countMax
	 */
	@Override
	public int getCount(Random rand) {
		return countMin < countMax
				? countMin + rand.nextInt(countMax - countMin) : countMin;
	}
	
	/**
	 * Returns a single ItemStack from the possible items in this registry,
	 * Useful if you just want a quick and dirty random Item.
	 *
	 * @param rand
	 *            A Random Number gen
	 * @return A single ItemStack, or null if it could not get one.
	 */
	@Override
	public ItemStack getOneItem(Random rand) {
		WeightedRandomChestContent[] items = getItems(rand);
		WeightedRandomChestContent item = (WeightedRandomChestContent) WeightedRandom
				.getRandomItem(rand, items);
		ItemStack[] stacks = ZaneChestGenHooks.generateStacks(rand,
				item.theItemId, item.theMinimumChanceToGenerateItem,
				item.theMaximumChanceToGenerateItem);
		return stacks.length > 0 ? stacks[0] : null;
	}
	
	@Override
	public int getMin() {
		return countMin;
	}
	
	@Override
	public int getMax() {
		return countMax;
	}
	
	@Override
	public void setMin(int value) {
		countMin = value;
	}
	
	@Override
	public void setMax(int value) {
		countMax = value;
	}
}