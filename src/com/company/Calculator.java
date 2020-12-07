package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        kalkulatorProgram();
    }

    private static void kalkulatorProgram() {

        int a,b,hasil,pilih;
        String jawab;
        boolean pilihan_ngulang= true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator");
        System.out.println("masukan nilai a :");
        a= scanner.nextInt();
        System.out.println("masukan nilai b :");
        b = scanner.nextInt();
        System.out.println("Pilih opearasi yang akan digunakan ");
        System.out.println("1 Penjumlaham");
        System.out.println("Pilih operasi yang akan di gunakan");
        pilih = scanner.nextInt();


        if (pilih == 1){
            while (pilihan_ngulang){
                hasil= a + b ;
                System.out.println("hasi penjumlahan adalah :"+hasil);
                System.out.println("Apakah anda ingin lanjut kemabli ? y/n ");
                jawab= scanner.next();
                if (jawab.equalsIgnoreCase("n")){
                    break;
                }else if (jawab.equalsIgnoreCase("y")){
                    kalkulatorProgram();
                }
            }
        }
    }

}
