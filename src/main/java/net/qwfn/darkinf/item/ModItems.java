package net.qwfn.darkinf.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.qwfn.darkinf.DarkInfection;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DarkInfection.MOD_ID);

    public static  final RegistryObject<Item> Void_steel = ITEMS.register("void_steel",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> raw_Void_steel = ITEMS.register("raw_void_steel",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
