package helpDesk;

import com.typesafe.config.ConfigFactory;
import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import realProperties.ConfigProvider;

/**  - Это главная страница тестируемого сайта
 *  - Инициализируем с BaseSeleniumPage чтоб РАБОТАЛ наш webDriver
 *  -  @FindBy аннотоация которая нам позволяет найти именно тот элемент и производить поиск на стр
 *  именно тогда, когда мы к нему обратились */


public class MainPage extends BaseSeleniumPage {
    @FindBy(id = "id_queue")
    private WebElement Queue;

    @FindBy(xpath = "//select[@id= 'id_queue']//option[@value='1']")
    private WebElement QueueBillingQueries;

    @FindBy(xpath = "//input[@name='title']")
    private WebElement Summary_of_the_problem;

    @FindBy(xpath = "//textarea[@name='body']")
    private  WebElement Description_of_your_issue;

    @FindBy(xpath = "//input[@id='id_due_date']")
    private  WebElement Due_on;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//a[text()= '29']")
    private WebElement Due_on_calendar;

    @FindBy(id = "id_submitter_email")
    private  WebElement Your_EMail_Address;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement button;

    @FindBy(xpath = "//a[@id='userDropdown']")
    private WebElement LogInButton;


    public MainPage() { // alt+insert -> constructor -> select none
        driver.get(ConfigProvider.URL); //  переход на тестируемый сайт
       PageFactory.initElements(driver, this); // необходимо для инициализации всех элементов xpath

    }

    public  MainPage createTicket(String email, String body, String title) {
        QueueBillingQueries.click();
        Queue.click();
        Summary_of_the_problem.sendKeys(email);
        Description_of_your_issue.sendKeys(body);
        Due_on.click();
        Due_on_calendar.click();
        Your_EMail_Address.sendKeys(title);
        button.click();
        return this; // вернуть текующую страницу т.к мы продолжаем с ней работать
    }
    /**  метод openLoginPage создали для того,//
     * чтоб автотест переходил на следующую страницу и выполнял скрип с авторизацией LoginPage */
    public LoginPage openLoginPage(){
        LogInButton.click();
        return new LoginPage(); //  возвращаем новую страницу LoginPage (эффект паровозика)
    }
}
