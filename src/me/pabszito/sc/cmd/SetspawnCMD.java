// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.Location;
import net.md_5.bungee.api.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class SetspawnCMD implements CommandExecutor
{
    private Simplessentials plugin;
    
    public SetspawnCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.cant_execute_from_console")));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.setspawn")) {
            final Location l = p.getLocation();
            final double x = l.getX();
            final double y = l.getY();
            final double z = l.getZ();
            final String world = l.getWorld().getName();
            final float yaw = l.getYaw();
            final float pitch = l.getPitch();
            final FileConfiguration config = this.plugin.getLocations();
            config.set("locations.spawn.world", (Object)world);
            config.set("locations.spawn.x", (Object)x);
            config.set("locations.spawn.y", (Object)y);
            config.set("locations.spawn.z", (Object)z);
            config.set("locations.spawn.yaw", (Object)yaw);
            config.set("locations.spawn.pitch", (Object)pitch);
            this.plugin.saveLocations();
            final String setspawn = MSGH.getMessages().getString("Messages.spawn.spawn_set").replace("&", "§");
            p.sendMessage(setspawn);
            return true;
        }
        final FileConfiguration config2 = MSGH.getMessages();
        final String permission = config2.getString("Messages.general.no_perm").replace("&", "§");
        p.sendMessage(permission);
        return true;
    }
}
