package com.jmrapp.terralegion.game.item.impl;

import com.jmrapp.terralegion.engine.views.drawables.Drawable;
import com.jmrapp.terralegion.game.item.Item;
import com.jmrapp.terralegion.game.item.ItemCategory;
import com.jmrapp.terralegion.game.world.block.BlockType;

/**
 * Created by Jon on 10/1/15.
 */
public class BlockItem extends Item {

    private BlockType type;

    public BlockItem(BlockType type, ItemCategory category, String name, Drawable icon, int maxStack) {
        super(type.getId(), category, name, icon, maxStack);
        this.type = type;
    }

    public BlockType getBlockType() {
        return type;
    }

    @Override
    public String toString() {
        return "Block\nCan be placed";
    }

}
