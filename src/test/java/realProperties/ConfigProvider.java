package realProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**  В ЭТОМ КЛАССЕ ВСЁ ЯВЛЯЕТСЯ ПУБЛИЧНЫМ И СТАТИЧНЫМ */
public interface ConfigProvider {
    Config config = readConfig(); //  переменной  config прикрепили метод readConfig

/**  инициализировали  созданный application.conf */
    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                /** если в пропертях есть слово "testProfiles",то */
        ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
        : ConfigFactory.load("application.conf");
    }
    String URL = readConfig().getString("url"); // мы обратились к url application.conf
    String DEMO_PASSWORD = readConfig().getString("usersParams.demo.password");
    String DEMO_LOGIN = readConfig().getString("usersParams.demo.login");


}
