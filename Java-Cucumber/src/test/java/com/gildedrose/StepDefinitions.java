package com.gildedrose;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    private Item[] items = new Item[1];
    private GildedRose app;

    @Given("The item as {string}")
    public void initial_name_is(String name) {
        items[0] = new Item(name, 0, 0);
        app = new GildedRose(items);
    }

    @Given("The item as {string} to Sell In {int} days and {int} Quality")
    public void initial_name_is_sellin_is_and_quality_is(String name, int sellIn, int quality) {
        items[0] = new Item(name, sellIn, quality);
        app = new GildedRose(items);
    }

    @When("I update the quality")
    public void i_update_the_quality() {
        app.updateQuality();
    }

    @Then("I should get item as {string}")
    public void i_should_get_name(String expected) {
        assertEquals(expected, app.items[0].name);
    }

    @Then("I should get item as {string} to Sell In {int} days and {int} Quality")
    public void i_should_get_name_as_sellin_as_and_quality_as(String expected, int sellIn, int quality) {
        assertEquals(expected, app.items[0].name);
        assertEquals(sellIn, app.items[0].sellIn);
        assertEquals(quality, app.items[0].quality);
    }
}

