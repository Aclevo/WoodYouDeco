package com.neofastftl.woodyoudeco;

import com.neofastftl.woodyoudeco.init.WoodYouDecoBlockEntities;
import com.neofastftl.woodyoudeco.init.WoodYouDecoBlocks;
import com.neofastftl.woodyoudeco.init.WoodYouDecoItems;
import com.neofastftl.woodyoudeco.init.WoodYouDecoTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WoodYouDeco.MODID)
public class WoodYouDeco {
    public static final String MODID = "woodyoudeco";

    public WoodYouDeco() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        WoodYouDecoBlocks.REGISTRY.register(bus);
        WoodYouDecoItems.REGISTRY.register(bus);
        WoodYouDecoTabs.REGISTRY.register(bus);
        WoodYouDecoBlockEntities.REGISTRY.register(bus);
    }
}
