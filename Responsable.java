package tn.tuniprod.gestionmagasin;

public class Responsable extends Employer {
    double prime;

    public Responsable() {}


    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, double prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = 10 * nbr_heures;
        if (nbr_heures > 160) {
            salaireBase += (nbr_heures - 160) * 0.20 * 10;
        }
        return salaireBase + prime;
    }

    public double getPrime() {
        return prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Responsable [Prime: " + prime + "]";
    }
}
