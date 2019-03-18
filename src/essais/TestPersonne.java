package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// Utilisation de la classe Personne
		AdressePostale a = new AdressePostale(5, "allée des courlis", 44830, "Bouaye");
		Personne p = new Personne("Julie", "Jeltsch", a);
		Personne q = new Personne("Julie", a);

	}
}