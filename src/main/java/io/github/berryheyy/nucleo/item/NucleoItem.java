package io.github.berryheyy.nucleo.item;

import io.github.berryheyy.nucleo.Nucleo;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class NucleoItem extends Item {
    public String registryName;

    public NucleoItem(String registryName) {
        super(new FabricItemSettings().group(Nucleo.ITEM_GROUP));

        this.registryName = registryName;
    }
    
}
