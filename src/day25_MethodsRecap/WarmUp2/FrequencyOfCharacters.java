package day25_MethodsRecap.WarmUp2;

import Resources.Library;

public class FrequencyOfCharacters {
    /*
    3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequencyt of characters as a stringfrom any given string
		Ex:
			FrequencyOfChars("ABABCB"); ==> "A2B3C1";
			FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
     */


    public static void main(String[] args) {
        String str = "AABBCCC";
        String nonDub = Library.removeDuplicate(str);
        System.out.println(nonDub);
        String result = "";
        for (int i = 0; i < nonDub.length(); i++) {
            String ch = "" + nonDub.charAt(i);
            int num = Library.frequency(str, ch);
            result += ch + num;
        }
        System.out.println(result);


    }

    public static String FrequencyOfChars(String str) {// day 19
        String nonDub = Library.removeDuplicate(str);
        String result = "";

        for (int i = 0; i < nonDub.length(); i++) {
            String ch = "" + nonDub.charAt(i);
            int num = Library.frequency(str, ch);
            result += ch + num;
        }
        return result;


    }
}
