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
public class Kvadrats {
    
    private double MalasGarums;
    
    private String krasa;
    
    public Kvadrats(){
    
    }

    public Kvadrats(double MalasGarums, String krasa) {
        this.MalasGarums = MalasGarums;
        this.krasa = krasa;
    }

    public double getMalasGarums() {
        return MalasGarums;
    }

    public void setMalasGarums(double MalasGarums) {
        if(MalasGarums<0){
            MalasGarums=0;
        }
        this.MalasGarums = MalasGarums;
    }

    public String getKrasa() {
        return krasa;
    }

    public void setKrasa(String krasa) {
        this.krasa = krasa;
    }
    
    public double laukums(){
        return this.MalasGarums * this.MalasGarums;
    }
    public double perimetrs(){
        return this.MalasGarums * 4;
    }
}

