package day47_Abstraction.Browser;

public final class OperaDriver extends RemoteWebDriver {
    @Override
    public void get(String URL) {
        System.out.println("Opening the "+URL+" in Opera");
    }
    @Override
    public  void quit(){
        System.out.println("Closing the Opera browser");
    }
}
