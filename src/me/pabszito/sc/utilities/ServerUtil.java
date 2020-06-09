// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.utilities;

import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import java.util.logging.Level;
import me.pabszito.sc.Simplessentials;
import org.bukkit.Server;

public class ServerUtil
{
    public static Server get() {
        return Simplessentials.getInstance().getServer();
    }
    
    public static String getMOTD() {
        return get().getMotd();
    }
    
    public static String getBukkitVersion() {
        return get().getBukkitVersion();
    }
    
    public static boolean hasWhitelist() {
        return get().hasWhitelist();
    }
    
    public static int getPlayers() {
        return get().getOnlinePlayers().size();
    }
    
    public static int getMaxPlayers() {
        return get().getMaxPlayers();
    }
    
    public static void log(final Level level, final String message) {
        Bukkit.getLogger().log(level, ChatColor.translateAlternateColorCodes('&', message));
    }
}
