package com.company;

public class InhertitanceLife {

}

class Motor{
    public void Kecepatan(){
        System.out.println("Kecepatan Maksimal");
    }

    public void Pengereman(){
        System.out.println("Pengereman bagus");
    }
}
class Honda extends Motor {
    @Override
    public void Kecepatan() {
        System.out.println("Kecepatan Motor Honda sangat bagus");
    }

    @Override
    public void Pengereman() {
        System.out.println("Pengereman motor honda sangat bagus");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.Kecepatan();
        honda.Pengereman();
    }
}
