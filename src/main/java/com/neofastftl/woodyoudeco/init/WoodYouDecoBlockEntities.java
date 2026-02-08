package com.neofastftl.woodyoudeco.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChiseledBookShelfBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChiseledBookShelfBlockEntity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.stream.Stream;

public class WoodYouDecoBlockEntities {
        public static final DeferredRegister<BlockEntityType<?>> REGISTRY;
        public static final RegistryObject<BlockEntityType<?>> CHISELED_BOOKSHELF;

        public static Block[] findBlocks(Class<?> targets) {
            Stream<Block> var10000 = ForgeRegistries.BLOCKS.getValues().stream();
            Objects.requireNonNull(targets);
            return var10000.filter(targets::isInstance).toArray(Block[]::new);
        }

        static {
            REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "woodster");
            CHISELED_BOOKSHELF = REGISTRY.register("chiseled_bookshelf", () -> BlockEntityType.Builder.of(ChiseledBookShelfBlockEntity::new, findBlocks(ChiseledBookShelfBlock.class)).build(null));
        }
    }
