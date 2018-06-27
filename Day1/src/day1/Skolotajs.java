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
public class Skolotajs {
     String vards;
     String uzvards;
     String epasts;

    public Skolotajs(String vards, String uzvards, String epasts) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.epasts = epasts;
    }

    @Override
    public String toString() {
        return "Skolotajs{" + "vards=" + vards + ", epasts=" + epasts + '}';
    }

    
}
