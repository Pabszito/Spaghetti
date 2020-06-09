// 
// Decompiled by Procyon v0.5.36
// 

package me.pabszito.sc.heads;

import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;
import me.pabszito.sc.confighandler.MSGH;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.SkullType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.Listener;

public class HeadDBHandler implements Listener
{
    public ItemStack createHead(final String playerName, final String nameInput) {
        final ItemStack head = new ItemStack(Material.SKULL_ITEM, 1, (short)SkullType.PLAYER.ordinal());
        final SkullMeta sm = (SkullMeta)head.getItemMeta();
        sm.setOwner(playerName);
        sm.setDisplayName(MSGH.getMessages().getString("Messages.addons.head_db.inventory." + nameInput).replaceAll("&", "\u00c2§"));
        head.setItemMeta((ItemMeta)sm);
        return head;
    }
    
    public ItemStack createHead2(final String playerName) {
        final ItemStack head = new ItemStack(Material.SKULL_ITEM, 1, (short)SkullType.PLAYER.ordinal());
        final SkullMeta sm = (SkullMeta)head.getItemMeta();
        sm.setOwner(playerName);
        head.setItemMeta((ItemMeta)sm);
        return head;
    }
    
    public void createInventory(final Player player) {
        final Inventory heads = Bukkit.createInventory((InventoryHolder)null, 54, MSGH.getMessages().getString("Messages.addons.head_db.inventory.title").replaceAll("&", "\u00c2§"));
        final ItemStack close = new ItemStack(Material.BARRIER, 1);
        final ItemMeta meta = close.getItemMeta();
        meta.setDisplayName(MSGH.getMessages().getString("Messages.addons.head_db.inventory.close_name").replaceAll("&", "\u00c2§"));
        close.setItemMeta(meta);
        heads.setItem(45, close);
        final ItemStack sheep = new ItemStack(this.createHead("MHF_Sheep", "animals_name"));
        heads.setItem(19, sheep);
        final ItemStack food = new ItemStack(this.createHead("MHF_Apple", "food_name"));
        heads.setItem(20, food);
        final ItemStack block = new ItemStack(this.createHead("MHF_Stone", "block_name"));
        heads.setItem(21, block);
        player.openInventory(heads);
        player.updateInventory();
    }
    
