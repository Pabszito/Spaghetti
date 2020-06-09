// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.confighandler;

import java.io.Reader;
import java.io.UnsupportedEncodingException;
import org.bukkit.configuration.Configuration;
import java.io.InputStreamReader;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.IOException;
import me.pabszito.sc.Simplessentials;
import java.io.File;
import org.bukkit.configuration.file.FileConfiguration;

public class MSGH
{
    static FileConfiguration messages;
    static File messagesFile;
    
    public MSGH(final Simplessentials plugin) {
        MSGH.messages = null;
        MSGH.messagesFile = null;
    }
    
    public static void registerMessages() {
        MSGH.messagesFile = new File(Simplessentials.getInstance().getDataFolder(), "messages.yml");
        if (!MSGH.messagesFile.exists()) {
            getMessages().options().copyDefaults(true);
            saveMessages();
        }
    }
    
    public static void saveMessages() {
        try {
            MSGH.messages.save(MSGH.messagesFile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static FileConfiguration getMessages() {
        if (MSGH.messages == null) {
            reloadMessages();
        }
        return MSGH.messages;
    }
    
    public static void reloadMessages() {
        if (MSGH.messages == null) {
            MSGH.messagesFile = new File(Simplessentials.getInstance().getDataFolder(), "messages.yml");
        }
        MSGH.messages = (FileConfiguration)YamlConfiguration.loadConfiguration(MSGH.messagesFile);
        try {
            final Reader defConfigStream = new InputStreamReader(Simplessentials.getInstance().getResource("messages.yml"), "UTF8");
            if (defConfigStream != null) {
                final YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                MSGH.messages.setDefaults((Configuration)defConfig);
            }
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
