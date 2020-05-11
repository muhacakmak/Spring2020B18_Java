package CodinBat.String_1;

public class middleThree {
    public static void main(String[] args) {
        String str="Candy";
        String result="";
        if(str.length()<=3){
            result=str;

        }else {
            result=str.substring(str.length()/2-1,str.length()/2+2);
        }

        System.out.println(result);



    }
}
