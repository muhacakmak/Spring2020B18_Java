package day11_Scanner.WarmupTask;

public class Browsers {
    /*
     3. write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers'
                        names, out put should be: Invalid Browser Name
     */
    public static void main(String[] args) {

        String browserName = "chrome";
        String result = " ";
        switch (browserName) {
            case "firefox":
            case "Firefox":
                System.out.println("Firefox is opening...");
                break;

            case "chrome":
                break;
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;
            case "Safari":
            case "safari":
                System.out.println("Safari is opening...");
                break;
            case "Opera":
            case "opera":
                System.out.println("Opera is opening...");
                break;
            default:
                System.out.println("Invalid Browser Name, Please give the right browser name");
        }
    }
}
