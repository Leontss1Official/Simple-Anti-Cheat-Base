package me.leontss1.base.manager;

import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.leontss1.base.Configuration;

public class PlayerManager implements Listener {
	
	public static List<UUID> alertsList;

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (player.hasPermission(Configuration.PERMISSION)) {
            PlayerManager.alertsList.add(player.getUniqueId());
        }

    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        if (PlayerManager.alertsList.contains(player.getUniqueId())) {
            PlayerManager.alertsList.remove(player.getUniqueId());
        }

    }

    @EventHandler
    public void onKick(PlayerKickEvent event) {
        Player player = event.getPlayer();

        if (PlayerManager.alertsList.contains(player.getUniqueId())) {
            PlayerManager.alertsList.remove(player.getUniqueId());
        }

    }

}
