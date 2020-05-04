package day23_Methods;

public class UniqueValues {

    /*
    warmup task:
	1.  Write a program that can print out the uniqueWithLoop values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
     */
    public static void main(String[] args) {
        String[] arr = {"A", "B", "A","C","D"};//B


        for (int j=0;j<arr.length;j++){
            int count2=0;
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i].equals(arr[j])){
                    count2++;
                }
            }
            if(count2==1){
                System.out.println(arr[j]);
            }

        }



        System.out.println("======================================");

// solution2
        for (String each2:arr) {
            int count = 0;

            for (String each : arr) {

                if (each.equals(each2)) {
                    count++;
                }

            }
            if (count == 1) {// if the character is uniqueWithLoop
                System.out.println(each2);

            }



        }

//        int count = 0;
//
//        for (String each : arr) {
//
//            if (each.equals("C")) {
//                count++;
//            }
//
//        }
//        if (count == 1) {// if the character is uniqueWithLoop
//            System.out.println("C");
//
//        }


        /*

        String str="AAABBCC"==>
        first

         */
        String str="AAABBCC";
        char []ch=str.toCharArray();
        System.out.println();




    }
}
