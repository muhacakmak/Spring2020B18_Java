package Resources;

import day39_AccessModifiers.PersonalInfo;

public class CheckInfo {
    public static void main(String[] args) {
        System.out.println(PersonalInfo.name);
        System.out.println(PersonalInfo.gender);
        //System.out.println("Grade: "+PersonalInfo.grade); not the same page
        //System.out.println(PersonalInfo.age);not the same page
        //System.out.println(PersonalInfo.SNN);not the same page
       // System.out.println(PersonalInfo.id);
        PersonalInfo obj=new PersonalInfo();

        System.out.println(obj.name);
        System.out.println(obj.gender);
//        System.out.println(obj.grade);
//        System.out.println(obj.age);

    }
}
