package day19_Arrays.WarmUP;

public class Frequency {
    /*
    	2. write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
	Hint: You need nested loops
     */
    public static void main(String[] args) {
        String str="AABCC";
        String result="";

        String nonDup="";

        for (int i = 0; i <str.length()-1 ; i++) {
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }
        System.out.println(nonDup);


        for (int j = 0; j <=nonDup.length()-1 ; j++) {
            char ch =nonDup.charAt(j);


        }




        int count=0;// count the total number of occurence of each from str

        for (int i = 0; i <=str.length()-1 ; i++) {
           if(str.charAt(i)=='A');{
               count++;
            }

        }
        System.out.println(count);







    }
}
