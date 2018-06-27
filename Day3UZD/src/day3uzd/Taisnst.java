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
public class Taisnst implements Formulas{

    double mala1;
    double mala2;
    
    public Taisnst(double mala1,double mala2) {
        this.mala1 = mala1;
        this.mala2 = mala2;
    }

    @Override
    public double perimeter() {
        return (this.mala1+this.mala2)*2;
    }

    @Override
    public double area() {
        return this.mala1*this.mala2;
    }
}
