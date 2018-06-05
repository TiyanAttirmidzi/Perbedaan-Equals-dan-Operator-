/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Asus
 */
public class Tugas3 {
    public static void main(String[] args) {
        System.out.println("Perbedaan Penggunaan/Pemakaian Operator (==) dan equals");
        
        String st1 = "Saya Suka Makan Tempe Goreng";
        String st2 = "Saya Suka Makan Tempe Goreng";
        String st3 = "Saya Suka";
        String st4 = " Makan";
        String st5 = " Tempe Goreng";
        String st6 = st3 + st4 + st5;
        
        System.out.println("");
        System.out.println("Pernyataan 1 : " + st1);
        System.out.println("Pernyataan 2 : " + st2);
        System.out.println("Pernyataan 3 : " + st3);
        System.out.println("Pernyataan 4 : " + st4);
        System.out.println("Pernyataan 5 : " + st5);
        System.out.println("Pernyataan 6 : " + st6);
        System.out.println("");
        System.out.println("Menggunakan Operator (==) :");
        System.out.println("Pernyataan 1 == Pernyataan 6 : " + (st1==st6));
        System.out.println("Pernyataan 1 == Pernyataan 2 : " + (st1==st2));
        System.out.println("Pernyataan 6 == Pernyataan 2 : " + (st6==st2));
        System.out.println("");
        System.out.println("Menggunakan Equals : ");
        System.out.println("Pernyataan 1 equals Pernyataan 6 : " + (st1.equals(st6)));
        System.out.println("Pernyataan 1 equals Pernyataan 2 : " + (st1.equals(st2)));
        System.out.println("Pernyataan 6 equals Pernyataan 2 : " + (st6.equals(st2)));
        
        
    }
}
