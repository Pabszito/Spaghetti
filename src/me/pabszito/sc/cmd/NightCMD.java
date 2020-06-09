// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import java.util.Iterator;
import net.md_5.bungee.api.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.World;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class NightCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            for (final World w : Bukkit.getServer().getWorlds()) {
                w.setTime(14000L);
            }
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.time.night")));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.time")) {
            for (final World w2 : Bukkit.getServer().getWorlds()) {
                w2.setTime(14000L);
            }
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.time.night")));
            return true;
        }
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
        return true;
    }
}
