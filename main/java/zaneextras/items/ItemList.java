package zaneextras.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import zaneextras.blocks.BlockList;
import zaneextras.items.armor.ZaneArmorMaterials;
import zaneextras.items.armor.butter.ButterArmor;
import zaneextras.items.armor.emerald.EmeraldArmor;
import zaneextras.items.armor.foolstaria.FoolStariaArmor;
import zaneextras.items.armor.radite.RaditeArmor;
import zaneextras.items.armor.skyium.SkyiumArmor;
import zaneextras.items.armor.staria.StariaArmor;
import zaneextras.items.armor.zanium.ZaniumArmor;
import zaneextras.items.armor.zogite.ZogiteArmor;
import zaneextras.items.bow.EmeraldBow;
import zaneextras.items.bow.EnderBow;
import zaneextras.items.bow.LightBow;
import zaneextras.items.bow.SkeletonKingBow;
import zaneextras.items.food.ItemFoodFrenchSalad;
import zaneextras.items.food.ItemFoodGhostPepper;
import zaneextras.items.food.ItemFoodGlowingFlesh;
import zaneextras.items.food.ItemFoodItalianSalad;
import zaneextras.items.food.ItemFoodPepper;
import zaneextras.items.food.ItemFoodRanchSalad;
import zaneextras.items.food.ItemFoodSalad;
import zaneextras.items.food.ZaneItemFood;
import zaneextras.items.food.seeds.NetherSeed;
import zaneextras.items.food.seeds.Seed;
import zaneextras.items.food.seeds.SeedFood;
import zaneextras.items.tool.damnhardbutter.ItemToolDamnHardButterAxe;
import zaneextras.items.tool.damnhardbutter.ItemToolDamnHardButterHoe;
import zaneextras.items.tool.damnhardbutter.ItemToolDamnHardButterPickaxe;
import zaneextras.items.tool.damnhardbutter.ItemToolDamnHardButterShovel;
import zaneextras.items.tool.emerald.ItemToolEmeraldAxe;
import zaneextras.items.tool.emerald.ItemToolEmeraldHoe;
import zaneextras.items.tool.emerald.ItemToolEmeraldPickaxe;
import zaneextras.items.tool.emerald.ItemToolEmeraldShovel;
import zaneextras.items.tool.foolstaria.ItemToolFoolStariaAxe;
import zaneextras.items.tool.foolstaria.ItemToolFoolStariaHoe;
import zaneextras.items.tool.foolstaria.ItemToolFoolStariaPickaxe;
import zaneextras.items.tool.foolstaria.ItemToolFoolStariaShovel;
import zaneextras.items.tool.skyium.ItemToolSkyiumAxe;
import zaneextras.items.tool.skyium.ItemToolSkyiumHoe;
import zaneextras.items.tool.skyium.ItemToolSkyiumPickaxe;
import zaneextras.items.tool.skyium.ItemToolSkyiumShovel;
import zaneextras.items.tool.staria.ItemToolStariaAxe;
import zaneextras.items.tool.staria.ItemToolStariaHoe;
import zaneextras.items.tool.staria.ItemToolStariaPickaxe;
import zaneextras.items.tool.staria.ItemToolStariaShovel;
import zaneextras.items.tool.zanium.ItemToolZaniumAxe;
import zaneextras.items.tool.zanium.ItemToolZaniumHoe;
import zaneextras.items.tool.zanium.ItemToolZaniumPickaxe;
import zaneextras.items.tool.zanium.ItemToolZaniumShovel;
import zaneextras.items.weapon.ItemWeaponDamnHardButterSword;
import zaneextras.items.weapon.ItemWeaponEmeraldSword;
import zaneextras.items.weapon.ItemWeaponFoolStariaSword;
import zaneextras.items.weapon.ItemWeaponSkyiumSword;
import zaneextras.items.weapon.ItemWeaponStariaSword;
import zaneextras.items.weapon.ItemWeaponZaniumSword;
import zaneextras.items.weapon.ItemWeaponZograditeScythe;

public class ItemList {
	
	// Everything Else
	public static final Item knife = new ItemChefKnife();
	public static final Item lightEye = new ItemLightEye();
	public static final Item lightBone = new ZaneItem("lightbone");
	public static final Item lightFlesh = new ItemFoodGlowingFlesh();
	public static final Item lightBoneMeal = new ZaneItem("lightbonemeal");
	public static final Item radiatedCoal = new ZaneItem("radiatedcoal");
	public static final Item pureFeather = new ZaneItem("purefeather");
	public static final Item angelHalo = new ZaneItem("angelhalo");
	public static final Item angelKey = new ZaneItem("angelkey");
	
