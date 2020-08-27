package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;
import ru.geekbrains.main.site.at.block.CoursesFilterBlock;
import ru.geekbrains.main.site.at.page.AuthorizationPage;
import ru.geekbrains.main.site.at.page.ContentPage;

public class AuthorizationTest extends BaseSettingsTest {

    @Test
    void name() {
        driver.get("https://geekbrains.ru/login");
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.getInputLogin().sendKeys("hks47018@eoopy.com");
        authorizationPage.getInputPassword().sendKeys("hks47018");
        authorizationPage.getButtonSingIn().click();
        ContentPage contentPage = new ContentPage(driver);
        contentPage.checkPageName("Главная");
        contentPage.getNavigationBlock().clickButton("Курсы");
        WebElement courses = driver.findElement(By.id("cour-link"));
        wait30second.until(ExpectedConditions.visibilityOf(courses)).click();
        WebElement freeCources = driver.findElement(By.id("filter-0"));
        wait30second.until(ExpectedConditions.visibilityOf(freeCources)).click();
        driver.findElement(By.xpath("//span[contains(.,'Тестирование ПО. Уровень 1')]"));
        driver.findElement(By.xpath("//span[contains(.,'Тестирование ПО. Уровень 2')]"));
    }




    @Test
    void extraTest() {
        driver.get("https://geekbrains.ru/login");
        new AuthorizationPage(driver)
                .singIn("hks47018@eoopy.com","hks47018")
                .checkPageName("Главная")
                .getNavigationBlock().clickButton("Курсы")
                .getCoursesTabsBlock().clickTab("Курсы")
                .clickCoursesFilter("Бесплатные")
                .clickCoursesFilter("Тестирование")
                .checkThatCourseIsPresent("Тестирование ПО. Уровень 1")
                .checkThatCourseIsPresent("Тестирование ПО. Уровень 2");
    }
}
