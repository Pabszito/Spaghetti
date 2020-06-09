// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.methods.versions;

import net.minecraft.server.v1_8_R1.IChatBaseComponent;
import net.minecraft.server.v1_8_R1.Packet;
import org.bukkit.craftbukkit.v1_8_R1.entity.CraftPlayer;
import org.bukkit.event.Event;
import org.bukkit.Bukkit;
import org.simplessentials.api.events.PlayerActionbarEvent;
import net.minecraft.server.v1_8_R1.PacketPlayOutChat;
import net.minecraft.server.v1_8_R1.ChatSerializer;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Actionbar1_8_R1
{
    public static void sendActionText(final Player player, final String message) {
        final String text = ChatColor.translateAlternateColorCodes('&', message);
        final IChatBaseComponent icbc = ChatSerializer.a("{\"text\": \"" + text + "\"}");
        final PacketPlayOutChat bar = new PacketPlayOutChat(icbc, (byte)2);
        final PlayerActionbarEvent playerActionbarEvent = new PlayerActionbarEvent(player, message);
        Bukkit.getPluginManager().callEvent((Event)playerActionbarEvent);
        if (playerActionbarEvent.isCancelled()) {
            return;
        }
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)bar);
    }
}
