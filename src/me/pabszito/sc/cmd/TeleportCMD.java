// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class TeleportCMD implements CommandExecutor
{
    private Simplessentials plugin;
    
    public TeleportCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.cant_execute_from_console")));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.teleport")) {
            if (args.length == 0) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.teleport.usage")));
            }
            else if (args.length == 1) {
                final Player target = Bukkit.getPlayerExact(args[0]);
                if (Bukkit.getOnlinePlayers().contains(target)) {
                    p.teleport(target.getLocation());
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.teleport.teleported_to_target").replaceAll("%player%", target.getName())));
                }
                else {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.player_not_found")));
                }
            }
            else if (args.length == 2) {
                final Player target2 = Bukkit.getPlayerExact(args[0]);
                final Player target3 = Bukkit.getPlayerExact(args[1]);
                if (p.hasPermission("simplessentials.teleport.others")) {
                    if (Bukkit.getOnlinePlayers().contains(target2) && Bukkit.getOnlinePlayers().contains(target3)) {
                        target2.teleport(target3.getLocation());
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.teleport.player_teleported_to_target").replaceAll("%player%", target2.getName()).replaceAll("%target%", target3.getName())));
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
