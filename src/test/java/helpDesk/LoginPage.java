package helpDesk;
import core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/** этот класс создали для авторизации пользователя demo/demo1234*/
public class LoginPage extends BaseSeleniumPage {
    @FindBy(xpath = "//input[@id='username']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    public LoginPage() {
        /** инициализируем все локаторы воедино */
        PageFactory.initElements(driver,this);
    }

    public TicketPage auth(String loginValue, String passwordValue) {
        // здесь создали переменные(loginValue и passwordValue) стринг для передачи данных для авторизации
        login.sendKeys(loginValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        return new TicketPage(); // возвращаем новую страницу TicketPage (эффект паровозика)
    }
}
