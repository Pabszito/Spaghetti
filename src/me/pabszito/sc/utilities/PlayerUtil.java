// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.utilities;

import java.util.UUID;
import org.bukkit.potion.PotionEffect;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class PlayerUtil
{
    public static String name(final Player p) {
        return p.getName();
    }
    
    public static String customName(final Player p) {
        return p.getCustomName();
    }
    
    public static String displayName(final Player p) {
        return p.getDisplayName();
    }
    
    public static Location loc(final Player p) {
        return p.getLocation();
    }
    
    public static void msg(final Player p, final String msg) {
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }
    
    public static void potion(final Player p, final PotionEffect potioneffect) {
        p.addPotionEffect(potioneffect);
    }
    
    public static float getExp(final Player p) {
        return p.getExp();
    }
    
    public static UUID getUUID(final Player p) {
        return p.getUniqueId();
    }
}
