package Interface;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import IA.IARandom;
import Moteur.Case;
import Moteur.Humain;
import Moteur.Partie;
import Moteur.PuissanceMode;

public class FPrincipale extends JFrame {
	private Plateau plateau;
	
	public FPrincipale() {
		this.setTitle("Puissance 4");
		this.setSize(900, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Humain benjamin = new Humain("Benjamin", Case.ROUGE);
    	Humain matthieu = new Humain("Matthieu", Case.JAUNE);
		
		plateau = new Plateau(PuissanceMode.PUISSANCE4, benjamin, matthieu);
		this.setContentPane(plateau);
		
		this.setVisible(true);
	}
	
	public Plateau getPlateau()
	{
		return plateau;
	}
	
	public static void main(String[] args) {
    	Interface.FPrincipale f = new Interface.FPrincipale();
    	f.getPlateau().commencerPartie();
    	
    }
}
