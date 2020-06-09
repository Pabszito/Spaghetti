// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.hook.cherrychat;

import org.bukkit.Bukkit;

public class CherryHook
{
    public boolean getHook() {
        return Bukkit.getServer().getPluginManager().getPlugin("CherryChat") != null;
    }
}
