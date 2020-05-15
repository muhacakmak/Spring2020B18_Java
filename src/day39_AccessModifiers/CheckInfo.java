package day39_AccessModifiers;

public class CheckInfo {
    public static void main(String[] args) {


        System.out.println("Name: "+PersonalInfo.name);
        System.out.println("Gender: "+PersonalInfo.gender);

        System.out.println("Grade: "+PersonalInfo.grade);
//        System.out.println("SNN: "+PersonalInfo.SNN);private
//        System.out.println("ID: "+PersonalInfo.id);private
        System.out.println("Age: "+PersonalInfo.age);
        PersonalInfo obj=new PersonalInfo();

        System.out.println(obj.name);
        System.out.println(obj.gender);
        System.out.println(obj.grade);
        System.out.println(obj.age);





    }
}
