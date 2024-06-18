package dev.dablulite.betterdisco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import dev.dablulite.betterdisco.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.LENA_RAINE_CREATOR_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.LENA_RAINE_CREATOR_MUSIC_DISC);



        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.PRECIPICE_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.PRECIPICE_MUSIC_DISC);



        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.VIGNETTE_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.VIGNETTE_MUSIC_DISC);



        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.KOMM_SUSSER_TOD_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.KOMM_SUSSER_TOD_MUSIC_DISC);



        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.NEVER_GONNA_GIVE_YOU_UP_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.NEVER_GONNA_GIVE_YOU_UP_MUSIC_DISC);



        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MIWA_CHANGE_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MIWA_CHANGE_MUSIC_DISC);



        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.REMEMBER_THAT_NIGHT_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.REMEMBER_THAT_NIGHT_MUSIC_DISC);



        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.ROUTINES_IN_THE_NIGHT_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.ROUTINES_IN_THE_NIGHT_MUSIC_DISC);



        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.NAVIGATING_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.NAVIGATING_MUSIC_DISC);



        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.PALADIN_STRAIT_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.PALADIN_STRAIT_MUSIC_DISC);
    }
}