package ru.geekbrains.main.site.at.page;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.block.CoursesFilterBlock;
import ru.geekbrains.main.site.at.block.CoursesTabsBlock;
import ru.geekbrains.main.site.at.block.HeaderBlock;
import ru.geekbrains.main.site.at.block.NavigationBlock;

public class ContentPage extends BasePage {

    private HeaderBlock headerBlock;
    private NavigationBlock navigationBlock;
    private CoursesTabsBlock coursesTabsBlock;
    private CoursesFilterBlock coursesFilterBlock;

    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement popUp1;

    @FindBy(css = "button>[class=\"svg-icon icon-popup-close-button \"]")
    private WebElement popUp2;

    public ContentPage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
        this.navigationBlock = new NavigationBlock(driver);
        this.coursesTabsBlock = new CoursesTabsBlock(driver);
    }

    @Step("проверка, что отобразилась страница '{expectedNamePage}'")
    public ContentPage checkPageName(String expectedNamePage) {
        WebElement namePage = headerBlock.getNamePage();
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(namePage, expectedNamePage));
        Assertions.assertEquals(expectedNamePage, namePage.getText());
        return new ContentPage(driver);
    }

    public ContentPage checkHeader() {
        WebElement headerPage = headerBlock.getHeaderPage();
        webDriverWait.until(ExpectedConditions.visibilityOf(headerPage));
        return new ContentPage(driver);
    }

    public ContentPage checkFooter() {
        WebElement footerPage = headerBlock.getFooterPage();
        webDriverWait.until(ExpectedConditions.visibilityOf(footerPage));
        return new ContentPage(driver);
    }

    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }


    public NavigationBlock getNavigationBlock() {
        return navigationBlock;
    }

    public CoursesTabsBlock getCoursesTabsBlock () { return coursesTabsBlock; }

    public WebElement getPopUp1() {
        return popUp1;
    }

    public WebElement getPopUp2() {
        return popUp2;
    }
}
