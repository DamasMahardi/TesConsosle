package com.company;

 class Inheritance {
    String name;
    String alamat;
    Inheritance(){
        name= "Damas Mahardi";
        alamat= "Tasikmalaya";
    }
    public static class Identitas extends Inheritance{
        String name;
        String alamat;
        Identitas(){
            name= "Junaedi";
            alamat="Cianjur";
        }
        void printdetails(){
            System.out.println("Nama saya adalah :"+this.name+"\nAlamat saya "+this.alamat);
        }
    }
    public static void main(String[] args) {
        Identitas identitas = new Identitas();
        identitas.printdetails();

    }
}

