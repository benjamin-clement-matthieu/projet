package Interface;

import javax.swing.JPanel;

import Moteur.Jeu;

public class Plateau extends JPanel{
	private PGrille pGrille;
	private Jeu jeu;
	
	public Plateau()
	{
		pGrille = new PGrille(490, 490);
		jeu = new Jeu(this);
		
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
}

