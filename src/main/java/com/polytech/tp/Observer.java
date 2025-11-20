package com.polytech.tp;

/**
 * Interface Observer (Pattern Observer).
 * Définit la méthode d'appel en cas de notification.
 */
public interface Observer {
    /**
     * Méthode appelée par le Subject pour notifier l'Observer.
     * @param message Le message de changement.
     */
    void update(String message);
}