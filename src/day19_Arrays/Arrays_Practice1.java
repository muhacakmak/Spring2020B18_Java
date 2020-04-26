package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {
        String [] friends={"Emrah(tayfun)", "Sha","Ramazan", "Mynun","Namik"};
        friends[0]="Emrah(tayfun)";

        System.out.println(friends[1]);

        for (int i = 0; i <=friends.length-1 ; i++) {
            String name=friends[i];
            System.out.println(name);
        }

        String [] emails={"cybertek@yahoo.com", "cybertek@gmail.com","cybertek@hotmail.com", "cybertek@outlook.com"};

        for (int i = 0; i <=emails.length-1 ; i++) {
            String email=emails[i];
            if(email.endsWith("@gmail.com")){
                System.out.println(email);
            }
     }

    }
}
