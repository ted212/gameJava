package com.ted.kitchen;

public class Aliment {

    private String name;
    private boolean estCuit;

    public void manger() {
        if (estCuit) {
            System.out.println("Miam miam cet aliment : " + this.name + " est bien cuit");
        } else {
            System.out.println("Beeerk cet aliment : " + this.name + " est cru !");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEstCuit() {
        return estCuit;
    }

    public void setEstCuit(boolean estCuit) {
        this.estCuit = estCuit;
    }
}
