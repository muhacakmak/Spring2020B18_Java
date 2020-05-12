package CodinBat.String_1;

public class frontAgain {
    public static void main(String[] args) {
        String str="edited";
        frontAgain(str);
        System.out.println(str.substring(0,2));
        System.out.println(str.substring(str.length()-2));

    }
    public static boolean frontAgain(String str) {

        if(str.length()==2){
            return true;
        }else if(str.length()<2){
            return false;
        }
        else if(str.substring(0,2).equals(str.substring(str.length()-2))){
            return true;
        }else {
            return false;
        }

    }

}
