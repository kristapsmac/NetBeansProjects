/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Kristaps
 */
public class Card {

    // H, S ,D , C
    private char suit;

    // J, Q, K, A , 10, 9 ,8,.......
    private String value;

    //1. konstruktors ar 2 parametriem
    //2. metode, kas atgriež pilnu kārts nosaukumu 
    //3. metode kas atgriež kārts skaitlisko vērtību
    public Card(char suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getName() {

        return String.format("%s %s", this.suit, this.value);

    }

    public int getValue() {
        switch (this.value) {
            case "A":
                return 11;
            case "K":
            case "Q":
            case "J":
                return 10;
            default:
                return Integer.valueOf(this.value);
        }

    }
}
