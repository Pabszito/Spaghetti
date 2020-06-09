// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.events.listener;

import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.server.ServerListPingEvent;

public interface IServerListener
{
    void changeMOTD(final ServerListPingEvent p0);
    
    void loginResults(final PlayerLoginEvent p0);
}
