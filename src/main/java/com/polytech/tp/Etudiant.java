package com.polytech.tp;

/**
 * Observer Concret pour l'étudiant.
 */
public class Etudiant implements Observer {
    private String nom;

    public Etudiant(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        // Affiche le message de notification dans la console
        System.out.println("Etudiant " + nom + " notifié : " + message);
    }
}