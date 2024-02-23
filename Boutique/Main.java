package Boutique;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
        Boutique boutique = new Boutique();

        ProduitElectronique produitElectronique = new ProduitElectronique("Ordinateur", 1000, 12);
        ProduitAlimentaire produitAlimentaire = new ProduitAlimentaire("Pomme", 2, LocalDate.now().plusMonths(2));
        ProduitBoisson produitBoisson = new ProduitBoisson("Coca-Cola", 500, 2);

        boutique.addProduit(produitElectronique);
        boutique.addProduit(produitAlimentaire);
        boutique.addProduit(produitBoisson);

        boutique.afficherStock();
        
        System.out.println("Le panier: ");

        Panier panier = new Panier();
        panier.ajouterProduit(produitElectronique);
        panier.ajouterProduit(produitAlimentaire);
        panier.ajouterProduit(produitBoisson);

        System.out.println("Prix total du panier: " + panier.prixTotalPanier());
    }
}
