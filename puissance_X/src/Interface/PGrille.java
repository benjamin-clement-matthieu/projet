package Interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import Moteur.Case;

public class PGrille extends JPanel {
	Rond[][] grille;
	public static ClickColEvent click = new ClickColEvent();
	private int nbLigne;
	private int nbColonne;
	
	public PGrille(int nbCol, int nbLig) {
		int dim = nbCol * nbCol * 10;
		this.setPreferredSize(new Dimension(dim, dim));
		nbLigne = nbLig;
		nbColonne = nbCol;
		initGrille();
	}

	public void paintComponent(Graphics g) {
		
		try {
			Image img = ImageIO.read(new File("fond-bleu.jpg"));
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void initGrille() {
		
		int tailleRond = nbColonne * 10 - 5;
		this.setLayout(new GridLayout(nbLigne + 1, nbColonne));

		grille = new Rond[nbLigne + 1][nbColonne];
		for (int i = 0; i < nbColonne; i++)
			for (int j = 0; j < nbColonne; j++)
				grille[i][j] = new Rond(tailleRond);

		for (int i = 0; i < nbColonne; i++) {
			for (int j = 0; j < nbColonne; j++) {
				if (i < nbLigne)
					this.add(grille[i][j]);
				else {
					String name = String.valueOf(j);
					JButton b = new JButton();
					b.setName(name);
					b.addActionListener(click);
					this.add(b);

				}
			}
		}
	}

	public void actualise(Case[][] g) {
		for (int i = 0; i < nbColonne; i++)
			for (int j = 0; j < nbLigne; j++)
			{
				switch(g[i][j])
				{
					case ROUGE:
						grille[j][i].setColor(Color.RED);
						break;
					case JAUNE:
						grille[j][i].setColor(Color.YELLOW);
						break;
				}
			}
	}
}
