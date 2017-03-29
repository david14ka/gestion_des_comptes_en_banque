/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class ComteEpargne extends Comptes {
    static final String TYPE="Compte Epargne";
    
    public ComteEpargne() {
        super(TYPE);
    }

    public ComteEpargne(String numero, String proprietaire, double solde, double tauxInteret) {
        super(TYPE,numero, proprietaire, solde, tauxInteret);
    }

}
