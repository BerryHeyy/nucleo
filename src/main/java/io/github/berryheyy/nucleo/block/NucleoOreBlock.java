package io.github.berryheyy.nucleo.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;

public class NucleoOreBlock extends NucleoBlock {

    public NucleoOreBlock(String registryName) {
        super(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).strength(0.5F, 0.5F), registryName);
    }
    
}
