package org.weebeler.lethalCompany.World;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.util.BoundingBox;
import org.weebeler.lethalCompany.Main;

public class SaveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Main.schematics.add(new Schematic(strings[0], new BoundingBox(Main.l1.getX(), Main.l1.getY(), Main.l1.getZ(), Main.l2.getX(), Main.l2.getY(), Main.l2.getZ())));
        return false;
    }
}
