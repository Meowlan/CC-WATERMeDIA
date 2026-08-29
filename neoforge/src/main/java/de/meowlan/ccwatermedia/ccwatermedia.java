package de.meowlan.ccwatermedia;

import com.mojang.logging.LogUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

import dan200.computercraft.api.ComputerCraftAPI;
import de.meowlan.ccwatermedia.computercraft.implementation.peripherals.*;

@Mod(Constants.MODID)
public class ccwatermedia {

    private static final Logger LOGGER = LogUtils.getLogger();

    public ccwatermedia(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Hello from CC: WATERMeDIA!");

        ComputerCraftAPI.registerGenericSource(new BigTelevisionPeripheral());
        ComputerCraftAPI.registerGenericSource(new BoxTelevisionPeripheral());
        ComputerCraftAPI.registerGenericSource(new FramePeripheral());
        ComputerCraftAPI.registerGenericSource(new ProjectorPeripheral());
        ComputerCraftAPI.registerGenericSource(new TelevisionPeripheral());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = Constants.MODID, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
