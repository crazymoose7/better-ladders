package com.github.makubas.better_ladders.block;

import com.github.makubas.better_ladders.BetterLadders;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static final Block IRON_LADDER =  registerBlock("iron_ladder", new IronLadderBlock());
    private static final Block GOLD_LADDER = registerBlock("gold_ladder", new GoldLadderBlock());
    private static final Block DIAMOND_LADDER =registerBlock("diamond_ladder", new DiamondLadderBlock());
    private static final Block NETHERITE_LADDER = registerBlock("netherite_ladder", new NetheriteLadderBlock());

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterLadders.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        BlockItem item = new BlockItem(block, new Item.Settings());

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL)
                .register((itemGroup) -> itemGroup.add(item));

        Registry.register(Registries.ITEM, Identifier.of(BetterLadders.MOD_ID, name), item);
    }

    public static void registerModBlocks() {
    }

}
