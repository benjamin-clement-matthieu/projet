package Moteur;
import java.util.Random;

import Interface.Plateau;

public class Partie {
	private Joueur[] joueurs;
	private Plateau plateau;
	private Joueur joueur1;
	private Joueur joueur2;
	private int jCourrant;
	private boolean partieFinie;
	
	public Partie(Joueur j1, Joueur j2, Plateau plateau)
	{
		this.joueur1 = j1;
		this.joueur2 = j2;
		this.partieFinie = true;
		joueurs = new Joueur[2];
		joueurs[0] = joueur1;
		joueurs[1] = joueur2;
		
		this.plateau = plateau;
	}
	
	public void commencer()
	{
		partieFinie = false;
		jCourrant = new Random().nextInt(1);
		
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
		
		partieFinie = true;
	}
	
	public Joueur getJoueur1()
	{
		return joueur1;
	}
	
	public Joueur getJoueur2()
	{
		return joueur2;
	}
	
	// Retourne null si il n'y a pas de partie en cours
	public Joueur getJoueurCourrant()
	{
		if (partieFinie)
			return null;
		
		return joueurs[jCourrant];
	}
}
// x % a = x -(a * int(x/a))