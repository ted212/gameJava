package com.ted.kitchen;

public class Four {

    private int puissance;
    private int capacite;

    public void cuire(Aliment aliment) {
        System.out.println("Je cuis un aliment : " + aliment.getName());
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
        aliment.setEstCuit(true);
    }


    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
