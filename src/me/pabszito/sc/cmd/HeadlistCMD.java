// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import me.pabszito.sc.heads.HeadDBHandler;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class HeadlistCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        final Player p = (Player)sender;
        final HeadDBHandler hdb = new HeadDBHandler();
        hdb.createInventory(p);
        return false;
    }
}
