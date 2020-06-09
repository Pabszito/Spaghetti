// 
// Decompiled by Procyon v0.5.36
// 

package org.simplessentials.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Event;

public class PlayerActionbarEvent extends Event
{
    private static final HandlerList handlers;
    private Player player;
    private String text;
    private boolean cancelled;
    
    public PlayerActionbarEvent(final Player p, final String text) {
        this.cancelled = false;
        this.player = this.player;
        this.text = text;
    }
    
    public HandlerList getHandlers() {
        return PlayerActionbarEvent.handlers;
    }
    
    public static HandlerList getHandlerList() {
        return PlayerActionbarEvent.handlers;
    }
    
    public Player getPlayer() {
        return this.player;
    }
    
    public String getText() {
        return this.text;
    }
    
    public void setText(final String text) {
        this.text = text;
    }
    
    public boolean isCancelled() {
        return this.cancelled;
    }
    
    public void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }
    
    static {
        handlers = new HandlerList();
    }
}
