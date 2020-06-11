package day46_final_abstract.Shape;

public final class Circle extends Shape {
    public double radius;
    public final static double PI=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }


    protected void Area(){//10
        double area=radius*radius*PI;//2mg

        System.out.println("Area is: "+area);
    }
}
