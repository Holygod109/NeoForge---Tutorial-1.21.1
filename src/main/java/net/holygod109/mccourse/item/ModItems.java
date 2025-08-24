package net.holygod109.mccourse.item;

import net.holygod109.mccourse.MCCourseMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MCCourseMod.MOD_ID);

    public static final DeferredItem<Item> BLACK_OPAL = ITEMS.registerSimpleItem("black_opal");
    public static final DeferredItem<Item> RAW_BLACK_OPAL =
            ITEMS.registerItem("raw_black_opal", Item::new, new Item.Properties());

    public static final DeferredItem<Item> VOID_CRYSTAL = ITEMS.registerSimpleItem("void_crystal");
    public static final DeferredItem<Item> SPACE_CRYSTAL = ITEMS.registerSimpleItem("space_crystal");
    public static final DeferredItem<Item> ABUNDANT_CRYSTAL = ITEMS.registerSimpleItem("abundant_crystal");
    public static final DeferredItem<Item> SOUL_CRYSTAL = ITEMS.registerSimpleItem("soul_crystal");
    public static final DeferredItem<Item> TIME_CRYSTAL = ITEMS.registerSimpleItem("time_crystal");
    public static final DeferredItem<Item> AZURE_SHARD = ITEMS.registerSimpleItem("azure_shard");


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
