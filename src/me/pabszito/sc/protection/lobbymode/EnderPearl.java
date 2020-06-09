// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.protection.lobbymode;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;
import me.pabszito.sc.Simplessentials;
import java.util.List;
import org.bukkit.event.Listener;

public class EnderPearl implements IEnderPearl, Listener
{
    List<String> ew;
    
    public EnderPearl() {
        this.ew = (List<String>)Simplessentials.getInstance().getConfig().getStringList("Config.protection.lobbyMode.enabledWorlds");
    }
    
    @Override
    public void cancelEnderPearl(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        final World w = p.getWorld();
        if (this.ew.contains(w.getName()) && Simplessentials.getInstance().getConfig().getBoolean("Config.protection.lobbyMode.enderPearls.enabled") && p.getItemInHand().getType().equals((Object)Material.ENDER_PEARL)) {
            e.setCancelled(true);
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', Simplessentials.getInstance().getConfig().getString("Config.protection.lobbyMode.enderPearls.denied")));
        }
    }
}
