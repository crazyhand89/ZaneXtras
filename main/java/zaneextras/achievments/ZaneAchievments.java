package zaneextras.achievments;

import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import zaneextras.blocks.BlockList;
import zaneextras.items.ItemList;

public class ZaneAchievments {
	
	public static Achievement butterOreAch;
	public static Achievement butterIngotAch;
	public static Achievement zograditeScytheAch;
	public static Achievement skyiumOreAch;
	public static Achievement stariaOreAch;
	public static Achievement zaniumOreAch;
	public static Achievement killSkeletonKingAch;
	public static Achievement raditeOreAch;
	public static Achievement zogiteOreAch;
	public static Achievement sodiumOreAch;
	public static Achievement lightOreAch;
	public static Achievement lightDimAch;
	public static Achievement saladAch;
	public static Achievement dressedRSaladAch;
	public static Achievement dressedFSaladAch;
	public static Achievement dressedISaladAch;
	public static Achievement killLightSkeletonAch;
	public static Achievement killLightZombieAch;
	public static Achievement raditeIngotAch;
	public static Achievement zogiteIngotAch;
	public static Achievement butterSwordAch;
	public static Achievement stariaSwordAch;
	public static Achievement stariaArmorAch;
	public static Achievement zaniumSwordAch;
	public static Achievement zaniumArmorAch;
	public static AchievementPage zaneModPage;
	
