/*
 * author guo
 * year 2023
 */
package gzq.byd.com;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class StringManager {
    private ResourceBundle resourceBundle;

    public StringManager(String packageName) {
        String bundleName = packageName + ".messages";
        resourceBundle = ResourceBundle.getBundle(bundleName);
    }

    public String getString(String key){
        if (key == null) {
            String msg = "key is null";

            throw new NullPointerException(msg);
        }

        String str = null;

        try {
            str = resourceBundle.getString(key);
        } catch (MissingResourceException mre) {
            str = "Cannot find message associated with key '" + key + "'";
        }

        return str;
    }


    public static void main(String[] args) {
        StringManager stringManager = new StringManager("gzq.byd.com");

        System.out.println(stringManager.getString("heiha.loaded"));
    }
}
