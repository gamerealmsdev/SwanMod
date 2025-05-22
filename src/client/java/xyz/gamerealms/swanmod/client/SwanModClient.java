package xyz.gamerealms.swanmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import xyz.gamerealms.swanmod.client.entity.CapybaraModel;
import xyz.gamerealms.swanmod.client.entity.CapybaraRenderer;
import xyz.gamerealms.swanmod.entity.ModEntities;

public class SwanModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(CapybaraModel.CAPYBARA, CapybaraModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.CAPYBARA, CapybaraRenderer::new);
    }
}
