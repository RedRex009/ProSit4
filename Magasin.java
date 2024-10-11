package tn.tuniprod.gestionmagasin;

import tn.tuniprod.gestionmagasin.Produit;

public class Magasin {
    int id;
    String nom;
    String adress;
    public static final int capacite = 50;
    int index =0;
    static int totalProduits;


    Produit[] produits = new Produit[capacite];

    Employer[] employers = new Employer[20];

    int totlalEmployer ;

    public Magasin() {
    }

    public Magasin(int id, String nom, String adress) {
        this.id = id;
        this.nom = nom;
        this.adress = adress;
    }

    public Magasin(int id, String adress) {
        this.id = id;
        this.adress = adress;
    }

    public void ajouterProduit(Produit p) {
        for (int i = 0; i < produits.length; i++) {
            if (produits[i].Comparer(p)) {
                if (index < capacite) {
                    produits[index] = p;
                    totalProduits++;
                    index++;

                } else {
                    System.out.println("La capacité maximale du magasin est atteinte.");
                }
            } else {
                System.out.println("le produit existe dans la magasin  .");
            }
        }

    }

    public void afficherMagasin() {
        System.out.println("Magasin [ID: " + id + ", Nom: " + nom + ", Adresse: " + adress + "]");
        System.out.println("Employés:");
        for (Employer employe : employers) {
            System.out.println(employe);
        }
        System.out.println("Produits:");
        for (Produit produit : produits) {
            System.out.println(produit);
        }

    }

    public void afficherSalaires() {
        System.out.println("Salaires des employés dans le magasin " + nom + ":");
        for (Employer employe : employers) {
            System.out.println(employe.nom + " : " + employe.calculerSalaire() + " DT");
        }
    }

    public static int GetTotalProduits() {
        return totalProduits;
    }

    public void Max(Magasin m, Magasin m1) {
        if (m.index < m1.index) {

            System.out.println("la magasin " + m1.adress + " ayant la nombre superieur de produit");
        } else {
            System.out.println("la magasin " + m.adress + " ayant la nombre superieur de produit");
        }

    }


    public void supprimer(Produit p) {
        for (int i = 0; i < produits.length; i++) {
            if (produits[i].Comparer(p)) {
                produits[i] = produits[i - 1];

            }
            produits[i - 1] = null;
            index--;
            totalProduits--;
        }
    }


    public void ajouterEmployer(Employer e) {
        if (totlalEmployer < 20) {
            employers[totlalEmployer] = e;
            totlalEmployer++;
        } else {
            System.out.println("Les employes est maximale dans cette magasin  .");
        }

    }


    public void afficherPrimesResponsables() {
        System.out.println("Primes des responsables dans le magasin " + nom + ":");
        for (Employer employe : employers) {
            if (employe instanceof Responsable) {
                Responsable responsable = (Responsable) employe;
                System.out.println(responsable.nom + " : " + responsable.getPrime() + " DT");
            }
        }
    }

    public void afficherEmployes() {
        for (Employer employe : employers) {
            System.out.println(employe);
        }
    }

    public void affichenbEmployeParType() {
        int nbCaissiers = 0;
        int nbVendeurs = 0;
        int nbResponsables = 0;
        for (int i = 0; i < totlalEmployer; i++) {
            if (employers[i] instanceof Caissier) {
                nbCaissiers++;
            } else if (employers[i] instanceof Vendeur) {
                nbVendeurs++;
            } else if (employers[i] instanceof Responsable) {
                nbResponsables++;
            }
        }
        System.out.println("Nombre de Caissiers : " + nbCaissiers);
        System.out.println("Nombre de Vendeurs : " + nbVendeurs);
        System.out.println("Nombre de Responsables : " + nbResponsables);
    }

}


