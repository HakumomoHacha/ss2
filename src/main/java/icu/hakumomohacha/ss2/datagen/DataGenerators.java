package icu.hakumomohacha.ss2.datagen;


import icu.hakumomohacha.ss2.Utils;
import icu.hakumomohacha.ss2.blocks.BlockRegistry;
import icu.hakumomohacha.ss2.items.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Utils.mod_id, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeClient()) {
            //block/item models, blockstates, language files...
            generator.addProvider(new BlockStatesGen(generator,Utils.mod_id,helper));
            generator.addProvider(new ItemModelGen(generator,Utils.mod_id,helper, ItemRegistry.ITEMS));

        }
        if (event.includeServer()) {
            //recipes,advancements,tags...
        }

    }
}
