package IA;
import java.util.Random;

import Moteur.Case;
import Moteur.Jeu;
import Moteur.Ordinateur;

public class IAMin_Max extends Ordinateur {
  
  public IAMin_Max(Case couleur) {
    
    super(couleur);
  }
  
  @Override
  public void jouer(Jeu jeu, int profondeur) {
    
    int max = -1000;
    int tmp,maxi,maxj;
    int i,j;
    
    for (i=0; i<tHorizontale;i++)
    {
      for (j=0; j<tVerticale;j++)
      {
        if(jeu[i][j] == 0)
        {
          jeu[i][j] == 1;
          tmp = min(jeu, profondeur-1);
          
          if(tmp > max || ((tmp == max) && (rand()%2 == 0))
          {
            max = tmp;
            maxi = i
            maxj = j;
          }
          jeu[i][j] = 0;
        }
      }
    }
    
    jeu [maxi][maxj] = 1;
  }
  
  public void max(Jeu jeu, int profondeur){
    
    int max = -1000;
    int i,j,tmp;
    
    for(i=0; i<tHorizontale; i++)
    {
      for(j=0; j<tVerticlae; j++)
      {
        if(jeu[i][j] == 0)
        {
          jeu[i][j] = 2;
          tmp = min(jeu,profondeur-1);
   
          if(tmp > max || ((tmp == max) && (rand()%2 == 0))
          {
            max = tmp;
          }
          jeu[i][j] = 0;
        }
      }
    }
    
    return max;
  }
  
  public void min(Jeu jeu, int profondeur){

     int min = 1000;
     int i,j,tmp;

     for(i=0; i<tHorizontale; i++)
     {
          for(j=0; j<tVerticale; j++)
          {
                if(jeu[i][j] == 0)
                {
                      jeu[i][j] = 1;
                      tmp = max(jeu,profondeur-1);
                      
                      if(tmp < min || ( (tmp == min) && (rand()%2 == 0) ) )
                      {
                            min = tmp;
                      }
                      jeu[i][j] = 0;
                }
          }
     }

     return min;
     
}

  
  
  
  
 

