package com.ocaj.exam.tutorial; //Package instruction
/* Import an ArrayList class from the java.util package */
import java.util.ArrayList;
/* Import an all classes from the java.io */
import java.io;

public class MainClass {
    public static void main(String[] args) {
        /* Create a console from java.io package - run outside your IDE */
        Console console = System.console();
        String planet = console.readLine(" \nEnter your favorite planet: ");
        /* Create list of planets */
        ArrayList planetList = new ArrayList();
        planetList.add(planet); //Add user entry to list
        planetList.add("Gliese r581 c"); //Add a string to the list
        System.out.println(" \nTwo cool planets: " + planetList);
    }    
}
