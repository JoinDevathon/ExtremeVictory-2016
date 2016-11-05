package org.devathon.contest2016;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {

	private static MainClass plugin;
	
    @Override
    public void onEnable() {
    	MainClass.plugin = this;
    	
    	PluginManager pm = getServer().getPluginManager();
    	
    }

    @Override
    public void onDisable() {
       MainClass.plugin = null;
    }
    public static MainClass getInstance() {
    	return plugin;
    }
}