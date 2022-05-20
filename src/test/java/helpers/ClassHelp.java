package helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassHelp {
    public static String getUniqueString(String str){ // str - строка
      return str+ new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    }

}
