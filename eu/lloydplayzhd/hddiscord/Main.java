package eu.lloydplayzhd.hddiscord;

import java.util.Arrays;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import eu.lloydplayzhd.hddiscord.Commands.*;

public class Main
  extends JavaPlugin
  implements CommandExecutor, Listener {
	  
public void onEnable()
  {
    System.out.println("HDDiscord has been enabled!");
    registerConfig();
    getCommand("discord").setExecutor(new Discord(this));
    PluginManager pm = getServer().getPluginManager();
    getServer().getPluginManager().registerEvents(this, this);
    
    pm.registerEvents(this, this);
  }

private void registerConfig()
  {
    getConfig().options().copyDefaults(true);
    saveConfig();
  }
  public List<String> getDevelopers()
  {
    return Arrays.asList(new String[] { "LloydPlayzHD" });
  }
  public void onDisable()
  {
	    System.out.println(ChatColor.RED + "* Plugin: " + ChatColor.YELLOW + "HD Discord " + ChatColor.RED);
	    System.out.println(ChatColor.RED + "* Version: " + ChatColor.YELLOW + getDescription().getVersion() + ChatColor.RED);
	    System.out.println(ChatColor.RED + "* Plugin Author: " + ChatColor.YELLOW + getDevelopers());
	    System.out.println(ChatColor.RED + "* Plugin Status:" + ChatColor.YELLOW + " Desactivated" + ChatColor.RED);  }
}

