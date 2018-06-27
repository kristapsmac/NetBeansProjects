/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3uzd2;

import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class Day3UZD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ievade = new Scanner(System.in);

        System.out.println("Ievadiet vardu: ");
        String vards = ievade.next();
        System.out.println("Ievadiet uzvardu : ");
        String uzvards = ievade.next();
        System.out.println("Ievadiet dzimumu (V/S) : ");
        String dzimums = ievade.next();
        
        boolean pareizdzim=false;
        
        while(pareizdzim==false){
        if (dzimums == "V"){
            
            pareizdzim=true;
            
        }
        else if(dzimums == "S"){

            pareizdzim=true;
        }
        else{
            System.out.println("Nezinams dzimums");
            
        }
        }

        Klienti kl1 = new Klienti(vards, uzvards, dzimums);
        Konts k1 = new Konts();
        
        System.out.println("Ievadiet valutu");
        k1.valuta = ievade.next();

        boolean klientaievade = true;

        while (klientaievade == true) {

            System.out.println("Ievadiet velamo darbibu! (ievadiet 'izbeigt' ja velaties beigt ievadi) ");
            String darbiba = ievade.next();

            if (darbiba.equalsIgnoreCase("Dati")) {

                System.out.printf("Jus sauc %s %s un jus esat %s \n ", kl1.vards, kl1.uzvards, kl1.dzimums);

            } else if (darbiba.equalsIgnoreCase("Vards")) {

                System.out.println("Jus sauc  " + kl1.vards);

            } else if (darbiba.equalsIgnoreCase("Bilance")) {

                System.out.printf("Konta atlikums  %s %s \n", k1.atlikums, k1.valuta);

            } else if (darbiba.equalsIgnoreCase("Iemaksa")) {
                
                System.out.println("Cik daudz naudu iemaksasiet? : ");
                double daudzums = ievade.nextDouble();
                k1.deposit(daudzums);
                
                if(daudzums<=10000){
                    System.out.printf("Operacija veiksmiga! Jus iemaksajat %s %s \n", daudzums, k1.valuta);
                }
                else{
                    System.out.println("Operacija parsniedz limitu!");
                
                }

            } else if (darbiba.equalsIgnoreCase("Izmaksa")) {
                System.out.println("Cik daudz naudu izmaksasiet? : ");
                double daudzums = ievade.nextDouble();
               
                
                if(k1.atlikums>=0 && daudzums<=500){
                    k1.withdraw(daudzums);
                    System.out.printf("Operacija veiksmiga! Jus iemaksajat %s %s \n", daudzums, k1.valuta);
                }
                else{
                    System.out.println("Konta nepietiek lidzekli vai operacija parsniedz limitu");
                }

            } else if (darbiba.equalsIgnoreCase("izbeigt")) {

                klientaievade = false;
                
            } else {

                System.out.println("Nezinama darbiba! ");

            }
        }
    }

}
