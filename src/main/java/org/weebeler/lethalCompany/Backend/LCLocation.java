package org.weebeler.lethalCompany.World;


import org.bukkit.Bukkit;
import org.bukkit.Location;

public class LCLocation {
    public String worldName;
    public final int x, y, z;

    public LCLocation(Location loc) {
        x = loc.getBlockX();
        y = loc.getBlockY();
        z = loc.getBlockZ();
    }
    public void setWorld(String wn) {
        worldName = wn;
    }
    public Location convert() {
        return new Location(Bukkit.getWorld(worldName), x, y, z);
    }
}
