/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3uzd;

import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class Day3UZD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ievade = new Scanner(System.in);
        
        
        System.out.println("Ievadiet figuras veidu : ");
        String figura = ievade.next();
        
        if(figura.equalsIgnoreCase("kvadrats")){
            
            System.out.println("Ievadiet malas garumu : ");
            double mala1 = ievade.nextDouble();
            
            Kvadrats k1 = new Kvadrats(mala1);
            k1.perimeter();
            k1.area();
            calculateAreaAndPerimeter(k1);
            
        
        }
        else if(figura.equalsIgnoreCase("taisnsturis")){
            System.out.println("Ievadiet pirmas malas garumu : ");
            double mala1 = ievade.nextDouble();
            System.out.println("Ievadiet otras malas garumu : ");
            double mala2 = ievade.nextDouble();
            
            Taisnst tsst1 = new Taisnst(mala1,mala2);
            tsst1.perimeter();
            tsst1.area();
            
            calculateAreaAndPerimeter(tsst1);
            
        
        }
        else if(figura.equalsIgnoreCase("trissturis")){
            System.out.println("Ievadiet pirmas malas garumu : ");
            double mala1 = ievade.nextDouble();
            System.out.println("Ievadiet otras malas garumu : ");
            double mala2 = ievade.nextDouble();
            System.out.println("Ievadiet tresas malas garumu : ");
            double mala3 = ievade.nextDouble();
            
            Trisst trs1 = new Trisst(mala1,mala2,mala3);
            trs1.perimeter();
            trs1.area();
            
            calculateAreaAndPerimeter(trs1);
        
        }
        else if(figura.equalsIgnoreCase("piecsturis")){
            System.out.println("Ievadiet  malas garumu : ");
            double mala = ievade.nextDouble();
            
            Piecst p1= new Piecst(mala);
            p1.perimeter();
            p1.area();
            
            calculateAreaAndPerimeter(p1);
        }
        else {
            System.out.println("Nezinama figura! ");
        }
        
        
    }
    public static void calculateAreaAndPerimeter(Formulas darbib){
        
        System.out.println("laukums = " +darbib.area());
        System.out.println("perimetrs = " +darbib.perimeter());
        
        
    
    }
    
}
