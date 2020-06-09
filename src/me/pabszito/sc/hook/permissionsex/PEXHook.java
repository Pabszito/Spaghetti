// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.hook.permissionsex;

import org.bukkit.ChatColor;
import org.bukkit.Bukkit;

public class PEXHook
{
    public static boolean pex;
    
    public boolean getHook() {
        return Bukkit.getServer().getPluginManager().getPlugin("PermissionsEx") != null;
    }
    
    public void hook() {
        if (this.getHook()) {
            PEXHook.pex = true;
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &rHooked with PermissionsEx version " + Bukkit.getServer().getPluginManager().getPlugin("PermissionsEx").getDescription().getVersion()));
        }
    }
    
    static {
        PEXHook.pex = false;
    }
}
