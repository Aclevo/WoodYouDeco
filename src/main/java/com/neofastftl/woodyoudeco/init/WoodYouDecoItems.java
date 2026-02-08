package com.neofastftl.woodyoudeco.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WoodYouDecoItems {
    public static final DeferredRegister<Item> REGISTRY;
    public static final RegistryObject<Item> SPRUCE_CHISELED_BOOKSHELF;
    public static final RegistryObject<Item> BIRCH_CHISELED_BOOKSHELF;
    public static final RegistryObject<Item> JUNGLE_CHISELED_BOOKSHELF;
    public static final RegistryObject<Item> ACACIA_CHISELED_BOOKSHELF;
    public static final RegistryObject<Item> DARK_OAK_CHISELED_BOOKSHELF;
    public static final RegistryObject<Item> MANGROVE_CHISELED_BOOKSHELF;
    public static final RegistryObject<Item> CHERRY_CHISELED_BOOKSHELF;
    public static final RegistryObject<Item> BAMBOO_CHISELED_BOOKSHELF;
    public static final RegistryObject<Item> CRIMSON_CHISELED_BOOKSHELF;
    public static final RegistryObject<Item> WARPED_CHISELED_BOOKSHELF;
    public static final RegistryObject<Item> SPRUCE_BOOKSHELF;
    public static final RegistryObject<Item> BIRCH_BOOKSHELF;
    public static final RegistryObject<Item> JUNGLE_BOOKSHELF;
    public static final RegistryObject<Item> ACACIA_BOOKSHELF;
    public static final RegistryObject<Item> DARK_OAK_BOOKSHELF;
    public static final RegistryObject<Item> MANGROVE_BOOKSHELF;
    public static final RegistryObject<Item> CHERRY_BOOKSHELF;
    public static final RegistryObject<Item> BAMBOO_BOOKSHELF;
    public static final RegistryObject<Item> CRIMSON_BOOKSHELF;
    public static final RegistryObject<Item> WARPED_BOOKSHELF;
    public static final RegistryObject<Item> SPRUCE_LADDER;
    public static final RegistryObject<Item> BIRCH_LADDER;
    public static final RegistryObject<Item> JUNGLE_LADDER;
    public static final RegistryObject<Item> ACACIA_LADDER;
    public static final RegistryObject<Item> DARK_OAK_LADDER;
    public static final RegistryObject<Item> MANGROVE_LADDER;
    public static final RegistryObject<Item> CHERRY_LADDER;
    public static final RegistryObject<Item> BAMBOO_LADDER;
    public static final RegistryObject<Item> CRIMSON_LADDER;
    public static final RegistryObject<Item> WARPED_LADDER;

    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new
                BlockItem(block.get(), new Item.Properties()));
    }

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "woodyoudeco");
        SPRUCE_CHISELED_BOOKSHELF = block(WoodYouDecoBlocks.SPRUCE_CHISELED_BOOKSHELF);
        BIRCH_CHISELED_BOOKSHELF = block(WoodYouDecoBlocks.BIRCH_CHISELED_BOOKSHELF);
        JUNGLE_CHISELED_BOOKSHELF = block(WoodYouDecoBlocks.JUNGLE_CHISELED_BOOKSHELF);
        ACACIA_CHISELED_BOOKSHELF = block(WoodYouDecoBlocks.ACACIA_CHISELED_BOOKSHELF);
        DARK_OAK_CHISELED_BOOKSHELF = block(WoodYouDecoBlocks.DARK_OAK_CHISELED_BOOKSHELF);
        MANGROVE_CHISELED_BOOKSHELF = block(WoodYouDecoBlocks.MANGROVE_CHISELED_BOOKSHELF);
        CHERRY_CHISELED_BOOKSHELF = block(WoodYouDecoBlocks.CHERRY_CHISELED_BOOKSHELF);
        BAMBOO_CHISELED_BOOKSHELF = block(WoodYouDecoBlocks.BAMBOO_CHISELED_BOOKSHELF);
        CRIMSON_CHISELED_BOOKSHELF = block(WoodYouDecoBlocks.CRIMSON_CHISELED_BOOKSHELF);
        WARPED_CHISELED_BOOKSHELF = block(WoodYouDecoBlocks.WARPED_CHISELED_BOOKSHELF);
        SPRUCE_BOOKSHELF = block(WoodYouDecoBlocks.SPRUCE_BOOKSHELF);
        BIRCH_BOOKSHELF = block(WoodYouDecoBlocks.BIRCH_BOOKSHELF);
        JUNGLE_BOOKSHELF = block(WoodYouDecoBlocks.JUNGLE_BOOKSHELF);
        ACACIA_BOOKSHELF = block(WoodYouDecoBlocks.ACACIA_BOOKSHELF);
        DARK_OAK_BOOKSHELF = block(WoodYouDecoBlocks.DARK_OAK_BOOKSHELF);
        MANGROVE_BOOKSHELF = block(WoodYouDecoBlocks.MANGROVE_BOOKSHELF);
        CHERRY_BOOKSHELF = block(WoodYouDecoBlocks.CHERRY_BOOKSHELF);
        BAMBOO_BOOKSHELF = block(WoodYouDecoBlocks.BAMBOO_BOOKSHELF);
        CRIMSON_BOOKSHELF = block(WoodYouDecoBlocks.CRIMSON_BOOKSHELF);
        WARPED_BOOKSHELF = block(WoodYouDecoBlocks.WARPED_BOOKSHELF);
        SPRUCE_LADDER = block(WoodYouDecoBlocks.SPRUCE_LADDER);
        BIRCH_LADDER = block(WoodYouDecoBlocks.BIRCH_LADDER);
        JUNGLE_LADDER = block(WoodYouDecoBlocks.JUNGLE_LADDER);
        ACACIA_LADDER = block(WoodYouDecoBlocks.ACACIA_LADDER);
        DARK_OAK_LADDER = block(WoodYouDecoBlocks.DARK_OAK_LADDER);
        MANGROVE_LADDER = block(WoodYouDecoBlocks.MANGROVE_LADDER);
        CHERRY_LADDER = block(WoodYouDecoBlocks.CHERRY_LADDER);
        BAMBOO_LADDER = block(WoodYouDecoBlocks.BAMBOO_LADDER);
        CRIMSON_LADDER = block(WoodYouDecoBlocks.CRIMSON_LADDER);
        WARPED_LADDER = block(WoodYouDecoBlocks.WARPED_LADDER);
    }
}
