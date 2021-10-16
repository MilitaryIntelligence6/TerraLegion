package com.jmrapp.terralegion.game.world.block.impl;

import com.jmrapp.terralegion.engine.views.drawables.Drawable;
import com.jmrapp.terralegion.engine.views.drawables.ResourceManager;
import com.jmrapp.terralegion.game.world.block.BlockType;

/**
 * Will be used as a crop for farming. Crops will be planted by seeds and have multiple
 * stages of growth throughout time.
 * <p>
 * <p>
 * Created by oprsec on 8/5/16.
 */
public class CropBlock extends PlantBlock {

    public CropBlock(BlockType type, Drawable drawable, float lightBlockingAmount, boolean collides,
                     boolean transparent, float initHealth, float resistance) {
        super(BlockType.CROP_BLOCK_0, ResourceManager.getInstance().getDrawable("crop0"), 0.1f, false, true, 0.1f, 0.1f);
    }
}
