// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.confighandler;

import java.io.IOException;
import me.pabszito.sc.Simplessentials;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import org.bukkit.entity.Player;

public class DataHandler
{
    public static void generate(final Player p) {
        final File file = new File("plugins/Simplessentials/data/" + File.separator + p.getName() + ".yml");
        final YamlConfiguration filedata = YamlConfiguration.loadConfiguration(file);
        if (!file.exists()) {
            filedata.set("ip", (Object)(p.getAddress().getAddress() + ""));
            filedata.set("balance", (Object)Simplessentials.getInstance().getConfig().getDouble("Config.economySettings.defaultBalance"));
            try {
                filedata.save(file);
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else {
            filedata.set("ip", (Object)(p.getAddress().getAddress() + ""));
            try {
                filedata.save(file);
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static YamlConfiguration get(final String playerName) {
        final File file = new File("plugins/Simplessentials/data/" + File.separator + playerName + ".yml");
        final YamlConfiguration filedata = YamlConfiguration.loadConfiguration(file);
        if (!file.exists()) {
            return null;
        }
        return filedata;
    }
}
