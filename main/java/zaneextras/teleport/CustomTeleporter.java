package zaneextras.teleport;

import net.minecraft.entity.Entity;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class CustomTeleporter extends Teleporter {
	
	private final WorldServer worldServer;
	
	public CustomTeleporter(WorldServer worldServer) {
		super(worldServer);
		this.worldServer = worldServer;
	}
	
	@Override
	public boolean makePortal(Entity entity) {
		return false;
	}
	
	@Override
	public void placeInPortal(Entity entity, double x, double y, double z,
			float yaw) {
	}
}
