package com.github.makubas.better_ladders.block;

import com.github.makubas.better_ladders.config.ConfigFile;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LadderBlock;
import net.minecraft.sound.BlockSoundGroup;


public class GoldLadderBlock extends LadderBlock {

    public double ladderSpeed = ConfigFile.GOLD_LADDER_SPEED;

    public GoldLadderBlock() {
        super(AbstractBlock.Settings.create()
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .hardness(1.8F)
                .nonOpaque());
    }
}
