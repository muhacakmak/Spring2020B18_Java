package day46_final_abstract.Shape;

import day46_final_abstract.Shape.Shape;

public class Square {
    public double side;
    public Square(double side){
        this.side=side;
    }
    public void Area(){//10

        double area=side*side;//2mg
        System.out.println("Area of square : "+area);
    }

}
