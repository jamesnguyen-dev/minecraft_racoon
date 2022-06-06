package net.jamesnguyen.jamesmod.event;

import net.jamesnguyen.jamesmod.JamesMod;
import net.jamesnguyen.jamesmod.entity.ModEntityTypes;
import net.jamesnguyen.jamesmod.entity.custom.RaccoonEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JamesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.RACCOON.get(), RaccoonEntity.setAttributes());
    }
}
