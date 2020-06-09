// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.events;

import org.bukkit.event.EventPriority;
import org.bukkit.event.EventHandler;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.event.player.PlayerQuitEvent;
import me.pabszito.sc.Simplessentials;
import org.bukkit.event.Listener;

public class Leave implements Listener
{
    private Simplessentials plugin;
    
    public Leave(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void JoinEvent(final PlayerQuitEvent e) {
        if (!this.plugin.getConfig().getBoolean("Config.customQuitMessage")) {
            return;
        }
        if (MSGH.getMessages().getString("Messages.others.leave_message").equals("none")) {
            e.setQuitMessage((String)null);
            return;
        }
        e.setQuitMessage(MSGH.getMessages().getString("Messages.others.leave_message").replaceAll("&", "\u00c2§").replaceAll("%player%", e.getPlayer().getName()));
    }
}
