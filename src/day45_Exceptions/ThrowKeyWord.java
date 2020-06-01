package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowKeyWord {

    public static void main(String[] args) throws Exception {
        NoSuchElementException obj = new NoSuchElementException();
        //  throw obj;
        //   throw new NoSuchElementException();

        //System.out.println();

        /*
        boolean breakTime=true;


        if(breakTime){
            throw new RuntimeException("It is break time we should take a break");

        }
        */




            throw new IOException();



    }
}
