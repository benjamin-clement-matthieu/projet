package Moteur;
import java.util.Random;

import Interface.Plateau;

public class Partie {
	private Joueur[] joueurs;
	private Plateau plateau;
	
	public Partie(Joueur joueur1, Joueur joueur2, Plateau plateau)
	{
		joueurs = new Joueur[2];
		joueurs[0] = joueur1;
		joueurs[1] = joueur2;
		
		this.plateau = plateau;
	}
	
	public void commencer()
	{
		int jCourrant = new Random().nextInt(1);
		
		while(true)
		{
			if (plateau.getJeu().grillePleine())
			{
				System.out.println("La grille est pleine !");
				break;
			}
			
			joueurs[jCourrant].jouer(plateau.getJeu());
			
			if (plateau.getJeu().verifierGagnant(joueurs[jCourrant]))
			{
				System.out.println("Le joueur " + joueurs[jCourrant].getNom() + " : " + joueurs[jCourrant].getCouleur() + " a gagné");
				break;
			}
			
			jCourrant++;
			jCourrant = jCourrant%2;
		}
		
		System.out.println("Fini");
	}
}
// x % a = x -(a * int(x/a))