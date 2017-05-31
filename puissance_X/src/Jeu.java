
public class Jeu {
	private Case[][] grille;
	private int tHorizontale;
	private int tVerticale;
	
	public Jeu()
	{
		InitGrille();
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
		for(int i = 0; i < tVerticale; i++)
			if (grille[i][col] == Case.VIDE)
			{
				grille[i][col] = joueur.getCouleur();
				return true;
			}
		
		return false;
	}
	
	public boolean grillePleine()
	{
		for (int i = 0; i < tHorizontale; i++)
			for (int j = 0; j < tVerticale; j++)
				if (grille[i][j] == Case.VIDE)
					return false;
		
		return true;
	}
	
	public boolean verifierGagnant()
	{
		return false;
	}
	
	public Case[][] getGrille()
	{
		return grille;
	}
}
