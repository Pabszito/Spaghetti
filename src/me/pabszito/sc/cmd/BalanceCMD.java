// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.pabszito.sc.hook.vault.EconomyAPI;
import org.bukkit.command.CommandExecutor;

public class BalanceCMD implements CommandExecutor
{
    EconomyAPI eco;
    
    public BalanceCMD() {
        this.eco = new EconomyAPI();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.cant_execute_from_console")));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.balance")) {
            if (args.length == 0) {
                final double playermoney = this.eco.getBalance(p.getName());
                p.sendMessage(this.toColor(MSGH.getMessages().getString("Messages.economy.balance").replaceAll("%player%", p.getName()).replaceAll("%bal%", playermoney + "")));
            }
            else if (args.length == 1) {
                final Player p2 = Bukkit.getPlayerExact(args[0]);
                if (Bukkit.getOnlinePlayers().contains(p2)) {
                    final double playermoney2 = this.eco.getBalance(p2.getName());
                    p.sendMessage(this.toColor(MSGH.getMessages().getString("Messages.economy.balance_other").replaceAll("%player%", p2.getName()).replaceAll("%bal%", playermoney2 + "")));
                }
            }
        }
        return true;
    }
    
    protected String toColor(final String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
