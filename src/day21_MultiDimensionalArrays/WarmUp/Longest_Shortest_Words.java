package day21_MultiDimensionalArrays.WarmUp;

public class Longest_Shortest_Words {
    /*
    2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
     */
    public static void main(String[] args) {

        String[] names = {"Reem", "Omar", "Muhtar", "Emrah", "Mohammed", "Ana", "ShaMuhammet"};

        int maxLengthString = names[0].length();
        int minLengthString = names[0].length();
        String longestWord = "";
        String shortestWord = "";


        for (int i = 0; i < names.length; i++) {


            if (names[i].length() > maxLengthString) {
                maxLengthString = names[i].length();
                longestWord = names[i];
            }
            if (names[i].length() < minLengthString) {
                minLengthString = names[i].length();
                shortestWord = names[i];

            }

        }
        System.out.println("Longest word : " + longestWord);
        System.out.println("Shortest word : " + shortestWord);

    }
}
