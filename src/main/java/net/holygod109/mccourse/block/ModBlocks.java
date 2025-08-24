package net.holygod109.mccourse.block;

import net.holygod109.mccourse.MCCourseMod;
import net.holygod109.mccourse.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MCCourseMod.MOD_ID);

    //Kaupenjoe's tutorial blocks
    public static final DeferredBlock<Block> BLACK_OPAL_BLOCK = registerBlock("black_opal_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RAW_BLACK_OPAL_BLOCK = registerBlock("raw_black_opal_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_OPAL_ORE = registerBlock("black_opal_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_OPAL_DEEPSLATE_ORE = registerBlock("black_opal_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6),
                    BlockBehaviour.Properties.of().strength(6f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_OPAL_END_ORE = registerBlock("black_opal_end_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 8),
                    BlockBehaviour.Properties.of().strength(5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_OPAL_NETHER_ORE = registerBlock("black_opal_nether_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 7),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

//My own experiments
    public static final DeferredBlock<Block> VOID_CRYSTAL_ORE = registerBlock("void_crystal_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
 public static final DeferredBlock<Block> DEEPSLATE_VOID_CRYSTAL_ORE= registerBlock("deepslate_void_crystal_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
 public static final DeferredBlock<Block> TIME_CRYSTAL_ORE = registerBlock("time_crystal_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
 public static final DeferredBlock<Block> DEEPSLATE_TIME_CRYSTAL_ORE = registerBlock("deepslate_time_crystal_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
 public static final DeferredBlock<Block> SOUL_CRYSTAL_ORE = registerBlock("soul_crystal_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
 public static final DeferredBlock<Block> DEEPSLATE_SOUL_CRYSTAL_ORE = registerBlock("deepslate_soul_crystal_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
 public static final DeferredBlock<Block> ABUNDANT_CRYSTAL_ORE = registerBlock("abundant_crystal_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
 public static final DeferredBlock<Block> DEEPSLATE_ABUNDANT_CRYSTAL_ORE = registerBlock("deepslate_abundant_crystal_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
 public static final DeferredBlock<Block> SPACE_CRYSTAL_ORE = registerBlock("space_crystal_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
 public static final DeferredBlock<Block> DEEPSLATE_SPACE_CRYSTAL_ORE = registerBlock("deepslate_space_crystal_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));




    private static <T extends Block>DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
