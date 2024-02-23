package Boutique;

public class ProduitBoisson extends Produit {
    private int quantite;

    public ProduitBoisson(String nom, int prix, int quantite) {
        super(nom, prix);
        this.quantite = quantite;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Type: ProduitBoisson, Quantité: " + quantite + " cl");
    }

}
