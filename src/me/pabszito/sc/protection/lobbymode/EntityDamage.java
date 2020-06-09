// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.protection.lobbymode;

import org.bukkit.event.EventHandler;
import org.bukkit.World;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import me.pabszito.sc.Simplessentials;
import java.util.List;
import org.bukkit.event.Listener;

public class EntityDamage implements IEntityDamage, Listener
{
    List<String> ew;
    
    public EntityDamage() {
        this.ew = (List<String>)Simplessentials.getInstance().getConfig().getStringList("Config.protection.lobbyMode.enabledWorlds");
    }
    
    @EventHandler
    @Override
    public void cancelEntityDamage(final EntityDamageByEntityEvent e) {
        final World w = e.getDamager().getWorld();
        if (this.ew.contains(w.getName()) && Simplessentials.getInstance().getConfig().getBoolean("Config.protection.lobbyMode.pvp.enabled") && e.getDamager().getType().equals((Object)EntityType.PLAYER) && e.getEntity().getType().equals((Object)EntityType.PLAYER)) {
            e.setCancelled(true);
            e.getDamager().sendMessage(ChatColor.translateAlternateColorCodes('&', Simplessentials.getInstance().getConfig().getString("Config.protection.lobbyMode.pvp.denied")));
        }
    }
}
