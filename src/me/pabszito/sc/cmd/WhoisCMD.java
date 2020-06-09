// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import net.md_5.bungee.api.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class WhoisCMD implements CommandExecutor
{
    String fly;
    String food;
    String health;
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            if (args.length == 0) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_argument_set")));
            }
            else if (args.length >= 1) {
                final Player t = Bukkit.getPlayerExact(args[0]);
                if (Bukkit.getOnlinePlayers().contains(t)) {
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_name").replaceAll("%player%", t.getName())));
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_gamemode") + t.getGameMode().name()));
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_ip") + t.getAddress().getHostName()));
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_food") + this.checkFood(t)));
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_health") + this.checkHealth(t)));
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_flymode") + this.checkFly(t)));
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_coordinates") + t.getLocation().getWorld().getName() + ", " + t.getLocation().getX() + ", " + t.getLocation().getY() + ", " + t.getLocation().getZ()));
                }
                else {
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.player_not_found")));
                }
            }
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.whois")) {
            if (args.length == 0) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_argument_set")));
            }
            else if (args.length >= 1) {
                final Player t2 = Bukkit.getPlayerExact(args[0]);
                if (Bukkit.getOnlinePlayers().contains(t2)) {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_name").replaceAll("%player%", t2.getName())));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_gamemode") + t2.getGameMode().name()));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_ip") + t2.getAddress().getHostName()));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_food") + this.checkFood(t2)));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_health") + this.checkHealth(t2)));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_flymode") + this.checkFly(t2)));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.player_coordinates") + t2.getLocation().getWorld().getName() + ", " + t2.getLocation().getX() + ", " + t2.getLocation().getY() + ", " + t2.getLocation().getZ()));
                }
                else {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.player_not_found")));
                }
            }
        }
        return false;
    }
    
    public String checkFly(final Player player) {
        if (player.getAllowFlight()) {
            this.fly = ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.true"));
        }
        else if (!player.getAllowFlight()) {
            this.fly = ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.false"));
        }
        return this.fly;
    }
    
    public String checkFood(final Player player) {
        if (player.getHealth() <= 0.0) {
            this.food = ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.dead"));
        }
        else if (player.getHealth() >= 1.0) {
            this.food = player.getFoodLevel() + "";
        }
        return this.food;
    }
    
    public String checkHealth(final Player player) {
        if (player.getHealth() <= 0.0) {
            this.health = ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.whois.dead"));
        }
        else if (player.getHealth() >= 1.0) {
            this.health = player.getHealth() + "";
        }
        return this.health;
    }
}
