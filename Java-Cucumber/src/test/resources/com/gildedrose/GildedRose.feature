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
