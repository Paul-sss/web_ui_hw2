package ru.geekbrains.main.site.at;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;
import ru.geekbrains.main.site.at.page.ContentPage;

@Epic("Web UI тесты")
@Feature("Навигация")
@Story("Переход по навигации")
@DisplayName("Навигация")
public class NavigationTest extends BaseSettingsTest {


    /*@BeforeEach
    public void beforeAllTests() {

        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://geekbrains.ru/tests");
    }*/

    @Test
    public void checkHeaderEvents () {
        new ContentPage(driver)
        .getNavigationBlock().clickButton("Вебинары")
        .checkHeader()
        .checkFooter();
    }

    @Test
    public void checkHeaderForum () {
        new ContentPage(driver)
        .getNavigationBlock().clickButton("Форум")
        .checkHeader()
        .checkFooter();
    }

    @Test
    public void checkHeaderPosts () {
        new ContentPage(driver)
        .getNavigationBlock().clickButton("Блог")
        .checkHeader()
        .checkFooter();
    }

    @Test
    public void checkHeaderTests () {
        new ContentPage(driver)
        .getNavigationBlock().clickButton("Тесты")
        .checkHeader()
        .checkFooter();
    }

    @Test
    public void checkHeaderCareer () {
        new ContentPage(driver)
        .getNavigationBlock().clickButton("Карьера")
        .checkHeader()
        .checkFooter();
    }

    @Test void checkPageEvents () {
        new ContentPage(driver)
        .getNavigationBlock().clickButton("Вебинары")
        .checkPageName("Вебинары");
    }

    @Test void checkPageForum () {
        new ContentPage(driver)
        .getNavigationBlock().clickButton("Форум")
        .checkPageName("Форум");
    }

    @Test void checkPagePosts () {
        new ContentPage(driver)
        .getNavigationBlock().clickButton("Блог")
        .checkPageName("Блог");
    }

    @Test void checkPageTests () {
        new ContentPage(driver)
        .getNavigationBlock().clickButton("Тесты")
        .checkPageName("Тесты");
    }


    @Test
    public void checkPageCareer () {
        new ContentPage(driver)
        .getNavigationBlock().clickButton("Карьера")
        .checkPageName("Карьера");
    }

   /* @AfterEach
    public void afterAllTests () {
        driver.quit();
    }*/
}
