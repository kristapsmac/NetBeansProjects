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
public class Vertejums {
    
    MacPrieksm prieksmets;
    Skolens skolens;
    int atzime;

    public Vertejums(MacPrieksm prieksmets, Skolens skolens, int atzime) {
        this.prieksmets = prieksmets;
        this.skolens = skolens;
        this.atzime = atzime;
    }
    
    public String Informacija(){
        
        return "Skolēns= " + skolens.vards+ " " + skolens.uzvards + " Priekšmeta nosaukums ir " + prieksmets.nosaukums + " Kuru pasniedza " 
        + prieksmets.pasniedzejs.vards + " " + prieksmets.pasniedzejs.uzvards + " Saņemta atzime = " + atzime; 
    // String.format("Skolens = %s %s, Prieksmets = %s, pasniedzejs = %s, %s, atzime = %s,
    // this.skolens.getVards(),
    // this.skolens.getUzvards(),
    // this.prieksmets.getNosaukums(),
    // this.preiksmets.getPasniedzejs(), šeit bija atsevišķā klasē jau nodefinēta funkcija pasniedzejam, kur tiek izvadits vards un uzvards
    // this.skolens.getVards(),
    // this.skolens.getVards(),
    // this.atzime)
                   
    }
}
