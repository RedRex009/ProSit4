package tn.tuniprod.gestionmagasin;

public class Vendeur extends Employer {
    double TauxDeVente;

    public Vendeur() {}

    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, double tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heures);
        this.TauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * TauxDeVente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vendeur [Taux de Vente: " + TauxDeVente + "]";
    }
}

