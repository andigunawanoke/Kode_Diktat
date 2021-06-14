package com.poi.data;
import java.util.Scanner;
public class ExceptionDemo2 {
    public static void main(String[] args){
        Scanner sc  =  new Scanner(System.in);
        boolean isi=false;
        System.out.print("Masukkan angka genap: ");
        try {
            add();
            isi = true;
        } catch (BukanAngkaException ex) {
            System.out.println(ex.toString());
        } finally{
            if(isi){
                System.out.println("input sudah benar");
            }
        }
    }

    public static void add() throws BukanAngkaException{
        Scanner sc =new Scanner(System.in);
        int angka;
        angka = sc.nextInt();
        if (angka % 2 == 1){
            throw new BukanAngkaException("Bukan angka genap!");
        }
    }
}

