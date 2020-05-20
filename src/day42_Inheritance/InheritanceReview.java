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

    public B(String a) {
        this(10);

        System.out.println("long");

    }

}

public class InheritanceReview extends B {
    public InheritanceReview(double a) {
        this(10);
    }

    public InheritanceReview(String a) {
        this(10);
        System.out.println("String");
    }

    public InheritanceReview(int a) {
        super("");
        System.out.println("String");
    }

    public static void main(String[] args) {
        InheritanceReview obj = new InheritanceReview(100);


    }

}
