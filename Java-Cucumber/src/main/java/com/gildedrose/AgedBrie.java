package com.gildedrose;

public class AgedBrie extends GildedRoseItem {
    public static final String LABEL = "Aged Brie";

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
