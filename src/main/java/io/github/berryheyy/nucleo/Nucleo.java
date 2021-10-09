package io.github.berryheyy.nucleo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.berryheyy.nucleo.registry.BlockRegistry;
import io.github.berryheyy.nucleo.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Nucleo implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger("modid");

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier(Reference.MOD_ID, "general"),
        () -> new ItemStack(ItemRegistry.RAW_URANIUM));

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");

        BlockRegistry.init();
        ItemRegistry.init();
    }
    
}
