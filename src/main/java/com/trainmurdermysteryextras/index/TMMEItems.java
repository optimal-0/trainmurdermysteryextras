package com.trainmurdermysteryextras.index;

import com.trainmurdermysteryextras.item.GlassHammerItem;
import dev.doctor4t.ratatouille.util.registrar.ItemRegistrar;
import dev.doctor4t.trainmurdermystery.TMM;
import dev.doctor4t.trainmurdermystery.index.TMMItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

public interface TMMEItems {
    ItemRegistrar registrar = new ItemRegistrar("trainmurdermysteryextras");

    RegistryKey<ItemGroup> TMME_ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, TMM.id("trainmurdermysterextrasitems"));
    RegistryKey<ItemGroup> TMME_BLOCK_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, TMM.id("trainmurdermysterextrasblock"));

    RegistryKey<net.minecraft.item.ItemGroup> EQUIPMENT_GROUP = TMMItems.EQUIPMENT_GROUP;

    Item GLASS_HAMMER = registrar.create("glass_hammer", new GlassHammerItem(new Item.Settings().maxCount(1)), EQUIPMENT_GROUP);

    static void initialize() {
        registrar.registerEntries();

        Registry.register(Registries.ITEM_GROUP, TMME_BLOCK_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.trainmurdermystery.building"))
                .icon(() -> new ItemStack(GLASS_HAMMER))
                .build());
    }
}

