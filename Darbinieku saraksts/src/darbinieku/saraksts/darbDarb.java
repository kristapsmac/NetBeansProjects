/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darbinieku.saraksts;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class darbDarb {

    static Scanner input = new Scanner(System.in);

    String nos;
    ArrayList<Employee> darbinieki;

    public darbDarb(String nos) {
        this.nos = nos;
        this.darbinieki=new ArrayList<Employee>();
    }

    public void add() {
        System.out.println("Darbinieku pievonošana.");
        System.out.println("Ievadiet Jaunā darbinieka vārdu!");
        String name = input.next();
        System.out.println("Ievadiet Jaunā darbinieka uzvārdu!");
        String surname = input.next();
        System.out.println("Ievadiet Jaunā darbinieka dzimšanas dienas datumu!(dd/mm/yyyy)");
        String birthDate = input.next();
        darbinieki.add(new Employee(name, surname, birthDate));
        System.out.printf("Veiksmigi pievienots jauns darbinieks! %s %s dzimis %s \n", name.substring(1, 2), surname, birthDate);
    }

    public void fire() {
        System.out.println("Darbinieku atlaišana.");
        System.out.println("Ievadiet darbinieka vārdu!");
        String name = input.next();
        System.out.println("Ievadiet darbinieka uzvārdu!");
        String surname = input.next();
        for (int i = darbinieki.size() - 1; i < -1; i--) {
            if (darbinieki.get(i).name==name && darbinieki.get(i).surname==surname) {
                darbinieki.remove(i);
                break;
            }
        }
    }

    public void modify() {
        System.out.println("Darbinieku labošana.");
        System.out.println("Ievadiet darbinieka vārdu!");
        String name = input.next();
        System.out.println("Ievadiet darbinieka uzvārdu!");
        String surname = input.next();
        for (int i = darbinieki.size() - 1; i > -1; i--) {
            if (darbinieki.get(i).name==name && darbinieki.get(i).surname==surname) {
                System.out.println("Ievadiet darbinieka dzimsanas datumu!");
                String birthDate = input.next();
                darbinieki.get(i).birthDate=birthDate;
                break;
            }
        }
        System.out.printf("Veiksmigi mainīti darbinieka %s %s dati!", name.substring(1, 2), surname);
    }

    public void printAll() {
        System.out.println("Uzņēmumā mans uznemums strādā :");
        for (Employee emp : darbinieki) {
            System.out.printf("%s %s dz. %s", emp.name, emp.surname, emp.birthDate);
        }

    }

}
