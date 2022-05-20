package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketPage extends BaseSeleniumPage {
    @FindBy(xpath = "//input[@id='search_query']")
    private WebElement searchGo;

    @FindBy(xpath = "//div[@class='tickettitle']")
    private WebElement ticket; // это наши созданные письма

    public TicketPage() { // alt+insert
        PageFactory.initElements(driver,this);
    } //инициализировали все xpath alt+insert

    public TicketsPage findTicket(String str){
        searchGo.sendKeys(str, Keys.ENTER); // в строку поиска вводиться самый свежее письмо переменная str
        ticket.click();
        return new TicketsPage(); // ВОЗВРАЩАЕМ НОВУЮ СТРАНИЦУ TICKETS PAGE

    }


}
