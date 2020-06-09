// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class FlyCMD implements CommandExecutor
{
    private Simplessentials plugin;
    
    public FlyCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(this.plugin.getConfig().getString("Messages.cantExecuteFromConsole").replaceAll("&", "§"));
            return false;
        }
        final Player p = (Player)sender;
        if (p.getAllowFlight()) {
            if (p.hasPermission("simplessentials.fly")) {
                p.sendMessage(MSGH.getMessages().getString("Messages.fly.fly_disabled").replaceAll("&", "§"));
                p.setAllowFlight(false);
                return false;
            }
            p.sendMessage(MSGH.getMessages().getString("Messages.general.no_perm").replaceAll("&", "§"));
            return false;
        }
        else {
            if (p.hasPermission("simplessentials.fly")) {
                p.setAllowFlight(true);
                p.sendMessage(MSGH.getMessages().getString("Messages.fly.fly_enabled").replaceAll("&", "§"));
                return false;
            }
            p.sendMessage(MSGH.getMessages().getString("Messages.no_perm").replaceAll("&", "§"));
            return false;
        }
    }
}
