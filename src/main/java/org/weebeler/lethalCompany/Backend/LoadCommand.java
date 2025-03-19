package org.weebeler.lethalCompany.World;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.weebeler.lethalCompany.Main;

public class LoadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        for (Schematic sc : Main.schematics) {
            if (sc.name.equals(strings[0])) {
                sc.paste(((Player) commandSender).getLocation());
            }
        }

        return false;
    }
}
