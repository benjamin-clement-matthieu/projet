
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
	
	public void jouerCoup(int col, Joueur joueur)
	{
		
	}
}
