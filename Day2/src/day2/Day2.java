/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author Kristaps
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kvadrats kv = new Kvadrats();
        kv.mala=5;
        kv.krasa="melns";
        
        Aplis apl = new Aplis();
        apl.radius=3;
        apl.krasa="roza";
        
        double laukums= kv.laukums();
        double perimetrs= kv.perimetrs();
        String krasa= kv.krasa();
        
        System.out.println("Kvadrata laukums = "+ laukums);
        System.out.println("Kvadrata perimetrs = "+ perimetrs);
        System.out.println("Kvadrata krasa = "+ krasa);
        
        System.out.println("Apla laukums = "+ apl.laukums());
        System.out.println("Apla perimetrs = "+ apl.perimetrs());
        System.out.println("Apla krasa = "+ apl.krasa);
        
        KravasTrans krtr=new KravasTrans("skand","volvo",1990,99.9);

        PasTrans pastr=new PasTrans("vac","audi",1991,3);
        
        System.out.println(krtr.toString());
        System.out.println(pastr.toString());
    }
}
