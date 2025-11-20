package com.polytech.tp;


public class Responsable implements Observer {
    private String nom;

    public Responsable(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        // Affiche le message de notification dans la console
        System.out.println("Responsable " + nom + " notifié : " + message);
    }
}