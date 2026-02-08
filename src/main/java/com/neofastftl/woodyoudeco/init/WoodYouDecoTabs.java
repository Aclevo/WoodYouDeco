package com.neofastftl.woodyoudeco.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class WoodYouDecoTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;
    public static final RegistryObject<CreativeModeTab> WOODYOUDECO;

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "woodyoudeco");
        WOODYOUDECO = REGISTRY.register("woodyoudeco", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.woodyoudeco")).icon(() -> new ItemStack(Blocks.CHISELED_BOOKSHELF)).displayItems((parameters, tabData) -> {
            tabData.accept(Blocks.CHISELED_BOOKSHELF);
            tabData.accept(WoodYouDecoBlocks.SPRUCE_CHISELED_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.BIRCH_CHISELED_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.JUNGLE_CHISELED_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.ACACIA_CHISELED_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.DARK_OAK_CHISELED_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.MANGROVE_CHISELED_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.CHERRY_CHISELED_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.BAMBOO_CHISELED_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.CRIMSON_CHISELED_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.WARPED_CHISELED_BOOKSHELF.get());
            tabData.accept(Blocks.BOOKSHELF);
            tabData.accept(WoodYouDecoBlocks.SPRUCE_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.BIRCH_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.JUNGLE_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.ACACIA_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.DARK_OAK_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.MANGROVE_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.CHERRY_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.BAMBOO_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.CRIMSON_BOOKSHELF.get());
            tabData.accept(WoodYouDecoBlocks.WARPED_BOOKSHELF.get());
            tabData.accept(Blocks.LADDER);
            tabData.accept(WoodYouDecoBlocks.SPRUCE_LADDER.get());
            tabData.accept(WoodYouDecoBlocks.BIRCH_LADDER.get());
            tabData.accept(WoodYouDecoBlocks.JUNGLE_LADDER.get());
            tabData.accept(WoodYouDecoBlocks.ACACIA_LADDER.get());
            tabData.accept(WoodYouDecoBlocks.DARK_OAK_LADDER.get());
            tabData.accept(WoodYouDecoBlocks.MANGROVE_LADDER.get());
            tabData.accept(WoodYouDecoBlocks.CHERRY_LADDER.get());
            tabData.accept(WoodYouDecoBlocks.BAMBOO_LADDER.get());
            tabData.accept(WoodYouDecoBlocks.CRIMSON_LADDER.get());
            tabData.accept(WoodYouDecoBlocks.WARPED_LADDER.get());
        }).build());
    }
}
