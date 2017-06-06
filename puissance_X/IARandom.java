package IA;
import java.util.Random;

import Moteur.Case;
import Moteur.Jeu;
import Moteur.Ordinateur;

public class IARandom extends Ordinateur {
	
	public IARandom(Case couleur)
	{
		super(couleur);
	}
	
	@Override
	public void jouer(Jeu jeu) {
		int random = new Random().nextInt(jeu.getTHorizontale());
		
		while(!jeu.jouerCoup(random, this)){
			random = new Random().nextInt(jeu.getTHorizontale());
		}
	}
	
	
}


