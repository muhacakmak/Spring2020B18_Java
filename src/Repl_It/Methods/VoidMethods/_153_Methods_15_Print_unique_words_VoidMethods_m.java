package Repl_It.Methods.VoidMethods;

public class _153_Methods_15_Print_unique_words_VoidMethods_m {
    public static void main(String[] args) {

        String[] word = {"Emrah", "Zeynep", "Tahir", "Tahir"};

       printUniqueWords(word);
    }
    public static void printUniqueWords(String[] words){
        for (String eacArr : words) {
            int count = 0;
            for (String eachArr2 : words) {
                if (eacArr.equalsIgnoreCase(eachArr2)) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(eacArr);
            }
        }

    }

}
