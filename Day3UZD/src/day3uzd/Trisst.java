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
public class Trisst implements Formulas{
    
    double mala1;
    double mala2;
    double mala3;
    double perimeter;


    public Trisst(double mala1, double mala2, double mala3) {
        this.mala1 = mala1;
        this.mala2 = mala2;
        this.mala3 = mala3;
        
    }

    @Override
    public double perimeter() {
        double perimeter=mala1+this.mala2+this.mala3;
        return perimeter;
    }
    double pusperi=perimeter*0.5;

    @Override
    public double area() {
        
        double area= Math.sqrt(pusperi*(pusperi-this.mala1)*(pusperi-this.mala2)*(pusperi-this.mala3));
        return area;
    }
    
}
