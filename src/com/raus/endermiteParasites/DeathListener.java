package com.raus.endermiteParasites;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class DeathListener implements Listener
{
	@EventHandler
	public void onEndermanDeath(EntityDeathEvent event)
	{
		// Look for enderman death
		if (event.getEntityType() == EntityType.ENDERMAN)
		{
			Entity ent = event.getEntity();
			Location loc = ent.getLocation();
			
			ent.getWorld().spawnEntity(loc, EntityType.ENDERMITE);
		}
	}
}