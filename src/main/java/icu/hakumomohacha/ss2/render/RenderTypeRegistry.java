package icu.hakumomohacha.ss2.render;

import icu.hakumomohacha.ss2.Utils;
import icu.hakumomohacha.ss2.blocks.BlockRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT,modid = Utils.mod_id)
public class RenderTypeRegistry {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event){
        event.enqueueWork(
                ()->{
                    ItemBlockRenderTypes.setRenderLayer(BlockRegistry.CHERRY_SAPLING.get(), RenderType.cutout());
                    ItemBlockRenderTypes.setRenderLayer(BlockRegistry.CHERRY_HANA.get(), RenderType.cutout());
                    ItemBlockRenderTypes.setRenderLayer(BlockRegistry.MOON_HANA.get(), RenderType.cutout());
                }
        );
    }
}
