package com.company;



class Identitas{
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Identitas identitas = new Identitas();
        identitas.setNama("Damas");
        System.out.println(identitas.getNama());

    }

}


