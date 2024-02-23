package Boutique;

public class ProduitElectronique extends Produit {
	private int dureeGarantie;

    public ProduitElectronique(String nom, int prix, int dureeGarantie) {
        super(nom, prix);
        this.dureeGarantie = dureeGarantie;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Type: ProduitElectronique, Durée de garantie: " + dureeGarantie + " mois");
    }
}
