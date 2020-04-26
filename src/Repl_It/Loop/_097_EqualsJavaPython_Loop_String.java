package Repl_It.Loop;

import java.util.Scanner;

public class _097_EqualsJavaPython_Loop_String {
    /*Given a string, print out true if the number of appearances of "java"
     anywhere in the string is equal to the number of appearances of "python"
     anywhere in the string (case sensitive).
        Example:
        input: We study java not python
        output: true
        Example:
        input: What's the difference between java, javascript and python?
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();//We
        int countJava=0;
        int countPython= 0;

        boolean result = false;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.contains("java") || sentence.contains("python")) {
                if (sentence.contains("python")) {
                    sentence = sentence.replaceFirst("python", "");
                    countPython++;
                }
                if (sentence.contains("java")) {
                    sentence = sentence.replaceFirst("java", "");
                    countJava++;
                }
            }

            result = countJava == countPython;
        }
        System.out.println(result);
        }
    }



