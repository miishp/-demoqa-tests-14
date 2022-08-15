package com.demoqa;

import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;

public class TextBoxTests {
    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
//        Configuration.timeout = 10000; // 10 seconds
//        Configuration.browser = "opera";
        Configuration.browserSize = "1920x1080";

    @Test
    void fillFormTest() {
        open("")

    }
}
