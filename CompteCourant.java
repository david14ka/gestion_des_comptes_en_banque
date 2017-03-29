/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class CompteCourant extends Comptes {
    
    static final String TYPE="Compte Courant";
    public CompteCourant() {
        super(TYPE);
    }

    public CompteCourant(String numero, String proprietaire, double solde, double tauxInteret) {
        super(TYPE,numero, proprietaire, solde, tauxInteret);
    }

    @Override
    public void retirerArgent(double somme) {
        super.retirerArgent(somme+(somme/super.getTauxInteret()));
    }
    
    
}
