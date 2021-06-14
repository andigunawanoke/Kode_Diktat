package com.poi.data;
import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args){
        Scanner sc  =  new Scanner(System.in);
        boolean isi=false;
        System.out.print("Masukkan angka: ");
        try {
            int angka;
            angka = sc.nextInt();
            System.out.println(angka);
            isi = true;
        } catch (Exception e) {
            System.out.println("ERROR. . . INPUT BUKAN ANGKA");
        } finally{
            if(isi){
                System.out.println("input sudah benar");
            }
        }
    }
}
