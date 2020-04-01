package day14_StringClass;

public class Practice {
    public static void main(String[] args) {

        String gMail="cybertekschool@gmail.com";
        String userInputGMail="CybertekSchool@gmail.com";
        boolean result=gMail.equalsIgnoreCase(userInputGMail);
        if(result){
            System.out.println("Logged in" + "");

        }else {
            System.out.println("Valid ");
        }
         /*
        valid password Must contains a special characters such as (!, _, $)
        valid password not conatian spaces

         */
        String passWord="mmasd1235";

        if(passWord.contains(" ")){
            System.out.println("Password cannot have space in it");
        }else {
            System.out.println("Valid password");
        }

        System.out.println("=============================");
        /*
        every website has "http" at the begenning of the web address
         */
        String webAddress="www.amazon.com";
        webAddress=webAddress.toLowerCase();

        if(webAddress.startsWith("www.")){
            System.out.println("valid");
        }else {
            System.out.println("Invalid");
        }

        /*every single gmail address end with @gmail.com

         */
        String email="CybertekSchool@Yahoo.com";
        if(email.endsWith("@gmail.com")){
            System.out.println("Valid Gmail");
        }else {
            System.out.println("Invalid gmail");
        }

        /*
        write a program that can validate if a weba ddress is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, .net, .Gov
         */


    }
}
