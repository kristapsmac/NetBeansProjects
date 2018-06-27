/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3uzd3;

import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class Employee {

    static Scanner input = new Scanner(System.in);

    public String vards;
    public String uzvards;
    public String dzD;

    public Employee(String vards, String uzvards, String dzD) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.dzD = dzD;
    }

}
