package me.penguin.vanishplugin;

import me.penguin.vanishplugin.commands.VanishCommand;
import me.penguin.vanishplugin.events.JoinEvent;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class VanishPlugin extends JavaPlugin {

    public ArrayList<Player> invisible_list = new ArrayList<>();

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("vanish").setExecutor(new VanishCommand(this));

        getServer().getPluginManager().registerEvents(new JoinEvent(this), this);
    }
}

