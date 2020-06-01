package day46_final_abstract;

public class Triangle extends Shape{
    public double base;
    public double high;

    public Triangle(double base, double high) {
        this.base = base;
        this.high = high;
    }
    @Override
    protected void Area(){
        double area=base*high*1/2;

        System.out.println("Area is triangle: "+area);


    }
}
