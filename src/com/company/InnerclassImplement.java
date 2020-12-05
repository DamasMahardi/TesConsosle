package com.company;

public interface InnerclassImplement {
    void print();
}

class AnonymousClass{
    static InnerclassImplement innerclassImplement = new InnerclassImplement() {
        @Override
        public void print() {
            System.out.println("ini adalah class interface implements");
        }
    };

    public static void main(String[] args) {
        innerclassImplement.print();
    }
}
