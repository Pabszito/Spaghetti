// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.methods.versions;

import net.minecraft.server.v1_8_R3.EntityPlayer;
import org.bukkit.event.Event;
import org.bukkit.Bukkit;
import org.simplessentials.api.events.PlayerPingEvent;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Ping1_8_R3
{
    public int get3Ping(final Player player) {
        final CraftPlayer cp = (CraftPlayer)player;
        final EntityPlayer ep = cp.getHandle();
        final PlayerPingEvent playerPingEvent = new PlayerPingEvent(player, ep.ping);
        Bukkit.getPluginManager().callEvent((Event)playerPingEvent);
        return ep.ping;
    }
}
