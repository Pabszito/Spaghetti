// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.hook.bungeecord;

import org.spigotmc.SpigotConfig;
import org.bukkit.event.EventHandler;
import com.google.common.io.ByteArrayDataOutput;
import org.bukkit.plugin.Plugin;
import org.bukkit.event.player.PlayerKickEvent;
import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import org.bukkit.entity.Player;
import me.pabszito.sc.Simplessentials;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class BungeeCordConnecter implements PluginMessageListener, Listener
{
    public void hook() {
        if (this.hasBungee()) {
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &rDetected BungeeCord mode!"));
            if (!Simplessentials.getInstance().getConfig().contains("Config.bungeecord.sendToLobbyOnKick")) {
                Simplessentials.getInstance().getConfig().set("Config.bungeecord.sendToLobbyOnKick", (Object)false);
            }
            if (!Simplessentials.getInstance().getConfig().contains("Config.bungeecord.lobbyServer")) {
                Simplessentials.getInstance().getConfig().set("Config.bungeecord.lobbyServer", (Object)"lobby");
            }
        }
    }
    
    public void onPluginMessageReceived(final String channel, final Player player, final byte[] message) {
        if (!channel.equals("BungeeCord")) {
            return;
        }
        final ByteArrayDataInput in = ByteStreams.newDataInput(message);
        final String subchannel = in.readUTF();
        if (subchannel.equals("ConnectOther")) {}
    }
    
    @EventHandler
    public void onKick(final PlayerKickEvent e) {
        if (Simplessentials.getInstance().getConfig().getBoolean("Config.bungeecord.sendToLobbyOnKick")) {
            final ByteArrayDataOutput out = ByteStreams.newDataOutput();
            out.writeUTF("ConnectOther");
            out.writeUTF(e.getPlayer().getName());
            out.writeUTF(Simplessentials.getInstance().getConfig().getString("Config.bungeecord.lobbyServer"));
            e.getPlayer().sendPluginMessage((Plugin)Simplessentials.getInstance(), "BungeeCord", out.toByteArray());
        }
    }
    
    public boolean hasBungee() {
        final boolean bungee = SpigotConfig.bungee;
        return bungee;
    }
}
