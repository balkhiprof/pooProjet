/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstpackage;

/**
 *
 * @author Balkhi
 */
public class CompteParticulier extends Clients {
    private String compte;
    private double solde;
    public CompteParticulier(String nom, String prenom, String adresse, String tel, String compte, double solde) {
        super(nom, prenom, adresse, tel);
    }

    public CompteParticulier(String nom, String prenom, String adresse, String tel, String email, String compte, double solde) {
        super(nom, prenom, adresse, tel, email);
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
    
    
}
