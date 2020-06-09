// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import org.bukkit.entity.Player;
import java.io.BufferedReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import org.bukkit.configuration.Configuration;
import java.io.InputStreamReader;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.IOException;
import org.bukkit.plugin.PluginManager;
import me.pabszito.sc.protection.lobbymode.WeatherListener;
import me.pabszito.sc.protection.lobbymode.TitleSend;
import me.pabszito.sc.protection.lobbymode.EntityDamage;
import me.pabszito.sc.protection.lobbymode.EnderPearl;
import me.pabszito.sc.protection.lobbymode.BlockBreakListener;
import me.pabszito.sc.protection.lobbymode.BlockPlaceListener;
import me.pabszito.sc.events.DataGenerator;
import me.pabszito.sc.events.ChatHandler;
import me.pabszito.sc.events.listener.ServerListener;
import me.pabszito.sc.events.listener.DeathListener;
import me.pabszito.sc.events.Leave;
import me.pabszito.sc.events.Join;
import me.pabszito.sc.cmd.NickCMD;
import me.pabszito.sc.cmd.RulesCMD;
import me.pabszito.sc.cmd.CustomTextCMD;
import me.pabszito.sc.cmd.WhoisCMD;
import me.pabszito.sc.cmd.ChatCMD;
import me.pabszito.sc.cmd.AFKCMD;
import me.pabszito.sc.cmd.DisposalCMD;
import me.pabszito.sc.cmd.KickallCMD;
import me.pabszito.sc.cmd.MemoryCMD;
import me.pabszito.sc.cmd.HelpopCMD;
import me.pabszito.sc.cmd.HatCMD;
import me.pabszito.sc.cmd.SetspawnCMD;
import me.pabszito.sc.cmd.SpawnCMD;
import me.pabszito.sc.cmd.SkullCMD;
import me.pabszito.sc.cmd.VanishCMD;
import me.pabszito.sc.cmd.EnderchestCMD;
import me.pabszito.sc.cmd.WorkbenchCMD;
import me.pabszito.sc.cmd.OnlineCMD;
import me.pabszito.sc.cmd.PingCMD;
import me.pabszito.sc.cmd.TopCMD;
import me.pabszito.sc.cmd.DayCMD;
import me.pabszito.sc.cmd.NightCMD;
import me.pabszito.sc.cmd.BroadcastCMD;
import me.pabszito.sc.cmd.TeleportCMD;
import me.pabszito.sc.cmd.SuicideCMD;
import me.pabszito.sc.cmd.HealCMD;
import me.pabszito.sc.cmd.CoreCMD;
import me.pabszito.sc.cmd.ClearCMD;
import me.pabszito.sc.cmd.GamemodeCMD;
import me.pabszito.sc.cmd.FlyCMD;
import org.bukkit.command.CommandExecutor;
import me.pabszito.sc.cmd.TpsCMD;
import me.pabszito.sc.hook.permissionsex.PEXHook;
import me.pabszito.sc.hook.vault.VaultHook;
import me.pabszito.sc.hook.luckperms.LuckPermsHook;
import me.pabszito.sc.hook.cherrychat.CherryHook;
import org.bukkit.plugin.Plugin;
import me.pabszito.sc.hook.bungeecord.BungeeCordConnecter;
import me.pabszito.sc.confighandler.MSGH;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import java.util.logging.Level;
import java.io.File;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Simplessentials extends JavaPlugin implements Listener, PluginMessageListener
{
    public String serverVersion;
    public String latestversion;
    public boolean updatechecker;
    public static int tps;
    public static long second;
    public boolean v1_8_R1;
    public boolean v1_8_R2;
    public boolean v1_8_R3;
    public boolean v1_9_R1;
    public boolean v1_9_R2;
    public boolean v1_10_R1;
    public boolean v1_11_R1;
    public boolean v1_12_R1;
    public boolean v1_13_R1;
    public boolean v1_13_R2;
    ConsoleCommandSender c;
    FileConfiguration config;
    File cfile;
    private FileConfiguration players;
    private File playersFile;
    private static Simplessentials instance;
    public Level W;
    public Level E;
    public Level I;
    
    public Simplessentials() {
        this.v1_8_R1 = false;
        this.v1_8_R2 = false;
        this.v1_8_R3 = false;
        this.v1_9_R1 = false;
        this.v1_9_R2 = false;
        this.v1_10_R1 = false;
        this.v1_11_R1 = false;
        this.v1_12_R1 = false;
        this.v1_13_R1 = false;
        this.v1_13_R2 = false;
        this.c = Bukkit.getConsoleSender();
        this.players = null;
        this.playersFile = null;
        this.W = Level.WARNING;
        this.E = Level.SEVERE;
        this.I = Level.INFO;
        this.serverVersion = Bukkit.getServer().getClass().getPackage().getName().replace("org.bukkit.craftbukkit.", "");
    }
    
    public void onEnable() {
        Simplessentials.instance = this;
        this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fSimplessentials was enabled with version " + this.getDescription().getVersion() + "!"));
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        MSGH.registerMessages();
        this.luckPermsHook();
        this.vaultHook();
        this.pexHook();
        final BungeeCordConnecter bcc = new BungeeCordConnecter();
        if (bcc.hasBungee()) {
            Bukkit.getServer().getMessenger().registerOutgoingPluginChannel((Plugin)this, "BungeeCord");
            Bukkit.getServer().getMessenger().registerIncomingPluginChannel((Plugin)this, "BungeeCord", (PluginMessageListener)this);
            bcc.hook();
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new BungeeCordConnecter(), (Plugin)this);
        }
        final CherryHook ch = new CherryHook();
        if (ch.getHook()) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &rDetected CherryChat version " + Bukkit.getServer().getPluginManager().getPlugin("CherryChat").getDescription().getVersion() + " (hook demo)"));
        }
        this.getServer().getScheduler().scheduleSyncRepeatingTask((Plugin)this, (Runnable)new Runnable() {
            long sec;
            int ticks;
            
            @Override
            public void run() {
                this.sec = System.currentTimeMillis() / 1000L;
                if (Simplessentials.second == this.sec) {
                    ++this.ticks;
                }
                else {
                    Simplessentials.second = this.sec;
                    Simplessentials.tps = ((Simplessentials.tps == 0) ? this.ticks : ((Simplessentials.tps + this.ticks) / 2));
                    this.ticks = 2;
                }
            }
        }, 20L, 1L);
        this.commandRegister();
        this.eventRegister();
        this.registerLocations();
        if (this.serverVersion.equals("v1_8_R1")) {
            this.v1_8_R1 = true;
            this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fDetected server version v1_8_R1"));
        }
        else if (this.serverVersion.equals("v1_8_R2")) {
            this.v1_8_R2 = true;
            this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fDetected server version v1_8_R2"));
        }
        else if (this.serverVersion.equals("v1_8_R3")) {
            this.v1_8_R3 = true;
            this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fDetected server version v1_8_R3"));
        }
        else if (this.serverVersion.equals("v1_9_R1")) {
            this.v1_9_R1 = true;
            this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fDetected server version v1_9_R1"));
        }
        else if (this.serverVersion.equals("v1_9_R2")) {
            this.v1_9_R2 = true;
            this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fDetected server version v1_9_R2"));
        }
        else if (this.serverVersion.equals("v1_10_R1")) {
            this.v1_10_R1 = true;
            this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fDetected server version v1_10_R1"));
        }
        else if (this.serverVersion.equals("v1_11_R1")) {
            this.v1_11_R1 = true;
            this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fDetected server version v1_11_R1"));
        }
        else if (this.serverVersion.equals("v1_12_R1")) {
            this.v1_12_R1 = true;
            this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fDetected server version v1_12_R1"));
        }
        else if (this.serverVersion.equals("v1_13_R1")) {
            this.v1_13_R1 = true;
            this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fDetected server version v1_13_R1"));
        }
        else if (this.serverVersion.equals("v1_13_R2")) {
            this.v1_13_R2 = true;
            this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fDetected server version v1_13_R2"));
        }
        else {
            Bukkit.getLogger().log(Level.SEVERE, ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fA fatal error occurred! Please contact PabsMG on SpigotMC for more information."));
            Bukkit.getLogger().log(Level.SEVERE, ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fUnknown server version detected. (" + this.serverVersion + ")"));
            Bukkit.getLogger().log(Level.SEVERE, ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fYour version of Spigot/CraftBukkit:" + this.getServer().getBukkitVersion()));
            Bukkit.getLogger().log(Level.SEVERE, ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fError: UNKNOWN_VER"));
            Bukkit.getServer().getPluginManager().disablePlugin((Plugin)this);
        }
        if (this.getConfig().getBoolean("Config.checkForUpdates")) {
            this.updateChecker();
        }
    }
    
    public void onDisable() {
        this.c.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00c2» &fSimplessentials has been disabled."));
        Simplessentials.instance = null;
        if (this.players != null) {
            this.saveLocations();
        }
    }
    
    private void luckPermsHook() {
        final LuckPermsHook lph = new LuckPermsHook();
        lph.hook();
    }
    
    private void vaultHook() {
        final VaultHook vh = new VaultHook();
        vh.hook();
    }
    
    private void bungeeHook() {
        final BungeeCordConnecter bcc = new BungeeCordConnecter();
    }
    
    private void pexHook() {
        final PEXHook ph = new PEXHook();
        ph.hook();
    }
    
    public void commandRegister() {
        this.getCommand("tps").setExecutor((CommandExecutor)new TpsCMD(this));
        this.getCommand("fly").setExecutor((CommandExecutor)new FlyCMD(this));
        this.getCommand("gamemode").setExecutor((CommandExecutor)new GamemodeCMD(this));
        this.getCommand("ci").setExecutor((CommandExecutor)new ClearCMD(this));
        this.getCommand("simplessentials").setExecutor((CommandExecutor)new CoreCMD(this));
        this.getCommand("heal").setExecutor((CommandExecutor)new HealCMD(this));
        this.getCommand("suicide").setExecutor((CommandExecutor)new SuicideCMD(this));
        this.getCommand("teleport").setExecutor((CommandExecutor)new TeleportCMD(this));
        this.getCommand("broadcast").setExecutor((CommandExecutor)new BroadcastCMD());
        this.getCommand("night").setExecutor((CommandExecutor)new NightCMD());
        this.getCommand("day").setExecutor((CommandExecutor)new DayCMD());
        this.getCommand("top").setExecutor((CommandExecutor)new TopCMD(this));
        this.getCommand("ping").setExecutor((CommandExecutor)new PingCMD(this));
        this.getCommand("online").setExecutor((CommandExecutor)new OnlineCMD(this));
        this.getCommand("workbench").setExecutor((CommandExecutor)new WorkbenchCMD());
        this.getCommand("enderchest").setExecutor((CommandExecutor)new EnderchestCMD());
        this.getCommand("vanish").setExecutor((CommandExecutor)new VanishCMD(this));
        this.getCommand("skull").setExecutor((CommandExecutor)new SkullCMD());
        this.getCommand("spawn").setExecutor((CommandExecutor)new SpawnCMD(this));
        this.getCommand("setspawn").setExecutor((CommandExecutor)new SetspawnCMD(this));
        this.getCommand("hat").setExecutor((CommandExecutor)new HatCMD());
        this.getCommand("helpop").setExecutor((CommandExecutor)new HelpopCMD());
        this.getCommand("memory").setExecutor((CommandExecutor)new MemoryCMD());
        this.getCommand("kickall").setExecutor((CommandExecutor)new KickallCMD());
        this.getCommand("disposal").setExecutor((CommandExecutor)new DisposalCMD());
        this.getCommand("afk").setExecutor((CommandExecutor)new AFKCMD());
        this.getCommand("chat").setExecutor((CommandExecutor)new ChatCMD());
        this.getCommand("whois").setExecutor((CommandExecutor)new WhoisCMD());
        this.getCommand("customtext").setExecutor((CommandExecutor)new CustomTextCMD());
        this.getCommand("rules").setExecutor((CommandExecutor)new RulesCMD());
        this.getCommand("nick").setExecutor((CommandExecutor)new NickCMD());
    }
    
    public void eventRegister() {
        final PluginManager pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents((Listener)new Join(this), (Plugin)this);
        pm.registerEvents((Listener)new TpsCMD(this), (Plugin)this);
        pm.registerEvents((Listener)new Leave(this), (Plugin)this);
        pm.registerEvents((Listener)new DeathListener(this), (Plugin)this);
        pm.registerEvents((Listener)new VanishCMD(this), (Plugin)this);
        pm.registerEvents((Listener)new AFKCMD(), (Plugin)this);
        pm.registerEvents((Listener)new ChatCMD(), (Plugin)this);
        pm.registerEvents((Listener)new ServerListener(), (Plugin)this);
        pm.registerEvents((Listener)new ChatHandler(), (Plugin)this);
        pm.registerEvents((Listener)new DataGenerator(), (Plugin)this);
        pm.registerEvents((Listener)new BlockPlaceListener(), (Plugin)this);
        pm.registerEvents((Listener)new BlockBreakListener(), (Plugin)this);
        pm.registerEvents((Listener)new EnderPearl(), (Plugin)this);
        pm.registerEvents((Listener)new EntityDamage(), (Plugin)this);
        pm.registerEvents((Listener)new TitleSend(), (Plugin)this);
        pm.registerEvents((Listener)new WeatherListener(), (Plugin)this);
    }
    
    public static Simplessentials getInstance() {
        return Simplessentials.instance;
    }
    
    public void registerLocations() {
        this.playersFile = new File(this.getDataFolder(), "locations.yml");
        if (!this.playersFile.exists()) {
            this.getLocations().options().copyDefaults(true);
            this.saveLocations();
        }
    }
    
    public void saveLocations() {
        try {
            this.players.save(this.playersFile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public FileConfiguration getLocations() {
        if (this.players == null) {
            this.reloadLocations();
        }
        return this.players;
    }
    
    public void reloadLocations() {
        if (this.players == null) {
            this.playersFile = new File(this.getDataFolder(), "locations.yml");
        }
        this.players = (FileConfiguration)YamlConfiguration.loadConfiguration(this.playersFile);
        try {
            final Reader defConfigStream = new InputStreamReader(this.getResource("locations.yml"), "UTF8");
            if (defConfigStream != null) {
                final YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                this.players.setDefaults((Configuration)defConfig);
            }
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    
    public void updateChecker() {
        try {
            final HttpURLConnection con = (HttpURLConnection)new URL("https://api.spigotmc.org/legacy/update.php?resource=65511").openConnection();
            final int timed_out = 1250;
            con.setConnectTimeout(timed_out);
            con.setReadTimeout(timed_out);
            this.latestversion = new BufferedReader(new InputStreamReader(con.getInputStream())).readLine();
            if (this.latestversion.length() <= 7) {
                if (!this.getDescription().getVersion().equals(this.latestversion)) {
                    this.updatechecker = false;
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00ef¿½ &fThere is a new version available! (" + this.latestversion + ")"));
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00ef¿½ &fYou can download it at: https://www.spigotmc.org/resources/65511/"));
                }
                else {
                    this.updatechecker = true;
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00ef¿½ &fPlugin is up-to-date!"));
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            this.updatechecker = true;
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lSIMPLESSENTIALS &8\u00ef¿½ &fError while checking update."));
        }
    }
    
    public void onPluginMessageReceived(final String channel, final Player player, final byte[] message) {
        if (!channel.equals("BungeeCord")) {
            return;
        }
        final ByteArrayDataInput in = ByteStreams.newDataInput(message);
        final String subchannel = in.readUTF();
        if (subchannel.equals("ConnectOther")) {}
    }
    
    static {
        Simplessentials.tps = 2;
        Simplessentials.second = 0L;
    }
}
