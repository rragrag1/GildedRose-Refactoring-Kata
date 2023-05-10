package com.gildedrose;

public class Conjured extends GildedRoseItem {
    public Conjured(Item item) {
        super(item);
    }
    @Override
    protected void decreaseQuality() {
        item.quality = (item.quality > 1) ?  item.quality -2 : 0;
    }
}
