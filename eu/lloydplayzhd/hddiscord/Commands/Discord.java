package eu.lloydplayzhd.hddiscord.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import eu.lloydplayzhd.hddiscord.Main;

public class Discord implements CommandExecutor {
	private Main plugin;
  public Discord(Main pl) {
	  plugin = pl;
  }
public boolean onCommand(CommandSender arg0, Command command, String label, String[] args)
  {
    if (!(arg0 instanceof Player)) {
    	System.out.println(ChatColor.RED + "Console can not see the HDDiscord commands..");
        return false;    }
    Player p = (Player)arg0;
    String Discord;
    String Prefix;
    Prefix = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Prefix"));
    Discord = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Discord"));
    	p.sendMessage(Prefix + " " + Discord);
    return false;
  }
}
