package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationTest {

    protected ChromeDriver driver;

    @BeforeEach
    public void beforeAllTests() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://geekbrains.ru/tests");
    }

    @Test
    public void checkHeaderEvents () {
        WebElement eventButton = driver.findElement(By.cssSelector("aside nav [href=\"/events\"]"));
        eventButton.click();
        checkHeader();
        checkFooter();
    }

    @Test
    public void checkHeaderForum () {
        WebElement topicsButton = driver.findElement(By.cssSelector("aside nav [href=\"/topics\"]"));
        topicsButton.click();
        checkHeader();
        checkFooter();
    }

    @Test
    public void checkHeaderPosts () {
        WebElement postsButton = driver.findElement(By.cssSelector("aside nav [href=\"/posts\"]"));
        postsButton.click();
        checkHeader();
        checkFooter();
    }

    @Test
    public void checkHeaderTests () {
        WebElement testsButton = driver.findElement(By.cssSelector("aside nav [href=\"/tests\"]"));
        testsButton.click();
        checkHeader();
        checkFooter();
    }

    @Test
    public void checkHeaderCareer () {
        WebElement  careerButton = driver.findElement(By.cssSelector("aside nav [href=\"/career\"]"));
        careerButton.click();
        checkHeader();
        checkFooter();
    }

    public void checkHeader () {
        driver.findElement(By.cssSelector("[class*=\"gb-header\"]"));
    }

    public void checkFooter () {
        driver.findElement(By.cssSelector("[class = \"site-footer__content\"]"));
    }

    @Test void checkPageEvents () {
        WebElement eventButton = driver.findElement(By.cssSelector("aside nav [href=\"/events\"]"));
        eventButton.click();

        WebElement eventsTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Вебинары", eventsTitlePage.getText());
    }

    @Test void checkPageForum () {
        WebElement topicsButton = driver.findElement(By.cssSelector("aside nav [href=\"/topics\"]"));
        topicsButton.click();

        WebElement topicsTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Форум", topicsTitlePage.getText());
    }

    @Test void checkPagePosts () {
        WebElement postsButton = driver.findElement(By.cssSelector("aside nav [href=\"/posts\"]"));
        postsButton.click();

        WebElement postsTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Блог", postsTitlePage.getText());
    }

    @Test void checkPageTests () {
        WebElement testsButton = driver.findElement(By.cssSelector("aside nav [href=\"/tests\"]"));
        testsButton.click();

        WebElement testsTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Тесты", testsTitlePage.getText());
    }


    @Test
    public void checkPageCareer () {
        WebElement  careerButton = driver.findElement(By.cssSelector("aside nav [href=\"/career\"]"));
        careerButton.click();

        WebElement careerTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Карьера", careerTitlePage.getText());
    }

    @AfterEach
    public void afterAllTests () {
        driver.quit();
    }
}
