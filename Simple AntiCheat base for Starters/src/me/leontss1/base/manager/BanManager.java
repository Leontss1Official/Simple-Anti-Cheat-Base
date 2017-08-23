package me.leontss1.base.manager;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import me.leontss1.base.Configuration;

public class BanManager {
	
	public static void banPlayer(Player player) {
		Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "ban " + player.getName() + "[" + Configuration.ANTICHEAT_NAME + "]: " + "Unfair Advantage");
	}

}
