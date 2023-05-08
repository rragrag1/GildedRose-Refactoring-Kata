package com.gildedrose;

public class GildedRoseItem {
    protected final Item item;
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED = "Conjured";
    public GildedRoseItem(Item item) {
        this.item = item;
    }
    public GildedRoseItem create() {

        if (item.name.equals(AGED_BRIE)) {
            return new AgedBrie(item);
        }

        if (item.name.equals(BACKSTAGE)) {
            return new BackStage(item);
        }

        if (item.name.equals(SULFURAS)) {
            return new Sulfuras(item);
        }

        if (item.name.equals(CONJURED)) {
            return new Conjured(item);
        }
        return new GildedRoseItem(item);
    }

    public void updateQuality() {
        updateExpiration();
        decreaseQuality();
        if (isExpired()) {
            decreaseQuality();
        }
    }
    protected void updateExpiration() {
          if (!item.name.equals(SULFURAS)) {
            item.sellIn --;
        }
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
