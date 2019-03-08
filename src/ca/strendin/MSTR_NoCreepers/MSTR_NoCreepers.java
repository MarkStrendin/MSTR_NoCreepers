package ca.strendin.MSTR_NoCreepers;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MSTR_NoCreepers extends JavaPlugin {
    @Override
    public void onDisable() {
        MSTRComms.logThis("Plugin DISABLED");        
    }

    @Override
    public void onEnable() {
     // Register events
        PluginManager pm = getServer().getPluginManager();        
        pm.registerEvents(new MSTRCreatureSpawnListner(this), this);
        MSTRComms.logThis("Plugin ENABLED");        
    }

}
