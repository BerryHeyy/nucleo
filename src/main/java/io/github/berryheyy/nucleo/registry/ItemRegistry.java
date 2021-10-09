package io.github.berryheyy.nucleo.registry;

import io.github.berryheyy.nucleo.item.NucleoItem;
import net.minecraft.item.Item;

public class ItemRegistry {
    
    public static final Item RAW_URANIUM = RegistryHandler.registerItem(new NucleoItem("raw_uranium"));

    public static void init() {}
}
