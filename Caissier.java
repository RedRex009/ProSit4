package tn.tuniprod.gestionmagasin;

public class Caissier extends Employer{
    int numeroDeCaisse;


    public Caissier(){
        super();
    }

    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = 5 * nbr_heures;
        if (nbr_heures > 180) {
            salaireBase += (nbr_heures - 180) * 0.15 * 5;
        }
        return salaireBase;
    }


    @Override
    public String toString() {
        return super.toString() + ", Caissier [Numéro de Caisse: " + numeroDeCaisse + "]";
    }
}
