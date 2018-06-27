/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3uzd3;

import static day3uzd3.Employee.input;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class Day3uzd3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Employee> darbinieks = new ArrayList<Employee>();

        darbinieks.add(new Employee("Janis ", " Uzvards ", "12/12/2012 "));
        darbinieks.add(new Employee("Peteris ", " Berzins ", "01/01/2001 "));
        darbinieks.add(new Employee("Aigars ", " Darbinieks ", "02/02/1002 "));
        darbinieks.add(new Employee("Jana ", " Ozola ", "03/05/1980 "));
        darbinieks.add(new Employee("Laura ", " Cilveks ", "10/10/1950 "));

        System.out.println("Izvēlieties kādu no darbibam (add,fire,printall,change)");
        String darbiba = input.next();

        switch (darbiba) {

            case "add":
                addEmployee();
                darbinieks.add(new Employee(vards, uzvards, dzD));
                System.out.println("Darbinieks veiksmigi pievienots");
                break;
            case "fire":
                System.out.println("Darbinieku atlaišana.");
                System.out.println("Ievadiet darbinieka vārdu!");
                String vards = input.next();
                System.out.println("Ievadiet darbinieka uzvārdu!");
                String uzvards = input.next();
                for (int i = 0; i < darbinieks.size();i++) {
                    if(Employee.contains(vards)&& Employee.contains(uzvards)){
                        
                    }
                }
                break;
            case "printall":
                printEmployees();
                break;
            case "change":
                changeEmployee();
                break;
        }

    }

    public static void addEmployee() {
        System.out.println("Darbinieku pievonošana.");
        System.out.println("Ievadiet Jaunā darbinieka vārdu!");
        String vards = input.next();
        System.out.println("Ievadiet Jaunā darbinieka uzvārdu!");
        String uzvards = input.next();
        System.out.println("Ievadiet Jaunā darbinieka dzimšanas dienas datumu!");
        String dzD = input.next();

    }

    public static void printEmployees() {

    }

    public static void changeEmployee() {

    }
