package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketsPage extends BaseSeleniumPage {
    /** этот класс создали для сверения заголовка письма, текста и email */

    @FindBy(xpath = "//th[text()='Submitter E-Mail']/following::td[1]") //following:: переходим на элемент ниже
    private WebElement emailTicket;

    @FindBy(xpath = "//h3") // это заголовок (номер билда с именем)
    private WebElement title;

    @FindBy(xpath = "//td[@id='ticket-description']//p")
    private WebElement body;

    public TicketsPage() {PageFactory.initElements(driver, this);
    } //инициализировали все xpath
    public String getEmail(){  // берем текст
        return emailTicket.getText();}

    public String getTitle(){
        return title.getText();}

    public String getBody(){
        return body.getText();}
}
