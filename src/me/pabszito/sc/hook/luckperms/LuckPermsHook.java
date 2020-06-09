// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.hook.luckperms;

import me.lucko.luckperms.api.Group;
import me.lucko.luckperms.LuckPerms;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;

public class LuckPermsHook
{
    public static boolean luckperms;
    
    public boolean getHook() {
        return Bukkit.getServer().getPluginManager().getPlugin("LuckPerms") != null;
    }
    
    public void hook() {
        if (this.getHook()) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &rDetected LuckPerms version " + Bukkit.getServer().getPluginManager().getPlugin("LuckPerms").getDescription().getVersion()));
            for (final String string : getGroups()) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &rDetected groups: " + string));
            }
            LuckPermsHook.luckperms = true;
        }
        else {
            LuckPermsHook.luckperms = false;
        }
    }
    
    public static List<String> getGroups() {
        final List<String> groups = new ArrayList<String>();
        for (final Group group : LuckPerms.getApi().getGroups()) {
            groups.add(group.getName());
        }
        return groups;
    }
    
    static {
        LuckPermsHook.luckperms = false;
    }
}
