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

public class HealCMD implements CommandExecutor
{
    private Simplessentials plugin;
    
    public HealCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(MSGH.getMessages().getString("Messages.general.cant_execute_from_console").replaceAll("&", "§"));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.heal")) {
            p.setHealth(20.0);
            p.sendMessage(MSGH.getMessages().getString("Messages.heal.you_have_been_healed").replaceAll("&", "§"));
            return true;
        }
        p.sendMessage(MSGH.getMessages().getString("Messages.general.no_perm").replaceAll("&", "§"));
        return true;
    }
}
