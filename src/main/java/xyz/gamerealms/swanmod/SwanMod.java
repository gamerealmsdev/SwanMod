package xyz.gamerealms.swanmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.gamerealms.swanmod.entity.ModEntities;
import xyz.gamerealms.swanmod.entity.custom.CapybaraEntity;

public class SwanMod implements ModInitializer {
    public static final String MOD_ID = "swanmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(ModEntities.CAPYBARA, CapybaraEntity.createAttributes());
    }
}
