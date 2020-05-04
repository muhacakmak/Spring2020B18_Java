package day33_CustomClass.WarmUp;

import java.util.ArrayList;
import java.util.Arrays;

public class uniqueWithLoop {
    /*
 1. write a program that can return the uniqueWithLoop objects
 from a anArray List of Integers
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the uniqueWithLoop objects in arrayList
     */
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList <>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 4, 5, 5));
        System.out.println("Original arrayList: " + list);
        ArrayList <Integer> result = new ArrayList <>();

        //int count=Collections.frequency(list,list.get(0));


        for (int k = 0; k < list.size(); k++) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {//0 1
                int each = list.get(k);//1
                if (each == list.get(i)) {// 1
//                1
                    count++;//1+1
                }

            }
            if(count==1){
                result.add(list.get(k));
            }
        }
        System.out.println(result);
    }

}


