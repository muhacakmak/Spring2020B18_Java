package day05_Unary_ShorthandOperators;

public class PrimitivesCasting {
    public static void main(String[] args) {
        int a=128;  // explicit casting
        byte b=(byte)a;
        System.out.println(b);

        double DecimalNumber=10.5;
        float FloatNumber=(int) DecimalNumber;
        // long int short we can assign to

        System.out.println(FloatNumber);

        long LongNum=300L;
        int IntNum=(int)LongNum;

        System.out.println(IntNum);

        // implicit casting
        byte ByteNum=100;
        int IntNum2=ByteNum;

        short shortNumber=100;
        long longNumber=shortNumber;

        // explicit casting practices

        double LargestNumber=100.8765;

        byte ByteValue=(byte) LargestNumber;

        float FloatValue=(float) LargestNumber;

        System.out.println(FloatValue);



















    }
}
