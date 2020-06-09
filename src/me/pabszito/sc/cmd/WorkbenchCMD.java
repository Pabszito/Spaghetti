// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class WorkbenchCMD implements CommandExecutor
{
    Simplessentials instance;
    
    public WorkbenchCMD() {
        this.instance = Simplessentials.getInstance();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', this.instance.getConfig().getString("Messages.cantExecuteFromConsole")));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.workbench")) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.instance.getConfig().getString("Messages.craftingTableOpened")));
            p.openWorkbench(p.getLocation(), true);
            return true;
        }
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.instance.getConfig().getString("Messages.noPerm")));
        return false;
    }
}
