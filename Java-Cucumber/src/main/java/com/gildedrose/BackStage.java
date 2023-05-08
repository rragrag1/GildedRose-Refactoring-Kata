package com.gildedrose;

public class BackStage extends GildedRoseItem {
    public BackStage(Item item) {
        super(item);
    }
    @Override
    public void updateQuality() {
        increaseQuality();
        if (item.sellIn < 11) {
            increaseQuality();
        }
        if (item.sellIn < 6) {
            increaseQuality();
        }
        if (isExpired()) {
            item.quality = 0;
        }
        updateExpiration();
    }

}
