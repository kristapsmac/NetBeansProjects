/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class Uzdevumi {

    private static Scanner ievade = new Scanner(System.in);

    public static void Pimeri() {
        System.out.print("Ievadi valsti: ");
        String valsts = ievade.next().toLowerCase();

        switch (valsts) {
            case "latvija":
                System.out.println("Rīga");
                break;
            case "lietuva":
                System.out.println("Viļņa");
                break;
            default:
                System.out.println("Nezinama valsts!");
                break;
        }
    }

    public static void MasiviSarakasti() {
        int[] skaitluMasivs = new int[3];
        skaitluMasivs[0] = 5;
        skaitluMasivs[1] = 9;
        skaitluMasivs[2] = 1;

        int[] skaitluMasivs2 = {5, 9, 1};
        int masievaIeraksti = skaitluMasivs.length;
        int tresaisSkaitlis = skaitluMasivs2[2];
        boolean irCetri=false;
        for (int skaitlis : skaitluMasivs2) {
            System.out.println(skaitlis);
            if(skaitlis==4){
                System.out.println("skaitlis 4 ir masīvā!");
                irCetri=true;
            }
        }
        //if(irCetri==false)
        //if(irCetri!=true) ir tieši tas pats kas rindiņa zemāk
        if(!irCetri){
            System.out.print("skaitlis 4 nav masīvā!");
        }

        ArrayList<String> tekstaSaraksts = new ArrayList<String>();
        tekstaSaraksts.add("teksts1");
        tekstaSaraksts.add("teksts2");
        tekstaSaraksts.add("teksts3");
        int sarakstaIeraksti = tekstaSaraksts.size();
        String tresaisVards = tekstaSaraksts.get(2);
        for (String vards : tekstaSaraksts) {
            System.out.println(vards);
        }

    }

    public static void Darbibas() {
        System.out.print("Ievadi skaitli: ");
        double d1 = ievade.nextDouble();
        System.out.print("Ievadi velamo darbibu: ");
        String darbiba = ievade.next();
        System.out.print("Ievadi skaitli: ");
        double d2 = ievade.nextDouble();
        System.out.print("Ievadi velamo darbibu: ");
        String darbiba2 = ievade.next();
        System.out.print("Ievadi skaitli: ");
        double d3 = ievade.nextDouble();
        double summa;

        if (darbiba == "/" || darbiba == "*") {
            summa = PaligF(d1, d2, darbiba);
            summa = PaligF(summa, d3, darbiba2);
        } else {
            summa = PaligF(d2, d3, darbiba2);
            summa = PaligF(d1, summa, darbiba);
        }
        System.out.println("Rezultats =" + summa);
    }

    private static double PaligF(double d1, double d2, String darbiba) {
        switch (darbiba) {
            case "/":
                return 1 / d2;
            case "*":
                return d1 * d2;
            case "-":
                return d1 - d2;
            case "+":
                return d1 + d2;
            default:
                return 0;

        }
    }
}
