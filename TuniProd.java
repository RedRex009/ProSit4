package tn.tuniprod.gestionmagasin;
import java.util.Scanner;
public class TuniProd {




        public static void main(String[] args) {
            // Création des magasins
            Magasin carrefour = new Magasin(1, "Carrefour", "Centre-Ville");
            Magasin monoprix = new Magasin(2, "Monoprix", "Menzah 6");

            // Création des employés pour Carrefour
            Caissier caissier1 = new Caissier(101, "Ali", "Rue 1", 160, 1);
            Caissier caissier2 = new Caissier(102, "Ahmed", "Rue 2", 180, 2);
            Vendeur vendeur1 = new Vendeur(103, "Sara", "Rue 3", 160, 0.15);
            Responsable responsable1 = new Responsable(104, "Leila", "Rue 4", 160, 500.0);

            // Ajout des employés à Carrefour
            carrefour.ajouterEmployer(caissier1);
            carrefour.ajouterEmployer(caissier2);
            carrefour.ajouterEmployer(vendeur1);
            carrefour.ajouterEmployer(responsable1);

            // Création des employés pour Monoprix
            Caissier caissier3 = new Caissier(201, "Zied", "Rue 5", 190, 3);
            Vendeur vendeur2 = new Vendeur(202, "Mouna", "Rue 6", 160, 0.12);
            Vendeur vendeur3 = new Vendeur(203, "Amine", "Rue 7", 160, 0.10);
            Vendeur vendeur4 = new Vendeur(204, "Sana", "Rue 8", 160, 0.18);
            Responsable responsable2 = new Responsable(205, "Omar", "Rue 9", 160, 600.0);

            // Ajout des employés à Monoprix
            monoprix.ajouterEmployer(caissier3);
            monoprix.ajouterEmployer(vendeur2);
            monoprix.ajouterEmployer(vendeur3);
            monoprix.ajouterEmployer(vendeur4);
            monoprix.ajouterEmployer(responsable2);

            // Création et ajout des produits pour Carrefour
            Produit p1 = new Produit(1,"Lait","Delice", 1.2);
            Produit p2 = new Produit(2,"Pain","Bagette", 0.5);
            carrefour.ajouterProduit(p1);
            carrefour.ajouterProduit(p2);

            // Création et ajout des produits pour Monoprix
            Produit p3 = new Produit(3,"Fromage","presedents", 3.5);
            Produit p4 = new Produit(4,"Jus","stil" ,2.0);
            monoprix.ajouterProduit(p3);
            monoprix.ajouterProduit(p4);

            carrefour.afficherMagasin();
            monoprix.afficherMagasin();


            monoprix.afficherMagasin();

            carrefour.afficherSalaires();
            monoprix.afficherSalaires();

            carrefour.afficherPrimesResponsables();
            monoprix.afficherPrimesResponsables();

            carrefour.afficherEmployes();
            monoprix.afficherEmployes();
        }



}
