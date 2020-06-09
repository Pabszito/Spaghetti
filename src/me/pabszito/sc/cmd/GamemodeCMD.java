// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.GameMode;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class GamemodeCMD implements CommandExecutor
{
    private Simplessentials plugin;
    
    public GamemodeCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(MSGH.getMessages().getString("Messages.general.cant_execute_from_console").replaceAll("&", "§"));
            return false;
        }
        final Player p = (Player)sender;
        if (args.length > 0) {
            if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("creative")) {
                if (p.hasPermission("simplessentials.gamemode")) {
                    p.sendMessage(MSGH.getMessages().getString("Messages.gamemode.creative").replaceAll("&", "§"));
                    p.setGameMode(GameMode.CREATIVE);
                    return true;
                }
                p.sendMessage(MSGH.getMessages().getString("Messages.general.no_perm").replaceAll("&", "§"));
                return false;
            }
            else if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("survival")) {
                if (p.hasPermission("simplessentials.gamemode")) {
                    p.sendMessage(MSGH.getMessages().getString("Messages.gamemode.survival").replaceAll("&", "§"));
                    p.setGameMode(GameMode.SURVIVAL);
                    return true;
                }
                p.sendMessage(MSGH.getMessages().getString("Messages.general.no_perm").replaceAll("&", "§"));
                return false;
            }
            else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("sp") || args[0].equalsIgnoreCase("spectator")) {
                if (p.hasPermission("simplessentials.gamemode")) {
                    p.sendMessage(MSGH.getMessages().getString("Messages.gamemode.spectator").replaceAll("&", "§"));
                    p.setGameMode(GameMode.SPECTATOR);
                    return true;
                }
                p.sendMessage(MSGH.getMessages().getString("Messages.general.no_perm").replaceAll("&", "§"));
                return false;
            }
            else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("adventure")) {
                if (p.hasPermission("simplessentials.gamemode")) {
                    p.sendMessage(MSGH.getMessages().getString("Messages.gamemode.adventure").replaceAll("&", "§"));
                    p.setGameMode(GameMode.ADVENTURE);
                    return true;
                }
                p.sendMessage(MSGH.getMessages().getString("Messages.general.no_perm").replaceAll("&", "§"));
                return false;
            }
        }
        else if (sender.hasPermission("simplessentials.gamemode")) {
            if (args.length >= 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.gamemode.usage")));
            }
        }
        else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
        }
        return false;
    }
}
