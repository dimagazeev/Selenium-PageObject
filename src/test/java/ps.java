import helpDesk.MainPage;
import org.junit.Test;
import realProperties.ConfigProvider;

/**public class ps {


    /**
     * 1.  Создали базовыцй класс(BaseSeleniumTest)  в котором прописали все необходимые действия до и после
     * 2. Создали BaseSeleniumPage в которой отдельно вынесли chromeDriver и инициализировали его с driver
     * 3. Создали файл application.conf и создали нашу админку demo/demo1234
     * 4. Далее создали файл INTERFACE и инициализировали переменные URL, DEMO_PASSWORD и
     * DEMO_LOGIN с нашей админкой из файла application.conf
     * 5. Создаем папку helpPage в ней будут храниться все классы с действиями на странице
     * и главный в ней класс HelpDeskClass и инициализируем BaseSeleniumTest
     * 6. Создаем класс MainPage и инициализируем с BaseSeleniumPage в этом классе прописываем локаторы xpath
     *  и какие действия мы с ними совершаем
     *  7. Далее создали класс LoginPage для авторизации пользователя demo/demo1234
     *  8. Далее создаем класс TicketPage для перехода через поиск и нажатие на наши созданные письма
     *  9. Далее создаем класс TicketsPage для сверки заголовкаБ email и текста письма(обращения)
     *



    public class HelpDeskClassv2 extends BaseSeleniumTest {
        // это исходный класс HelpDestClass, его первоначальный вид
        @Test
        public void checkTicket() {
            String title = "Oleg morozov";
            String BODY = "Не работает кнопка включения и выключения мультиварки";
            String email = "reeetest@gmail.com";
            MainPage mainPage = new MainPage();
            mainPage.createTicket(title,BODY,email)
                    .openLoginPage() //openLoginPage(класс созданный в MainPage).
                    .auth(ConfigProvider.DEMO_LOGIN,ConfigProvider.DEMO_PASSWORD)
                    //auth (класс созданный в LoginPage)
                    .findTicket(title); // findTicket (класс созданный в TicketPage)







        }
        }
    }
*/