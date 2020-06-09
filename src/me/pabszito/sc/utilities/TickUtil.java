// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.utilities;

public class TickUtil
{
    private TickUtil() {
    }
    
    public static long convertSecondsToTicks(final long seconds) {
        return seconds * 20L;
    }
    
    public static long convertTicksToSeconds(final long ticks) {
        return ticks / 20L;
    }
}
