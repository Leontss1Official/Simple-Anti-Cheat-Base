package me.leontss1.base.manager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import me.leontss1.base.Configuration;

public class MessageManager {

    public static void messageStaff(String message) {
        Bukkit.broadcast(ChatColor.translateAlternateColorCodes('&', message), Configuration.PERMISSION);
    }

}