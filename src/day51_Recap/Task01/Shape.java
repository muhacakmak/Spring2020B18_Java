package day51_Recap.Task01;

/*
1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
    2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double
    3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)

 */
public abstract class Shape {

      public static   String name;


    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}


interface Volume {
    boolean hasVolume = true;

    double calculateVolume();

}

interface PI {
    double PI = 3.14;

}
