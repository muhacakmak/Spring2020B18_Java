package CodinBat.Warmup_1;

public class delDel {
    /*Given a string, if the string "del" appears starting at index 1,
     return a string where that "del" has been deleted. Otherwise, return the string unchanged.
    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"
     */
    public static void main(String[] args) {

        String str="del";
        String result="";
if(str.length()>=4) {
    if (str.substring(1, 4).equals("del")) {
        result = str.replace("del", "");
    } else {
        result = str;

    }
}else{
    result=str;
}
        System.out.println(result);

    }
}

