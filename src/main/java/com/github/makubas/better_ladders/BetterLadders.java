package com.github.makubas.better_ladders;

import com.github.makubas.better_ladders.block.*;
import net.fabricmc.api.ModInitializer;

public class BetterLadders implements ModInitializer {

	public static final String MOD_ID = "betlad";

	@Override
	public void onInitialize() {
		System.out.println("Better Ladders initialised!");
		ModBlocks.registerModBlocks();
	}
}
