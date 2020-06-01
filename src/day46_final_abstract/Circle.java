package day46_final_abstract;

public final class Circle extends Shape{
    public double radius;
    public final static double PI=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected void Area(){
        double area=radius*radius*PI;

        System.out.println("Area is: "+area);
    }
}
class ShapeObjects{

    public static void main(String[] args) {
        Circle obj1=new Circle(3.5);

        obj1.Area();
        Square obj2=new Square(4);
        obj2.Area();
        Triangle obj=new Triangle(5,4);
        obj.Area();
        Rectangle obj4=new Rectangle(2,3);
        obj4.Area();



    }

}