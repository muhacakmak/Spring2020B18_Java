package day19_Arrays;
import java.util.Scanner;
public class Assignment {
    /*
     // write a program that asks "enter a name" 10 times, and store each of the names in the array students

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] students=new String[3];
        String result="";
        System.out.println("Enter 10 student name : ");
        for (int i = 0; i <=students.length-1; i++) {
            System.out.print((i+1)+".Name :");
            students[i]=input.nextLine();
            System.out.print("student["+i+"]= \""+students[i]+"\"\n");
        }
        for (int i = 0; i <=students.length-1 ; i++) {
            result+="\""+students[i]+"\", ";
        }
        System.out.println("String[] students = { "+result+"}");
    }
}
