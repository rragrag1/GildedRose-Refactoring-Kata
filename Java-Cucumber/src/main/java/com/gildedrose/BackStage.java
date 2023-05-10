package com.gildedrose;

public class BackStage extends GildedRoseItem {
    public static final String LABEL = "Backstage passes to a TAFKAL80ETC concert";

    public BackStage(Item item) {
        super(item);
    }

    @Override
    protected void handleQuality() {
        increaseQuality();
        if (item.sellIn < 11) {
            increaseQuality();
        }
        if (item.sellIn < 6) {
            increaseQuality();
        }
    }
    @Override
    protected void handleExpiration() {
        item.quality = 0;
    }

}
