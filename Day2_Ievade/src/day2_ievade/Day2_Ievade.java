/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_ievade;

import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class Day2_Ievade {
    public static Scanner ievade = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ievade = new Scanner(System.in);
        
//        System.out.println("Ievadi vardu : ");
//        String vards = ievade.next(); 
//        System.out.println("Ievadi uzvardu : "); 
//        String uzvards = ievade.next();
//        
//        System.out.println("Mani sauc " + vards+ " " + uzvards); // vai 
//        System.out.printf("Mani sauc %s %s \n" ,vards ,uzvards);
//        
//        
//        System.out.println("Ievadi gradus : ");
//        double gradi = ievade.nextDouble();
//        System.out.println("Ievadi gradu skalu : ");
//        String skala = ievade.next();
//        
//        if(skala.equalsIgnoreCase("c")){
//            double parv= gradi*1.8+32;
//            System.out.println("Temperatura pec F skalas  : " +parv);
//        }
//        else if (skala.equalsIgnoreCase("f")){
//            double parv= (gradi-32)/1.8;
//            System.out.println("Temperatura pec C skalas : " + parv);
//        }
//        else{
//            System.out.println("Nezinama skala");
//        }
        
        System.out.println("Ievadi attalumu : ");
        double attalums = ievade.nextDouble(); 
        System.out.println("Ievadi laiku (minutes) : "); 
        int laiks = ievade.nextInt();
        System.out.println("Ievadi uzvardu : "); 
        int degviela = ievade.nextInt();
        
        double laiksST = laiks/60;
        double laiksSS= laiks*60; 
        double atrumsKMm= laiks/attalums;
        double atrumsKMh= laiksST/ attalums;
        double vidpaterKM= attalums/degviela;
        double vidpat100 = degviela/(attalums/100);
        
        
    }
    
}
