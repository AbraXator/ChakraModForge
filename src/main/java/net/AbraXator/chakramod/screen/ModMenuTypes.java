package net.AbraXator.chakramod.screen;

import net.AbraXator.chakramod.ChakraMod;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, ChakraMod.MOD_ID);

    public static final RegistryObject<MenuType<StoneBenchMenu>> STONE_BENCH_MENU =
            registerMenuType(StoneBenchMenu::new, "stone_bench_menu");

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>>
    registerMenuType(IContainerFactory<T> factory, String name){
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus){
        MENUS.register(eventBus);
    }
}
    