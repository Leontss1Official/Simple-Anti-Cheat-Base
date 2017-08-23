package me.leontss1.base.checks.combat;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import me.leontss1.base.checks.Category;
import me.leontss1.base.checks.Check;

public class Reach extends Check implements Listener {
	
	private double maxReach;

	public Reach() {
		super("Reach", Category.COMBAT, true);
		this.maxReach = 3.4;
		
		   
	   }
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e) {
		
		if (!(e.getDamager() instanceof Player)) return;
		
		if (!(e.getEntity() instanceof Player)) return;
		
		Player damager = (Player) e.getDamager();
		
		Player player = (Player) e.getEntity();
		
        final double distance = damager.getLocation().distance(player.getLocation());
        
        // Your Ping-Check here
        
        //----------------------------------------------------------
        
        if (!damager.isOnGround()) {
        	maxReach += 1.0;
        }
        
        if (!player.isOnGround()) {
        	maxReach += 1.0;
        }
        
       // Your Speed Potion Listener here saying to lower the reach depending on the potion effect ;)
        
       if (distance >= maxReach) {
    	   this.addViolation(player, true);
       }
		
		
	}
}

