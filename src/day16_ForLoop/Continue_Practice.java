package day16_ForLoop;

public class Continue_Practice {
    public static void main(String[] args) {
        // skip print Y,H, J,  D
        for (char i = 'Z'; i >='A'; i--) {
            if(i == 'Y' || i =='J'||i=='D'|| i=='H'){
                continue;
            }


            System.out.print(i+" ");

        }

        System.out.println();
        for (int i = 0; i <+100 ; i++) {

            if(i%3==0 ||i%5==0){
                continue;
            }

            System.out.print(i+" ");

        }
    }
}
