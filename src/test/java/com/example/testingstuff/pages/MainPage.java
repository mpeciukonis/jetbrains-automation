package com.example.testingstuff;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/*
    Page representing web elements in https://www.jetbrains.com webpage
 */

public class MainPage {
    public SelenideElement seeAllToolsButton = $("a.wt-button_mode_primary");
    public SelenideElement developerToolsMenuButton = $x("//*[@id=\"js-site-header\"]/div/div/div[2]/div[1]/div/nav/div[1]/button");
    public SelenideElement searchButton = $("[data-test='site-header-search-action']");
    public SelenideElement fullSearchButton = $("button[data-test='full-search-button']");
    public SelenideElement searchField = $("[data-test='search-input']");
    public SelenideElement fullSearchField = $x("//*[@id=\"js-site-header\"]/div/div/div[2]/div[4]/div/div/div[1]/div/div[1]/label/div/div/input");
    public SelenideElement developerToolsMenu = $x("//*[@id=\"js-site-header\"]/div/div/div[2]/div[1]/div/nav/div[1]/div/div");

    public void inputSearch(String searchInput){
        searchField.sendKeys(searchInput);
    }
}
