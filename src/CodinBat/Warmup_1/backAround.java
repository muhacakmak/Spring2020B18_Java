package CodinBat.Warmup_1;

public class backAround {
    /*
    Given a string, take the last char and return a new string with the
    last char added at the front and back, so "cat" yields "tcatt".
     The original string will be length 1 or more.
    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"
     */
    public static void main(String[] args) {

        String str="cat";
        char lastChar=str.charAt(str.length()-1);
        if(str.length()>=1){

            str=lastChar+str+lastChar;
        }
            System.out.println(str);

    }
}
