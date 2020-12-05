package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int hasil, angka1, angka2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih operasi yang akan di lakukan");
        System.out.println("1 Kali");
        System.out.println("2 Bagi");
        int s = scanner.nextInt();
        System.out.println("Masukan angka pertama :");
        angka1= scanner.nextInt();
        System.out.println("Masukan Angka Ke dua :");
        angka2= scanner.nextInt();
        switch (s){
            case 1:
                hasil= angka1 * angka2;
                System.out.println("Hasilnya Perakalian :"+hasil);
                break;
            case 2:
                hasil = angka1 / angka2;
                System.out.println("Hasil Pembagian :"+hasil);
                break;
            default:
                System.out.println("Pilihan Yang anda masukan tidak ada");
        }

    }
}
