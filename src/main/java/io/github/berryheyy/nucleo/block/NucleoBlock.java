package io.github.berryheyy.nucleo.block;

import net.minecraft.block.Block;

public class NucleoBlock extends Block {

    public String registryName;

    public NucleoBlock(Settings settings, String registryName) {
        super(settings);
        this.registryName = registryName;
    }
    
}
