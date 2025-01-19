package com.github.makubas.better_ladders;

import com.github.makubas.better_ladders.block.DiamondLadderBlock;
import com.github.makubas.better_ladders.block.GoldLadderBlock;
import com.github.makubas.better_ladders.block.IronLadderBlock;
import com.github.makubas.better_ladders.block.NetheriteLadderBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class BetterLadders implements ModInitializer {

	public static final String MOD_ID = "betlad";

	private static final IronLadderBlock IRON_LADDER = new IronLadderBlock();
	private static final GoldLadderBlock GOLD_LADDER = new GoldLadderBlock();
	private static final DiamondLadderBlock DIAMOND_LADDER = new DiamondLadderBlock();
	private static final NetheriteLadderBlock NETHERITE_LADDER = new NetheriteLadderBlock();

	@Override
	public void onInitialize() {
		System.out.println("Better Ladders initialised!");

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "iron_ladder"), IRON_LADDER);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_ladder"), new BlockItem(IRON_LADDER, new FabricItemSettings().group(ItemGroup.MISC)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gold_ladder"), GOLD_LADDER);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gold_ladder"), new BlockItem(GOLD_LADDER, new FabricItemSettings().group(ItemGroup.MISC)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "diamond_ladder"), DIAMOND_LADDER);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_ladder"), new BlockItem(DIAMOND_LADDER, new FabricItemSettings().group(ItemGroup.MISC)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "netherite_ladder"), NETHERITE_LADDER);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_ladder"), new BlockItem(NETHERITE_LADDER, new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
