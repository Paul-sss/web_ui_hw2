package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.utils.ButtonNotFoundException;

public class CoursesFilterBlock extends BasePage {
    @FindBy(css = "[#filter-0]")
    private WebElement filterFree;

    @FindBy(css = "[#filter-1]")
    private WebElement filterForBeginners;

    @FindBy(css = "[#filter-2]")
    private WebElement filterWebDevelopment;

    @FindBy(css = "[#filter-3]")
    private WebElement filterSoftwareDevelopment;

    @FindBy(css = "[#filter-4]")
    private WebElement filterWebDesign;

    @FindBy(css = "[#filter-5]")
    private WebElement filterMobileDdevelopment;

    @FindBy(css = "[#filter-6]")
    private WebElement filterGameDevelopment;

    @FindBy(css = "[#filter-7]")
    private WebElement filterInformationSecurity;

    @FindBy(css = "[#filter-8]")
    private WebElement filterDataScience;

    @FindBy(css = "[#filter-9]")
    private WebElement filterTesting;

    @FindBy(css = "[#filter-10]")
    private WebElement filterInternetMarketing;

    @FindBy(css = "[#filter-11]")
    private WebElement filterSystemAdministration;

    @FindBy(css = "[#filter-12]")
    private WebElement filterGeekClub;

    @FindBy(css = "[#filter-13]")
    private WebElement filterCybersport;

    public CoursesFilterBlock(WebDriver driver) {
        super(driver);
    }

    @Step("Выбор фильтра: '{tabName}'")
    public CoursesFilterBlock clickCoursesFilter(String tabName) {
        getFilter(tabName).click();
        return this;
    }

    @Step("проверка, что курс: '{nameOfCourses}' присутствует на странице")
    public CoursesFilterBlock checkThatCourseIsPresent (String nameOfCourses) {
        driver.findElement(By.xpath("//span[contains(.,'"+nameOfCourses+"')]"));
        return this;
    }

    private WebElement getFilter(String tabName) {
        switch (tabName) {
            case "Бесплатные":
                return filterFree;
            case "Для начинающих":
                return filterForBeginners;
            case "Веб-разработка":
                return filterWebDevelopment;
            case "Разработка программ":
                return filterSoftwareDevelopment;
            case "Веб-дизайн":
                return filterWebDesign;
            case "Мобильная разработка":
                return filterMobileDdevelopment;
            case "Разработка игр":
                return filterGameDevelopment;
            case "Информационная безопасность":
                return filterInformationSecurity;
            case "Data Science":
                return filterDataScience;
            case "Тестирование":
                return filterTesting;
            case "Интернет маркетинг":
                return filterInternetMarketing;
            case "Системное администрирование":
                return filterSystemAdministration;
            case "GeekClub":
                return filterGeekClub;
            case "Киберспорт":
                return filterCybersport;
            default:
                throw new ButtonNotFoundException("Элемента: "+tabName+" нет на странице!");
        }
    }
}
