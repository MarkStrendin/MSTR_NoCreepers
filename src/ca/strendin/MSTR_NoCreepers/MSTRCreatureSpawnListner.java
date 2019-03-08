package ca.strendin.MSTR_NoCreepers;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

public class MSTRCreatureSpawnListner implements Listener {
    public static MSTR_NoCreepers plugin;

    public MSTRCreatureSpawnListner(MSTR_NoCreepers thisplugin) {
        plugin = thisplugin;
    }
    
    @EventHandler        
    public void onCreatureSpawnEvent(CreatureSpawnEvent event) {
        if (event.getEntity().getType() == EntityType.CREEPER) {         
            event.setCancelled(true);
            event.getEntity().getWorld().spawnCreature(event.getEntity().getLocation(), EntityType.ZOMBIE);
            event.getEntity().getWorld().spawnCreature(event.getEntity().getLocation(), EntityType.ZOMBIE);
            event.getEntity().getWorld().spawnCreature(event.getEntity().getLocation(), EntityType.ZOMBIE);
        }
    }
    
    @EventHandler
    public void onEntityExplodeEvent(EntityExplodeEvent event) {
        if (event.getEntityType() == EntityType.CREEPER) {            
            event.setCancelled(true);
        }        
    }
}
