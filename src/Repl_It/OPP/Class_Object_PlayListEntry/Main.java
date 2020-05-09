package Repl_It.OPP.Class_Object_PlayListEntry;

public class Main {

    public static void main(String[] args) {


        PlayListEntry list = new PlayListEntry();

        list.setTitle("Mixed");
        list.setArtist("Abbey Road");
        list.setPlayCount(14);

        System.out.println(list.getArtist());

        System.out.println(list.getTitle());
        System.out.println(list.getPlayCount());

    }

}