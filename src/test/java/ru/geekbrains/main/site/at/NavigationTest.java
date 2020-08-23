package ru.geekbrains.main.site.at;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;
import ru.geekbrains.main.site.at.page.ContentPage;


public class NavigationTest extends BaseSettingsTest {

    protected ChromeDriver driver;
    ContentPage contentPage = new ContentPage(driver);

    @BeforeEach
    public void beforeAllTests() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://geekbrains.ru/tests");
    }

    @Test
    public void checkHeaderEvents () {
        contentPage.getNavigationBlock().clickButton("Вебинары");
        contentPage.checkHeader();
        contentPage.checkFooter();
    }

    @Test
    public void checkHeaderForum () {
        contentPage.getNavigationBlock().clickButton("Форум");
        contentPage.checkHeader();
        contentPage.checkFooter();
    }

    @Test
    public void checkHeaderPosts () {
        contentPage.getNavigationBlock().clickButton("Блог");
        contentPage.checkHeader();
        contentPage.checkFooter();
    }

    @Test
    public void checkHeaderTests () {
        contentPage.getNavigationBlock().clickButton("Тесты");
        contentPage.checkHeader();
        contentPage.checkFooter();
    }

    @Test
    public void checkHeaderCareer () {
        contentPage.getNavigationBlock().clickButton("Карьера");
        contentPage.checkHeader();
        contentPage.checkFooter();
    }

    @Test void checkPageEvents () {
        contentPage.getNavigationBlock().clickButton("Вебинары");
        contentPage.checkPageName("Вебинары");
    }

    @Test void checkPageForum () {
        contentPage.getNavigationBlock().clickButton("Форум");
        contentPage.checkPageName("Форум");
    }

    @Test void checkPagePosts () {
        contentPage.getNavigationBlock().clickButton("Блог");
        contentPage.checkPageName("Блог");
    }

    @Test void checkPageTests () {
        contentPage.getNavigationBlock().clickButton("Тесты");
        contentPage.checkPageName("Тесты");
    }


    @Test
    public void checkPageCareer () {
        contentPage.getNavigationBlock().clickButton("Карьера");
        contentPage.checkPageName("Карьера");
    }

    @AfterEach
    public void afterAllTests () {
        driver.quit();
    }
}
