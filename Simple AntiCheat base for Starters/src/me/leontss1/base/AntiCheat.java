package me.leontss1.base;

import org.bukkit.plugin.java.JavaPlugin;

import me.leontss1.base.checks.CheckManager;

public class AntiCheat extends JavaPlugin {
	
	public static AntiCheat Instance;
	
	public void onEnable() {
		
		Instance = this;
		
		System.out.println("[AntiCheat]: Enabling All-Checks");
		registerChecks();
		registerCommands();
		
        new CheckManager();
        new Configuration();
		
		
	}
	
	public void registerChecks() {
		//register checks as a listener I was too bored to code an actual check enabling system.
	}
	
	public void registerCommands() {
		//register your own commands lazy boi
	}

}
