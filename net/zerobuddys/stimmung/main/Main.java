package net.zerobuddys.stimmung.main;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class Main extends PluginBase implements Listener {

    private static String Prefix = "§8[§eStimmungsSystem§8] §7 | ";
    private static String DevPrefix = "§8[§bDev§8] §7 | ";
    private static String PluginEnable = "§aPlugin Starte!";
    private static String PluginDisable = "§aPlugin Stopt!";

    @Override
    public void onEnable() {
        getLogger().info(Prefix + TextFormat.AQUA + "Das System Wird Grade Geladen!");
        getLogger().info(DevPrefix + TextFormat.BLUE + "Der Developer Von Diesem System Ist ZeroBuddysYT");
    }

    @Override
    public void onDisable() {
        getLogger().info(Prefix + TextFormat.GOLD + "Das System Wird Gestoppt!");
        getLogger().info(DevPrefix + TextFormat.BLUE + "Der Developer Von Diesem System Ist ZeroBuddysYT");
    }
}
