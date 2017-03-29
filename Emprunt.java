/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Emprunt extends Comptes {
    //le montant total à rembourser,  et 
    private double montantTotal;
    //la valeur des mensualités
    private double valeurMens;
    //le compte duquel les mensualités doivent être débitées
    private Comptes compteDebutee;
    static final String TYPE="Emprunt";
    
    public Emprunt() {
        super(TYPE);
    }
    
    public Emprunt(double montantTotal, double valeurMens, String proprietaire, String numero) {
        super(TYPE,proprietaire,numero);
        this.montantTotal = montantTotal;
        this.valeurMens = valeurMens;
        
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public double getValeurMens() {
        return valeurMens;
    }

    public void setValeurMens(double valeurMens) {
        this.valeurMens = valeurMens;
    }

    public Comptes getCompteDebutee() {
        return compteDebutee;
    }

    public void setCompteDebutee(Comptes compteDebutee) {
        this.compteDebutee = compteDebutee;
    }
    
    public void debuterCompte(Comptes comptes){
        if (this.montantTotal < comptes.getSolde()){
            comptes.retirerArgent(montantTotal);
        }
        else{
            System.out.println("Le compte que vous voulez debutez n'a pas cette somme");
            this.montantTotal=0;
        }
        this.compteDebutee=comptes;
    }
    
    @Override
    public String toString() {
        return "Type de Compte : "+super.getTypeCompte()
                +"\nNumero : "+super.getNumero()
                +"\nProprietaire : "+super.getProprietaire()
                +"\nMontant a rembourser : "+montantTotal
                +"\nValeur mensuelle : "+valeurMens
                +"\n-----------------------------------------------------------------------------";
    }
    public String afficher(){
        return toString()
                +"\n\t\tEMPRUNT"
                +"\n\tCompte Debute : "+compteDebutee.getNumero()
                +"\tProprietaire : "+compteDebutee.getProprietaire()
                +"\tSolde restant : "+compteDebutee.getSolde()
                +"\tType compte : "+compteDebutee.getTypeCompte()
                +"\n-----------------------------------------------------------------------------";
    }
            
  
}
