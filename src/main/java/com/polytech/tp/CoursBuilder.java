package com.polytech.tp;

/**
 * Implémentation du pattern Builder pour construire la classe Cours de manière fluide.
 */
public class CoursBuilder {
    // Les attributs du Cours, avec des valeurs par défaut
    private String matiere = "Inconnue";
    private String enseignant = "Non assigné";
    private String salle = "À déterminer";
    private String jour = "Non spécifié";
    private String heure = "Non spécifiée";
    private boolean optionnel = false;
    private String niveau = "L3/M1";
    private boolean materiel = false;

    // Les méthodes setX() doivent retourner l'objet Builder (this) pour le chaînage
    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setJour(String jour) {
        this.jour = jour;
        return this;
    }

    public CoursBuilder setHeure(String heure) {
        this.heure = heure;
        return this;
    }

    public CoursBuilder setOptionnel(boolean optionnel) {
        this.optionnel = optionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }

    public CoursBuilder setMateriel(boolean materiel) {
        this.materiel = materiel;
        return this;
    }

    // La méthode build() crée l'objet final
    public Cours build() {
        // Validation minimale (optionnel, mais bonne pratique)
        if (matiere.isEmpty() || enseignant.isEmpty()) {
            throw new IllegalStateException("Matière et Enseignant doivent être définis.");
        }
        // Utilisation du constructeur long de la classe Cours
        return new Cours(matiere, enseignant, salle, jour, heure, optionnel, niveau, materiel);
    }
}