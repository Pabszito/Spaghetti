// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.Bukkit;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class SuicideCMD implements CommandExecutor
{
    private Simplessentials plugin;
    
    public SuicideCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(MSGH.getMessages().getString("Messages.general.cant_execute_from_console").replaceAll("&", "§"));
            return false;
        }
        final Player p = (Player)sender;
        if (!p.hasPermission("simplessentials.suicide")) {
            p.sendMessage(MSGH.getMessages().getString("Messages.general.no_perm").replaceAll("&", "§"));
            return false;
        }
        if (p.getHealth() == 0.0) {
            p.sendMessage(MSGH.getMessages().getString("Messages.suicide.already_dead").replaceAll("&", "§"));
            return false;
        }
        p.setHealth(0.0);
        p.setFoodLevel(0);
        p.sendMessage(MSGH.getMessages().getString("Messages.suicide.message").replaceAll("&", "§"));
        Bukkit.broadcastMessage(MSGH.getMessages().getString("Messages.suicide.broadcast").replaceAll("&", "§").replaceAll("%player%", p.getName()));
        return true;
    }
}
