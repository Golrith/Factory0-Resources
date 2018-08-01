package v0id.f0resources.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import v0id.api.f0resources.data.F0RBlocks;
import v0id.api.f0resources.data.F0RRegistryNames;
import v0id.f0resources.block.BlockDrillComponent;
import v0id.f0resources.block.BlockDrillPart;

@Mod.EventBusSubscriber(modid = F0RRegistryNames.MODID)
public class F0RBlocksRegistry
{
    @SubscribeEvent
    public static void onBlocksRegistry(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                new BlockDrillComponent(),
                new BlockDrillPart()
        );
    }

    @SubscribeEvent
    public static void onItemsRegistry(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                new ItemBlock(F0RBlocks.drillComponent).setRegistryName(F0RBlocks.drillComponent.getRegistryName()),
                new ItemBlock(F0RBlocks.drillPart).setRegistryName(F0RBlocks.drillPart.getRegistryName())
        );
    }
}