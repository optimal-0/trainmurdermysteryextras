package com.trainmurdermysteryextras;

import com.trainmurdermysteryextras.index.TMMEBlocks;
import com.trainmurdermysteryextras.index.TMMEItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrainMurderMysteryExtras implements ModInitializer {
	public static final String MOD_ID = "trainmurdermysteryextras";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        TMMEItems.initialize();
        TMMEBlocks.initialize();

		LOGGER.info("Hello Fabric world!");
	}
}