package net.qwfn.darkinf.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.qwfn.darkinf.DarkInfection;
import net.qwfn.darkinf.block.Modblocks;

public class DICreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_tabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DarkInfection.MOD_ID);

    public static final RegistryObject<CreativeModeTab> infected_blocks_n_items = CREATIVE_MODE_tabs.register("infected_blocks_n_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Void_steel.get()))
                    .title(Component.translatable("creativetab.dark_infection.infected_blocks_n_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.Void_steel.get());
                        pOutput.accept(ModItems.raw_Void_steel.get());
                        pOutput.accept(Modblocks.void_steel_block.get());
                        pOutput.accept(Modblocks.raw_void_steel_block.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_tabs.register(eventBus);
    }


}
