package com.superpickaxe;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(GrappleHook.MOD_ID)
public class GrappleHook {

    public static final String MOD_ID = "firstmod";

    private static final double GRAPPLE_RANGE = 30.0D;
    private static final double GRAPPLE_SPEED = 1.8D;
    private static final int COOLDOWN_TICKS = 20;

    @Mod.EventBusSubscriber(
            modid = MOD_ID,
            bus = Mod.EventBusSubscriber.Bus.FORGE
    )
    public static class ForgeEvents {

        @SubscribeEvent
        public static void onRightClickItem(
                PlayerInteractEvent.RightClickItem event
        ) {
            if (event.getItemStack().is(Items.FISHING_ROD)) {
                useGrapplingHook(event.getEntity());
            }
        }

        @SubscribeEvent
        public static void onRightClickBlock(
                PlayerInteractEvent.RightClickBlock event
        ) {
            if (event.getItemStack().is(Items.FISHING_ROD)) {
                useGrapplingHook(event.getEntity());
            }
        }

        private static void useGrapplingHook(Player player) {

           
        }
    }
}