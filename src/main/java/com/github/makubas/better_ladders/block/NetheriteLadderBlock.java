package com.github.makubas.better_ladders.block;

import com.github.makubas.better_ladders.config.ConfigFile;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LadderBlock;
import net.minecraft.sound.BlockSoundGroup;


public class NetheriteLadderBlock extends LadderBlock {

    public double ladderSpeed = ConfigFile.NETHERITE_LADDER_SPEED;

    public NetheriteLadderBlock() {
        super(AbstractBlock.Settings.create()
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                .hardness(2.4F)
                .nonOpaque());
    }
}
