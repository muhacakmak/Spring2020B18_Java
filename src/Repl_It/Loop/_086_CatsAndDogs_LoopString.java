package Repl_It.Loop;

import java.util.Scanner;

public class _086_CatsAndDogs_LoopString {
    /*
    Print true if the string "cat" and "dog" appear
    the same number of times in the given string word.

Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        boolean result = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.contains("dog") || word.contains("cat")) {
                if (word.contains("cat")) {
                    word = word.replaceFirst("cat", "");
                    countOfCats++;
                }
                if (word.contains("dog")) {
                    word = word.replaceFirst("dog", "");
                    countOfDogs++;
                }
            }

            result = countOfCats == countOfDogs;
        }
        System.out.println(result);
    }

}







