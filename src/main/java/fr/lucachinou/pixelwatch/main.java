package fr.lucachinou.pixelwatch;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("Pixel Watch is enabled");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
