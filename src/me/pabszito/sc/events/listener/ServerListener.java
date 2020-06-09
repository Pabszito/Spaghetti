// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.events.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.EventHandler;
import net.md_5.bungee.api.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import me.pabszito.sc.Simplessentials;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.event.Listener;

public class ServerListener implements Listener, IServerListener
{
    @EventHandler
    public void changeMOTD(final ServerListPingEvent e) {
        if (Simplessentials.getInstance().getConfig().getBoolean("Config.enableCustomMotd")) {
            e.setMotd(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.others.motd_message")));
        }
        if (Simplessentials.getInstance().getConfig().getBoolean("Config.enableCustomMotdMaxPlayers")) {
            e.setMaxPlayers(Simplessentials.getInstance().getConfig().getInt("Config.motdMaxPlayers"));
        }
    }
    
    @EventHandler
    public void loginResults(final PlayerLoginEvent e) {
        if (Bukkit.getOnlinePlayers().size() + 1 >= Bukkit.getMaxPlayers()) {
            if (e.getPlayer().hasPermission("simplessentials.joinfullserver")) {
                e.allow();
            }
            else {
                e.disallow(PlayerLoginEvent.Result.KICK_FULL, ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.others.server_is_full")));
            }
        }
        if (Bukkit.getServer().hasWhitelist()) {
            if (!Bukkit.getServer().getWhitelistedPlayers().contains(e.getPlayer())) {
                e.disallow(PlayerLoginEvent.Result.KICK_WHITELIST, ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.others.whitelist_is_on")));
            }
            else if (Bukkit.getServer().getWhitelistedPlayers().contains(e.getPlayer())) {
                e.allow();
            }
        }
    }
}
