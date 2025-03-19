package org.weebeler.lethalCompany.World;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.weebeler.lethalCompany.Main;

public class L2Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Main.l2 = ((Player) commandSender).getLocation();

        return false;
    }
}
