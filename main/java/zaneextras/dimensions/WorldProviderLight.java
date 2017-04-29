package zaneextras.dimensions;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;
import zaneextras.ZaneExtrasMain;
import zaneextras.biomes.ZaneBiomeList;

public class WorldProviderLight extends WorldProvider {
	
	@Override
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(ZaneBiomeList.lightBiome,
				0.0F);
		this.dimensionId = ZaneDimensionLoader.getDimID();
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean getWorldHasVoidParticles() {
		return false;
	}
	
	@Override
	public float getStarBrightness(float par1) {
		return 1.5F;
	}
	
	public int getSkyColorByTemp(float f) {
		return 0xff0;
	}
	
	@Override
	public String getWelcomeMessage() {
		return "Entering The Promised Land...";
	}
	
	@Override
	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderLight(worldObj, worldObj.getSeed(), true);
	}
	
	@Override
	public String getDepartMessage() {
		return "Leaving The Promised Land...";
	}
	
	@Override
	public double getHorizon() {
		return 0.0D;
	}
	
	@Override
	public boolean canDoRainSnowIce(Chunk chunk) {
		return false;
	}
	
	@Override
	public boolean canRespawnHere() {
		return false;
	}
	
	@Override
	public Vec3 getFogColor(float f, float f1) {
		float f3 = 5.0F;
		float f4 = 5.0F;
		float f5 = 5.0F;
		return Vec3.createVectorHelper(f3, f4, f5);
	}
	
	@Override
	public boolean isSkyColored() {
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return false;
	}
	
	@Override
	public String getDimensionName() {
		return "Promised-Land";
	}
	
	@Override
	public boolean isDaytime() {
		return true;
	}
	
	@Override
	public float getSunBrightnessFactor(float par1) {
		return 1.0F;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IRenderHandler getSkyRenderer() {
		return new SkyProviderLight(ZaneExtrasMain.proxy.getMinecraft());
	}
}