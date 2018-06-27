/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md1;

import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class uzdevumi {

    private static Scanner ievade = new Scanner(System.in);

    public static void PedejaisCipars() {
        System.out.print("Ievadi skaitli: ");
        double d1 = ievade.nextDouble();
        System.out.print("Ievadi skaitli: ");
        double d2 = ievade.nextDouble();

        d1 = d1 % 10;
        d2 = d2 % 10;
        if (d1 == d2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void plusMinuss10() {
        System.out.print("Ievadi skaitli: ");
        int d1 = ievade.nextInt();
        System.out.print("Ievadi skaitli: ");
        int d2 = ievade.nextInt();

        if (d1 == 10 || d2 == 10) {
            System.out.print("true");
        } else if (d1 + d2 == 10) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }

    public static void starp10un20() {
        System.out.print("Ievadi skaitli: ");
        int d1 = ievade.nextInt();
        System.out.print("Ievadi skaitli: ");
        int d2 = ievade.nextInt();

        if (10 <= d1 && d1 <= 20) {
            System.out.print("true");
        } else if (10 <= d2 && d2 <= 20) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }

    public static void lielakais() {
        System.out.print("Ievadi skaitli: ");
        int d1 = ievade.nextInt();
        System.out.print("Ievadi skaitli: ");
        int d2 = ievade.nextInt();
        System.out.print("Ievadi skaitli: ");
        int d3 = ievade.nextInt();
        System.out.print("Ievadi skaitli: ");
        int d4 = ievade.nextInt();

        int lielaisSK = 0;

        if (d1 > lielaisSK) {
            lielaisSK = d1;
        }
        if (d2 > lielaisSK) {
            lielaisSK = d2;
        }
        if (d3 > lielaisSK) {
            lielaisSK = d3;
        }
        if (d4 > lielaisSK) {
            lielaisSK = d4;
        }
        System.out.println(lielaisSK);
    }

    public static void eSkaits() {
        System.out.print("Ievadi vardu: ");
        String vards = ievade.next();

        int replace = vards.length() - vards.replace("e", "").length();
        System.out.println("" + replace);

    }

    public static void fizzBuzz() {
        System.out.print("Ievadi skaitli: ");
        int d1 = ievade.nextInt();

        if (d1 % 5 == 0 && d1 % 3 == 0) {
            System.out.print(" FizzBuzz ");
        } else if (d1 % 5 == 0) {
            System.out.print(" buzz ");
        } else if (d1 % 3 == 0) {
            System.out.print(" Fizz ");
        } else {
            System.out.printf(" %s !", d1);
        }
    }

}
