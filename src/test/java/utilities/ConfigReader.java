package utilities;

import java.util.Properties;

public class ConfigReader {

    public static Properties properties;
    static { // Her method() dan once calisir
        String dosyaYolu = "configuration.properties";

    }


    public static String getProperty(String key){
        /*
        test methodundan yolladigimiz String key degerini alip
        Properties class indan getProperty() methodunu kullanarak
         bu key'e ait value'yu bize getirir.
         */

        return properties.getProperty(key);
    }



}
