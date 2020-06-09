// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.protection.lobbymode;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPlaceEvent;

public interface IBlockPlace
{
    @EventHandler
    void disableBlockPlace(final BlockPlaceEvent p0);
}
