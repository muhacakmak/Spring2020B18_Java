package day12_JavaRecap;

public class Switch_Practice {
    public static void main(String[] args) {


        switch (3) {
            default:
                System.out.println("Invalid Case");
                break;
            case 1:
                System.out.println("Case 1");
                break;

            case 2:
                System.out.println("Case 2");
                break;
        }
        System.out.println("===================================");
          /*
        200, OK
        201, Created
        202, Accepted
         */
        int statusCode = 404;
        switch (statusCode) {
            case 200:
                System.out.println("Ok");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 2012:
                System.out.println("Accepted");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
