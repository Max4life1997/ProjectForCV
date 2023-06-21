package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import static javax.swing.UIManager.put;
import static org.apache.commons.lang3.ArrayUtils.add;

public class BaseRemoteTest {
    @BeforeAll
    @Step("Базовая конфигурация тестов")
    public static void beforeAll() throws MalformedURLException {
        SelenideLogger.addListener("allure", new AllureSelenide());

        Configuration.baseUrl = "https://demoqa.com";
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browserSize = "1920x1080";
    }
}
