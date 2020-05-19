package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
 */
public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo("Emir", 6, 'M', 123, "kinder garden");

        Student student2 = new Student();
        student2.setStudentInfo("Tahir", 4, 'M', 456, "Pre-K");

        Student student3 = new Student();
        student3.setStudentInfo("Elif", 25, 'F', 789, "Senior");

        ArrayList <Student> studentList = new ArrayList <>();
        studentList.addAll(Arrays.asList(student1, student2, student3));



        for (Student each : studentList) {
           // System.out.println(each);
            System.out.println("Name :" + each.name + ", studentID: " + each.studentID);
        }

    }
}
