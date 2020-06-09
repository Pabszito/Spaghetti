// 
// Decompiled by Procyon v0.5.36
// 

package org.simplessentials.api;

import me.pabszito.sc.hook.vault.EconomyAPI;
import me.pabszito.sc.methods.versions.TitleALLVER;
import java.io.File;
import org.bukkit.Location;
import org.bukkit.Bukkit;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.SkullType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import me.pabszito.sc.methods.versions.Actionbar1_13_R1;
import me.pabszito.sc.methods.versions.Actionbar1_13_R2;
import me.pabszito.sc.methods.versions.Actionbar1_12_R1;
import me.pabszito.sc.methods.versions.Actionbar1_11_R1;
import me.pabszito.sc.methods.versions.Actionbar1_10_R1;
import me.pabszito.sc.methods.versions.Actionbar1_9_R2;
import me.pabszito.sc.methods.versions.Actionbar1_9_R1;
import me.pabszito.sc.methods.versions.Actionbar1_8_R3;
import me.pabszito.sc.methods.versions.Actionbar1_8_R2;
import me.pabszito.sc.methods.versions.Actionbar1_8_R1;
import org.bukkit.entity.Player;
import me.pabszito.sc.Simplessentials;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.configuration.file.FileConfiguration;

public class SimplessentialsAPI
{
    private static SimplessentialsAPI api;
    
    public SimplessentialsAPI() {
        SimplessentialsAPI.api = this;
    }
    
    public static SimplessentialsAPI getAPI() {
        return SimplessentialsAPI.api;
    }
    
    public FileConfiguration getMessagesFile() {
        return MSGH.getMessages();
    }
    
    public FileConfiguration getConfigFile() {
        return Simplessentials.getInstance().getConfig();
    }
    
    public void sendActionbar(final Player p, final String message) {
        final Simplessentials instance = Simplessentials.getInstance();
        if (instance.v1_8_R1) {
            Actionbar1_8_R1.sendActionText(p, message);
        }
        else if (instance.v1_8_R2) {
            Actionbar1_8_R2.sendActionText(p, message);
        }
        else if (instance.v1_8_R3) {
            Actionbar1_8_R3.sendActionText(p, message);
        }
        else if (instance.v1_9_R1) {
            Actionbar1_9_R1.sendActionText(p, message);
        }
        else if (instance.v1_9_R2) {
            Actionbar1_9_R2.sendActionText(p, message);
        }
        else if (instance.v1_10_R1) {
            Actionbar1_10_R1.sendActionText(p, message);
        }
        else if (instance.v1_11_R1) {
            Actionbar1_11_R1.sendActionText(p, message);
        }
        else if (instance.v1_12_R1) {
            Actionbar1_12_R1.sendActionText(p, message);
        }
        else if (instance.v1_13_R2) {
            Actionbar1_13_R2.sendActionText(p, message);
        }
        else if (instance.v1_13_R1) {
            Actionbar1_13_R1.sendActionText(p, message);
        }
    }
    
    public UtilManager getUtils() {
        final UtilManager utilm = new UtilManager();
        return utilm;
    }
    
    public ItemStack createHead(final String player_name) {
        final ItemStack head = new ItemStack(Material.SKULL_ITEM, 1, (short)SkullType.PLAYER.ordinal());
        final SkullMeta sm = (SkullMeta)head.getItemMeta();
        sm.setOwner(player_name);
        head.setItemMeta((ItemMeta)sm);
        return head;
    }
    
    @Deprecated
    public boolean getCherryChatHook() {
        Bukkit.getLogger().warning("[Simplessentials] CherryChat with Simplessentials is no supported yet!");
        return false;
    }
    
    public FileConfiguration getLocationsFile() {
        return Simplessentials.getInstance().getLocations();
    }
    
    @Deprecated
    public String getBukkitVersion() {
        return Bukkit.getServer().getBukkitVersion();
    }
    
    public String getServerVersion() {
        return Simplessentials.getInstance().serverVersion;
    }
    
    public String getSimplessentialsVersion() {
        return Simplessentials.getInstance().getDescription().getVersion();
    }
    
    public String getLatestSimplessentialsVersion() {
        return Simplessentials.getInstance().latestversion;
    }
    
    public void simplessentialsUpdateChecker(final boolean execute) {
        if (execute) {
            Simplessentials.getInstance().updateChecker();
        }
    }
    
    public void addLocation(final String name, final Location location) {
        this.getLocationsFile().set("locations." + name + ".world", (Object)location.getWorld());
        this.getLocationsFile().set("locations." + name + ".x", (Object)location.getX());
        this.getLocationsFile().set("locations." + name + ".y", (Object)location.getY());
        this.getLocationsFile().set("locations." + name + ".z", (Object)location.getZ());
        this.getLocationsFile().set("locations." + name + ".yaw", (Object)location.getYaw());
        this.getLocationsFile().set("locations." + name + ".pitch", (Object)location.getPitch());
    }
    
    public File getSimplessentialsDataFolder() {
        return Simplessentials.getInstance().getDataFolder();
    }
    
    public void sendTitle(final Player player, final String title, final String subtitle, final int fadeIn, final int stay, final int fadeOut) {
        TitleALLVER.sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
    }
    
    public void clearTitle(final Player player) {
        TitleALLVER.clearTitle(player);
    }
    
    public EconomyAPI getEconomy() {
        final EconomyAPI ecoapi = new EconomyAPI();
        return ecoapi;
    }
}
