package com.company;

 class MultilevelInheritence {
    MultilevelInheritence(){
        System.out.println("Ini adalah buah");
    }

}

class Sayur extends MultilevelInheritence{
    String namaBuah;
    String manfaat;
    Sayur(){
        namaBuah = "Anggur";
        manfaat="Kesehatan Otak";
        System.out.println("ini sayur in heritence dari buah");

    }
}
 class Biji extends Sayur{
    Biji(){
        System.out.println("ini class biji in heritence dari sayur");
        System.out.println("Nama buah :"+this.namaBuah+ "\nManfaat untuk kesehatan :"+this.manfaat);
    }

    public static void main(String[] args) {
        Biji biji = new Biji();
    }
}
