// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.protection.lobbymode;

import org.bukkit.event.EventHandler;
import org.bukkit.event.weather.WeatherChangeEvent;
import me.pabszito.sc.Simplessentials;
import java.util.List;
import org.bukkit.event.Listener;

public class WeatherListener implements IWeather, Listener
{
    List<String> EW;
    
    public WeatherListener() {
        this.EW = (List<String>)Simplessentials.getInstance().getConfig().getStringList("Config.protection.lobbyMode.enabledWorlds");
    }
    
    @EventHandler
    @Override
    public void disableWeather(final WeatherChangeEvent e) {
        if (this.EW.contains(e.getWorld().getName()) && Simplessentials.getInstance().getConfig().getBoolean("Config.protection.lobbyMode.blockWeather")) {
            e.setCancelled(true);
        }
    }
}
