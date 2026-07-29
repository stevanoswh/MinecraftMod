package com.superpickaxe;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(FireSword.MOD_ID)
public class FireSword {

    public static final String MOD_ID = "firstmod";

    @Mod.EventBusSubscriber(
            modid = MOD_ID,
            bus = Mod.EventBusSubscriber.Bus.FORGE
    )
    public static class ForgeEvents {

        @SubscribeEvent
        public static void onPlayerAttack(AttackEntityEvent event) {

            Player player = event.getEntity();

            if (player.level().isClientSide()) {
                return;
            }

            if (!player.getMainHandItem().is(Items.DIAMOND_SWORD)) {
                return;
            }

            if (!(event.getTarget() instanceof LivingEntity target)) {
                return;
            }

            target.setSecondsOnFire(5);
        }
    }
}