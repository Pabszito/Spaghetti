// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.Material;
import org.bukkit.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class HatCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.cantExecuteFromConsole")));
            return false;
        }
        final Player p = (Player)sender;
        if (!p.hasPermission("simplessentials.hat")) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
            return false;
        }
        if (!p.getItemInHand().getType().equals((Object)Material.AIR)) {
            p.getInventory().setHelmet(p.getItemInHand());
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.hat.enjoy_your_hat")));
            return true;
        }
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.hat.cannot_be_air")));
        return true;
    }
}
