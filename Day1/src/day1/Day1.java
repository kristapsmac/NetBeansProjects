/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author Kristaps
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // var arī divās rindās piemeram Kvadrats kv1; un nakama rinda kv1 = new Kvadrats();
        Kvadrats kv1 = new Kvadrats();

        kv1.setMalasGarums(5.5);
        kv1.setKrasa("sarkans");

        double laukums = kv1.laukums();
        double perimetrs = kv1.perimetrs();

        Kvadrats kv2 = new Kvadrats(6, "melns");
        laukums = kv2.laukums();
        perimetrs = kv2.perimetrs();

        System.out.println("Kvadrata 2 laukums = " + laukums);
        System.out.println("Kvadrata 2 perimetrs = " + perimetrs);
        System.out.println("Kvadrata 1 krasa  = " + kv1.getKrasa());

        Telpa t1 = new Telpa(3, 5);

        Klase k1 = new Klase("10D", t1, 20);

        Skolotajs pasn1 = new Skolotajs("Janis ", "Janis ", "janis@janis.jan ");

        MacPrieksm mp1 = new MacPrieksm("Matematika ", t1, pasn1);

        Skolens sk1 = new Skolens("Jana ", "Jana ", "jana@jana.jan ", 1991, k1);

        Vertejums v1 = new Vertejums(mp1, sk1, 5);

        MacPrieksm mp2 = new MacPrieksm("Algebra ", t1, pasn1);

        Skolens sk2 = new Skolens("Vards ", "Uzvards ", "vards@epasts.valsts ", 1992, k1);

        Vertejums v2 = new Vertejums(mp2, sk2, 10);
        
        System.out.println(v1.Informacija());
        
        
        Auto auto = new Auto();
        Lidmasina lidmasina = new Lidmasina();
        auto.parvietoties();
        lidmasina.parvietoties();
        
        parvietot(auto);
        parvietot(lidmasina);
        
        Direktors d = new Direktors();
        d.uzvards = " Uzvards ";
        d.vards=" Vards ";
        //System.out.println(d.toString());
        darbiniekaVards(d);

    }
    static void darbiniekaVards(Darbinieks d){
        System.out.println(d.toString());
    
    }
    
    static void parvietot(Transportlidzeklis tr){
        tr.parvietoties();
    
    }

}


