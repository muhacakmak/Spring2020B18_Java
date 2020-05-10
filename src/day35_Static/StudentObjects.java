package day35_Static;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Muhtar";

        Student student2=new Student();
        student2.name="Kuzat";

        System.out.println(student1);
        System.out.println(student2);


        Student.printSchoolName();

    }
}