	// ignots
	public static final Item butterItem = new ItemRarity("damnhardbutteringot",
			EnumRarity.common);
	public static final Item raditeIngot = new ItemRarity("raditeingot",
			EnumRarity.uncommon);
	public static final Item zogiteIngot = new ItemRarity("zogiteingot",
			EnumRarity.uncommon);
	public static final Item zograditeIgnot = new ZaneAnimatedItem(
			"zograditeingot", EnumRarity.epic);
	
	// Materials
	public static final Item sodium = new ZaneItem("sodium");
	public static final Item zanium = new ItemRarity("zanium", EnumRarity.epic);
	public static final Item staria = new ItemRarity("staria", EnumRarity.epic);
	public static final Item skyium = new ZaneItem("skyium");
	public static final Item chargedStaria = new ZaneAnimatedItem(
			"charged_staria", EnumRarity.epic);
	public static final Item chargedZanium = new ZaneAnimatedItem(
			"charged_zanium", EnumRarity.epic);
	public static final Item foolStaria = new ZaneItem("foolstaria");
	
	// Dust
	public static final Item butterDust = new ZaneItem("butterdust");
	public static final Item redGlowStoneDust = new ZaneItem(
			"redglowstonedust");
	public static final Item skyiumDust = new ZaneItem("skyiumdust");
	public static final Item zogiteDust = new ItemRarity("zogitedust",
			EnumRarity.uncommon);
	public static final Item raditeDust = new ItemRarity("raditedust",
			EnumRarity.uncommon);
	public static final Item zograditeBlend = new ZaneAnimatedItem(
			"zograditeblend", EnumRarity.rare);
	
	// Sticks
	public static final Item glowStick = new ZaneItem("glowstick");
	public static final Item netherStick = new ZaneItem("netherstick");
	public static final Item raditeInfusedStick = new ItemRarity(
			"raditeinfusedstick", EnumRarity.rare);
	public static final Item lightStick = new ItemRarity("lightstick",
			EnumRarity.uncommon);
	
	// Bottles
	public static final Item mixedBottle = new ZaneItem("mixturebottle");
	public static final Item acidBottle = new ZaneItem("acidbottle");
	public static final Item chlorineBottle = new ZaneBottleItem(
			"chlorinebottle");
	public static final Item french = new ZaneBottleItem("frenchbottle");
	public static final Item ranch = new ZaneBottleItem("ranchbottle");
	public static final Item italian = new ZaneBottleItem("italianbottle");
	public static final Item salt = new ZaneBottleItem("salt");
	public static final Item blackPepper = new ZaneBottleItem("blackpepper");
	public static final Item vinegar = new ZaneBottleItem("vinegar");
	
	// Buckets
	public static final Item chlorineBucket = new ZaneItemBucket(
			BlockList.chlorineFluidBlock, "bucket_chlorine");
	public static final Item acidBucket = new ZaneItemBucket(
			BlockList.acidFluidBlock, "bucket_acid");
	public static final Item raditeBucket = new ZaneRarityBucket(
			BlockList.raditeFluidBlock, "bucket_radite", EnumRarity.rare);
	
	// Non edible food
	public static final Item crushedPeppercorn = new ZaneItem(
			"crushedpeppercorn");
	public static final Item tomatoPaste = new ZaneItem("tomatopaste");
	public static final Item ketchup = new ZaneItem("ketchup");
	
