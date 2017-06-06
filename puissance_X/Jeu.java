package Moteur;
import Interface.Plateau;

public class Jeu {
	private Case[][] grille;
	private int tHorizontale;
	private int tVerticale;
	private Plateau plateau;
	
	public Jeu(Plateau p)
	{
		InitGrille();
		plateau = p;
	}
	
	private void InitGrille()
	{
		tHorizontale = 7;
		tVerticale = 6;
		
		grille = new Case[tHorizontale][tVerticale];
		
		for (int i = 0; i < tHorizontale; i++)
			for (int j = 0; j < tVerticale; j++)
				grille[i][j] = Case.VIDE;
	}
	
	public boolean jouerCoup(int col, Joueur joueur)
	{
		if (col <= tVerticale &&  col >= 0)
		{
			// On regarde chaque case de la colonne en partant du bas
			for(int i = tVerticale - 1; i >= 0; i--)
				// Si une case est vide, le coup est joué
				if (grille[col][i] == Case.VIDE)
				{
					grille[col][i] = joueur.getCouleur();
					
					plateau.getPGrille().actualise(grille);
					return true;
				}
			
		}
		
		return false;
	}
	
	public boolean grillePleine()
	{
		// On regarde chaque case, si une est vide la grille n'est pas pleine.
		for (int i = 0; i < tHorizontale; i++)
			for (int j = 0; j < tVerticale; j++)
				if (grille[i][j] == Case.VIDE)
					return false;
		
		return true;
	}
	
	public boolean verifierGagnant(Joueur joueur)
	{
		for (int i = 0; i < tHorizontale; i++)
			for (int j = 0; j < tVerticale; j++)
				//Si on a trouvé un jeton du joueur, on regarde dans toutes les directions
				if (grille[i][j] == joueur.getCouleur()){
					// Boucle pour toutes les directions (Nord, NordEst, Sud etc ...)
					for (int k = 0; k < 8; k++)
						if (verifierDirection(joueur, i, j, k))
							return true;
				}
		return false;
	}
	
	// Permet de vérifier s'il a y 3 jetons alignés dans une direction
	private boolean verifierDirection(Joueur j, int x, int y, int direction)
	{
		for (int i = 1; i < 4; i++)
		{
			int x2 = x;
			int y2 = y;
			
			switch (direction)
			{
				case 0: // Nord
					y2 -= i;
					break;
				case 1: // NordEst
					y2 -= i;
					x2 += i;
					break;
				case 2: // NordOuest
					y2 -= i;
					x2 -= i;
					break;
				case 3: // Sud
					y2 += i;
					break;
				case 4: // SudEst
					y2 += i;
					x2 += i;
					break;
				case 5: // SudOuest
					y2 += i;
					x2 -= i;
					break;
				case 6: // Ouest
					x2 -= i;
					break;
				case 7: // Est
					x2 += i;
					break;
			}
			
			// Si la case n'est pas celle du joueur ou si le point x2,y2 n'est pas dans la grille
			if (!estDansLaGrille(x2,y2) || grille[x2][y2] != j.getCouleur())
				return false;
		}
		
		return true;
	}
	
	private boolean estDansLaGrille(int x, int y)
	{
		// On enlève 1 à la taille Horizontale et Verticale car le tableau commence à 0 et non pas 1
		int tH = tHorizontale - 1;
		int tV = tVerticale - 1;
		
		return !(x > tH || x < 0 || y > tV || y < 0);
	}
	
	// Retourne le plateau qui contient l'interface
	public Plateau getPlateau()
	{
		return plateau;
	}
	
	// Retourne la grille du jeu
	public Case[][] getGrille()
	{
		return grille;
	}
	
	// Retourne la taille horizontale de la grille
	public int getTHorizontale()
	{
		return tHorizontale;
	}
	
	// Retourne la taille verticale de la grille
	public int getTVerticale()
	{
		return tVerticale;
	}
	
	public void AfficherGrille()
	{
		for (int i = 0; i < tVerticale; i++){
			for (int j = 0; j < tHorizontale; j++)
			{
				if (grille[j][i] == Case.VIDE)
					System.out.print("*");
				else if (grille[j][i] == Case.ROUGE)
					System.out.print("X");
				else if (grille[j][i] == Case.JAUNE)
					System.out.print("O");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
}

