package com.ted.Paris;

public class Parisien implements MoyenDeLocomotion {
    public void seDeplacer(MoyenDeLocomotion moyenDeLocomotion) {
        moyenDeLocomotion.deplace("19 rue Germain Pilon 75018 Paris");
    }

    @Override
    public void deplace(String adresse) {

    }
}
