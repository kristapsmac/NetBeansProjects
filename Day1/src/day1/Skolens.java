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
public class Skolens {
    String vards;
    String uzvards;
    String epasts;
    int dzgads;
    Klase klase;    

    public Skolens(String vards, String uzvards, String epasts, int dzgads, Klase klase) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.epasts = epasts;
        this.dzgads = dzgads;
        this.klase = klase;
    }
}
