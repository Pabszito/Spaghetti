// 
// Decompiled by Procyon v0.5.36
// 

package org.simplessentials.api;

import me.pabszito.sc.utilities.EconomyUtils;
import me.pabszito.sc.utilities.TickUtil;
import me.pabszito.sc.utilities.ServerUtil;
import me.pabszito.sc.utilities.PlayerUtil;

public class UtilManager
{
    private PlayerUtil util1;
    private ServerUtil util2;
    private TickUtil util3;
    private EconomyUtils util4;
    
    public PlayerUtil getPlayerUtil() {
        return this.util1;
    }
    
    public ServerUtil getServerUtil() {
        return this.util2;
    }
    
    public TickUtil getTickUtil() {
        return this.util3;
    }
    
    public EconomyUtils getEconomyUtils() {
        return this.util4;
    }
}
