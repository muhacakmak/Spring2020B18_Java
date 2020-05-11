package CodinBat.String_1;

public class lastChars {
    public static void main(String[] args) {
        String a = "";
        String b = "";
        String result = "";

        if (b.length() == 0 && a.length() == 0) {
            result = "@@";
        } else if (b.length() == 0) {
            result = a.substring(0, 1) + "@";
        } else if(a.length()==0){
            result="@"+ b.substring(b.length() - 1);

        }else {
            result = a.substring(0, 1) + b.substring(b.length() - 1);
        }
        System.out.println(result);


    }
}
