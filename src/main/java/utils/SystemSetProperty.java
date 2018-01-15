package utils;

public class SystemSetProperty {

    private static  String resources="./resources/";
    public static void chrome(){
        System.setProperty("webdriver.chrome.driver", resources + "chromedriver");
    }

    public static void firefox(){
        System.setProperty("webdriver.gecko.driver", resources + "geckodriver");
    }

}
