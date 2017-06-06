package Interface;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
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
		initPlateau(mode, j1, j2);
		initComposant();
	}
	
	private void initComposant()
	{
		// Label pour les noms des joueurs
		JLabel lJoueur1 = new JLabel("Joueur 1 : " + partie.getJoueur1().getNom());
		JLabel lJoueur2 = new JLabel("Joueur 2 : " + partie.getJoueur2().getNom());
		
		Rond couleurJ1 = new Rond(40);
		couleurJ1.setColor(partie.getJoueur1().getCouleur());
		
		Rond couleurJ2 = new Rond(40);
		couleurJ2.setColor(partie.getJoueur2().getCouleur());
		
		JButton bMenu = new JButton("Menu");
		bMenu.setPreferredSize(new Dimension(80, 50));
		
		JButton bRecommencer = new JButton("Recommencer");
		bMenu.setPreferredSize(new Dimension(80, 50));
		
		setLayout(null);
		
		// Pseudo joueur 1 (avec sa couleur)
		lJoueur1.setBounds(50, 35, 180, 20);
		this.add(lJoueur1);
		
		couleurJ1.setBounds(230, 20, 50, 50);
		this.add(couleurJ1);
		
		// Pseudo joueur 2 (avec sa couleur)
		lJoueur2.setBounds(50, 590, 200, 20);
		this.add(lJoueur2);
		
		couleurJ2.setBounds(230, 575, 50, 50);
		this.add(couleurJ2);
		
		// Grille
		pGrille.setBounds(50, 80, 490, 490);
		this.add(pGrille);
		
		// Bouton menu
		bMenu.setBounds(650, 100, 200, 50);
		this.add(bMenu);
		
		// Bouton recommencer
		bRecommencer.setBounds(650, 170, 200, 50);
		this.add(bRecommencer);
	}
	
	private void initPlateau(PuissanceMode mode, Joueur j1, Joueur j2)
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
