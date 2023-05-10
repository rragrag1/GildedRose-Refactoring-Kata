package com.gildedrose;

public class AgedBrie extends GildedRoseItem {
    public AgedBrie(Item item) {
        super(item);
    }
    @Override
    protected void handleQuality() {
        increaseQuality();
    }
    @Override
    protected void handleExpiration() {
        increaseQuality();
    }


}
