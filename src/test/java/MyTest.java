import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * created by s.a.miroshnychenko 7/26/2018
 */

public class MyTest {
    @Test
    public void test1() {
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua/");
        Assert.assertEquals("https://www.google.com.ua/", driver.getCurrentUrl());
        driver.quit();

    }

    @Test
    public void test2() {

    }

    @Test
    public void test3() {

    }

    @Test
    public void test4() {

    }

    @Test
    public void test5() {

    }
}
