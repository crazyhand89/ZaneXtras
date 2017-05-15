package zaneextras.proxies;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import zaneextras.events.ZaneClientEvents;
import zaneextras.items.arrow.EntityEmeraldArrow;
import zaneextras.items.arrow.EntityEnderArrow;
import zaneextras.items.arrow.EntityGoldenArrow;
import zaneextras.items.arrow.EntityLightArrow;
import zaneextras.items.render.RenderEmeraldArrow;
import zaneextras.items.render.RenderEnderArrow;
import zaneextras.items.render.RenderGoldenArrow;
import zaneextras.items.render.RenderLightArrow;
import zaneextras.lib.helpers.ModHelper;
import zaneextras.mobs.entities.EntityAngel;
import zaneextras.mobs.entities.EntityHellSheep;
import zaneextras.mobs.entities.EntityLightSkeleton;
import zaneextras.mobs.entities.EntityLightZombie;
import zaneextras.mobs.entities.EntitySkeletonKing;
import zaneextras.mobs.models.ModelAngel;
import zaneextras.mobs.models.ModelHellSheep;
import zaneextras.mobs.models.ModelLightSkeleton;
import zaneextras.mobs.models.ModelLightZombie;
import zaneextras.mobs.models.ModelSkeletonKing;
import zaneextras.mobs.renders.RenderAngel;
import zaneextras.mobs.renders.RenderHellSheep;
import zaneextras.mobs.renders.RenderLightSkeleton;
import zaneextras.mobs.renders.RenderLightZombie;
import zaneextras.mobs.renders.RenderSkeletonKing;

public class ClientProxy extends CommonProxy {
	
	private final Minecraft mc = Minecraft.getMinecraft();
	
	@Override
	public void initRenderers() {
		
		// Arrows
		
		RenderingRegistry.registerEntityRenderingHandler(
				EntityEmeraldArrow.class, new RenderEmeraldArrow());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderArrow.class,
				new RenderEnderArrow());
		
		RenderingRegistry.registerEntityRenderingHandler(
				EntityGoldenArrow.class, new RenderGoldenArrow());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityLightArrow.class,
				new RenderLightArrow());
		
		// Mobs
		RenderingRegistry.registerEntityRenderingHandler(EntityHellSheep.class,
				new RenderHellSheep(new ModelHellSheep(), 0.5F));
		
		RenderingRegistry.registerEntityRenderingHandler(
				EntitySkeletonKing.class,
				new RenderSkeletonKing(new ModelSkeletonKing(), 0.5F));
		
		RenderingRegistry.registerEntityRenderingHandler(
				EntityLightSkeleton.class,
				new RenderLightSkeleton(new ModelLightSkeleton(), 0.5F));
		
		RenderingRegistry.registerEntityRenderingHandler(
				EntityLightZombie.class,
				new RenderLightZombie(new ModelLightZombie(), 0.5F));
		
		RenderingRegistry.registerEntityRenderingHandler(
				EntityAngel.class,
				new RenderAngel(new ModelAngel(), 0.5F));
	}
	
	@Override
	public void initClientEvents() {
		ZaneClientEvents eventhandler = new ZaneClientEvents();
		FMLCommonHandler.instance().bus().register(eventhandler);
		MinecraftForge.EVENT_BUS.register(eventhandler);
	}
	
	@Override
	public Minecraft getMinecraft() {
		return this.mc;
	}
	
	@Override
	public void sendChatMessage(EntityPlayer player, String message) {
		if (!player.worldObj.isRemote) {
			ModHelper.addChatMessage(player, message);
		}
	}
}