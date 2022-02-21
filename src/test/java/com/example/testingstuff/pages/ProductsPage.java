package com.example.testingstuff;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/*
    Page representing web elements in https://www.jetbrains.com/products webpage
 */

public class ProductsPage {
    public SelenideElement productsSelectionTable = $x("//*[@id=\"products-page\"]/div/div[1]/div[1]");
}
