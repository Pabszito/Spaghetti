// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.events;

import org.bukkit.event.EventPriority;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import me.pabszito.sc.confighandler.DataHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;

public class DataGenerator implements Listener
{
    @EventHandler(priority = EventPriority.MONITOR)
    public void generateData(final PlayerJoinEvent e) {
        final Player p = e.getPlayer();
        DataHandler.generate(p);
    }
}
