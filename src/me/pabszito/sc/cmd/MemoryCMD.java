// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.Chunk;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import org.bukkit.ChatColor;
import org.bukkit.World;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class MemoryCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(MSGH.getMessages().getString("Messages.memory.asignated_memory").replaceAll("&", "§").replaceAll("%memory%", Runtime.getRuntime().totalMemory() / 1024L / 1024L + ""));
            Bukkit.getConsoleSender().sendMessage(MSGH.getMessages().getString("Messages.memory.max_memory").replaceAll("&", "§").replaceAll("%memory%", Runtime.getRuntime().maxMemory() / 1024L / 1024L + ""));
            Bukkit.getConsoleSender().sendMessage(MSGH.getMessages().getString("Messages.memory.free_memory").replaceAll("&", "§").replaceAll("%memory%", Runtime.getRuntime().freeMemory() / 1024L / 1024L + ""));
            final List<World> worlds = (List<World>)Bukkit.getServer().getWorlds();
            for (final World w : worlds) {
                String worldType = MSGH.getMessages().getString("Messages.memory.worldtype_overworld");
                switch (w.getEnvironment()) {
                    case NETHER: {
                        worldType = MSGH.getMessages().getString("Messages.memory.worldtype_nether");
                        break;
                    }
                    case THE_END: {
                        worldType = MSGH.getMessages().getString("Messages.memory.worldtype_end");
                        break;
                    }
                }
                int tileEntities = 0;
                try {
                    for (final Chunk chunk : w.getLoadedChunks()) {
                        tileEntities += chunk.getTileEntities().length;
                    }
                }
                catch (ClassCastException ex) {
                    Bukkit.getLogger().severe("[Simplessentials] Cannot get chunk data at " + w + ex);
                }
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.memory.worlds").replaceAll("%world%", w.getName()).replaceAll("%worldtype%", worldType).replaceAll("%loadedchunks%", w.getLoadedChunks().length + "").replaceAll("%entities%", w.getEntities().size() + "").replaceAll("%tileentities%", tileEntities + "")));
            }
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.memory")) {
            p.sendMessage(MSGH.getMessages().getString("Messages.memory.asignated_memory").replaceAll("&", "§").replaceAll("%memory%", Runtime.getRuntime().totalMemory() / 1024L / 1024L + ""));
            p.sendMessage(MSGH.getMessages().getString("Messages.memory.max_memory").replaceAll("&", "§").replaceAll("%memory%", Runtime.getRuntime().maxMemory() / 1024L / 1024L + ""));
            p.sendMessage(MSGH.getMessages().getString("Messages.memory.free_memory").replaceAll("&", "§").replaceAll("%memory%", Runtime.getRuntime().freeMemory() / 1024L / 1024L + ""));
            final List<World> worlds2 = (List<World>)Bukkit.getServer().getWorlds();
            for (final World w2 : worlds2) {
                String worldType2 = MSGH.getMessages().getString("Messages.memory.worldtype_overworld");
                switch (w2.getEnvironment()) {
                    case NETHER: {
                        worldType2 = MSGH.getMessages().getString("Messages.memory.worldtype_nether");
                        break;
                    }
                    case THE_END: {
                        worldType2 = MSGH.getMessages().getString("Messages.memory.worldtype_end");
                        break;
                    }
                }
                int tileEntities2 = 0;
                try {
                    for (final Chunk chunk2 : w2.getLoadedChunks()) {
                        tileEntities2 += chunk2.getTileEntities().length;
                    }
                }
                catch (ClassCastException ex2) {
                    Bukkit.getLogger().log(Level.SEVERE, "[Simplessentials] Cannot get chunk data at " + w2, ex2);
                }
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.memory.worlds").replaceAll("%world%", w2.getName()).replaceAll("%worldtype%", worldType2).replaceAll("%loadedchunks%", w2.getLoadedChunks().length + "").replaceAll("%entities%", w2.getEntities().size() + "").replaceAll("%tileentities%", tileEntities2 + "")));
            }
        }
        else {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
        }
        return false;
    }
}
