package day41_Inheritance;
/*
title  (inherited)
author (inherited)
price (inherited)
length
toStoring()

 */

public class AudioBook extends Book{
    public String length;
    public void listen(){
        System.out.println("Listing to "+title);
    }

}