    private void food(final Player player) {
        final Inventory foodCategory = Bukkit.createInventory((InventoryHolder)null, 54, MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.inventory_title").replaceAll("&", "\u00c2§"));
        final ItemStack hamburger = new ItemStack(this.createHead2("simbasbestbud"));
        final SkullMeta meta = (SkullMeta)hamburger.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.hamburger")));
        hamburger.setItemMeta((ItemMeta)meta);
        foodCategory.setItem(0, hamburger);
        final ItemStack menu = new ItemStack(Material.ARROW, 1);
        final ItemMeta menuMeta = menu.getItemMeta();
        menuMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.back")));
        menu.setItemMeta(menuMeta);
        foodCategory.setItem(45, menu);
        final ItemStack decoracion = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
        final ItemStack cs = new ItemStack(this.createHead2("MHF_Question"));
        final SkullMeta csmeta = (SkullMeta)cs.getItemMeta();
        csmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.coming_soon")));
        cs.setItemMeta((ItemMeta)csmeta);
        for (int i = 46; i < 53; ++i) {
            if (i != 49) {
                foodCategory.setItem(i, decoracion);
            }
            else {
                foodCategory.setItem(i, cs);
            }
        }
        final ItemStack taco = new ItemStack(this.createHead2("Crunchy_Taco34"));
        final SkullMeta tacometa = (SkullMeta)taco.getItemMeta();
        tacometa.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.taco")));
        taco.setItemMeta((ItemMeta)tacometa);
        foodCategory.setItem(1, taco);
        final ItemStack sushi = new ItemStack(this.createHead2("lmaoki"));
        final SkullMeta sushimeta = (SkullMeta)sushi.getItemMeta();
        sushimeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.sushi")));
        sushi.setItemMeta((ItemMeta)sushimeta);
        foodCategory.setItem(2, sushi);
        final ItemStack nutella = new ItemStack(this.createHead2("Chipsandip"));
        final SkullMeta nutellameta = (SkullMeta)nutella.getItemMeta();
        nutellameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.nutella")));
        nutella.setItemMeta((ItemMeta)nutellameta);
        foodCategory.setItem(3, nutella);
        final ItemStack apple = new ItemStack(this.createHead2("MHF_Apple"));
        final SkullMeta applemeta = (SkullMeta)apple.getItemMeta();
        applemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.apple")));
        apple.setItemMeta((ItemMeta)applemeta);
        foodCategory.setItem(4, apple);
        final ItemStack popcorn = new ItemStack(this.createHead2("ZachWarnerHD"));
        final SkullMeta popcornmeta = (SkullMeta)popcorn.getItemMeta();
        popcornmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.popcorn")));
        popcorn.setItemMeta((ItemMeta)popcornmeta);
        foodCategory.setItem(5, popcorn);
        final ItemStack choc = new ItemStack(this.createHead2("Chazwell777"));
        final SkullMeta chocmeta = (SkullMeta)choc.getItemMeta();
        chocmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.chocolate_bar")));
        choc.setItemMeta((ItemMeta)chocmeta);
        foodCategory.setItem(6, choc);
        final ItemStack bread = new ItemStack(this.createHead2("_Grime"));
        final SkullMeta breadmeta = (SkullMeta)bread.getItemMeta();
        breadmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.bread")));
        bread.setItemMeta((ItemMeta)breadmeta);
        foodCategory.setItem(7, bread);
        final ItemStack cookie = new ItemStack(this.createHead2("QuadratCookie"));
        final SkullMeta cookiemeta = (SkullMeta)cookie.getItemMeta();
        cookiemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.cookie")));
        cookie.setItemMeta((ItemMeta)cookiemeta);
        foodCategory.setItem(8, cookie);
        final ItemStack cake = new ItemStack(this.createHead2("MHF_Cake"));
        final SkullMeta cakemeta = (SkullMeta)cake.getItemMeta();
        cakemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.cake")));
        cake.setItemMeta((ItemMeta)cakemeta);
        foodCategory.setItem(9, cake);
        final ItemStack salad = new ItemStack(this.createHead2("NnOoMmIiSs123"));
        final SkullMeta saladmeta = (SkullMeta)salad.getItemMeta();
        saladmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.salad")));
        salad.setItemMeta((ItemMeta)saladmeta);
        foodCategory.setItem(10, salad);
        final ItemStack coconut = new ItemStack(this.createHead2("Kairu"));
        final SkullMeta coconutmeta = (SkullMeta)coconut.getItemMeta();
        coconutmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.coconut")));
        coconut.setItemMeta((ItemMeta)coconutmeta);
        foodCategory.setItem(11, coconut);
        final ItemStack beer = new ItemStack(this.createHead2("Thanauser"));
        final SkullMeta beermeta = (SkullMeta)beer.getItemMeta();
        beermeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.beer")));
        beer.setItemMeta((ItemMeta)beermeta);
        foodCategory.setItem(12, beer);
        final ItemStack pancake = new ItemStack(this.createHead2("Weed_Pancakes"));
        final SkullMeta pancakemeta = (SkullMeta)pancake.getItemMeta();
        pancakemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.pancake")));
        pancake.setItemMeta((ItemMeta)pancakemeta);
        foodCategory.setItem(13, pancake);
        final ItemStack pepsi = new ItemStack(this.createHead2("polkadot44"));
        final SkullMeta pepsimeta = (SkullMeta)pepsi.getItemMeta();
        pepsimeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.pepsi")));
        pepsi.setItemMeta((ItemMeta)pepsimeta);
        foodCategory.setItem(14, pepsi);
        final ItemStack waffles = new ItemStack(this.createHead2("TheModernWaffle"));
        final SkullMeta wafflesmeta = (SkullMeta)waffles.getItemMeta();
        wafflesmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.waffles")));
        waffles.setItemMeta((ItemMeta)wafflesmeta);
        foodCategory.setItem(15, waffles);
        final ItemStack potato = new ItemStack(this.createHead2("CraftPotato13"));
        final SkullMeta potatometa = (SkullMeta)potato.getItemMeta();
        potatometa.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.potato")));
        potato.setItemMeta((ItemMeta)potatometa);
        foodCategory.setItem(16, potato);
        final ItemStack gbman = new ItemStack(this.createHead2("ciastek"));
        final SkullMeta gbmanmeta = (SkullMeta)potato.getItemMeta();
        gbmanmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.gingerbread_man")));
        gbman.setItemMeta((ItemMeta)gbmanmeta);
        foodCategory.setItem(16, gbman);
        final ItemStack cupcake = new ItemStack(this.createHead2("BitchsLoveCake"));
        final SkullMeta cupcakemeta = (SkullMeta)cupcake.getItemMeta();
        cupcakemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.cupcake")));
        cupcake.setItemMeta((ItemMeta)cupcakemeta);
        foodCategory.setItem(17, cupcake);
        final ItemStack orange = new ItemStack(this.createHead2("AdolfJohannes"));
        final SkullMeta orangemeta = (SkullMeta)orange.getItemMeta();
        orangemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.egg")));
        orange.setItemMeta((ItemMeta)orangemeta);
        foodCategory.setItem(18, orange);
        final ItemStack close = new ItemStack(Material.BARRIER, 1);
        final ItemMeta closemeta = close.getItemMeta();
        closemeta.setDisplayName(MSGH.getMessages().getString("Messages.addons.head_db.inventory.close_name").replaceAll("&", "\u00c2§"));
        close.setItemMeta(closemeta);
        foodCategory.setItem(53, close);
        player.openInventory(foodCategory);
        player.updateInventory();
    }
    
    public void letters(final Player player) {
    }
    
    @EventHandler
    public void clickEvent(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
        if (e.getClickedInventory().getTitle().equals(ChatColor.stripColor(MSGH.getMessages().getString("Messages.addons.head_db.inventory.title")))) {
            if (e.getSlot() == 19) {
                e.setCancelled(true);
            }
            else if (e.getSlot() == 45) {
                e.getWhoClicked().closeInventory();
                e.setCancelled(true);
            }
            else if (e.getSlot() == 20) {
                this.food(p);
                e.setCancelled(true);
            }
            else if (e.getSlot() == 21) {
                e.setCancelled(true);
            }
        }
        if (e.getClickedInventory().getTitle().equals(ChatColor.stripColor(MSGH.getMessages().getString("Messages.addons.head_db.inventory.food.inventory_title")))) {
            if (e.getSlot() == 45) {
                e.setCancelled(true);
                p.closeInventory();
                this.createInventory(p);
            }
            else if (e.getSlot() == 53) {
                e.setCancelled(true);
                p.closeInventory();
            }
            else if (e.getSlot() <= 18) {
                p.closeInventory();
                e.setCancelled(true);
                p.getInventory().addItem(new ItemStack[] { e.getCurrentItem() });
            }
            else if (e.getSlot() <= 52 && e.getSlot() != 45) {
                e.setCancelled(true);
            }
        }
    }
}
