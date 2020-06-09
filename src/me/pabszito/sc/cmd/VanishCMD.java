// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import java.util.Iterator;
import org.bukkit.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import java.util.UUID;
import java.util.HashMap;
import org.bukkit.event.Listener;
import org.bukkit.command.CommandExecutor;

public class VanishCMD implements CommandExecutor, Listener
{
    static HashMap<UUID, Boolean> vanish;
    private final Simplessentials instance;
    
    public VanishCMD(final Simplessentials plugin) {
        this.instance = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.cant_execute_from_console")));
            return false;
        }
        final Player p = (Player)sender;
        if (VanishCMD.vanish.containsValue(false) || !VanishCMD.vanish.containsKey(p.getUniqueId())) {
            for (final Player o : Bukkit.getOnlinePlayers()) {
                o.hidePlayer(p);
            }
            VanishCMD.vanish.put(p.getUniqueId(), true);
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.vanish.enabled")));
            return true;
        }
        if (VanishCMD.vanish.containsValue(true)) {
            for (final Player o : Bukkit.getOnlinePlayers()) {
                o.showPlayer(p);
            }
            VanishCMD.vanish.put(p.getUniqueId(), false);
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.vanish.disabled")));
            return false;
        }
        return false;
    }
    
    static {
        VanishCMD.vanish = new HashMap<UUID, Boolean>();
    }
}
