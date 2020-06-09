// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.events;

import java.util.Iterator;
import ru.tehkode.permissions.bukkit.PermissionsEx;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import me.pabszito.sc.Simplessentials;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.Listener;

public class ChatHandler implements Listener
{
    @Deprecated
    public void modifyChat(final AsyncPlayerChatEvent e) {
        e.setFormat(ChatColor.translateAlternateColorCodes('&', Simplessentials.getInstance().getConfig().getString("Messages.chatFormat").replaceAll("%player%", e.getPlayer().getName()).replaceAll("%msg%", e.getMessage().replaceAll("%", "%"))));
    }
    
    public void handleChat(final AsyncPlayerChatEvent e) {
        e.setCancelled(true);
        final Player p = e.getPlayer();
        final String message = e.getMessage();
        if (!p.hasPermission("simplessentials.chat.colors")) {
            for (final Player o : Bukkit.getOnlinePlayers()) {
                if (Bukkit.getServer().getPluginManager().getPlugin("PermissionsEx") == null) {
                    o.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.others.format")).replaceAll("%message%", message).replaceAll("%player%", p.getName()).replaceAll("%displayname%", p.getDisplayName()).replaceAll("%prefix%", "").replaceAll("%suffix%", ""));
                }
                else {
                    o.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.others.format")).replaceAll("%message%", message).replaceAll("%player%", p.getName()).replaceAll("%displayname%", p.getDisplayName()).replaceAll("%prefix%", PermissionsEx.getUser(p).getPrefix()).replaceAll("%suffix%", PermissionsEx.getUser(p).getSuffix()));
                }
            }
        }
        else {
            for (final Player o : Bukkit.getOnlinePlayers()) {
                if (Bukkit.getServer().getPluginManager().getPlugin("PermissionsEx") == null) {
                    o.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.others.format")).replaceAll("%message%", ChatColor.translateAlternateColorCodes('&', message)).replaceAll("%player%", p.getName()).replaceAll("%displayname%", p.getDisplayName()).replaceAll("%prefix%", "").replaceAll("%suffix%", ""));
                }
                else {
                    o.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.others.format")).replaceAll("%message%", ChatColor.translateAlternateColorCodes('&', message)).replaceAll("%player%", p.getName()).replaceAll("%displayname%", p.getDisplayName()).replaceAll("%prefix%", PermissionsEx.getUser(p).getPrefix()).replaceAll("%suffix%", PermissionsEx.getUser(p).getSuffix()));
                }
            }
        }
    }
}
