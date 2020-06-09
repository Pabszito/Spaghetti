// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.command.CommandExecutor;

public class ChatCMD implements CommandExecutor, Listener
{
    public static boolean CHAT_DISABLED;
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.cant_execute_from_console")));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.chat")) {
            if (args.length == 0) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.usage")));
            }
            else if (args.length >= 1) {
                if (args[0].equalsIgnoreCase("lock")) {
                    if (!ChatCMD.CHAT_DISABLED) {
                        ChatCMD.CHAT_DISABLED = true;
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.chat_locked")));
                        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.chat_locked_broadcast").replaceAll("%player%", p.getName())));
                    }
                    else {
                        ChatCMD.CHAT_DISABLED = false;
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.chat_unlocked")));
                        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.chat_unlocked_broadcast").replaceAll("%player%", p.getName())));
                    }
                    return true;
                }
                if (args[0].equalsIgnoreCase("clear")) {
                    for (int i = 0; i < 100; ++i) {
                        Bukkit.broadcastMessage("");
                    }
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.chat_cleared_broadcast").replaceAll("%player%", p.getName())));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.chat_cleared")));
                }
                else {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.usage")));
                }
            }
        }
        else {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
        }
        return false;
    }
    
    @EventHandler
    public void ifChatIsDisabled(final AsyncPlayerChatEvent e) {
        if (ChatCMD.CHAT_DISABLED && !e.getPlayer().hasPermission("simplessentials.chatlock.bypass")) {
            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.chat.chat_is_locked")));
            e.setCancelled(true);
        }
        else if (ChatCMD.CHAT_DISABLED && e.getPlayer().hasPermission("simplessentials.chatlock.bypass")) {
            e.setCancelled(false);
        }
    }
}
