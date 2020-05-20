package day42_Inheritance;


class B {

    public B(int a) {
        System.out.println("int");

    }
    public B(double a) {
        System.out.println("double");

    }
    public B(long a) {
        this(10);

        System.out.println("long");

    }

}

public class InheritanceReview extends B {
    InheritanceReview(String a) {
        super(19l);
        System.out.println("String");
    }

    public static void main(String[] args) {
        InheritanceReview obj = new InheritanceReview("Selcuk");


    }

}
