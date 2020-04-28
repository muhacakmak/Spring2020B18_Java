package Repl_It.Methods;

public class _Assessment_test_2_4_Appears_twice {
    /*
    Write a a method appearsTwice() that returns true if
    value of variable target appears only twice in the string sentence, otherwise return false.
    Examples:
    Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.
    Main.appearsTwice("laptop", "I would like to buy a new laptop
     */
    public static void main(String[] args) {

        String sentence = "I would like to buy a new , because my laptop is too old.";
        String target = "laptop";
        Boolean result=appearsTwice(sentence,target);
        System.out.println(result);
    }

    public static boolean appearsTwice(String target, String sentence) {
        int count = 0;
        while (sentence.contains(target)) {
            sentence = sentence.replaceFirst(target, "");
            count++;
        }
        if (count == 2) {
           return true;

        } else {
           return false;
        }
    }

}
