package helpDesk;
import core.BaseSeleniumTest;
import helpers.TestValues;
import org.junit.Assert;
import org.junit.Test;
import realProperties.ConfigProvider;
import static helpers.ClassHelp.getUniqueString;

public class HelpDeskClass extends BaseSeleniumTest {
    @Test
    public void checkTicket(){

        String title = getUniqueString (TestValues.Test_title);
        //мы обратились к классу TestValues и взяли от туда переменную Test_title)

        TicketsPage TicketPAGE =  new MainPage().createTicket(title,TestValues.Test_Body,TestValues.Test_email)
                .openLoginPage()
                .auth(ConfigProvider.DEMO_LOGIN,ConfigProvider.DEMO_PASSWORD )
                .findTicket(title);
        // TicketPAGE - это переменная которую мы создали

        //проверки (заголовков)
        Assert.assertTrue(TicketPAGE.getTitle().contains(title));
        Assert.assertEquals(TicketPAGE.getBody(), TestValues.Test_Body);
        Assert.assertEquals(TicketPAGE.getEmail(), TestValues.Test_email);


    }
}
