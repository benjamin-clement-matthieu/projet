package Interface;
import javax.swing.JPanel;

import Moteur.Jeu;
import Moteur.Joueur;
import Moteur.Partie;
import Moteur.PuissanceMode;

public class Plateau extends JPanel{
	private PGrille pGrille;
	private Jeu jeu;
	private Partie partie;
	
	public Plateau(PuissanceMode mode, Joueur j1, Joueur j2)
	{
		int nbC = -1; // Nombre de colonnes
		int nbL = -1; // Nombre de lignes
		switch (mode)
		{
			case PUISSANCE4:
				nbC = 7;
				nbL = 6;
				break;
			case PUISSANCE5:
				nbC = 8;
				nbL = 7;
				break;
			case PUISSANCE6:
				nbC = 9;
				nbL = 8;
				break;
		}
		
		pGrille = new PGrille(nbC, nbL);
		jeu = new Jeu(this, nbC, nbL);
		partie = new Partie(j1, j2, this);
		
		this.add(pGrille);
	}
	
	public PGrille getPGrille()
	{
		return pGrille;
	}
	
	public Jeu getJeu()
	{
		return jeu;
	}
	
	public Partie getPartie()
	{
		return partie;
	}
	
	public void commencerPartie()
	{
		partie.commencer();
	}
}
