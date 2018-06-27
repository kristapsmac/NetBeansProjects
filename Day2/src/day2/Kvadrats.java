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
public class Kvadrats implements Darbibas{
    
    double mala ;
    String krasa;

    @Override
    public double laukums() {
        return  this.mala * this.mala;
    }

    @Override
    public String krasa() {
        return this.krasa;
    }

    @Override
    public double perimetrs() {
        return this.mala * 4;
    }
    
    
    
}
