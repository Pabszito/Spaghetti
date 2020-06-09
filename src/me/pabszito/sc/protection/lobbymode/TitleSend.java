// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.protection.lobbymode;

import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.EventHandler;
import java.util.Random;
import java.io.File;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerJoinEvent;
import me.pabszito.sc.Simplessentials;
import java.util.List;
import org.bukkit.event.Listener;

public class TitleSend implements ITitleSend, Listener
{
    List<String> EW;
    
    public TitleSend() {
        this.EW = (List<String>)Simplessentials.getInstance().getConfig().getStringList("Config.protection.lobbyMode.enabledWorlds");
    }
    
    @EventHandler
    @Override
    public void sendTitleOnJoin(final PlayerJoinEvent e) {
        if (this.EW.contains(e.getPlayer().getWorld().getName())) {
            try {
                if (Simplessentials.getInstance().getConfig().getBoolean("Config.protection.lobbyMode.others.titleOnJoin")) {}
            }
            catch (NullPointerException ex) {
                Bukkit.getLogger().severe("[Simplessentials] Path Config.protection.lobbyMode.others.titleOnJoin is missing or is null! (boolean returns true/false, this path is returning null). Changing config.yml to the default.");
                final File config = new File(Simplessentials.getInstance().getDataFolder(), "config.yml");
                final Random r = new Random();
                final int id = r.nextInt(1000);
                config.renameTo(new File(Simplessentials.getInstance().getDataFolder(), "corrupted_config" + id + ".yml"));
            }
        }
    }
    
    @EventHandler
    @Override
    public void sendTitleOnWorldChange(final PlayerChangedWorldEvent e) {
    }
}
