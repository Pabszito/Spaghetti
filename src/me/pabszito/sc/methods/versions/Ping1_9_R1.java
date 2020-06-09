// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.methods.versions;

import net.minecraft.server.v1_9_R1.EntityPlayer;
import org.bukkit.event.Event;
import org.bukkit.Bukkit;
import org.simplessentials.api.events.PlayerPingEvent;
import org.bukkit.craftbukkit.v1_9_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Ping1_9_R1
{
    public int get4Ping(final Player p) {
        final CraftPlayer cp = (CraftPlayer)p;
        final EntityPlayer ep = cp.getHandle();
        final PlayerPingEvent playerPingEvent = new PlayerPingEvent(p, ep.ping);
        Bukkit.getPluginManager().callEvent((Event)playerPingEvent);
        return ep.ping;
    }
}
