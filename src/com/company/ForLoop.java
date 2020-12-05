package com.company;

public class ForLoop {
    public static void main(String[] args) {
        String buah[]= {"Anggur", "Pisang","Alpukat"};
        String sayuran[]={"Wortel","Kangkung", "Buncis"};
        for (String a:buah
             ) {
            System.out.println("Loping buah :"+a);
        }
        System.out.println("------------");

        for (String b:sayuran )
        System.out.println("Loping Sayuran :"+b);
    }
}
