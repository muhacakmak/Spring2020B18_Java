package day22_Arrays_Loops.WarmUp;

public class Java_Python {
    /*
     3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                    (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
     */
    public static void main(String[] args) {
        String sentence = "I like java and javascript";
        sentence=sentence.toLowerCase();
        int countJava=0;
        int countPython=0;
        sentence.split(" ");
        String[] words = sentence.split(" ");

        for (String eachWords:words){
            if(eachWords.contains("java")){
                countJava++;
            }
            if (eachWords.contains("java")) {
                countPython++;
            }



        }
        System.out.println(countJava);
        System.out.println(countPython);




    }
}
