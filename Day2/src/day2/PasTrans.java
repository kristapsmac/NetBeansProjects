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
public class PasTrans extends Transportlidzeklis{
    
    public int maxpas;

    public PasTrans(String razotajs, String marka, int gads,int maxpas) {
        super(razotajs, marka, gads);
        
        this.maxpas=maxpas;
    }
    @Override
    public String toString(){
        String teksts = super.toString();
        teksts +=", pasazieri = "+ this.maxpas;
        
        return teksts;
}
}
