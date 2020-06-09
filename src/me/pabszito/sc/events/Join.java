// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.events;

import org.bukkit.event.EventPriority;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.Sound;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.event.player.PlayerJoinEvent;
import me.pabszito.sc.Simplessentials;
import org.bukkit.event.Listener;

public class Join implements Listener
{
    private Simplessentials plugin;
    
    public Join(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void JoinEvent(final PlayerJoinEvent e) {
        final Player p = e.getPlayer();
        if (this.plugin.getConfig().getBoolean("Config.customJoinMessage")) {
            if (MSGH.getMessages().getString("Messages.others.join_message").equals("none")) {
                e.setJoinMessage((String)null);
            }
            else {
                e.setJoinMessage(MSGH.getMessages().getString("Messages.others.join_message").replaceAll("&", "\u00c2§").replaceAll("%player%", e.getPlayer().getName()));
            }
        }
        p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10.0f, 1.5f);
    }
}
