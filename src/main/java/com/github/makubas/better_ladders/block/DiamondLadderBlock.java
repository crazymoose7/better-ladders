package com.github.makubas.better_ladders.block;

import com.github.makubas.better_ladders.config.ConfigFile;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;


public class DiamondLadderBlock extends LadderBlock {

    public double ladderSpeed = ConfigFile.DIAMOND_LADDER_SPEED;

    public DiamondLadderBlock() {
        super(FabricBlockSettings.of(Material.METAL)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .hardness(2.1F)
                .nonOpaque());
    }
}
