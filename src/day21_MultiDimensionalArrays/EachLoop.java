package day21_MultiDimensionalArrays;

public class EachLoop {
    /*
    for(DataType variableName: ArrayName)

     */
    public static void main(String[] args) {

        int [] nums={1,2,3,4};

        for (int eachElement:nums){
            System.out.println(eachElement);
        }
        String[] students={"Muhtar","Asiye", "Murodil"};

        for (String eachStudent:students){
            System.out.println(eachStudent);
        }

        int[]arr1={1,2,3,4,5,6,7,8,9,10};
        for (int eachNumber:arr1){
            if(eachNumber<5){
                continue;
            }
            System.out.println(eachNumber);
        }


        System.out.println("=========================================");
        String sentence="I like Java";
        String[] words=sentence.split(" ");
        for (String eachWord:words){
            System.out.println(eachWord);
        }

    }
}
