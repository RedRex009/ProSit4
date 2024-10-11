package tn.tuniprod.gestionmagasin;

public class Employer {
     int identifiant;
     String nom;
     String adresse;
    protected int nbr_heures;



//    public int getIdentifiant() {
//        return identifiant;
//    }
//
//    public String getAdresse() {
//        return adresse;
//    }
//    public void setAdresse(String adresse) {
//        this.adresse = adresse;
//    }
//
//
//    public String getNom() {
//        return nom;
//    }
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//
//    public int getNbr_heureus() {
//        return nbr_heureus;
//    }
//    public void setNbr_heureus(int nbr_heureus) {
//        this.nbr_heureus = nbr_heureus;
//    }

    public Employer() { }

    public Employer(int identifiant, String nom, String adresse, int nbr_heures) {
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    @Override
    public String toString() {
        return "Employé [ID: " + identifiant + ", Nom: " + nom + ", Adresse: " + adresse + ", Heures/mois: " + nbr_heures + "]";
    }

    public double calculerSalaire() {
        return 0;
    }


}

