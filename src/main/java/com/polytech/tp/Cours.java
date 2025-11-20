package com.polytech.tp;

public class Cours implements ICours {

   
    private final String matiere;
    private final String enseignant;
    private final String salle;
    private final String date;
    private final String heureDebut;
    private final boolean estOptionnel;
    private final String niveau;
    private final boolean necessiteProjecteur;
    private final double duree = 1.5; 

  
    public Cours(String matiere, String enseignant, String salle, String date,
                 String heureDebut, boolean estOptionnel, String niveau, boolean necessiteProjecteur) {
        this.matiere = matiere;
        this.enseignant = enseignant;
        this.salle = salle;
        this.date = date;
        this.heureDebut = heureDebut;
        this.estOptionnel = estOptionnel;
        this.niveau = niveau;
        this.necessiteProjecteur = necessiteProjecteur;
    }

    
    private Cours(CoursBuilder builder) {
        this.matiere = builder.matiere;
        this.enseignant = builder.enseignant;
        this.salle = builder.salle;
        this.date = builder.date;
        this.heureDebut = builder.heureDebut;
        this.estOptionnel = builder.estOptionnel;
        this.niveau = builder.niveau;
        this.necessiteProjecteur = builder.necessiteProjecteur;
    }

    
    @Override
    public String getDescription() {
        return matiere;
    }

    @Override
    public double getDuree() {
        return duree;
    }

    public String getMatiere() { return matiere; }
    public String getEnseignant() { return enseignant; }


    public static class CoursBuilder {

       
        private String matiere = "Matière par défaut";
        private String enseignant = "Enseignant par défaut";
        private String salle = "Amphi A";
        private String date = "Non définie";
        private String heureDebut = "Non définie";
        private boolean estOptionnel = false;
        private String niveau = "L3";
        private boolean necessiteProjecteur = true;

        
        public CoursBuilder() {}

        
        public CoursBuilder setMatiere(String matiere) { this.matiere = matiere; return this; }
        public CoursBuilder setEnseignant(String enseignant) { this.enseignant = enseignant; return this; }
        public CoursBuilder setSalle(String salle) { this.salle = salle; return this; }
        public CoursBuilder onDate(String date) { this.date = date; return this; }
        public CoursBuilder atHeure(String heureDebut) { this.heureDebut = heureDebut; return this; }
        public CoursBuilder isOptionnel(boolean estOptionnel) { this.estOptionnel = estOptionnel; return this; }
        public CoursBuilder forNiveau(String niveau) { this.niveau = niveau; return this; }
        public CoursBuilder needsProjecteur(boolean necessiteProjecteur) { this.necessiteProjecteur = necessiteProjecteur; return this; }

       
        public Cours build() {
          
            return new Cours(this); 
        }
    }
}