	// food
	public static final Item butterFood = new ZaneItemFood("butteringot", 1,
			0.5F, false);
	public static final Item butterPotato = new ZaneItemFood("butterpotato", 8,
			0.7F, false);
	public static final Item rawSweet = new ZaneItemFood("rawsweetpotatofry", 1,
			0.1F, false);
	public static final Item cookedSweet = new ZaneItemFood(
			"cookedsweetpotatofry", 2, 0.5F, false);
	public static final Item rawFry = new ZaneItemFood("rawfry", 1, 0.1F,
			false);
	public static final Item cookedFry = new ZaneItemFood("cookedfry", 2, 0.5F,
			false);
	public static final Item greenBean = new ZaneItemFood("greenbean", 2, 0.5F,
			false);
	public static final Item spinach = new ZaneItemFood("spinach", 2, 0.5F,
			false);
	public static final Item lettuce = new ZaneItemFood("lettuce", 2, 0.5F,
			false);
	public static final Item cheese = new ZaneItemFood("cheese", 2, 0.5F,
			false);
	public static final Item tomato = new ZaneItemFood("tomato", 2, 0.5F,
			false);
	public static final Item garlic = new ZaneItemFood("garlic", 2, 0.5F,
			false);
	public static final Item onion = new ZaneItemFood("onion", 2, 0.5F, false);
	public static final Item salad = new ItemFoodSalad();
	public static final Item ghost = new ItemFoodGhostPepper();
	public static final Item pepper = new ItemFoodPepper();
	public static final Item italianSalad = new ItemFoodItalianSalad();
	public static final Item frenchSalad = new ItemFoodFrenchSalad();
	public static final Item ranchSalad = new ItemFoodRanchSalad();
	public static final Item barrierApple = new ItemBarrierApple()
			.setAlwaysEdible();
	
	// Seeds
	public static final Item pepperSeeds = new Seed("pepperseeds",
			BlockList.pepperCrop);
	public static final Item ghostSeeds = new NetherSeed("ghostpepperseeds",
			BlockList.ghostCrop);
	public static final Item greenSeeds = new Seed("greenbeanseeds",
			BlockList.greenBeanCrop);
	public static final Item spinachSeeds = new Seed("spinachseeds",
			BlockList.spinachCrop);
	public static final Item lettuceSeeds = new Seed("lettuce_seeds",
			BlockList.lettuceStem);
	public static final Item tomatoSeeds = new Seed("tomato_seeds",
			BlockList.tomatoStem);
	public static final Item onionSeeds = new Seed("onionseeds",
			BlockList.onionCrop);
	public static final Item garlicSeeds = new Seed("garlicseeds",
			BlockList.garlicCrop);
	
	// Crops
	public static final Item sweetPotato = new SeedFood(2, 0.3F,
			BlockList.sweetPotatoCrop, Blocks.farmland, "sweetpotato");
	public static final Item peppercorn = new SeedFood(2, 0.3F,
			BlockList.peppercornCrop, Blocks.farmland, "peppercorn");
	
	// Butter Tools and Sword
	public static final Item butterHoe = new ItemToolDamnHardButterHoe();
	public static final Item butterAxe = new ItemToolDamnHardButterAxe();
	public static final Item butterShovel = new ItemToolDamnHardButterShovel();
	public static final Item butterPickaxe = new ItemToolDamnHardButterPickaxe();
	public static final Item butterSword = new ItemWeaponDamnHardButterSword();
	
	// Butter Armor Set
	public static final Item butterHelmet = new ButterArmor(
			ZaneArmorMaterials.BUTTER, "butterhelmet", 0);
	public static final Item butterChestPlate = new ButterArmor(
			ZaneArmorMaterials.BUTTER, "butterchestplate", 1);
	public static final Item butterLeggings = new ButterArmor(
			ZaneArmorMaterials.BUTTER, "butterleggings", 2);
	public static final Item butterBoots = new ButterArmor(
			ZaneArmorMaterials.BUTTER, "butterboots", 3);
	
	// Emerald Tools and Sword
	public static final Item emeraldHoe = new ItemToolEmeraldHoe();
	public static final Item emeraldAxe = new ItemToolEmeraldAxe();
	public static final Item emeraldShovel = new ItemToolEmeraldShovel();
	public static final Item emeraldPickaxe = new ItemToolEmeraldPickaxe();
	public static final Item emeraldSword = new ItemWeaponEmeraldSword();
	
	// Emerald Armor Set
	public static final Item emeraldHelmet = new EmeraldArmor(
			ZaneArmorMaterials.EMERALD, "emeraldhelmet", 0);
	public static final Item emeraldChestPlate = new EmeraldArmor(
			ZaneArmorMaterials.EMERALD, "emeraldchestplate", 1);
	public static final Item emeraldLeggings = new EmeraldArmor(
			ZaneArmorMaterials.EMERALD, "emeraldleggings", 2);
	public static final Item emeraldBoots = new EmeraldArmor(
			ZaneArmorMaterials.EMERALD, "emeraldboots", 3);
	
