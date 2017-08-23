package me.leontss1.base.checks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import me.leontss1.base.Configuration;
import me.leontss1.base.manager.BanManager;
import me.leontss1.base.manager.MessageManager;
import me.leontss1.base.manager.PlayerManager;

import java.util.logging.Level;

public abstract class Check implements Listener {

    private String name;
    private Category category;
    private boolean enabled;
    private boolean autoban;

    public Check(String name, Category category, boolean autoban) {
        this.name = name;
        this.category = category;
        this.enabled = true;
        this.autoban = autoban;
    }

    public void addViolation(Player player, boolean alertStaff) {
    	
    	int vio = 0;

    	vio =+ 1;
    	
        if (alertStaff) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                if (PlayerManager.alertsList.contains(players.getUniqueId())) {
                MessageManager.messageStaff("&7[&a!&7] &a" + player.getDisplayName() + " &failed &a" + name + " &7VL: &a" + vio);
               }
                
          if (autoban) {
        	  if (vio > 60) {
        		  BanManager.banPlayer(player);
        	  }
          }
            }
        }
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean isAutoban() {
        return autoban;
    }
}
