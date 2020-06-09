// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import net.md_5.bungee.api.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class BroadcastCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            if (args.length == 0) {
                Bukkit.getConsoleSender().sendMessage(MSGH.getMessages().getString("Messages.broadcast.usage").replaceAll("&", "§"));
                return false;
            }
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "" + MSGH.getMessages().getString("Messages.broadcast.prefix").replaceAll("&", "§") + "" + this.convertArgsToMsg(args)));
            return true;
        }
        else {
            final Player p = (Player)sender;
            if (!p.hasPermission("simplessentials.broadcast")) {
                p.sendMessage(MSGH.getMessages().getString("Messages.general.no_perm").replaceAll("&", "§"));
                return false;
            }
            if (args.length == 0) {
                p.sendMessage(MSGH.getMessages().getString("Messages.broadcast.usage").replaceAll("&", "§"));
                return true;
            }
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "" + MSGH.getMessages().getString("Messages.broadcast.prefix").replaceAll("&", "§") + "" + this.convertArgsToMsg(args)));
            return true;
        }
    }
    
    private String convertArgsToMsg(final String[] args) {
        final StringBuilder msg = new StringBuilder();
        for (final String arg : args) {
            msg.append(arg).append(" ");
        }
        return msg.toString();
    }
}
