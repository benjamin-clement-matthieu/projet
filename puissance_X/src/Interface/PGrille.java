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

	public PGrille(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
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
		this.setLayout(new GridLayout(7, 7));

		grille = new Rond[7][7];
		for (int i = 0; i < 7; i++)
			for (int j = 0; j < 7; j++)
				grille[i][j] = new Rond();

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i < 6)
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
		for (int i = 0; i < 7; i++)
			for (int j = 0; j < 6; j++)
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
