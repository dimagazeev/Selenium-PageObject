package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumTest {
    /**
     * в этом классе приписываем действия "до" "после"
     */
    protected WebDriver driver;

    @Before
    public void setUp() {
        /** эта строка автоматически скачает chromedriver т.к установили библиотеку WebDriverManager*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); // переменная driver является теперь  chromeDriver
        driver.manage().window().maximize(); // хром открывается на полный экран
        

        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
        /** Ждем 10 сек для загрузки стра, если стр не загрузилась за 10 сек, тест падает */

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        /**Время ожидания элементов на странице */

        BaseSeleniumPage.setDriver(driver);
    }


}

