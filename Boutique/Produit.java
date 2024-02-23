package Boutique;

public class Produit {
	 private String nom;
	    private int prix;

	    public Produit(String nom, int prix) {
	        this.nom = nom;
	        this.prix = prix;
	    }

	    public void afficher() {
	        System.out.println("Nom: " + nom + ", Prix: " + prix);
	    }

		public int getPrix() {
			return prix;
		}
}
