// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.inventory.ItemStack;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class ClearCMD implements CommandExecutor
{
    private Simplessentials plugin;
    
    public ClearCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(MSGH.getMessages().getString("Messages.general.cant_execute_from_console").replaceAll("&", "\u00c2§"));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.clear")) {
            p.getInventory().setArmorContents((ItemStack[])null);
            p.getInventory().clear();
            p.sendMessage(MSGH.getMessages().getString("Messages.clear.inventory_cleared").replaceAll("&", "\u00c2§"));
            return true;
        }
        p.sendMessage(MSGH.getMessages().getString("Messages.general.no_perm").replaceAll("&", "\u00c2§"));
        return true;
    }
}
