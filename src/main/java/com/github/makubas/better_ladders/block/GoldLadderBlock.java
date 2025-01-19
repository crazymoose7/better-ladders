package com.github.makubas.better_ladders.block;

import com.github.makubas.better_ladders.config.ConfigFile;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;


public class GoldLadderBlock extends LadderBlock {

    public double ladderSpeed = ConfigFile.GOLD_LADDER_SPEED;

    public GoldLadderBlock() {
        super(FabricBlockSettings.of(Material.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .hardness(1.8F)
                .nonOpaque());
    }
}
