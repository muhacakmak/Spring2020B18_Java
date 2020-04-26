package day13_StringClass;

public class charAt {
    public static void main(String[] args) {
        // charAt()

        String str = "Cybertekfffhfghghjgjghj";
        //            01234567

        char ch1 = str.charAt(5);
        char ch4=str.charAt(4);
        System.out.println(ch4);

        System.out.println(str.length());

        int lastindex=str.length()-1;
        char lastch=str.charAt(str.length()-1);
        System.out.println(lastch);
        ///







//        System.out.println(ch1 == 'A');
//        System.out.println(ch1 == 'T');
//
//        // lengthMethods()
//        int totalLength=str.length();
//        System.out.println(totalLength);
//        System.out.println(totalLength>250);
//
//
        String str2="Today is great day, Java is fun";
        int maxIndexNum=str2.length()-1;
        System.out.println("MaxIndex= lenght-1"+maxIndexNum);

//        //concat()
//
//        String s1="Cybertek";
//        s1=s1.concat(" School");//"Cybertek Scool"
//        System.out.println(s1);
//        String s2="Java";
//        System.out.println(s2.concat(" is a programming language"));
//
//        s2=s2.concat(" is a programming language");
//        System.out.println(s2);
//
//        String r1="Java is fun";
//        r1=r1.concat(", and it's easy");
//        System.out.println(r1);
//
//        String name1="CYBERTEK";
//        name1=name1.toLowerCase();
//        System.out.println(name1);
//        String name2="cybertek school";
//        name2=name2.toUpperCase();
//        System.out.println(name2);
//        // trim():
//        String A1="           Today is a great day           ";
//        System.out.println("before the rim: "+A1);
//
//        System.out.println("After trim : "+A1.trim());
//
//
//
//







    }
}
