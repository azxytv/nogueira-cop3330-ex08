package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

	    Scanner pe = new Scanner(System.in);
        Scanner pi = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.println("How many people?");

        int people = pe.nextInt();

        System.out.println("How many pizzas do you have?");

        int pizza = pi.nextInt();

        System.out.println("How many slices per pizza?");

        int slice = sl.nextInt();
        int total = slice * pizza;
        int division = total/people;
        int left = total%people;

        System.out.println(people + " people with " + pizza + " pizzas" + "(" + total + " slices )" );
        System.out.println("Each person gets "+ division + " pieces of pizza." );
        System.out.println("There are "+ left + " leftover pieces.");





    }
}
