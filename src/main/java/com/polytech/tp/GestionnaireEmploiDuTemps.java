package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

/**
 * Le Sujet Concret (Subject) dans le pattern Observer.
 * Responsable de la notification des changements.
 */
public class GestionnaireEmploiDuTemps implements Subject {
    // La liste des observateurs enregistrés
    private List<Observer> observers = new ArrayList<>();
    private String dernierChangement;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("Observer attaché."); // Log optionnel
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer détaché."); // Log optionnel
    }

    @Override
    public void notifyObservers(String message) {
        System.out.println("Notification de changement envoyée : " + message); // Log optionnel
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    /**
     * Méthode qui simule un changement d'état. 
     * Cette méthode est appelée par le test (ligne 76).
     * @param changement Le message de changement à notifier.
     */
    public void setChangement(String changement) {
        this.dernierChangement = changement;
        // Déclencher la notification
        notifyObservers(changement);
    }
}