	/**
	 * init Method to add Achievements and a custom Achievement age for mod.
	 * <p>
	 * 1 - name of acvhievement, must start with achievement.name
	 * <p>
	 * 2 - name of achievement you give it (must be unique!)
	 * <p>
	 * 3 - 0,0 are the coordinates for achievement (Think x, y). Y is the height
	 * and cannot be lower than -7. X is the row. There is a limit but have not
	 * found all of them yet.
	 * <p>
	 * 4 - Picture to use for the achievement
	 * <p>
	 * 5 - Use either (Achievement) null for independent achievements or the
	 * name of the prerequisite Achievement
	 * <p>
	 * Page is always intialized last with the list of achievments to insert.
	 */
	public static void init() {
		
		// Butter related Achievements
		butterOreAch = new Achievement("achievement.butterore", "butterore", 0,
				0, Item.getItemFromBlock(BlockList.dhbOre), (Achievement) null)
						.initIndependentStat().registerStat();
		butterIngotAch = new Achievement("achievement.butteringot",
				"butteringot", 2, 0, ItemList.butterItem, butterOreAch)
						.registerStat();
		butterSwordAch = new Achievement("achievement.buttersword",
				"buttersword", 4, 0, ItemList.butterSword, butterIngotAch)
						.registerStat();
		
		// Light Dimension releated Achievements
		lightDimAch = new Achievement("achievement.lightdimension",
				"lightdimension", 6, -4, ItemList.lightEye, (Achievement) null)
						.setSpecial().registerStat();
		killLightSkeletonAch = new Achievement("achievement.killlightskeleton",
				"killlightskeleton", 8, -4, ItemList.lightBone, lightDimAch)
						.registerStat();
		killLightZombieAch = new Achievement("achievement.killlightzombie",
				"killlightzombie", 4, -4, ItemList.lightFlesh, lightDimAch)
						.registerStat();
		lightOreAch = new Achievement("achievement.lightore", "lightore", 6, -6,
				Item.getItemFromBlock(BlockList.lightEmeraldOre), lightDimAch)
						.registerStat();
		
		// Ore Achievements
		skyiumOreAch = new Achievement("achievement.skyiumore", "skyiumore", 0,
				2, ItemList.skyium, (Achievement) null).registerStat();
		sodiumOreAch = new Achievement("achievement.sodiumore", "sodiumore", 2,
				4, ItemList.sodium, (Achievement) null).registerStat();
		
		// Food related Achievements
		saladAch = new Achievement("achievement.salad", "salad", -4, 0,
				ItemList.salad, (Achievement) null).registerStat();
		dressedFSaladAch = new Achievement("achievement.dressedfsalad",
				"dressedfsalad", -4, 2, ItemList.frenchSalad, saladAch)
						.registerStat();
		dressedRSaladAch = new Achievement("achievement.dressedrsalad",
				"dressedrsalad", -6, 2, ItemList.ranchSalad, saladAch)
						.registerStat();
		dressedISaladAch = new Achievement("achievement.dressedisalad",
				"dressedisalad", -2, 2, ItemList.italianSalad, saladAch)
						.registerStat();
		
		// Radite releated Achievements
		raditeOreAch = new Achievement("achievement.raditeore", "raditeore", 2,
				-2, Item.getItemFromBlock(BlockList.raditeOre), butterOreAch)
						.registerStat();
		raditeIngotAch = new Achievement("achievement.raditeingot",
				"raditeingot", 2, -4, ItemList.raditeIngot, raditeOreAch)
						.registerStat();
		
		// Zogite ore and ingot Achievements
		zogiteOreAch = new Achievement("achievement.zogiteore", "zogiteore", -2,
				-2, Item.getItemFromBlock(BlockList.zogiteOre), butterOreAch)
						.registerStat();
		zogiteIngotAch = new Achievement("achievement.zogiteingot",
				"zogiteingot", -2, -4, ItemList.zogiteIngot, zogiteOreAch)
						.registerStat();
		
		// Weapon releated Achievements
		zograditeScytheAch = new Achievement("achievement.zograditescythe",
				"zograditescythe", 0, -4, ItemList.zograditeScythe,
				(Achievement) null).setSpecial().registerStat();
		
		// Boss releated Achievements
		killSkeletonKingAch = new Achievement("achievement.killskeletonking",
				"killskeletonking", 2, 2, ItemList.skeleBow, (Achievement) null)
						.setSpecial().registerStat();
		
		// Staria releated Achievements
		stariaOreAch = new Achievement("achievement.stariaore", "stariaore", -4,
				4, ItemList.staria, (Achievement) null).setSpecial()
						.registerStat();
		stariaArmorAch = new Achievement("achievement.stariaarmor",
				"stariaarmor", -6, 4, ItemList.stariaChestPlate, stariaOreAch)
						.setSpecial().registerStat();
		stariaSwordAch = new Achievement("achievement.stariasword",
				"stariasword", -2, 4, ItemList.stariaSword, stariaOreAch)
						.setSpecial().registerStat();
		
		// Zanium releated Achievements
		zaniumOreAch = new Achievement("achievement.zaniumore", "zaniumore", -4,
				6, ItemList.zanium, (Achievement) null).setSpecial()
						.registerStat();
		zaniumArmorAch = new Achievement("achievement.zaniumarmor",
				"zaniumarmor", -6, 6, ItemList.zaniumChestPlate, zaniumOreAch)
						.setSpecial().registerStat();
		zaniumSwordAch = new Achievement("achievement.zaniumsword",
				"zaniumsword", -2, 6, ItemList.zaniumSword, zaniumOreAch)
						.setSpecial().registerStat();
		
		zaneModPage = new AchievementPage("\u00A7cZane Extras", butterOreAch,
				butterIngotAch, zograditeScytheAch, lightDimAch, skyiumOreAch,
				raditeOreAch, zogiteOreAch, raditeIngotAch, zogiteIngotAch,
				stariaOreAch, zaniumOreAch, killLightSkeletonAch,
				killLightZombieAch, sodiumOreAch, saladAch, dressedFSaladAch,
				lightOreAch, killSkeletonKingAch, butterSwordAch,
				stariaArmorAch, stariaSwordAch, zaniumSwordAch, zaniumArmorAch,
				dressedRSaladAch, dressedISaladAch);
		
		AchievementPage.registerAchievementPage(zaneModPage);
	}
}
