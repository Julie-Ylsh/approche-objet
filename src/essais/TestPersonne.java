package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Utilisation de la classe Personne
		
		AdressePostale a = new AdressePostale();
		a.numeroRue = 5;
		a.libelleRue = "des courlis";
		a.codePostal = 44830;
		a.ville = "Bouaye";
		
		Personne p = new Personne();
		p.nom = "Jeltsch";
		p.prenom = "Julie";
		p.adresse = a;

	}
}