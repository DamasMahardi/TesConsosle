package com.company;

public class WrappClassJava {

    public static void main(String[] args) {
        Float operasi1= new Float(10.6);
        Float operasi2 = new Float(10.5);
        Float operasi3 = new Float(7.4);
        Float operasi4 = new Float(operasi1.floatValue()+operasi2.floatValue()+operasi3.floatValue());
        System.out.println("3 number "+ operasi4);
    }
}
