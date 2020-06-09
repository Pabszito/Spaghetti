// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.ChatColor;
import me.pabszito.sc.utilities.ServerUtil;
import me.pabszito.sc.confighandler.MSGH;
import java.util.logging.Level;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.UUID;
import java.util.HashMap;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class AFKCMD implements Listener, CommandExecutor
{
    static HashMap<UUID, Boolean> afk;
    int times;
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            ServerUtil.log(Level.INFO, MSGH.getMessages().getString("Messages.general.cant_execute_from_console"));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.afk")) {
            if (this.times < 1 && !AFKCMD.afk.containsKey(p.getUniqueId())) {
                AFKCMD.afk.put(p.getUniqueId(), false);
                ++this.times;
            }
            if (!AFKCMD.afk.containsKey(p.getUniqueId())) {
                ServerUtil.get().broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.afk.is_now_afk").replaceAll("%player%", p.getName())));
                AFKCMD.afk.put(p.getUniqueId(), true);
            }
            else {
                AFKCMD.afk.put(p.getUniqueId(), false);
                ServerUtil.get().broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.afk.is_no_more_afk").replaceAll("%player%", p.getName())));
            }
            return false;
        }
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
        return false;
    }
    
    @EventHandler
    public void a(final PlayerMoveEvent e) {
        final Player p = e.getPlayer();
        if (AFKCMD.afk.containsValue(true)) {
            AFKCMD.afk.put(p.getUniqueId(), false);
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.afk.is_no_more_afk").replaceAll("%player%", p.getName())));
        }
    }
    
    @EventHandler
    public void b(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
        if (AFKCMD.afk.containsValue(true)) {
            AFKCMD.afk.put(p.getUniqueId(), false);
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.afk.is_no_more_afk").replaceAll("%player%", p.getName())));
        }
    }
    
    @EventHandler
    public void c(final PlayerEggThrowEvent e) {
        final Player p = e.getPlayer();
        if (AFKCMD.afk.containsValue(true)) {
            AFKCMD.afk.put(p.getUniqueId(), false);
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.afk.is_no_more_afk").replaceAll("%player%", p.getName())));
        }
    }
    
    @EventHandler
    public void d(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (AFKCMD.afk.containsValue(true)) {
            AFKCMD.afk.put(p.getUniqueId(), false);
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.afk.is_no_more_afk").replaceAll("%player%", p.getName())));
        }
    }
    
    @EventHandler
    public void e(final InventoryCloseEvent e) {
        final Player p = (Player)e.getPlayer();
        if (AFKCMD.afk.containsValue(true)) {
            AFKCMD.afk.put(p.getUniqueId(), false);
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.afk.is_no_more_afk").replaceAll("%player%", p.getName())));
        }
    }
    
    @EventHandler
    public void f(final PlayerDropItemEvent e) {
        final Player p = e.getPlayer();
        if (AFKCMD.afk.containsValue(true)) {
            AFKCMD.afk.put(p.getUniqueId(), false);
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.afk.is_no_more_afk").replaceAll("%player%", p.getName())));
        }
    }
    
    @EventHandler
    public void g(final PlayerBedEnterEvent e) {
        if (AFKCMD.afk.containsValue(true)) {
            AFKCMD.afk.put(e.getPlayer().getUniqueId(), false);
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.afk.is_no_more_afk").replaceAll("%player%", e.getPlayer().getName())));
        }
    }
    
    @EventHandler
    public void h(final PlayerPortalEvent e) {
        if (AFKCMD.afk.containsKey(e.getPlayer().getUniqueId())) {
            AFKCMD.afk.put(e.getPlayer().getUniqueId(), false);
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.afk.is_no_more_afk").replaceAll("%player%", e.getPlayer().getName())));
        }
    }
    
    @EventHandler
    public void g(final AsyncPlayerChatEvent e) {
        if (AFKCMD.afk.containsValue(true)) {
            AFKCMD.afk.put(e.getPlayer().getUniqueId(), false);
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.afk.is_no_more_afk").replaceAll("%player%", e.getPlayer().getName())));
        }
    }
    
    static {
        AFKCMD.afk = new HashMap<UUID, Boolean>();
    }
}
