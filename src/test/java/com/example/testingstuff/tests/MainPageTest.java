package com.example.testingstuff;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest {
    MainPage mainPage = new MainPage();
    ProductsPage productsPage = new ProductsPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("https://www.jetbrains.com/");
    }

    @Test
    public void search() {
        mainPage.searchButton.click();

        mainPage.inputSearch("Selenium");
        mainPage.fullSearchButton.click();

        assertEquals("Selenium", mainPage.fullSearchField.getValue(), "Search field should have Selenium in it.");
    }

    @Test
    public void toolsMenu() {
        mainPage.developerToolsMenuButton.click();

        assertTrue(mainPage.developerToolsMenu.isDisplayed(), "Developer Tools menu should be visible.");
    }

    @Test
    public void navigationToAllTools() {
        mainPage.seeAllToolsButton.click();

        assertTrue(productsPage.productsSelectionTable.isDisplayed(), "Products selection table is not displayed.");
    }
}
