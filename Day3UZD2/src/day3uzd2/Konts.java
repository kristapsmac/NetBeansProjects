/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3uzd2;

/**
 *
 * @author Kristaps
 */
public class Konts {
    
    Klienti klients;
    double atlikums=0;
    String valuta="$";
    
    public String getCustomer(){
        
        return String.format("Klienta vards ir %s klienta uzvards ir %s un klienta dzimums ir %s", klients.vards,klients.uzvards, klients.dzimums);
    
    }
    
    public String getCustomerName(){
        return String.format("Klienta vards ir  %s.",klients.vards);        
    
    }
    public String getBalance(){
        return String.format("Konta atlikums ir %s %s ", atlikums, valuta);
    
    }    
    public void deposit(double daudzums ){
        
        atlikums+=daudzums;
        
    
    }    
    public void withdraw(double daudzums){
        
        atlikums-=daudzums;
        
    
    }
}
