import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FPrincipale extends JFrame {
	rond[][] grille;

	public FPrincipale() {
		this.setTitle("Puissance 4");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		grille = new rond[6][7];
		InitGrille();
		this.setLayout(new GridLayout(6, 7));
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 7; j++)
				this.getContentPane().add(grille[i][j]);
		
		this.setVisible(true);
		
		grille[2][2].setColor(Color.red);
	}

	private void InitGrille() {
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 7; j++)
		
			{	
				grille[i][j] = new rond();
			}
				
	}
}




