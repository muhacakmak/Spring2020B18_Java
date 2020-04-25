package day25_MethodsRecap;

public class Driver {
    /*
    1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "safari", "edge", "Opera"}
				 then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
     */


    public static void main(String[] args) {
        String str = getDriver1("chrome");
        System.out.println(str);
    }

    public static String getDriver1(String browserName) {

        String result = "";
        switch (browserName.toLowerCase()) {
            case "chrome":
                result = "Chrome Drive";
                break;
            case "firefox":
                result = "Firefox Drive";
                break;
            case "safari":
                result = "Safari Drive";
                break;
            case "edge":
                result = "Edge Drive";
                break;
            case "Opera":
                result = "Opera Drive";
                break;
            default:
                result = "Invalid Driver";


        }
        return result;
    }

}
