/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3uzd;

/**
 *
 * @author Kristaps
 */
public class Piecst implements Formulas{
    
    double mala;

    public Piecst(double mala) {
        this.mala = mala;
    }    
    

    @Override
    public double perimeter() {
        return this.mala*5;
    }

    @Override
    public double area() {
        double area = 0.25*Math.sqrt(5*(5+2*Math.sqrt(5)*(this.mala*this.mala)));
        return area;
    }
    
}
