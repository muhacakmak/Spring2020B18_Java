package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {

        String[] devTeam={"Zeynep", "Haider", "Jovid","Muhtar"};
        String[] testersTem={"Rahman", "Aishan","Osman","Ali"};
        String[] PO={"Barzy","Donald"};
        String[] testersTeam2={"Ilhan","Zarina","Aizhan","Asiman"};

        String [][] scrumTeam={devTeam,testersTem,PO};

        scrumTeam[0][3]="Jean";
        scrumTeam[1]=testersTeam2;

        String info=scrumTeam[1][2];
        System.out.println(info);
        System.out.println("============================");

        for (String eachEmployee:scrumTeam[1]) {

            System.out.println(eachEmployee);

        }
        System.out.println("=============================");
        System.out.println(scrumTeam[2][1]);






    }
}
