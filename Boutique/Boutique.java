package Boutique;

import java.util.List;
import java.util.ArrayList;

public class Boutique {
	private List<Produit> produits;

    public Boutique() {
        produits = new ArrayList<>();
    }

    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void afficherStock() {
        for (Produit produit : produits) {
            produit.afficher();
        }
    }
}
