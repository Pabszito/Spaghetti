// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import java.util.List;
import net.md_5.bungee.api.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class RulesCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.cant_execute_from_console")));
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.rules")) {
            final List<String> msg = (List<String>)MSGH.getMessages().getStringList("Messages.rules.rules");
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.rules.title")));
            for (int i = 0; i < msg.size(); ++i) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', (String)msg.get(i)));
            }
        }
        else {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
        }
        return false;
    }
}