	// Staria Armor Set
	public static final Item stariaHelmet = new StariaArmor(
			ZaneArmorMaterials.STARIA, "stariahelmet", 0,
			Enchantment.respiration, 4, Enchantment.protection, 4);
	public static final Item stariaChestPlate = new StariaArmor(
			ZaneArmorMaterials.STARIA, "stariachestplate", 1,
			Enchantment.protection, 4, Enchantment.blastProtection, 4);
	public static final Item stariaLeggings = new StariaArmor(
			ZaneArmorMaterials.STARIA, "starialeggings", 2,
			Enchantment.protection, 4, Enchantment.projectileProtection, 4);
	public static final Item stariaBoots = new StariaArmor(
			ZaneArmorMaterials.STARIA, "stariaboots", 3,
			Enchantment.featherFalling, 4, Enchantment.protection, 4);
	
	// Staria Tools and Sword
	public static final Item stariaHoe = new ItemToolStariaHoe();
	public static final Item stariaAxe = new ItemToolStariaAxe();
	public static final Item stariaShovel = new ItemToolStariaShovel();
	public static final Item stariaPickaxe = new ItemToolStariaPickaxe();
	public static final Item stariaSword = new ItemWeaponStariaSword();
	
	// Zanium Armor Set
	public static final Item zaniumHelmet = new ZaniumArmor(
			ZaneArmorMaterials.ZANIUM, "zaniumhelmet", 0,
			Enchantment.respiration, 4, Enchantment.thorns, 4);
	public static final Item zaniumChestPlate = new ZaniumArmor(
			ZaneArmorMaterials.ZANIUM, "zaniumchestplate", 1,
			Enchantment.blastProtection, 4, Enchantment.thorns, 4);
	public static final Item zaniumLeggings = new ZaniumArmor(
			ZaneArmorMaterials.ZANIUM, "zaniumleggings", 2, Enchantment.thorns,
			4, Enchantment.projectileProtection, 4);
	public static final Item zaniumBoots = new ZaniumArmor(
			ZaneArmorMaterials.ZANIUM, "zaniumboots", 3,
			Enchantment.featherFalling, 4, Enchantment.thorns, 4);
	
	// Zanium Tools and Sword
	public static final Item zaniumHoe = new ItemToolZaniumHoe();
	public static final Item zaniumAxe = new ItemToolZaniumAxe();
	public static final Item zaniumShovel = new ItemToolZaniumShovel();
	public static final Item zaniumPickaxe = new ItemToolZaniumPickaxe();
	public static final Item zaniumSword = new ItemWeaponZaniumSword();
	
	// Skyium Armor Set
	public static final Item skyiumHelmet = new SkyiumArmor(
			ZaneArmorMaterials.SKYIUM, "skyiumhelmet", 0,
			Enchantment.protection, 3);
	public static final Item skyiumChestPlate = new SkyiumArmor(
			ZaneArmorMaterials.SKYIUM, "skyiumchestplate", 1,
			Enchantment.projectileProtection, 3);
	public static final Item skyiumLeggings = new SkyiumArmor(
			ZaneArmorMaterials.SKYIUM, "skyiumleggings", 2,
			Enchantment.blastProtection, 3);
	public static final Item skyiumBoots = new SkyiumArmor(
			ZaneArmorMaterials.SKYIUM, "skyiumboots", 3,
			Enchantment.featherFalling, 4);
	
	// Skyium Tools and Sword
	public static final Item skyiumHoe = new ItemToolSkyiumHoe();
	public static final Item skyiumAxe = new ItemToolSkyiumAxe();
	public static final Item skyiumShovel = new ItemToolSkyiumShovel();
	public static final Item skyiumPickaxe = new ItemToolSkyiumPickaxe();
	public static final Item skyiumSword = new ItemWeaponSkyiumSword();
	
	// Zogite Armor Set
	public static final Item zogiteHelmet = new ZogiteArmor(
			ZaneArmorMaterials.ZOGITE, "zogitehelmet", 0, Enchantment.thorns,
			3);
	public static final Item zogiteChestPlate = new ZogiteArmor(
			ZaneArmorMaterials.ZOGITE, "zogitechestplate", 1,
			Enchantment.thorns, 3);
	public static final Item zogiteLeggings = new ZogiteArmor(
			ZaneArmorMaterials.ZOGITE, "zogiteleggings", 2, Enchantment.thorns,
			3);
	public static final Item zogiteBoots = new ZogiteArmor(
			ZaneArmorMaterials.ZOGITE, "zogiteboots", 3, Enchantment.thorns, 3);
	
