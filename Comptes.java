/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Comptes {
    
    private final String typeCompte;
    private String proprietaire;
    private double solde;
    private String numero;
    private double tauxInteret;
    
    public Comptes(String type) {
        typeCompte=type;
        numero="0000";
        proprietaire="NOM";
        solde=0;
        tauxInteret=0;
    }
    public Comptes(String type,String proprietaire, String numero){
        this.typeCompte=type;
        this.proprietaire=proprietaire;
        this.numero=numero;
    }
    
    public Comptes(String type,String numero, String proprietaire, double solde, double tauxInteret) {
        this.typeCompte=type;
        this.proprietaire = proprietaire;
        this.solde = solde;
        this.numero = numero;
        this.tauxInteret = tauxInteret;
    }
    
    
    
    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
    
    public void deposerArgent(double somme){
        this.solde+=somme;
    }
    public void retirerArgent(double somme){
        this.solde-=somme;
    }

    @Override
    public String toString() {
        return "Type de Compte : "+typeCompte
                +"\nNumero : "+numero
                +"\nProprietaire : "+proprietaire
                +"\nSolde : "+solde
                +"\nTaux Interer : "+tauxInteret
                +"%\n-----------------------------------------------------------\n";
    }

    public String getTypeCompte() {
        return typeCompte;
    }
    
    
}
