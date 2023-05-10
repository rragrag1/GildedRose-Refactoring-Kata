package com.gildedrose;

public class GildedRoseItem {
    protected final Item item;

    public GildedRoseItem(Item item) {
        this.item = item;
    }
    public GildedRoseItem create() {

        if (item.name.equals(AgedBrie.LABEL)) {
            return new AgedBrie(item);
        }

        if (item.name.equals(BackStage.LABEL)) {
            return new BackStage(item);
        }

        if (item.name.equals(Sulfuras.LABEL)) {
            return new Sulfuras(item);
        }

        if (item.name.equals(Conjured.LABEL)) {
            return new Conjured(item);
        }
        return new GildedRoseItem(item);
    }

    public void updateQuality() {
        handleQuality();
        updateExpiration();
        if (isExpired()) {
            handleExpiration();
        }
    }
    protected void handleQuality() {
        decreaseQuality();
    }
    protected void handleExpiration() {
        decreaseQuality();
    }
    protected void updateExpiration() {
            item.sellIn --;
    }
    protected boolean isExpired() {
        return item.sellIn < 0;
    }
    protected void decreaseQuality() {
        if (item.quality > 0) {
            item.quality --;
        }
    }
    protected void increaseQuality() {
        if (item.quality < 50) {
            item.quality ++;
        }
    }
}
