// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import me.pabszito.sc.methods.versions.Actionbar1_13_R2;
import me.pabszito.sc.methods.versions.Actionbar1_13_R1;
import me.pabszito.sc.methods.versions.Actionbar1_12_R1;
import me.pabszito.sc.methods.versions.Actionbar1_11_R1;
import me.pabszito.sc.methods.versions.Actionbar1_10_R1;
import me.pabszito.sc.methods.versions.Actionbar1_9_R2;
import me.pabszito.sc.methods.versions.Actionbar1_9_R1;
import me.pabszito.sc.methods.versions.Actionbar1_8_R1;
import me.pabszito.sc.methods.versions.Actionbar1_8_R2;
import org.bukkit.plugin.Plugin;
import me.pabszito.sc.methods.versions.Actionbar1_8_R3;
import org.bukkit.scheduler.BukkitRunnable;
import me.pabszito.sc.confighandler.MSGH;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.UUID;
import java.util.HashMap;
import me.pabszito.sc.Simplessentials;
import org.bukkit.event.Listener;
import org.bukkit.command.CommandExecutor;

public class TpsCMD implements CommandExecutor, Listener
{
    private Simplessentials plugin;
    static HashMap<UUID, Boolean> ABE;
    
    public TpsCMD(final Simplessentials plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            if (Simplessentials.tps > 20) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "The server is running with 20 tps"));
                return false;
            }
            if (Simplessentials.tps < 20) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "The server is running with " + Simplessentials.tps + " tps"));
                return false;
            }
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.tps")) {
            if (TpsCMD.ABE.containsValue(false)) {
                TpsCMD.ABE.put(p.getUniqueId(), true);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.tps.enabling_actionbar")));
                if (this.plugin.v1_8_R3) {
                    new BukkitRunnable() {
                        public void run() {
                            if (Simplessentials.tps == 0) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f20 tps")));
                            }
                            else if (Simplessentials.tps == 0 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R3.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                        }
                    }.runTaskTimer((Plugin)this.plugin, 0L, 10L);
                }
                else if (this.plugin.v1_8_R2) {
                    new BukkitRunnable() {
                        public void run() {
                            if (Simplessentials.tps == 0) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f20 tps")));
                            }
                            else if (Simplessentials.tps == 0 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                        }
                    }.runTaskTimer((Plugin)this.plugin, 0L, 10L);
                }
                else if (this.plugin.v1_8_R1) {
                    new BukkitRunnable() {
                        public void run() {
                            if (Simplessentials.tps == 0) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f20 tps")));
                            }
                            else if (Simplessentials.tps == 0 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_8_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                        }
                    }.runTaskTimer((Plugin)this.plugin, 0L, 10L);
                }
                else if (this.plugin.v1_9_R1) {
                    new BukkitRunnable() {
                        public void run() {
                            if (Simplessentials.tps == 0) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f20 tps")));
                            }
                            else if (Simplessentials.tps == 0 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                        }
                    }.runTaskTimer((Plugin)this.plugin, 0L, 10L);
                }
                else if (this.plugin.v1_9_R2) {
                    new BukkitRunnable() {
                        public void run() {
                            if (Simplessentials.tps == 0) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f20 tps")));
                            }
                            else if (Simplessentials.tps == 0 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_9_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                        }
                    }.runTaskTimer((Plugin)this.plugin, 0L, 10L);
                }
                else if (this.plugin.v1_10_R1) {
                    new BukkitRunnable() {
                        public void run() {
                            if (Simplessentials.tps == 0) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f20 tps")));
                            }
                            else if (Simplessentials.tps == 0 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_10_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                        }
                    }.runTaskTimer((Plugin)this.plugin, 0L, 10L);
                }
                else if (this.plugin.v1_11_R1) {
                    new BukkitRunnable() {
                        public void run() {
                            if (Simplessentials.tps == 0) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f20 tps")));
                            }
                            else if (Simplessentials.tps == 0 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_11_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                        }
                    }.runTaskTimer((Plugin)this.plugin, 0L, 10L);
                }
                else if (this.plugin.v1_12_R1) {
                    new BukkitRunnable() {
                        public void run() {
                            if (Simplessentials.tps == 0) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f20 tps")));
                            }
                            else if (Simplessentials.tps == 0 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_12_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                        }
                    }.runTaskTimer((Plugin)this.plugin, 0L, 10L);
                }
                else if (this.plugin.v1_13_R1) {
                    new BukkitRunnable() {
                        public void run() {
                            if (Simplessentials.tps == 0) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f20 tps")));
                            }
                            else if (Simplessentials.tps == 0 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R1.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                        }
                    }.runTaskTimer((Plugin)this.plugin, 0L, 10L);
                }
                else if (this.plugin.v1_13_R2) {
                    new BukkitRunnable() {
                        public void run() {
                            if (Simplessentials.tps == 0) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps + " tps")));
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c§c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c&c\u258c §f" + Simplessentials.tps) + " tps"));
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(true)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §a\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f20 tps")));
                            }
                            else if (Simplessentials.tps == 0 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 1 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 2 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 3 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 4 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 5 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 6 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 7 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 8 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 9 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 10 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 11 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 12 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 13 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 14 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 15 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 16 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 17 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 18 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps == 19 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                            else if (Simplessentials.tps >= 20 && TpsCMD.ABE.containsValue(false)) {
                                Actionbar1_13_R2.sendActionText(p, String.valueOf(ChatColor.translateAlternateColorCodes('&', " §8\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c\u258c §f? tps")));
                                this.cancel();
                            }
                        }
                    }.runTaskTimer((Plugin)this.plugin, 0L, 10L);
                }
            }
            else {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.tps.disabling_actionbar")));
                TpsCMD.ABE.put(p.getUniqueId(), false);
            }
        }
        else {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
        }
        return false;
    }
    
    @EventHandler
    public void addToHashMap(final PlayerJoinEvent e) {
        if (!TpsCMD.ABE.containsKey(e.getPlayer().getUniqueId())) {
            TpsCMD.ABE.put(e.getPlayer().getUniqueId(), false);
        }
    }
    
    @EventHandler
    public void addToHashMap2(final PlayerMoveEvent e) {
        if (!TpsCMD.ABE.containsKey(e.getPlayer().getUniqueId())) {
            TpsCMD.ABE.put(e.getPlayer().getUniqueId(), false);
        }
    }
    
    static {
        TpsCMD.ABE = new HashMap<UUID, Boolean>();
    }
}
