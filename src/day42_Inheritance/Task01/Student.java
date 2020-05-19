package day42_Inheritance.Task01;

/*
create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
 */
public class Student extends Person {
    /*
    name;   (Inheritance)
    age;    (Inheritance)
    gender;  (Inheritance)
    studentID
    , clazz
     */
    public long studentID;
    public String clazz;
    public static String schoolName="Cybertek";

    public void attendClass() {
        System.out.println(name + " is attending class");
    }

    public void code() {
        System.out.println(name + " is coding");
    }

    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz) {
        setPersonInfo(name,age,gender);
        this.studentID = studentID;
        this.clazz = clazz;
    }
    public String toString(){
        return "Name: "+name+", age: "+age+", gender: "+gender+", student ID: $"+studentID+", class: "+clazz
                +", school name "+schoolName;

    }

}
