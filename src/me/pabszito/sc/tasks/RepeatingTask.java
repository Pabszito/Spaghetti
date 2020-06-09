// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.tasks;

import org.bukkit.plugin.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class RepeatingTask implements Runnable
{
    private int taskId;
    
    public RepeatingTask(final JavaPlugin plugin, final int arg1, final int arg2) {
        this.taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask((Plugin)plugin, (Runnable)this, (long)arg1, (long)arg2);
    }
    
    public void cancel() {
        Bukkit.getScheduler().cancelTask(this.taskId);
    }
}
