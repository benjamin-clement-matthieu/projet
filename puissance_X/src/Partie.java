import java.util.Random;

public class Partie {
	private Joueur[] joueurs;
	
	public Partie(Joueur joueur1, Joueur joueur2)
	{
		joueurs = new Joueur[1];
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
				break;
			
			joueurs[jCourrant].jouer(jeu);
			
			if (jeu.verifierGagnant())
				break;
			
			jCourrant++;
			jCourrant = jCourrant%2;
		}
	}
}