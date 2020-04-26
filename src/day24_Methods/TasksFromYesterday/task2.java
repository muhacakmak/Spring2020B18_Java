package day24_Methods.TasksFromYesterday;

public class task2 {
    /*
    2. write a method called GalonsToLitters, that can convert gallons to litters
	 			   1 G = 3.75 L
     */
    public static void main(String[] args) {
        GallonsToLitters(1);



    }
    public static void GallonsToLitters(double gallon){
        double liter=gallon*3.75;
        System.out.println(gallon+" G = "+liter+" L");
    }



}
