package zaneextras.potions;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import zaneextras.ZaneExtrasMain;
import zaneextras.lib.ModInfo;

public class ZaneBasePotion extends Potion {
	
	/**
	 * Protects the Player from Shadow damage.
	 */
	
	public static ResourceLocation icon;
	
	public ZaneBasePotion(String potionName, int potionId,
			boolean potionIsBadEffect, int potionEffectiveness) {
		super(potionId, potionIsBadEffect, potionEffectiveness);
		
		// Add our mod's ID on to the actual Potion name, to prevent any future
		// compatibility issues.
		this.setPotionName(ModInfo.MODID + "_" + potionName);
		
		// This part is probably pointless, considering we tell it not to use an
		// icon at all. But let's play it safe.
		this.setIconIndex(0, 0);
		
		icon = new ResourceLocation(
				"zaneextras:textures/potions/" + potionName + ".png");
	}
	
	// This is where we actually program the 'effect' for the Potion. Note: We
	// must call this manually! I do it through the LivingUpdate event in the
	// Minecraft Forge event bus. Note that I call this through the proxy,
	// just to be on the safe side.
	@Override
	public void performEffect(EntityLivingBase par1LivingBase,
			int par2Amplifier) {
		if (par1LivingBase instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) par1LivingBase;
			
			// Sending it through the proxy eliminates any client-on-server
			// issues we may have.
			ZaneExtrasMain.proxy.doPotionEffect(player, this.getId());
		}
	}
	
	@Override
	public Potion setIconIndex(int x, int y) {
		super.setIconIndex(x, y);
		return this;
	}
	
	@Override
	public int getStatusIconIndex() {
		ITextureObject texture = Minecraft.getMinecraft().renderEngine
				.getTexture(icon);
		Minecraft.getMinecraft().renderEngine.bindTexture(icon);
		return super.getStatusIconIndex();
	}
}