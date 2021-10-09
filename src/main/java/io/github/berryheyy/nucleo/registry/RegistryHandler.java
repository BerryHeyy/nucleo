package io.github.berryheyy.nucleo.registry;

import io.github.berryheyy.nucleo.Nucleo;
import io.github.berryheyy.nucleo.Reference;
import io.github.berryheyy.nucleo.block.NucleoBlock;
import io.github.berryheyy.nucleo.data.ItemModelGenerator;
import io.github.berryheyy.nucleo.item.NucleoItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryHandler {

    public static NucleoItem registerItem(NucleoItem item, boolean generateModel) {
        if (generateModel) {
            ItemModelGenerator.registerItemModel(item.registryName);
        }
        
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, item.registryName), item);

        return item;
    }

    public static NucleoItem registerItem(NucleoItem item) { return registerItem(item, true); }
    
    public static NucleoBlock registerBlock(NucleoBlock block)
    {
        ItemModelGenerator.registerBlockItemModel(block.registryName);

        Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, block.registryName), block);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, block.registryName),
            new BlockItem(block, new FabricItemSettings().group(Nucleo.ITEM_GROUP)));

        return block;
    }
}
