/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Admin
 */
public class game1 {
    public static void main(String[] args) {
        String string = "1223";
        char a = string.charAt(0);
        char b = string.charAt(1);
        char c = string.charAt(2);
        char d = string.charAt(3);
        int e = (int)a - 48;
        int f = (int)b - 48;
        int g = (int)c - 48;
        int h = (int)d - 48;
        int number = (e * 1000) + (f * 100) + (g * 10) + (h * 1);
        System.out.println(number);
    }
}
