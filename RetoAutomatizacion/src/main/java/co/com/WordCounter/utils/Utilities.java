package co.com.WordCounter.utils;

public class Utilities {


    public static String getDriver() {
        //String[] drivers = {"chrome", "edge", "firefox"};
        String[] drivers = {"firefox"};
        int i = (int) (Math.random() * drivers.length);
        return drivers [i];
    }

}
