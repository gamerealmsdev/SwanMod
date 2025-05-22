package xyz.gamerealms.swanmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.gamerealms.swanmod.SwanMod;
import xyz.gamerealms.swanmod.entity.custom.CapybaraEntity;

public class ModEntities {
    public static final EntityType<CapybaraEntity> CAPYBARA = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(SwanMod.MOD_ID, "capybara"),
            EntityType.Builder.create(CapybaraEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.7f, 0.6f).build());

    public static void registerModEntities() {
        SwanMod.LOGGER.info("Registering Mod Entities for " + SwanMod.MOD_ID);
    }
}