	// Radite Armor Set
	public static final Item raditeHelmet = new RaditeArmor(
			ZaneArmorMaterials.RADITE, "raditehelmet", 0,
			Enchantment.protection, 4);
	public static final Item raditeChestPlate = new RaditeArmor(
			ZaneArmorMaterials.RADITE, "raditechestplate", 1,
			Enchantment.protection, 4);
	public static final Item raditeLeggings = new RaditeArmor(
			ZaneArmorMaterials.RADITE, "raditeleggings", 2,
			Enchantment.protection, 4);
	public static final Item raditeBoots = new RaditeArmor(
			ZaneArmorMaterials.RADITE, "raditeboots", 3, Enchantment.protection,
			4);
	
	// Zogradite Scythe
	public static final Item zograditeScythe = new ItemWeaponZograditeScythe();
	
	// Bows
	public static final Item emeraldBow = new EmeraldBow();
	public static final Item enderBow = new EnderBow();
	public static final Item skeleBow = new SkeletonKingBow();
	public static final Item lightBow = new LightBow();
	
	// Arrows
	public static final Item emeraldArrow = new ItemRarity("emeraldarrow",
			EnumRarity.uncommon);
	public static final Item enderArrow = new ItemRarity("enderarrow",
			EnumRarity.uncommon);
	public static final Item goldenArrow = new ItemRarity("goldenarrow",
			EnumRarity.rare);
	public static final Item lightArrow = new ItemRarity("lightarrow",
			EnumRarity.rare);
	
	//Fool Staria Armor Set
	public static final Item foolStariaHelmet = new FoolStariaArmor(
			ZaneArmorMaterials.FOOL_STARIA, "foolstariahelmet", 0);
	public static final Item foolStariaChestPlate = new FoolStariaArmor(
			ZaneArmorMaterials.FOOL_STARIA, "foolstariachestplate", 1);
	public static final Item foolStariaLeggings = new FoolStariaArmor(
			ZaneArmorMaterials.FOOL_STARIA, "foolstarialeggings", 2);
	public static final Item foolStariaBoots = new FoolStariaArmor(
			ZaneArmorMaterials.FOOL_STARIA, "foolstariaboots", 3);
	
	// Fool Staria Tools and Sword
	public static final Item foolStariaHoe = new ItemToolFoolStariaHoe();
	public static final Item foolStariaAxe = new ItemToolFoolStariaAxe();
	public static final Item foolStariaShovel = new ItemToolFoolStariaShovel();
	public static final Item foolStariaPickaxe = new ItemToolFoolStariaPickaxe();
	public static final Item foolStariaSword = new ItemWeaponFoolStariaSword();
	
