// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class CoreCMD implements CommandExecutor
{
    private Simplessentials plugin;
    
    public CoreCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender p, final Command cmd, final String label, final String[] args) {
        if (!(p instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fRunning Simplessentials version " + Simplessentials.getInstance().getDescription().getVersion() + "."));
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fPlugin configuration reloaded; coded by &aPabszito&f."));
            return false;
        }
        if (p.hasPermission("simplessentials.reload")) {
            this.plugin.reloadLocations();
            this.plugin.reloadConfig();
            MSGH.reloadMessages();
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fRunning Simplessentials version " + Simplessentials.getInstance().getDescription().getVersion() + "."));
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fPlugin reloaded, made by &aPabszito&f."));
            return true;
        }
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Simplessentials.getInstance().getConfig().getString("Messages.noPerm")));
        return true;
    }
}
