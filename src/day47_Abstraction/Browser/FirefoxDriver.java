package day47_Abstraction.Browser;

public final class FirefoxDriver extends RemoteWebDriver {
    @Override
    public void get(String URL) {
        System.out.println("Opening the "+URL+" in Firefox");
    }
    @Override
    public  void quit(){
        System.out.println("Closing the Firefox browser");
    }
}
