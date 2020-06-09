// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bukkit.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class NickCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.cant_execute_from_console")));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.nick")) {
            if (args.length == 0) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.nick.usage")));
                return false;
            }
            if (args.length == 1) {
                final Pattern pattern = Pattern.compile("[a-zA-Z]");
                final Matcher m = pattern.matcher(args[0]);
                if (m.find()) {
                    p.setDisplayName(ChatColor.translateAlternateColorCodes('&', args[0] + "&r"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.nick.displayname_set").replaceAll("%displayname%", args[0] + "&r")));
                    return false;
                }
                sender.sendMessage(ChatColor.RED + "No puedes usar ese caracter!");
                return true;
            }
            else if (args.length >= 2) {
                final Player p2 = Bukkit.getPlayerExact(args[0]);
                if (p.hasPermission("simplessentials.nick.others")) {
                    if (Bukkit.getOnlinePlayers().contains(p2)) {
                        if (args[1].equalsIgnoreCase("off")) {
                            p2.setDisplayName(p2.getName());
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.nick.displayname_set").replaceAll("%displayname%", p2.getName())));
                            p2.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.nick.displayname_reset")));
                        }
                        p2.setDisplayName(ChatColor.translateAlternateColorCodes('&', args[0] + "&r"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.nick.displayname_set_other").replaceAll("%player%", p2.getName()).replaceAll("%displayname%", args[1] + "&r")));
                        p2.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.nick.displayname_updated").replaceAll("%displayname%", args[1] + "&r")));
                    }
                    else {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.player_not_found")));
                    }
                }
                else {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
                }
            }
        }
        return false;
    }
}
