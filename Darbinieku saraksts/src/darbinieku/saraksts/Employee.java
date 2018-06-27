/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darbinieku.saraksts;

/**
 *
 * @author Kristaps
 */
public class Employee {
    
    public String name;
    public String surname;
    public String birthDate;

    public Employee(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }  
}
