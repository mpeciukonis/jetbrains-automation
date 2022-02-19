package com.example.testingstuff;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// https://www.jetbrains.com/
public class MainPage {
    public SelenideElement seeAllToolsButton = $("a.wt-button_mode_primary");
    public SelenideElement toolsMenu = $x("//*[@id=\"js-site-header\"]/div/div/div[2]/div[1]/div/nav/div[1]/button");
    public SelenideElement searchButton = $("[data-test='site-header-search-action']");
}
