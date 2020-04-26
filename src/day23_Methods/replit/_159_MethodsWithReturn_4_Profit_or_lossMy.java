package day23_Methods.replit;

public class _159_MethodsWithReturn_4_Profit_or_lossMy {
    /*
    c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
        it returns a string value that can be "profit","loss","no loss"

        for example:
        c_profis(100,1500)
        returns : "profit"

        c_profis(20,5)
        returns : "loss"

        c_profis(100,100)
        returns : "no loss"
     */
    public static void main(String[] args) {


        System.out.println(c_profits(1000,500));

    }

    public static String c_profits(int sellPrice, int buyPrice) {

        String result = "";
        if (sellPrice > buyPrice) {
            result = "profit";

        } else if (buyPrice > sellPrice) {
            result = "loss";
        } else {
            result = "no loss";
        }

        return result;
    }
}
