// 
// Decompiled by Procyon v0.5.36
// 

package org.simplessentials.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Event;

public class PlayerPingEvent extends Event
{
    private static final HandlerList handlers;
    private Player player;
    private int ping;
    
    public PlayerPingEvent(final Player player, final int ping) {
        this.player = player;
        this.ping = ping;
    }
    
    public HandlerList getHandlers() {
        return PlayerPingEvent.handlers;
    }
    
    public static HandlerList getHandlerList() {
        return PlayerPingEvent.handlers;
    }
    
    public Player getPlayer() {
        return this.player;
    }
    
    static {
        handlers = new HandlerList();
    }
}
