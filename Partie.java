import java.util.Random;

public class Partie {
	private Joueur[] joueurs;
	
	public Partie(Joueur joueur1, Joueur joueur2)
	{
		joueurs = new Joueur[2];
		joueurs[0] = joueur1;
		joueurs[1] = joueur2;
	}
	
	public void commencer()
	{
		Jeu jeu = new Jeu();
		int jCourrant = new Random().nextInt(1);
		
		while(true)
		{
			if (jeu.grillePleine())
			{
				System.out.println("La grille est pleine !");
				break;
			}
			
			joueurs[jCourrant].jouer(jeu);
			
			jeu.AfficherGrille();
			
			if (jeu.verifierGagnant(joueurs[jCourrant]))
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