package com.github.makubas.better_ladders.block;

import com.github.makubas.better_ladders.config.ConfigFile;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LadderBlock;
import net.minecraft.sound.BlockSoundGroup;


public class DiamondLadderBlock extends LadderBlock {

    public double ladderSpeed = ConfigFile.DIAMOND_LADDER_SPEED;

    public DiamondLadderBlock() {
        super(AbstractBlock.Settings.create()
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .hardness(2.1F)
                .nonOpaque());
    }
}
