package OCA.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal dog = new Dog("Karabas", 7, "M");
        Animal cat = new Cat("Yumag", 6, "F");

        ArrayList<Animal>list=new ArrayList <>(Arrays.asList(dog,cat));
        System.out.println(list.get(0).age);



    }
}
