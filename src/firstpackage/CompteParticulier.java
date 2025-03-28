/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstpackage;

/**
 *
 * @author Balkhi
 */
public class CompteParticulier extends Clients{
    private int numerocompte;
    private double solde;
    //Constructeurs

    public CompteParticulier(int numerocompte, double solde, String nom, String prenom, String adresse, String tel, String email) {
        super(nom, prenom, adresse, tel, email);
        this.numerocompte = numerocompte;
        this.solde = solde;
    }

    public CompteParticulier(int numerocompte, double solde, String nom, String prenom, String adresse, String tel) {
        super(nom, prenom, adresse, tel);
        this.numerocompte = numerocompte;
        this.solde = solde;
    }
    //Getters and setters

    public int getNumerocompte() {
        return numerocompte;
    }

    public void setNumerocompte(int numerocompte) {
        this.numerocompte = numerocompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    //Verser de l'argent
    public void verser(double montant){
        this.solde += montant;        
    }
    //Retirer l'argent
    public boolean retirer(double montant){
        if (this.solde > montant){
            this.solde -= montant;
            return true;
        }else{
            return false;
        }
    }  
}
