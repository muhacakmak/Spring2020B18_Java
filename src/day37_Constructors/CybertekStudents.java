package day37_Constructors;

public class CybertekStudents {
    static  String schoolName;
    String  studentName;
    int groupNumber;
    String batch;

    public CybertekStudents(String studentName, int groupNumber, String batch) {
        schoolName="Cybertek";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }
    public String toString() {
        return "Name: " + studentName + ", Batch: " +batch
                +", in group:" + groupNumber +", School name" +schoolName;
    }
}
class CObjects{
    public static void main(String[] args) {
        CybertekStudents students1=new CybertekStudents("Drar",3,"Batch 18");
        System.out.println(students1);
        CybertekStudents students2=new CybertekStudents("Saban",12,"Bach 18");
        System.out.println(students2);
    }
}
