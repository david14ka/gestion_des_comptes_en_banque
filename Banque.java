
public class Banque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comptes c1=new CompteCourant("0001", "David", 1000, 10);
        Comptes c2=new ComteEpargne("0001", "Emmanuel", 800, 10);
        Comptes c3=new Emprunt(100, 20, "Delvaux", "0001");
        
        Emprunt e=new Emprunt(100, 20, "Delvaux", "0001");
        e.debuterCompte(c1);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(e.afficher());
    }
    
}
