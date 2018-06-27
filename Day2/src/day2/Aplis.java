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
public class Aplis implements Darbibas{
    
    double radius;
    String krasa;

    @Override
    public double laukums() {
        
        return (this.radius * this.radius) * Math.PI;
    }

    @Override
    public String krasa() {
        return this.krasa;
    }

    @Override
    public double perimetrs() {
        return 2 * Math.PI * this.radius;
    }
    
    
}
