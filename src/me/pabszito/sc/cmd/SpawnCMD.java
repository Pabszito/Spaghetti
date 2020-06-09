// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.Location;
import org.bukkit.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class SpawnCMD implements CommandExecutor
{
    private Simplessentials plugin;
    
    public SpawnCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.cant_execute_from_console")));
            return false;
        }
        if (p.hasPermission("simplessentials.spawn")) {
            final FileConfiguration config = this.plugin.getLocations();
            if (config.contains("locations.spawn.x")) {
                final double x = Double.valueOf(config.getString("locations.spawn.x"));
                final double y = Double.valueOf(config.getString("locations.spawn.y"));
                final double z = Double.valueOf(config.getString("locations.spawn.z"));
                final float yaw = Float.valueOf(config.getString("locations.spawn.yaw"));
                final float pitch = Float.valueOf(config.getString("locations.spawn.pitch"));
                final World world = this.plugin.getServer().getWorld(config.getString("locations.spawn.world"));
                final Location l = new Location(world, x, y, z, yaw, pitch);
                p.teleport(l);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.spawn.teleported_to_spawn")));
            }
            else {
                p.sendMessage(MSGH.getMessages().getString("Messages.spawn.not_set").replace("&", "§"));
            }
        }
        else {
            final FileConfiguration config = MSGH.getMessages();
            final String permission = config.getString("Messages.general.no_perm").replace("&", "§");
            p.sendMessage(permission);
        }
        return false;
    }
}
