// 
// Decompiled by Procyon v0.5.36
// 

package org.simplessentials.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Event;

public class PlayerTitleEvent extends Event
{
    private static final HandlerList handlers;
    private Player player;
    private String title;
    private String subtitle;
    private boolean cancelled;
    
    public PlayerTitleEvent(final Player player, final String title, final String subtitle) {
        this.cancelled = false;
        this.player = player;
        this.title = title;
        this.subtitle = subtitle;
    }
    
    public HandlerList getHandlers() {
        return PlayerTitleEvent.handlers;
    }
    
    public static HandlerList getHandlerList() {
        return PlayerTitleEvent.handlers;
    }
    
    public Player getPlayer() {
        return this.player;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(final String title) {
        this.title = title;
    }
    
    public String getSubtitle() {
        return this.subtitle;
    }
    
    public void setSubtitle(final String subtitle) {
        this.subtitle = subtitle;
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
