Feature: Gilded Rose quality
  I want to know if the quality is updated properly

  Scenario: Checking foo
    Given The item as "foo"
    When I update the quality
    Then I should get item as "foo"

  Scenario: Checking foo with SellIn and Quality
    Given The item as "foo" to Sell In 5 days and 20 Quality
    When I update the quality
    Then I should get item as "foo" to Sell In 4 days and 19 Quality

  Scenario: Checking Aged Brie
    Given The item as "Aged Brie" to Sell In 2 days and 0 Quality
    When I update the quality
    Then I should get item as "Aged Brie" to Sell In 1 days and 1 Quality

  Scenario: Checking Sulfuras 1
    Given The item as "Sulfuras, Hand of Ragnaros" to Sell In 0 days and 80 Quality
    When I update the quality
    Then I should get item as "Sulfuras, Hand of Ragnaros" to Sell In 0 days and 80 Quality

  Scenario: Checking Sulfuras 2
    Given The item as "Sulfuras, Hand of Ragnaros" to Sell In -1 days and 80 Quality
    When I update the quality
    Then I should get item as "Sulfuras, Hand of Ragnaros" to Sell In -1 days and 80 Quality


  Scenario: Checking Backstage 1
    Given The item as "Backstage passes to a TAFKAL80ETC concert" to Sell In 15 days and 20 Quality
    When I update the quality
    Then I should get item as "Backstage passes to a TAFKAL80ETC concert" to Sell In 14 days and 21 Quality

  Scenario: Checking Backstage 2
    Given The item as "Backstage passes to a TAFKAL80ETC concert" to Sell In 10 days and 49 Quality
    When I update the quality
    Then I should get item as "Backstage passes to a TAFKAL80ETC concert" to Sell In 9 days and 50 Quality

  Scenario: Checking Backstage 3
    Given The item as "Backstage passes to a TAFKAL80ETC concert" to Sell In 5 days and 49 Quality
    When I update the quality
    Then I should get item as "Backstage passes to a TAFKAL80ETC concert" to Sell In 4 days and 50 Quality

  Scenario: Checking the Quality of an item is never negative
    Given The item as "foo" to Sell In 10 days and 0 Quality
    When I update the quality
    Then I should get item as "foo" to Sell In 9 days and 0 Quality

  Scenario: Checking once the sell by date has passed, Quality degrades twice as fast
    Given The item as "foo" to Sell In 0 days and 20 Quality
    When I update the quality
    Then I should get item as "foo" to Sell In -1 days and 18 Quality
