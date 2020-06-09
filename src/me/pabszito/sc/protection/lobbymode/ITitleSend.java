// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.protection.lobbymode;

import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public interface ITitleSend
{
    void sendTitleOnJoin(final PlayerJoinEvent p0);
    
    void sendTitleOnWorldChange(final PlayerChangedWorldEvent p0);
}
