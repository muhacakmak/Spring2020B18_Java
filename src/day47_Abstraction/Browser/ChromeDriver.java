package day47_Abstraction.Browser;

public final class ChromeDriver extends RemoteWebDriver {
    @Override
    public void get(String URL) {
        System.out.println("Opening the "+URL+" in Chrome");
    }
    @Override
    public  void quit(){
        System.out.println("Closing the Chrome browser");
    }
}
