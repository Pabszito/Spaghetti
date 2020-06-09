// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.hook.vault;

import org.bukkit.plugin.RegisteredServiceProvider;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.ServicePriority;
import net.milkbowl.vault.Vault;
import org.bukkit.Bukkit;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.permission.Permission;
import net.milkbowl.vault.economy.Economy;

public class VaultHook
{
    public static boolean vault;
    private static Economy econ;
    private static Permission perms;
    private static Chat chat;
    
    public boolean getHook() {
        return Bukkit.getServer().getPluginManager().getPlugin("Vault") != null;
    }
    
    public void hook() {
        if (this.getHook()) {
            final EconomyAPI ecoReg = new EconomyAPI();
            final Vault vault = (Vault)Bukkit.getPluginManager().getPlugin("Vault");
            Bukkit.getServicesManager().register((Class)Economy.class, (Object)ecoReg, (Plugin)vault, ServicePriority.Highest);
            this.setupEconomy();
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fDetected Vault version " + Bukkit.getServer().getPluginManager().getPlugin("Vault").getDescription().getVersion()));
        }
    }
    
    private boolean setupEconomy() {
        if (Bukkit.getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        final RegisteredServiceProvider<Economy> rsp = (RegisteredServiceProvider<Economy>)Bukkit.getServer().getServicesManager().getRegistration((Class)Economy.class);
        if (rsp == null) {
            return false;
        }
        VaultHook.econ = (Economy)rsp.getProvider();
        return VaultHook.econ != null;
    }
    
    private boolean setupChat() {
        final RegisteredServiceProvider<Chat> rsp = (RegisteredServiceProvider<Chat>)Bukkit.getServer().getServicesManager().getRegistration((Class)Chat.class);
        VaultHook.chat = (Chat)rsp.getProvider();
        return VaultHook.chat != null;
    }
    
    private boolean setupPermissions() {
        final RegisteredServiceProvider<Permission> rsp = (RegisteredServiceProvider<Permission>)Bukkit.getServer().getServicesManager().getRegistration((Class)Permission.class);
        VaultHook.perms = (Permission)rsp.getProvider();
        return VaultHook.perms != null;
    }
    
    public static Economy getEconomy() {
        return VaultHook.econ;
    }
    
    public static Permission getPermissions() {
        return VaultHook.perms;
    }
    
    public static Chat getChat() {
        return VaultHook.chat;
    }
    
    static {
        VaultHook.vault = false;
        VaultHook.econ = null;
        VaultHook.perms = null;
        VaultHook.chat = null;
    }
}
