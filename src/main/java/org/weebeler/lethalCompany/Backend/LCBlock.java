package org.weebeler.lethalCompany.World;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class LCBlock {
    public final String material;
    public final int x, y, z;
    public final String data;

    public LCBlock(Block block) {
        material = block.getType().name();
        x = block.getX();
        y = block.getY();
        z = block.getZ();
        data = block.getBlockData().getAsString();
    }

    public Material getMat() {
        return Material.getMaterial(material);
    }
}
