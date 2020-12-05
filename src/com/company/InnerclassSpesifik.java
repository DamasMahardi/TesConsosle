package com.company;

class InnerclassSpesifik {
    //sub class
    void printsubclass(){
        System.out.println("Ini adalah sub class spesifik tipe");
    }

}
class AnonymusClass {
    static InnerclassSpesifik outAnonimous = new InnerclassSpesifik() {
        void printAnonimous() {
            super.printsubclass();
            System.out.println("ini adalah anonimous class");
        }
    };

    public static void main(String[] args) {
        outAnonimous.printsubclass();

    }
}
