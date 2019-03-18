package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Utilisation de la classe AdessePostale
		AdressePostale a = new AdressePostale();
		a.numeroRue = 5;
		a.libelleRue = "des courlis";
		a.codePostal = 44830;
		a.ville = "Bouaye";

		// TODO Définition d'une autre classe AdessePostale
		AdressePostale b = new AdressePostale();
		b.numeroRue = 7;
		b.libelleRue = "des courlis";
		b.codePostal = 44830;
		b.ville = "Bouaye";
	}



}
