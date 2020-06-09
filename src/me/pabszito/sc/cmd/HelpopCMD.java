// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import java.util.Iterator;
import net.md_5.bungee.api.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class HelpopCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            if (args.length >= 1) {
                for (final Player o : Bukkit.getOnlinePlayers()) {
                    if (o.hasPermission("simplessentials.helpop.receive")) {
                        o.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.helpop.helpop_format").replaceAll("%player%", "CONSOLE").replaceAll("%message%", this.helpop(args))));
                    }
                }
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.helpop.helpop_format").replaceAll("%player%", "CONSOLE").replaceAll("%message%", this.helpop(args))));
            }
            else {
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_argument_set")));
            }
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.helpop")) {
            if (args.length >= 1) {
                for (final Player o2 : Bukkit.getOnlinePlayers()) {
                    if (o2.hasPermission("simplessentials.helpop.receive")) {
                        o2.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.helpop.helpop_format").replaceAll("%player%", p.getName()).replaceAll("%message%", this.helpop(args))));
                    }
                }
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.helpop.helpop_format").replaceAll("%player%", p.getName()).replaceAll("%message%", this.helpop(args))));
            }
            else {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_argument_set")));
            }
        }
        return false;
    }
    
    private String helpop(final String[] args) {
        final StringBuilder msg = new StringBuilder();
        for (final String arg : args) {
            msg.append(arg).append(" ");
        }
        return msg.toString();
    }
}
