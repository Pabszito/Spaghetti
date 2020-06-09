// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.command.CommandExecutor;

public class EnderchestCMD implements CommandExecutor
{
    FileConfiguration instance;
    
    public EnderchestCMD() {
        this.instance = MSGH.getMessages();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', this.instance.getString("Messages.cantExecuteFromConsole")));
            return false;
        }
        final Player p = (Player)sender;
        if (!p.hasPermission("simplessentials.enderchest")) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.instance.getString("Messages.general.no_perm")));
            return false;
        }
        if (args.length == 0) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.instance.getString("Messages.enderchest.opening_enderchest")));
            p.openInventory(p.getEnderChest());
            return true;
        }
        if (args.length == 1) {
            if (!p.hasPermission("simplessentials.enderchest.others")) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.instance.getString("Messages.general.no_perm")));
                return false;
            }
            final Player p2 = Bukkit.getPlayerExact(args[0]);
            if (Bukkit.getOnlinePlayers().contains(p2)) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.instance.getString("Messages.enderchest.opening_enderchest_other").replaceAll("%player%", p2.getName())));
                p.openInventory(p2.getEnderChest());
                return true;
            }
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.instance.getString("Messages.general.player_not_found")));
            return false;
        }
        else {
            if (args.length >= 3) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.instance.getString("Messages.general.no_valid_argument")));
                return false;
            }
            return false;
        }
    }
}
