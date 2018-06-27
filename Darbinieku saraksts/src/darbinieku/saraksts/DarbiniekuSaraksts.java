/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darbinieku.saraksts;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class DarbiniekuSaraksts {

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        darbDarb uznemums = new darbDarb("SIA mans uznemums");
        boolean ievade = true;
        
        while (ievade == true) {
            System.out.println("Izvēlieties kādu no darbibam (add,fire,printall,change), ja velaties partraukt ievadi ievadiet 0!");
            String op = input.next();

            switch (op) {
                case "add":
                    uznemums.add();
                    break;
                case "fire":
                    uznemums.fire();
                    break;
                case "modify":
                    uznemums.modify();
                    break;
                case "printall":
                    uznemums.printAll();
                    break;
                case "0":
                    ievade = false;
                    break;
                default:
                    System.out.println("Nezinama darbiba");
                    break;
            }
        }
    }

}
