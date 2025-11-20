package com.polytech.tp;

/**
 * Interface Subject (Pattern Observer).
 * Définit les méthodes pour attacher, détacher et notifier les Observers.
 */
public interface Subject {
    /**
     * Attache un Observer à la liste de notification.
     * @param observer L'objet Observer à attacher.
     */
    void attach(Observer observer);

    /**
     * Détache un Observer de la liste de notification.
     * @param observer L'objet Observer à détacher.
     */
    void detach(Observer observer);

    /**
     * Notifie tous les Observers enregistrés d'un changement.
     * @param message Le message à envoyer aux Observers.
     */
    void notifyObservers(String message);
}