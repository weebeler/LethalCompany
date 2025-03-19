package org.weebeler.lethalCompany.World;

import org.bukkit.World;

public class Orbit extends Server {
    public World orbit;
    public Orbit(String n, World o) {
        super(n);
        orbit = o;
    }
}
