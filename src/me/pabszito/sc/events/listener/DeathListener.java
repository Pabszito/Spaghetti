// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.events.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;
import me.pabszito.sc.Simplessentials;
import org.bukkit.event.Listener;

public class DeathListener implements Listener
{
    private Simplessentials plugin;
    
    public DeathListener(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onDeath(final PlayerDeathEvent e) {
        if (this.plugin.getConfig().getBoolean("Config.autoRespawn")) {
            final Player p = e.getEntity().getPlayer();
            p.spigot().respawn();
        }
    }
}
