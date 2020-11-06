package com.lucky3028.debug

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Debug : JavaPlugin() {
    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(CustomListener, this)
        getCommand("custom").executor = CustomCommand()
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}