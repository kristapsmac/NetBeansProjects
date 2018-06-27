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
public class KravasTrans extends Transportlidzeklis{
    
    public double ietilp;

    public KravasTrans(String razotajs, String marka, int gads, double ietilp) {
        super(razotajs, marka, gads);
        
        
        this.ietilp=ietilp;
    }
    @Override
    public String toString(){
       // String teksts = super.toString();
       // teksts +=", ietilpiba = "+ this.ietilp;
        
        // return teksts;             abi izmantotie veidi der
    
        return String.format("%s, ietilipba = %s"
        ,super.toString()
        ,this.ietilp);
    }
}
