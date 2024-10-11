package tn.tuniprod.gestionmagasin;

import java.util.Objects;

public class Produit {

    private int code;
    private String nom;
    private String marque;
    private double prix;


    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        if (prix > 0){
            this.prix = prix;
        }

    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }


    public Produit() {}

    public  Produit(int code, String nom, String marque, double prix) {
        this.code = code;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
    }



    public void Afficher(){
        System.out.println("///");
        System.out.println("  Nom : " + nom);
        System.out.print(" - Code : " + code);
        System.out.print(" - Marque : " + marque);
        System.out.print(" - Prix : " + prix);

    }


    public boolean Comparer(Produit p){
       return this.code == p.getCode() && (Objects.equals(this.nom, p.getNom())) && this.prix == p.getPrix();
    }

    public static boolean Comparer(Produit p , Produit p1){
        return (p1.getCode()== p.getCode()) && (Objects.equals(p1.getNom(), p.getNom())) && (p.getPrix() == p.getPrix()) ;


    }
}


