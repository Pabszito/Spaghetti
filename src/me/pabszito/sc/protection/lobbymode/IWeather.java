// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.protection.lobbymode;

import org.bukkit.event.EventHandler;
import org.bukkit.event.weather.WeatherChangeEvent;

public interface IWeather
{
    @EventHandler
    void disableWeather(final WeatherChangeEvent p0);
}
