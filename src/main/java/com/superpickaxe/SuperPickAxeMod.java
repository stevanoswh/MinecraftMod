package com.superpickaxe;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(FirstMod.MOD_ID)
public class FirstMod {

    public static final String MOD_ID = "firstmod";

    public FirstMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {

        if (!(event.getLevel() instanceof Level level)) {
            return;
        }

        if (level.isClientSide()) {
            return;
        }

        Player player = event.getPlayer();

        if (!player.getMainHandItem().is(Items.DIAMOND_PICKAXE)) {
            return;
        }

        BlockPos pos = event.getPos();

        level.explode(
                player,
                pos.getX() + 0.5,
                pos.getY() + 0.5,
                pos.getZ() + 0.5,
                2.0F,
                Level.ExplosionInteraction.TNT
        );
    }
}