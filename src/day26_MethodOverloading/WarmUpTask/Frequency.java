package day26_MethodOverloading.WarmUpTask;

public class Frequency {
    /*
    1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
     */
    public static void main(String[] args) {
        String str="ABBAAAAAAAAAAAAA";
        char ch='A';
        char [] arr=str.toCharArray();
        int count=0;
        for (char eachArr:arr) {

            if(eachArr==ch){
                count++;
            }
        }
        System.out.println(count);
        String str2="ABCDEFGABABABABA";
        char ch2='B';

       int count2= frequency(str2,ch2);
        System.out.println(count2);




    }
    public static int frequency(String str, char ch){
        char [] arr=str.toCharArray();
        int count=0;
        for (char eachArr:arr) {

            if(eachArr==ch){
                count++;
            }
        }

        return  count;
    }
}
