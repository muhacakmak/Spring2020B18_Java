package CodinBat.String_1;

public class atFirst {
    /*
    Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"
     */
    public static void main(String[] args) {
        String str="";
        String result="";
        if(str.length()==1){
            result=str+"@";
        }else if(str.length()==0){
            result="@@";
        }else {
            result=str.substring(0,2);
        }
        System.out.println(result);



    }



}
