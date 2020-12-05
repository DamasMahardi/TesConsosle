package com.company;


public class EncpsulasiAchive {
    private String kursus;
    EncpsulasiAchive(){
        kursus= "Android";
    }

    public String getKursus() {
        return kursus;
    }

    public void setKursus(String kursus) {
        this.kursus = kursus;
    }

    public static class Tes{
        public static void main(String[] args) {
            EncpsulasiAchive encpsulasiAchive = new EncpsulasiAchive();
            encpsulasiAchive.setKursus("Android");
            encpsulasiAchive.getKursus();
        }
    }
}
