package core;

import org.openqa.selenium.WebDriver;

/** на всех Page классах мы будем наследоваться именно от этого класса.
 * Этот класс применим ко всем PAGE классам
 *  в дальнейшем будем инициализироваться(ссылаться на этот класс(extends)*/

abstract public class BaseSeleniumPage {

    protected static WebDriver driver;
    /**protected  позволяет использовать переменную в классах наследниках(extends) */

    public static void setDriver(WebDriver webDriver){

        driver = webDriver;

    }
}
