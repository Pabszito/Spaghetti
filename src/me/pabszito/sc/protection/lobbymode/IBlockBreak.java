// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.protection.lobbymode;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;

public interface IBlockBreak
{
    @EventHandler
    void disableBlockBreak(final BlockBreakEvent p0);
}
