package Boutique;

import java.time.LocalDate;

public class ProduitAlimentaire extends Produit {
	 private LocalDate dateExpiration;

	    public ProduitAlimentaire(String nom, int prix, LocalDate localDate) {
	        super(nom, prix);
	        this.dateExpiration = localDate;
	    }

	    @Override
	    public void afficher() {
	        super.afficher();
	        System.out.println("Type: ProduitAlimentaire, Date d'expiration: " + dateExpiration);
	    }
}
