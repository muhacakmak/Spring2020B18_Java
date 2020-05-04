package day19_Arrays.WarmUP;

public class Uniques_2 {
    /*
    1. write a program that can return the uniqueWithLoop characters from a string
		Ex:  "AABCC" ==> "B"

     */
    public static void main(String[] args) {
        String str = "ABABC";//s
        String result = " ";

        for (int j = 0; j < str.length(); j++) {
            char ch2=str.charAt(j);

            int count=0;
            for (int i = 0; i <str.length() ; i++) {

                char ch=str.charAt(i);
                if(ch==ch2){
                    count++;
                }


            }
            if(count==1){
                result+=ch2;
            }


        }


        System.out.println(result);

    }

    }