	public static void init() {
		addItem(butterItem, "i1");
		addItem(butterFood, "i2");
		addItem(butterPotato, "i3");
		addItem(butterDust, "i4");
		addItem(butterHoe, "i5");
		addItem(butterShovel, "i6");
		addItem(butterPickaxe, "i7");
		addItem(butterAxe, "i8");
		addItem(butterSword, "i9");
		addItem(butterHelmet, "i10");
		addItem(butterChestPlate, "i11");
		addItem(butterLeggings, "i12");
		addItem(butterBoots, "i13");
		addItem(redGlowStoneDust, "i14");
		addItem(emeraldHelmet, "i15");
		addItem(emeraldChestPlate, "i16");
		addItem(emeraldLeggings, "i17");
		addItem(emeraldBoots, "i18");
		addItem(emeraldHoe, "i19");
		addItem(emeraldShovel, "i20");
		addItem(emeraldPickaxe, "i21");
		addItem(emeraldAxe, "i22");
		addItem(emeraldSword, "i23");
		addItem(sweetPotato, "i24");
		addItem(rawSweet, "i25");
		addItem(cookedSweet, "i26");
		addItem(rawFry, "i27");
		addItem(cookedFry, "i28");
		addItem(knife, "i29");
		addItem(ghost, "i30");
		addItem(greenBean, "i31");
		addItem(pepper, "i32");
		addItem(greenSeeds, "i33");
		addItem(ghostSeeds, "i34");
		addItem(pepperSeeds, "i35");
		addItem(spinach, "i36");
		addItem(spinachSeeds, "i37");
		addItem(lettuce, "i38");
		addItem(lettuceSeeds, "i39");
		addItem(salad, "i40");
		addItem(staria, "i41");
		addItem(stariaHelmet, "i42");
		addItem(stariaChestPlate, "i43");
		addItem(stariaLeggings, "i44");
		addItem(stariaBoots, "i45");
		addItem(stariaHoe, "i46");
		addItem(stariaShovel, "i47");
		addItem(stariaPickaxe, "i48");
		addItem(stariaAxe, "i49");
		addItem(stariaSword, "i50");
		addItem(zanium, "i51");
		addItem(zaniumHelmet, "i52");
		addItem(zaniumChestPlate, "i53");
		addItem(zaniumLeggings, "i54");
		addItem(zaniumBoots, "i55");
		addItem(zaniumHoe, "i56");
		addItem(zaniumShovel, "i57");
		addItem(zaniumPickaxe, "i58");
		addItem(zaniumAxe, "i59");
		addItem(zaniumSword, "i60");
		addItem(glowStick, "i61");
		addItem(netherStick, "i62");
		addItem(emeraldBow, "i63");
		addItem(emeraldArrow, "i64");
		addItem(enderArrow, "i65");
		addItem(enderBow, "i66");
		addItem(cheese, "i67");
		addItem(tomato, "i68");
		addItem(garlic, "i69");
		addItem(salt, "i70");
		addItem(blackPepper, "i71");
		addItem(onion, "i72");
		addItem(vinegar, "i73");
		addItem(acidBucket, "i74");
		addItem(acidBottle, "i75");
		addItem(peppercorn, "i76");
		addItem(crushedPeppercorn, "i77");
		addItem(tomatoSeeds, "i78");
		addItem(onionSeeds, "i79");
		addItem(garlicSeeds, "i80");
		addItem(mixedBottle, "i81");
		addItem(tomatoPaste, "i82");
		addItem(ketchup, "i83");
		addItem(sodium, "i84");
		addItem(chlorineBucket, "i85");
		addItem(french, "i86");
		addItem(ranch, "i87");
		addItem(italian, "i88");
		addItem(chlorineBottle, "i89");
		addItem(italianSalad, "i90");
		addItem(frenchSalad, "i91");
		addItem(ranchSalad, "i92");
		addItem(skyium, "i93");
		addItem(skyiumHelmet, "i94");
		addItem(skyiumChestPlate, "i95");
		addItem(skyiumLeggings, "i96");
		addItem(skyiumBoots, "i97");
		addItem(skyiumHoe, "i98");
		addItem(skyiumShovel, "i199");
		addItem(skyiumPickaxe, "i100");
		addItem(skyiumAxe, "i101");
		addItem(skyiumSword, "i102");
		addItem(skyiumDust, "i103");
		addItem(skeleBow, "i04");
		addItem(goldenArrow, "i105");
		addItem(chargedStaria, "i106");
		addItem(chargedZanium, "i107");
		addItem(zogiteDust, "i108");
		addItem(raditeDust, "i109");
		addItem(raditeIngot, "i110");
		addItem(zogiteIngot, "i111");
		addItem(zograditeIgnot, "i112");
		addItem(zograditeBlend, "i113");
		addItem(raditeBucket, "i114");
		addItem(zogiteHelmet, "i115");
		addItem(zogiteChestPlate, "i116");
		addItem(zogiteLeggings, "i117");
		addItem(zogiteBoots, "i118");
		addItem(raditeHelmet, "i119");
		addItem(raditeChestPlate, "i120");
		addItem(raditeLeggings, "i121");
		addItem(raditeBoots, "i122");
		addItem(zograditeScythe, "i123");
		addItem(raditeInfusedStick, "i124");
		addItem(lightEye, "i125");
		addItem(lightArrow, "i126");
		addItem(lightBow, "i127");
		addItem(lightFlesh, "i128");
		addItem(lightBone, "i129");
		addItem(lightBoneMeal, "i130");
		addItem(lightStick, "i131");
		addItem(barrierApple, "i132");
		addItem(radiatedCoal, "i133");
		addItem(foolStaria, "i134");
		addItem(foolStariaHelmet, "i135");
		addItem(foolStariaChestPlate, "i136");
		addItem(foolStariaLeggings, "i137");
		addItem(foolStariaBoots, "i138");
		addItem(foolStariaHoe, "i139");
		addItem(foolStariaShovel, "i140");
		addItem(foolStariaPickaxe, "i141");
		addItem(foolStariaAxe, "i142");
		addItem(foolStariaSword, "i143");
		addItem(pureFeather, "i144");
		addItem(angelHalo, "i145");
		addItem(angelKey, "i146");
	}
	
	public static void addItem(Item item, String name) {
		GameRegistry.registerItem(item, name);
	}
}