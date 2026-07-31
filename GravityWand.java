package com.superpickaxe;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(GravityWand.MOD_ID)
public class FirstMod {

    public static final String MOD_ID = "firstmod";

    private static final double LAUNCH_POWER = 4.5D;
    private static final int COOLDOWN_TICKS = 10;

    @Mod.EventBusSubscriber(
            modid = MOD_ID,
            bus = Mod.EventBusSubscriber.Bus.FORGE
    )
    public static class ForgeEvents {

      
    }
}
