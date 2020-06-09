// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import java.util.List;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class CustomTextCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            final List<String> msg = (List<String>)MSGH.getMessages().getStringList("Messages.customtext.text");
            for (int i = 0; i < msg.size(); ++i) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', (String)msg.get(i)));
            }
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission(MSGH.getMessages().getString("Messages.customtext.permission"))) {
            final List<String> msg2 = (List<String>)MSGH.getMessages().getStringList("Messages.customtext.text");
            for (int j = 0; j < msg2.size(); ++j) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', (String)msg2.get(j)));
            }
            return false;
        }
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
        return false;
    }
}
