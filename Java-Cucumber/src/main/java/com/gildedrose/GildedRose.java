package com.gildedrose;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED = "Conjured";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals(AGED_BRIE)) {
                increaseQuality(item);
                updateExpiration(item);
                if (isExpired(item)) {
                    increaseQuality(item);
                }
            }

            else if (item.name.equals(BACKSTAGE)) {
                increaseQuality(item);
                if (item.sellIn < 11) {
                        increaseQuality(item);
                    }
                    if (item.sellIn < 6) {
                        increaseQuality(item);
                    }
                if (isExpired(item)) {
                    item.quality = 0;
                }
                updateExpiration(item);
            }

            else if (item.name.equals(SULFURAS)) {
            }
            else if (item.name.equals(CONJURED)){
                updateExpiration(item);
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                    decreaseQuality(item);
                }
                if (isExpired(item)) {
                    decreaseQuality(item);
                    decreaseQuality(item);
                }
            }
            else {
                updateExpiration(item);
                decreaseQuality(item);
                if (isExpired(item)) {
                    decreaseQuality(item);
                }
            }

        }
    }
    private void updateExpiration(Item item) {
        if (!item.name.equals(SULFURAS)) {
            item.sellIn --;
        }
    }
    private boolean isExpired(Item item) {
        return item.sellIn < 0;
    }
    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality --;
        }
    }
    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality ++;
        }
    }
}
