package com.company;

interface awal{
    public  void awalmethod();
}

interface tengah{
    public void tengahmethod();
}
interface akhir extends awal,tengah{
    public void mainmethod();
}

public class InheritanceMultiple implements akhir {
    public void mainmethod(){
        System.out.println("Ini adalah method utama");
    }

    @Override
    public void awalmethod() {
        System.out.println("ini method awal");
    }

    @Override
    public void tengahmethod() {
        System.out.println("ini method tengah");
    }

    public static void main(String[] args) {
        InheritanceMultiple multiple = new InheritanceMultiple();
        multiple.mainmethod();
        multiple.tengahmethod();
        multiple.awalmethod();
    }
}
