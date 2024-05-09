package com.example.demo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ProductPageTest {

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    public void setUp() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
    }

    @Test
    public void verifyProductDetails() {
        open("https://vk.com/club225299895?w=product-225299895_10044406");
        $(byText("Услуги")).should(Condition.exist);

    }

    @Test
    public void verifyCommunityHomePage() {
        open("https://vk.com/club225299895");
        $(byText("Подробная информация")).should(Condition.exist);

    }
}
