package net.holygod109.mccourse.item;

import net.holygod109.mccourse.MCCourseMod;
import net.holygod109.mccourse.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.awt.*;
import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MOD_ID);

    public static final Supplier<CreativeModeTab> BLACK_OPAL_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("black_opal_item_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mccourse.black_opal_items_tab"))
                    .icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BLACK_OPAL);
                        pOutput.accept(ModItems.RAW_BLACK_OPAL);
                    }).build());

public static final Supplier<CreativeModeTab> BLACK_OPAL_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("black_opal_blocks_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mccourse.black_opal_blocks_tab"))
                    .icon(() -> new ItemStack(ModBlocks.BLACK_OPAL_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MCCourseMod.MOD_ID, "black_opal_item_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.BLACK_OPAL_BLOCK);
                        pOutput.accept(ModBlocks.RAW_BLACK_OPAL_BLOCK);

                        pOutput.accept(ModBlocks.BLACK_OPAL_ORE);
                        pOutput.accept(ModBlocks.BLACK_OPAL_DEEPSLATE_ORE);
                        pOutput.accept(ModBlocks.BLACK_OPAL_END_ORE);
                        pOutput.accept(ModBlocks.BLACK_OPAL_NETHER_ORE);
                    }).build());


    public static final Supplier<CreativeModeTab>VOID_CRYSTAL_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("void_crystal_item_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mccourse.void_crystal_items_tab"))
                    .icon(() -> new ItemStack(ModItems.VOID_CRYSTAL.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.VOID_CRYSTAL);
                        pOutput.accept(ModItems.ABUNDANT_CRYSTAL);
                        pOutput.accept(ModItems.SPACE_CRYSTAL);
                        pOutput.accept(ModItems.SOUL_CRYSTAL);
                        pOutput.accept(ModItems.TIME_CRYSTAL);
                    }).build());

    public static final Supplier<CreativeModeTab>VOID_CRYSTAL_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("void_crystal_blocks_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mccourse.void_crystal_blocks_tab"))
                    .icon(() -> new ItemStack(ModBlocks.ABUNDANT_CRYSTAL_ORE.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.ABUNDANT_CRYSTAL_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_ABUNDANT_CRYSTAL_ORE);
                        pOutput.accept(ModBlocks.SOUL_CRYSTAL_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_SOUL_CRYSTAL_ORE);
                        pOutput.accept(ModBlocks.SPACE_CRYSTAL_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_SPACE_CRYSTAL_ORE);
                        pOutput.accept(ModBlocks.TIME_CRYSTAL_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_TIME_CRYSTAL_ORE);
                        pOutput.accept(ModBlocks.VOID_CRYSTAL_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_VOID_CRYSTAL_ORE);
                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
