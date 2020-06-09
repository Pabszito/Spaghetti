// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.cmd;

import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.SkullType;
import org.bukkit.Material;
import net.md_5.bungee.api.ChatColor;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class SkullCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.cantExecuteFromConsole")));
            return false;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("simplessentials.skull")) {
            if (args.length == 0) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_argument_set")));
            }
            else if (args.length == 1) {
                final ItemStack playerskull = new ItemStack(Material.SKULL_ITEM, 1, (short)SkullType.PLAYER.ordinal());
                final SkullMeta meta = (SkullMeta)playerskull.getItemMeta();
                meta.setOwner(args[0]);
                playerskull.setItemMeta((ItemMeta)meta);
                p.getInventory().addItem(new ItemStack[] { playerskull });
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.skull.skull_added").replaceAll("%skullowner%", args[0])));
            }
        }
        else {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.general.no_perm")));
        }
        return false;
    }
}
