// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.methods.versions.Ping1_13_R2;
import me.pabszito.sc.methods.versions.Ping1_13_R1;
import me.pabszito.sc.methods.versions.Ping1_12_R1;
import me.pabszito.sc.methods.versions.Ping1_11_R1;
import me.pabszito.sc.methods.versions.Ping1_10_R1;
import me.pabszito.sc.methods.versions.Ping1_9_R2;
import me.pabszito.sc.methods.versions.Ping1_9_R1;
import me.pabszito.sc.methods.versions.Ping1_8_R3;
import me.pabszito.sc.methods.versions.Ping1_8_R2;
import me.pabszito.sc.methods.versions.Ping1_8_R1;
import me.pabszito.sc.Simplessentials;
import org.bukkit.command.CommandExecutor;

public class PingCMD implements CommandExecutor
{
    private Simplessentials plugin;
    Ping1_8_R1 p1_8_R1;
    Ping1_8_R2 p1_8_R2;
    Ping1_8_R3 p1_8_R3;
    Ping1_9_R1 p1_9_R1;
    Ping1_9_R2 p1_9_R2;
    Ping1_10_R1 p1_10_R1;
    Ping1_11_R1 p1_11_R1;
    Ping1_12_R1 p1_12_R1;
    Ping1_13_R1 p1_13_R1;
    Ping1_13_R2 p1_13_R2;
    
    public PingCMD(final Simplessentials plugin) {
        this.p1_8_R1 = new Ping1_8_R1();
        this.p1_8_R2 = new Ping1_8_R2();
        this.p1_8_R3 = new Ping1_8_R3();
        this.p1_9_R1 = new Ping1_9_R1();
        this.p1_9_R2 = new Ping1_9_R2();
        this.p1_10_R1 = new Ping1_10_R1();
        this.p1_11_R1 = new Ping1_11_R1();
        this.p1_12_R1 = new Ping1_12_R1();
        this.p1_13_R1 = new Ping1_13_R1();
        this.p1_13_R2 = new Ping1_13_R2();
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Messages.cantExecuteFromConsole")));
            return false;
        }
        final Player p = (Player)sender;
        if (args.length == 0) {
            if (this.plugin.v1_8_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message").replaceAll("%ping%", "" + this.p1_8_R1.get1Ping(p))));
                return false;
            }
            if (this.plugin.v1_8_R2) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message").replaceAll("%ping%", "" + this.p1_8_R2.get2Ping(p))));
                return false;
            }
            if (this.plugin.v1_8_R3) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message").replaceAll("%ping%", "" + this.p1_8_R3.get3Ping(p))));
                return false;
            }
            if (this.plugin.v1_9_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message").replaceAll("%ping%", "" + this.p1_9_R1.get4Ping(p))));
                return false;
            }
            if (this.plugin.v1_9_R2) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message").replaceAll("%ping%", "" + this.p1_9_R2.get5Ping(p))));
                return false;
            }
            if (this.plugin.v1_10_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message").replaceAll("%ping%", "" + this.p1_10_R1.get6Ping(p))));
                return false;
            }
            if (this.plugin.v1_11_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message").replaceAll("%ping%", "" + this.p1_11_R1.get7Ping(p))));
                return false;
            }
            if (this.plugin.v1_12_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message").replaceAll("%ping%", "" + this.p1_12_R1.get8Ping(p))));
                return false;
            }
            if (this.plugin.v1_13_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message").replaceAll("%ping%", "" + this.p1_13_R1.get9Ping(p))));
                return false;
            }
            if (this.plugin.v1_13_R2) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message").replaceAll("%ping%", "" + this.p1_13_R2.get10Ping(p))));
                return false;
            }
        }
        else if (args.length == 1) {
            final Player p2 = Bukkit.getPlayerExact(args[0]);
            if (!Bukkit.getOnlinePlayers().contains(p2)) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.player_not_found")));
                return false;
            }
            if (this.plugin.v1_8_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message_other").replaceAll("%ping%", "" + this.p1_8_R1.get1Ping(p2)).replaceAll("%player%", p2.getName())));
                return false;
            }
            if (this.plugin.v1_8_R2) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message_other").replaceAll("%ping%", "" + this.p1_8_R2.get2Ping(p2)).replaceAll("%player%", p2.getName())));
                return false;
            }
            if (this.plugin.v1_8_R3) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message_other").replaceAll("%ping%", "" + this.p1_8_R3.get3Ping(p2)).replaceAll("%player%", p2.getName())));
                return false;
            }
            if (this.plugin.v1_9_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message_other").replaceAll("%ping%", "" + this.p1_9_R1.get4Ping(p2)).replaceAll("%player%", p2.getName())));
                return false;
            }
            if (this.plugin.v1_9_R2) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message_other").replaceAll("%ping%", "" + this.p1_9_R2.get5Ping(p2)).replaceAll("%player%", p2.getName())));
                return false;
            }
            if (this.plugin.v1_10_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message_other").replaceAll("%ping%", "" + this.p1_10_R1.get6Ping(p2)).replaceAll("%player%", p2.getName())));
                return false;
            }
            if (this.plugin.v1_11_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message_other").replaceAll("%ping%", "" + this.p1_11_R1.get7Ping(p2)).replaceAll("%player%", p2.getName())));
                return false;
            }
            if (this.plugin.v1_12_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message_other").replaceAll("%ping%", "" + this.p1_12_R1.get8Ping(p2)).replaceAll("%player%", p2.getName())));
                return false;
            }
            if (this.plugin.v1_13_R1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message_other").replaceAll("%ping%", "" + this.p1_13_R1.get9Ping(p2)).replaceAll("%player%", p2.getName())));
                return false;
            }
            if (this.plugin.v1_13_R2) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.ping.message_other").replaceAll("%ping%", "" + this.p1_13_R2.get10Ping(p2)).replaceAll("%player%", p2.getName())));
                return false;
            }
            return false;
        }
        return false;
    }
}
