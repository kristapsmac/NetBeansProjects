/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class Uzdevumi {

    static Scanner ievade = new Scanner(System.in);

    public String teksts = "";

    public static void Piemeri() {
        // nevar izmantot mainigo "teksts", jo static funkcija 
        //teksts="A";

        // cikls no 1 līdz 10 
        for (int i = 1; i <= 10; i++) {
            System.out.println("i= " + i);
        }

        // cikls no 5 līdz 1 
        int N = 5;
        while (true) {
            if (N == 0) {
                break;
            }
            System.out.println("N = " + N);
            N--;
        }
    }

    public static void Ntie() {

        System.out.println("Ievadiet skaitli! ");
        int skaitlis = ievade.nextInt();
        int summa = 0;

        for (int i = 1; i <= skaitlis; i++) {
            System.out.println(i);
            summa += i;
        }
        System.out.println(summa);

    }

    public static void NtoSumma() {

        int summa = 0;
        System.out.println("Ievadiet cik daudz skaitlus ievadisiet! ");
        int skaits = ievade.nextInt();

        for (int i = 1; i <= skaits; i++) {
            System.out.println("Ievadiet skaitli! ");
            int skaitlis = ievade.nextInt();
            summa += skaitlis;
        }

        double vid = (double) summa / skaits;
        System.out.println("Vidējā skaitļu vērtība = " + vid);
        System.out.println("Skaitlu summa =  " + summa);
    }

    public static void SkaitluKubi() {
        System.out.println("Līdz kuram skaitlim velateis kubus! ");
        int skaitlis = ievade.nextInt();

        for (int i = 1; i <= skaitlis; i++) {
            int kubs = (int) Math.pow(i, 3);
            System.out.printf("%s = %s \n", i, kubs);
        }
    }

    public static void TrisSt() {
        System.out.println("Cik lielu trissturi ? : ");
        int n = ievade.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Rezgis() {
        System.out.println("Cik lielu rezgi? ");
        int n = ievade.nextInt();

        for (int k = 1; k <= n / 2; k++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
            }
            System.out.println();
            for (int j = n; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();

        }

    }

    public static void PretejaSeciba() {
        System.out.println("Ievadiet skaitli!: ");
        int n = ievade.nextInt();
        System.out.println();
        int otradi = n;

        for (; otradi != 0; otradi = otradi / 10) {
            int cipars = otradi % 10;
            System.out.print(cipars);
        }
        System.out.println();

    }

    public static void Piramida() {
        System.out.println("Cik lielu piramidu ? : ");
        int n = ievade.nextInt();
        int j = 1;
        int k=1;
        int i = 1;
        int l=1;

        for(;i<=n;i++) {
            for (; j < n; j++) {
                System.out.print(" ");
            }
            j=1+i;
            for(;k<=i;k++){
                System.out.printf(" %s",l);
                l++;
               
            }
            k=k-i;
            System.out.println();
            
        }

    }

}
