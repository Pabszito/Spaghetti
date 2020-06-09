// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.protection.lobbymode;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.event.block.BlockBreakEvent;
import me.pabszito.sc.Simplessentials;
import java.util.List;
import org.bukkit.event.Listener;

public class BlockBreakListener implements IBlockBreak, Listener
{
    List<String> EW;
    
    public BlockBreakListener() {
        this.EW = (List<String>)Simplessentials.getInstance().getConfig().getStringList("Config.protection.lobbyMode.enabledWorlds");
    }
    
    @EventHandler
    @Override
    public void disableBlockBreak(final BlockBreakEvent e) {
        final Player p = e.getPlayer();
        if (this.EW.contains(p.getLocation().getWorld().getName()) && Simplessentials.getInstance().getConfig().getBoolean("Config.protection.lobbyMode.blockBreak.enabled")) {
            if (!p.hasPermission("simplessentials.bypass.lobbyprotection.blockbreak")) {
                e.setCancelled(true);
                if (Simplessentials.getInstance().getConfig().getBoolean("Config.protection.lobbyMode.deniedMessage")) {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Simplessentials.getInstance().getConfig().getString("Config.protection.lobbyMode.blockBreak.denied")));
                }
            }
            else {
                e.setCancelled(false);
            }
        }
    }
}
