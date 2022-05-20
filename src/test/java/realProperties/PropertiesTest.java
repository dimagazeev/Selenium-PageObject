package realProperties;

import org.junit.Test;

import java.io.IOException;

public class PropertiesTest {
   @Test  // простой метод конфигурации с с использованием application.properties
    public void readProperties() throws IOException {
        /** синхронизируем с ресурсом application.properties(переход ctrl+click) */
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
        /** инициализируем url из application в переменную urlGetProperties */
        String urlGetProperties = System.getProperty("url");
    }
    @Test // 2 -ой метод конфигурации с использованием application.conf
    public void readFromConf(){
        String UrlFromConf = ConfigProvider.URL;
        System.out.println(UrlFromConf);
        String demoLoginConf = ConfigProvider.DEMO_LOGIN;
        System.out.println(demoLoginConf);
    }
}
