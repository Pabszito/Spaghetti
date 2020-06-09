// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.hook.vault;

import org.bukkit.Bukkit;
import java.util.List;
import java.io.IOException;
import java.io.File;
import me.pabszito.sc.confighandler.DataHandler;
import me.pabszito.sc.Simplessentials;
import net.milkbowl.vault.economy.EconomyResponse;
import net.milkbowl.vault.economy.AbstractEconomy;

public class EconomyAPI extends AbstractEconomy
{
    private double startAmount;
    private String economyName;
    private EconomyResponse notImplemented;
    
    public EconomyAPI() {
        this.startAmount = Simplessentials.getInstance().getConfig().getDouble("Config.economySettings.defaultBalance");
        this.economyName = "SimplessentialsEco";
        this.notImplemented = new EconomyResponse(0.0, 0.0, EconomyResponse.ResponseType.NOT_IMPLEMENTED, "This feature has not been implemented yet");
    }
    
    public EconomyResponse bankBalance(final String playerName) {
        return this.notImplemented;
    }
    
    public EconomyResponse bankDeposit(final String playerName, final double amount) {
        return this.depositPlayer(playerName, amount);
    }
    
    public EconomyResponse bankHas(final String playerName, final double amount) {
        return this.notImplemented;
    }
    
    public EconomyResponse bankWithdraw(final String playerName, final double amount) {
        return this.withdrawPlayer(playerName, amount);
    }
    
    public EconomyResponse createBank(final String arg0, final String arg1) {
        return this.notImplemented;
    }
    
    public boolean createPlayerAccount(final String playerName) {
        if (!this.hasAccount(playerName)) {
            DataHandler.get(playerName).set("balance", (Object)this.startAmount);
            try {
                final File f = new File(Simplessentials.getInstance().getDataFolder() + "/data", playerName + ".yml");
                DataHandler.get(playerName).save(f);
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
            return true;
        }
        return false;
    }
    
    public boolean hasAccount(final String playerName) {
        return DataHandler.get(playerName).contains("economy");
    }
    
    public boolean hasAccount(final String playerName, final String worldName) {
        return this.hasAccount(playerName);
    }
    
    public String getName() {
        return this.economyName;
    }
    
    public boolean has(final String playerName, final double amount) {
        return this.getBalance(playerName) >= amount;
    }
    
    public boolean has(final String playerName, final String worldName, final double amount) {
        return this.has(playerName, amount);
    }
    
    public EconomyResponse withdrawPlayer(final String playerName, final double amount) {
        if (this.has(playerName, amount)) {
            DataHandler.get(playerName).set("balance", (Object)(this.getBalance(playerName) - amount));
            try {
                final File f = new File(Simplessentials.getInstance().getDataFolder() + "/data", playerName + ".yml");
                DataHandler.get(playerName).save(f);
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
            return new EconomyResponse(amount, DataHandler.get(playerName).getDouble("balance"), EconomyResponse.ResponseType.SUCCESS, "");
        }
        return new EconomyResponse(0.0, this.getBalance(playerName), EconomyResponse.ResponseType.FAILURE, "Insufficient money");
    }
    
    public EconomyResponse withdrawPlayer(final String playerName, final String worldName, final double amount) {
        return this.withdrawPlayer(playerName, amount);
    }
    
    public EconomyResponse depositPlayer(final String playerName, final double amount) {
        DataHandler.get(playerName).set("balance", (Object)(this.getBalance(playerName) + amount));
        try {
            final File f = new File(Simplessentials.getInstance().getDataFolder() + "/data", playerName + ".yml");
            DataHandler.get(playerName).save(f);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return new EconomyResponse(amount + this.getBalance(playerName), this.getBalance(playerName), EconomyResponse.ResponseType.SUCCESS, "");
    }
    
    public EconomyResponse depositPlayer(final String playerName, final String worldName, final double amount) {
        return this.depositPlayer(playerName, amount);
    }
    
    public boolean createPlayerAccount(final String playerName, final String worldName) {
        return false;
    }
    
    public String currencyNamePlural() {
        return "pluralTest";
    }
    
    public String currencyNameSingular() {
        return "singularTest";
    }
    
    public EconomyResponse deleteBank(final String arg0) {
        return this.notImplemented;
    }
    
    public String format(final double arg0) {
        return null;
    }
    
    public int fractionalDigits() {
        return 0;
    }
    
    public double getBalance(final String playerName) {
        if (DataHandler.get(playerName).getString("balance") != null) {
            return DataHandler.get(playerName).getDouble("balance");
        }
        return 0.0;
    }
    
    public double getBalance(final String playerName, final String worldName) {
        return this.getBalance(playerName);
    }
    
    public List<String> getBanks() {
        return null;
    }
    
    public boolean hasBankSupport() {
        return false;
    }
    
    public EconomyResponse isBankMember(final String arg0, final String arg1) {
        return null;
    }
    
    public EconomyResponse isBankOwner(final String arg0, final String arg1) {
        return null;
    }
    
    @Deprecated
    public boolean isEnabled() {
        Bukkit.getLogger().warning("[Simplessentials] isEnabled method in EconomyAPI.class is deprecated.");
        return false;
    }
}
