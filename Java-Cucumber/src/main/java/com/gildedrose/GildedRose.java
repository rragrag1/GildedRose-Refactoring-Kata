package com.gildedrose;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals(AGED_BRIE)) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
            if (item.name.equals(AGED_BRIE)) {
                if (item.sellIn < 0) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
            if (item.name.equals(BACKSTAGE)) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                    if (item.sellIn < 11) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }

                    if (item.sellIn < 6) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }
                }
            }
            if (!item.name.equals(SULFURAS)) {
                item.sellIn = item.sellIn - 1;
            }
            if (item.name.equals(BACKSTAGE)) {
                if (item.sellIn < 0) {
                    item.quality = 0;
                }
            }


            if (!item.name.equals(AGED_BRIE) && !item.name.equals(BACKSTAGE) && !item.name.equals(SULFURAS)) {
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }
            }


            if (!item.name.equals(AGED_BRIE) && !item.name.equals(BACKSTAGE) && !item.name.equals(SULFURAS)) {
                if (item.sellIn < 0) {
                    if (item.quality > 0) {
                        item.quality = item.quality - 1;
                    }
                }
            }
        }
    }
}
