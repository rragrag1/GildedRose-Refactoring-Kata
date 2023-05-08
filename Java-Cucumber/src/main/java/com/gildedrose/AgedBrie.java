package com.gildedrose;

public class AgedBrie extends GildedRoseItem {
    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        updateExpiration();
        if (isExpired()) {
            increaseQuality();
        }
    }
}
