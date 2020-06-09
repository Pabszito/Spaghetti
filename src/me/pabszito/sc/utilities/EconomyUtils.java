// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.utilities;

import me.pabszito.sc.Simplessentials;
import me.pabszito.sc.confighandler.DataHandler;
import org.bukkit.plugin.RegisteredServiceProvider;
import java.util.logging.Level;
import org.bukkit.Bukkit;
import net.milkbowl.vault.economy.Economy;

public class EconomyUtils
{
    private static Economy economy;
    private static EconomyUtils economyutils;
    
    public EconomyUtils(final EconomyUtils economyutils) {
        EconomyUtils.economyutils = economyutils;
    }
    
    public static boolean setupEconomy() {
        if (Bukkit.getServer().getPluginManager().getPlugin("Vault") == null) {
            Bukkit.getLogger().log(Level.WARNING, "Vault not detected.");
            return false;
        }
        final RegisteredServiceProvider<Economy> regServProv = (RegisteredServiceProvider<Economy>)Bukkit.getServer().getServicesManager().getRegistration((Class)Economy.class);
        Bukkit.getLogger().warning("regServProv");
        if (regServProv == null) {
            Bukkit.getLogger().warning("regServProv = false, so disabling...");
            return false;
        }
        EconomyUtils.economy = (Economy)regServProv.getProvider();
        Bukkit.getLogger().warning("Economy != null");
        return EconomyUtils.economy != null;
    }
    
    public static Economy getEconomy() {
        return EconomyUtils.economy;
    }
    
    public static EconomyUtils getEconomyUtils() {
        return EconomyUtils.economyutils;
    }
    
    public void setBalance(final String playerName, final double amount) {
        DataHandler.get(playerName).set("balance", (Object)amount);
    }
    
    public void addBalance(final String playerName, final double amount) {
        this.setBalance(playerName, this.getBalance(playerName) + amount);
    }
    
    public boolean takeBalance(final String playerName, final double amount) {
        if (this.hasBalance(playerName, amount)) {
            this.setBalance(playerName, this.getBalance(playerName) - amount);
            return true;
        }
        return false;
    }
    
    public double getBalance(final String playerName) {
        return DataHandler.get(playerName).getDouble("balance");
    }
    
    public boolean hasBalance(final String playerName, final double amount) {
        return this.getBalance(playerName) >= amount;
    }
    
    public boolean pay(final String playerName1, final String playerName2, final double amount) {
        if (this.getBalance(playerName1) >= amount) {
            this.takeBalance(playerName1, amount);
            this.addBalance(playerName2, amount);
            return true;
        }
        return false;
    }
    
    public void resetBalance(final String playerName) {
        this.setBalance(playerName, Simplessentials.getInstance().getConfig().getDouble("Config.economySettings.defaultBalance"));
    }
    
    static {
        EconomyUtils.economy = null;
    }
}
