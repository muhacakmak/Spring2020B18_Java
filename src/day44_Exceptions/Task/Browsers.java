package day44_Exceptions.Task;
/*
 1. create a class called Browsers
            actions: openBrowser():prints "opens the default browser"
                     closeBrowser(): closes the default browser
    2. create a class called ChromeBrowser
            actions: openBrowser(): opens the chrome browser
                     closeBrowser(): closes the chrome browser
    3. creata a class called FirefoxBrowser
            actions: openBrowser(): opens the Firefox browser
                     closeBrowser(): closes the Firefox browser
    4. create a class called Opera browser
            actions: openBrowser(): opens the Opera browser
                     closeBrowser(): closes the Opera browser
    5. create a class called Test:
            create an object of each browsers and call the openBrowser & closeBrowser actions
    create all those classes in one java file
 */
public class Browsers {
    public void openBrowser(){
        System.out.println("opening the default browser");
    }
    public void closeBrowser(){
        System.out.println("closing the default browser");
    }


}
class ChromeBrowser extends Browsers {
    @Override
    public void openBrowser(){
        System.out.println("Opining Chrome Browser");

    }
    public void closeBrowser(){
        System.out.println("Closing Chrome Browser");
    }
}

class FirefoxBrowser extends Browsers{

    public void openBrowser(){
        System.out.println("Opening Fire Fox Browser");
    }
    public void closeBrowser(){
        System.out.println("Closing Fire Fox Browser");
    }
}
class Opera extends Browsers{
    public void openBrowser(){
        System.out.println("Opining Opera Browser");

    }
    public void closeBrowser(){
        System.out.println("Closing Opera Browser");
    }

}
class Test{
    public static void main(String[] args) {
        ChromeBrowser obj=new ChromeBrowser();
        obj.openBrowser();
        obj.closeBrowser();
        System.out.println("=============================");
        FirefoxBrowser obj1=new FirefoxBrowser();
        obj1.openBrowser();
        obj1.closeBrowser();

        System.out.println("=============================");
        Opera opera=new Opera();
        opera.openBrowser();
        opera.closeBrowser();
    }

}