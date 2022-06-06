package net.jamesnguyen.jamesmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("jamestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RACCOON_SPAWN_EGG.get());
        }
    };
}
