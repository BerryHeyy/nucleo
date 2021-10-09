package io.github.berryheyy.nucleo.registry;

import io.github.berryheyy.nucleo.block.NucleoOreBlock;
import net.minecraft.block.Block;

public class BlockRegistry {
    
    public static final Block URANIUM_ORE = RegistryHandler.registerBlock(new NucleoOreBlock("uranium_ore"));

    public static void init() {}

}
