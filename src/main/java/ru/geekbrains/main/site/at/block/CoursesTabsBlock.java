package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.utils.ButtonNotFoundException;

public class CoursesTabsBlock extends BasePage {
    @FindBy(css = "[#free-link]")
    private WebElement tabFreeIntensives;

    @FindBy(css = "[#prof-link]")
    private WebElement tabProfessions;

    @FindBy(css = "[#cour-link]")
    private WebElement tabCourses;


    public CoursesTabsBlock(WebDriver driver) {
        super(driver);
    }

    @Step("нажатие на '{tabName}'")
    public CoursesFilterBlock clickTab(String tabName) {
        getTab(tabName).click();
        return new CoursesFilterBlock(driver);
    }

    private WebElement getTab(String tabName) {
        switch (tabName) {
            case "Профессии":
                return tabProfessions;
            case "Курсы":
                return tabCourses;
            case "Бесплатные интенсивы":
                return tabFreeIntensives;
            default:
                throw new ButtonNotFoundException("Элемента: "+tabName+" нет на странице!");
        }
    }
}
