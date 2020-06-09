// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.block.Block;
import org.bukkit.Location;
import me.pabszito.sc.confighandler.MSGH;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class TopCMD implements CommandExecutor
{
    private Simplessentials plugin;
    
    public TopCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', Simplessentials.getInstance().getConfig().getString("Messages.cantExecuteFromConsole")));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.top")) {
            final Location l = p.getLocation();
            final Block b = p.getWorld().getHighestBlockAt(l.getBlockX(), l.getBlockZ());
            p.teleport(b.getLocation().add(0.5, 1.0, 0.5));
            final FileConfiguration config = MSGH.getMessages();
            final String top = config.getString("Messages.top.teleported_to_the_top").replace("&", "§");
            p.sendMessage(top);
        }
        else {
            final String permission = Simplessentials.getInstance().getConfig().getString("Messages.general.no_perm").replace("&", "§");
            p.sendMessage(permission);
        }
        return true;
    }
}
