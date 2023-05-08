package com.gildedrose;

public class Conjured extends GildedRoseItem {
    public Conjured(Item item) {
        super(item);
    }
    @Override
    public void updateQuality() {
        updateExpiration();
        if (item.quality > 0) {
            item.quality = item.quality - 1;
            decreaseQuality();
        }
        if (isExpired()) {
            decreaseQuality();
            decreaseQuality();
        }
    }

}
