// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import java.util.Iterator;
import org.bukkit.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class OnlineCMD implements CommandExecutor
{
    private Simplessentials plugin;
    
    public OnlineCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.online.count").replaceAll("%count%", Bukkit.getServer().getOnlinePlayers().size() + "")));
            String msg = null;
            int i = 0;
            for (final Player player : Bukkit.getOnlinePlayers()) {
                final String name = player.getName();
                if (i != 0) {
                    msg = msg + ", " + name;
                    ++i;
                }
                else {
                    msg = ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.online.players_prefix")).replaceAll("%names%", name);
                    ++i;
                }
                Bukkit.getConsoleSender().sendMessage(msg + ".");
            }
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.list")) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.online.count").replaceAll("%count%", Bukkit.getServer().getOnlinePlayers().size() + "")));
            String msg2 = null;
            int j = 0;
            for (final Player player2 : Bukkit.getOnlinePlayers()) {
                final String name2 = player2.getName();
                if (j != 0) {
                    msg2 = msg2 + ", " + name2;
                    ++j;
                }
                else {
                    msg2 = ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.online.players_prefix")).replaceAll("%names%", name2);
                    ++j;
                }
            }
            p.sendMessage(msg2 + ".");
            return false;
        }
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
        return true;
    }
}
