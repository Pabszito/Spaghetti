// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import java.util.Iterator;
import me.pabszito.sc.confighandler.MSGH;
import net.md_5.bungee.api.ChatColor;
import me.pabszito.sc.Simplessentials;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class KickallCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            if (args.length == 0) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', Simplessentials.getInstance().getConfig().getString("Messages.kickedAllPlayers")));
                for (final Player o : Bukkit.getOnlinePlayers()) {
                    o.kickPlayer(Simplessentials.getInstance().getConfig().getString("Config.defaultKickReason"));
                }
            }
            else if (args.length >= 1) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', Simplessentials.getInstance().getConfig().getString("Messages.kickedAllPlayers")));
                for (final Player o : Bukkit.getOnlinePlayers()) {
                    o.kickPlayer(this.convertArgsToReason(args));
                }
            }
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.kickall")) {
            if (args.length == 0) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.kickall.kicked_all_players")));
                for (final Player o2 : Bukkit.getOnlinePlayers()) {
                    if (o2.getName().equalsIgnoreCase(p.getName())) {
                        continue;
                    }
                    o2.kickPlayer(Simplessentials.getInstance().getConfig().getString("Config.defaultKickReason"));
                }
            }
            else if (args.length >= 1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.kickall.kicked_all_players")));
                for (final Player o2 : Bukkit.getOnlinePlayers()) {
                    if (o2.getName().equalsIgnoreCase(p.getName())) {
                        continue;
                    }
                    o2.kickPlayer(this.convertArgsToReason(args));
                }
            }
            return false;
        }
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.no_perm")));
        return false;
    }
    
    private String convertArgsToReason(final String[] args) {
        final StringBuilder msg = new StringBuilder();
        for (final String arg : args) {
            msg.append(arg).append(" ");
        }
        return msg.toString();
    }
}
