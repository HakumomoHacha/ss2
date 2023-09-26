package icu.hakumomohacha.ss2.modgroup;

import icu.hakumomohacha.ss2.items.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModGroup extends CreativeModeTab {
    public ModGroup() {
        super("ss2_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.SEASON_DIRT.get());
    }
}
