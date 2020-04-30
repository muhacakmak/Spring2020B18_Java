package Repl_It.ArrayList;

public class _165_Methods_with_return_10_thunder_blazz {
    public static void main(String[] args) {
        System.out.println(getThunderBlazz(false,false,1,2,3));

    }

    public static boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {

        boolean ingredient=ingredient1==1&&ingredient2==2&&ingredient3==3;
        boolean ingredientAlternate=ingredient1==3&&ingredient2==1&&ingredient3==2;
        if(available||gift||ingredient||ingredientAlternate){
            return true;
        }else{
            return false;
        }

    }
}
