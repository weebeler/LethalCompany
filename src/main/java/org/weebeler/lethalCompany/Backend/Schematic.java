package org.weebeler.lethalCompany.World;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.Map;

public class Schematic {
    public String name;
    public HashMap<LCLocation, LCBlock> blocks;
    BoundingBox box;

    public Schematic(String name, BoundingBox nb) {
        box = nb;
        blocks = new HashMap<>();

        for (double x = box.getMinX(); x < box.getMaxX(); x++) {
            for (double y = box.getMinY(); y < box.getMaxY(); y++) {
                for (double z = box.getMinZ(); z < box.getMaxZ(); z++) {
                    Location location = new Location(Bukkit.getWorld("ORBIT"), x, y, z);
                    blocks.put(new LCLocation(location), new LCBlock(location.getBlock()));
                }
            }
        }
    }

    public void paste(Location location) {
        World world = location.getWorld();

        int diffx = (int) (location.getBlockX() - box.getMinX());
        int diffy = (int) (location.getBlockY() - box.getMinY());
        int diffz = (int) (location.getBlockZ() - box.getMinZ());

        for (Map.Entry<LCLocation, LCBlock> entry : blocks.entrySet()) {
            entry.getKey().worldName = world.getName();
            Location loc = entry.getKey().convert().subtract(diffx, diffy, diffz);
            world.getBlockAt(loc).setType(entry.getValue().getMat());
            world.getBlockAt(loc).setBlockData(Bukkit.createBlockData(entry.getValue().data));
        }
    }

}
